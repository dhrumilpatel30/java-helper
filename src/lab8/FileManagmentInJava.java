package lab8;

import java.io.*;
import java.util.Scanner;

public class FileManagmentInJava {
    public static void main(String[] args) throws IOException {
//		File f1 = new File("a.txt");
//		f1.createNewFile();
        FileInputStream in = null;
		FileOutputStream out = null;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter File Name(from): ");
		String finname = sc.nextLine();
		System.out.print("Enter File Name(from): ");
		String foutname = sc.nextLine();
		System.out.print("Do you want to append or copy file content(a/c): ");
		String choice = sc.nextLine();
		try {
			in = new FileInputStream(finname);
			if(choice.equals("a")){
				out = new FileOutputStream(foutname,true);
			}
			else if(choice.equals("c")){
				out = new FileOutputStream(foutname);
				out.write(13);
			}
			else {
				System.out.println("Invalid Choice");
				return;
			}
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}catch (Exception e) {
			System.out.println("Invalid File Names");
			e.printStackTrace();
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
    }
}
