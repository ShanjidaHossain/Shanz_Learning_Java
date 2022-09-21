package file.read.and.write.and.create;

import java.io.File;

public class CreatingFolderAndFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("C:\\Users\\19294\\Desktop\\Testing");
		folder.mkdir();
		if (folder.exists()) {
			System.out.println(folder.getName() + ", Folder is created. ");
			File file = new File("C:\\Users\\19294\\Desktop\\Testing\\Testing.txt");		
			try {
				file.createNewFile();
			}catch(Exception e) {
				System.out.println(e);
			}
			if(file.exists()) {
				System.out.println(file.getName() + ", File is created. ");
			}

		}

	}

}
