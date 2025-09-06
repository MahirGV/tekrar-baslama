package exprements;

import java.io.File;

public class FileByType {

	public static void main(String[] args) {
		File dir = new File("/home/mahirjv/Downloads");
		File[] files = dir.listFiles();
		if (files == null)
			return;

		new File(dir, "Picture").mkdir();
		new File(dir, "Docs").mkdir();
		new File(dir, "Videos").mkdir();
		new File(dir, "ZipFiles").mkdir();

		for (File file : files) {
			String name = file.getName().toLowerCase();
			if (name.endsWith(".jpg") || name.endsWith(".png")) {
				file.renameTo(new File(dir + "/Pictures/" + file.getName()));
			} else if (name.endsWith(".pdf") || name.endsWith(".docx")) {
				file.renameTo(new File(dir + "/docs/" + file.getName()));
			} else if (name.endsWith(".mp4") || name.endsWith(".avi")) {
				file.renameTo(new File(dir + "/videos/" + file.getName()));
			} else if (name.endsWith(".tar.gz") || name.endsWith(".zip")) {
				file.renameTo(new File(dir + "/ZipFiles/" +file.getName()));
			}
				System.out.println("sistem ise dusdu");
		}
	}
}
