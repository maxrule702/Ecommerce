import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;
public class website {
Scanner input = new Scanner(System.in);
Scanner fileIn; // input file connection
  public   PrintWriter fileOut; //nection html conneciton
   public String filenameIn; // original file name
    public String filenameOut; // new html file name
   public int dotIndex; // postion of . in filename
   public String line = null; // a line from the input file

  public void file(){
      System.out.println("enter file name or path");
      //filenameIn = input.nextLine();
filenameIn = "src/helloWorld";
      //checks to see if file exists
      try{
        fileIn = new Scanner(new FileReader(filenameIn));
        dotIndex = filenameIn.lastIndexOf(".");
//        if(dotIndex == -1) {
//            filenameOut = filenameIn + ".html";
//        }

            filenameOut = filenameIn + ".html";
          fileOut = new PrintWriter(filenameOut);


//        else{
//                filenameOut = filenameIn.substring(0, dotIndex) + ".html";
//            }
//            fileOut = new PrintWriter(filenameOut);



          try{
         line = fileIn.nextLine();
         // add the text file here
              System.out.println(line);

         

            if(line == null){
                System.out.println("this file is empty");
            }

//
            else{
                //reads the file
                fileOut.println("<html>");
                fileOut.println("<head>");
                fileOut.println("<title>"+ filenameIn + "</title>");
                fileOut.println("</head>");
                fileOut.println("<a href = 'https://www.google.com target =_self>'/>");
                fileOut.println("<body>");
                fileOut.println(line);

                while(fileIn.hasNextLine()){
                    fileOut.println("<br>");
                    line = fileIn.nextLine();

                    if(line.isEmpty()){
                        fileOut.println("<br>");
                    }
                    else{
                        fileOut.println(line);
                        }
                    }
                fileOut.println("</body>");
                fileOut.println("</html>");


                System.out.println("HTML File is processed");
                }
            fileIn.close();
            fileOut.close();

            } catch (Exception e) {
              e.printStackTrace();
          }


      }catch(FileNotFoundException e){
          System.out.println("file not found");
      }

  }
}
