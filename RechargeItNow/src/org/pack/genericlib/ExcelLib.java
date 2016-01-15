package org.pack.genericlib;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExcelLib {

	public static void main(String[] args) throws IOException {
		File dir = new File("");
		File[] files = dir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return false;
			}
		});

		String line = null;
		File newFile = new File("");
		FileWriter fileWriter = new FileWriter(newFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		for (File file : files) {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line);
			}

		}

	}
}
