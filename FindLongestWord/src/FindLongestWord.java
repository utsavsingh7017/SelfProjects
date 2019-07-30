import java.io.*;
import java.util.*;
class FindLongestWord
{
 public static void main(String args[])throws IOException
 {
   int i=0,count=0;
   int j=0,length;
   char ch;
   HashSet<String> hl=new HashSet();
   String longestString="";
   String temp="";
   String temp2="";
   FileReader fr=null;

   try
   {
    fr=new FileReader("ram.txt"); 
   }
   catch(FileNotFoundException ett)
   {
     System.out.println("File not found");
   }
  while ((i=fr.read())!=-1)
   {	 
       
      ch=(char)i;
     
	  if(ch!=' ')
	    temp=temp+ch;
      else 
	  {
    	   
               count++;
               if(temp.length() > longestString.length())
		        {
                  longestString = temp;
			   
                }
               else if(temp.length()==longestString.length())
            	   hl.add(temp);
              
		       temp="";
	  }		  
   }       
        fr.close(); 
        if(count==0)
        	System.out.println("File is empty");
        else if(count==1)
        	System.out.println("file contains only one word");
        else 
        	{

        	System.out.println(longestString);
        	Iterator<String> it=hl.iterator();
        	while(it.hasNext())
           	{	
        	  System.out.println(it.next());
        	}
        }
       
 }
}