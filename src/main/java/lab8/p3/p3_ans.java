package lab8.p3;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class p3_ans {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the File to split: ");
        String input_file = sc.nextLine();
        File file1 = new File("src/lab8/p3/source/"+input_file);
        FileInputStream file_input1 = new FileInputStream("src/lab8/p3/source/"+input_file);
        System.out.println("Size of Give file is "+ Files.size(file1.toPath()));
        FileOutputStream file_output1 = new FileOutputStream("src/lab8/p3/destination/part1_"+input_file);
        System.out.println("New File Created: destination/part1_"+input_file);
        try {
            int count = 0,part_number=1;
            while(true){
                int a = file_input1.read();

                if(-1 == a)break;
                if(1024 * 5 == count){
                    count = 0;
                    part_number++;
                    file_output1 = new FileOutputStream("src/lab8/p3/destination/part"+part_number+"_"+input_file);
                    System.out.println("New File Created: destination/part"+part_number+"_"+input_file);
                }
                file_output1.write(a);
                count++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
