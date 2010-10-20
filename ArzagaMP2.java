import java.util.*;
import java.io.*;

class FileReading1 
{
	
   public static void main(String args[]) throws IOException 
   {
   	
   	  String strFileName;
   	  int cs[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
   	  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
   	  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
   	  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
   	     	  	
      System.out.print("What is the name of the file to read from? ");
     
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      strFileName = br.readLine();
      
      System.out.println("Now reading from " + strFileName + "...\n");
      
      FileInputStream fis = null;
      
      try 
      {
         fis = new FileInputStream(strFileName);
      } 
      catch (FileNotFoundException fnfe) 
      {
         System.err.println("File not found: " + fnfe.getMessage());         
      }
      
      try 
      {
         char cData;
         int iTemp;
         
         do 
         {
            iTemp = fis.read();
            cData = (char) iTemp;
                        
            if (iTemp != -1) 
            {              	
            	for(int i = 0; i < cs.length; i++)
            	{
            		if(i==iTemp)
            		{
            			cs[i]+=1;
            		}
            	}            
            }
		}

         while (iTemp != -1);
                 
      }
       
      catch (IOException ex) 
      {
         System.out.println("Problem in reading from the file.");
      }
      
      System.out.println("Char " + "Dec " + "Count");
      
      for (int i=0; i < cs.length; i++)
      {
      	char character = (char)i;
      	System.out.println(" " + character + "   " + i + "   " + cs[i]);
      }
   }
}