package lab8.p2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class p2_ans {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Directory to check ");

        File dirct = new File("a.txt");
        System.out.println(dirct.createNewFile());
//        String[] list_of_files = dirct.list();
//
//        if(null == list_of_files){
//            System.out.println("Directory does not contain any files");
//        }
//        else{
//            for(String file : list_of_files){
//                System.out.println(file);
//            }
//        }
    }
}
