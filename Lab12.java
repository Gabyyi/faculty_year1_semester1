import java.io.*;
class Lab12{
    public static void main(String[] args){
        try{

            //-----Exercise 1-----

            BufferedReader reader=new BufferedReader(new FileReader("numbers.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while((line=reader.readLine())!=null){
                if(line!=null && !line.isEmpty()){
                    String[] nostring=line.split("\\s+");
                    int[] v=new int[nostring.length];
                    for(int i=0;i<nostring.length;i++){   
                        v[i]=Integer.parseInt(nostring[i]);
                    }
                    int s=0;
                    int k=v.length;
                    int min=v[0];
                    int max=v[0];
                    for(int i=0;i<v.length-1;i++){
                        for(int j=i+1;j<v.length;j++)
                        {
                            if(min>v[i]) min=v[i];
                            if(max<v[i]) max=v[i];
                        }
                        s=s+v[i];
                    }
                    s=s+v[v.length-1];
                    System.out.println("min: "+min);
                    System.out.println("max: "+max);
                    System.out.println("avg: "+(double)s/k);
                
                    //-----Exercise 2------  

                    for(int i=0;i<v.length-1;i++)
                        for(int j=i+1;j<v.length;j++){
                            if(v[i]>v[j]){
                                int aux=v[i];
                                v[i]=v[j];
                                v[j]=aux;
                            }
                        }
                    for(int i=0;i<v.length;i++){
                        writer.write(v[i]+" ");
                    }
                }                
            }
            reader.close();
            writer.close();

            //-----Exercise 3-----

            BufferedReader reader2=new BufferedReader(new FileReader("test.txt"));
            BufferedWriter writer2=new BufferedWriter(new FileWriter("output2.txt"));
            int k=0;
            while(reader2.readLine()!=null){
                k++;
            }
            String[] strings=new String[k];
            reader2=new BufferedReader(new FileReader("test.txt"));
            for(int i=0;i<k;i++){
                strings[i]=reader2.readLine();
            }
            for(int i=k-1;i>=0;i--){
                writer2.write(strings[i]+'\n');
            }
            reader2.close();
            writer2.close();
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}