package regularExpersion;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOexpression {
	public void createLogFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (file.createNewFile()) {
			System.out.println("File created: " + file.getName());
		} else {
			System.out.println("File already exists.");
		}
	}

	public void moveLogFile(String source, String destination) throws IOException {
		Files.move(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
	}

	public void deleteLogFile(String fileName) {
		File file = new File(fileName);
		if (file.delete()) {
			System.out.println("Deleted the file: " + file.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}

	public static void main(String[] args) {
		IOexpression expression = new IOexpression();
		String filename = "C:\\Users\\walde\\Desktop\\iofiles\\" + "file1.txt";
		String destDirec = "C:\\Users\\walde\\Desktop\\iofiles\\destdirectory\\";

		LogMetaData metaData = new LogMetaData();
		metaData.setFileName("file1.txt");
		metaData.setFilePath("C:\\Users\\walde\\Desktop\\iofiles\\");

		try {
			expression.createLogFile(filename);
			expression.createLogFile(metaData.getFilePath() + metaData.getFileName());
			expression.moveLogFile(filename, destDirec);
			expression.deleteLogFile(filename);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
