import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework_3_huqiu {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:/myfile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("E:/myfile_cp2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = -1;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		System.out.println("¸´ÖÆ³É¹¦");
		bis.close();
		bos.close();
		// TODO Auto-generated method stub

	}

}
