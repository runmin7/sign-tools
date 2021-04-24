package com.develop.create.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.develop.create.storage.StorageProperties;

@Service
public class CreateFileService {
	
	private final Path rootLocation;

	@Autowired
	public CreateFileService(StorageProperties properties) {
		this.rootLocation = Paths.get(properties.getLocation());
	}
	
	public void createFile(String name) throws IOException {
		Objects.requireNonNull(name);
		int resultCount = 0;
		
		try {
			Path path = this.rootLocation.resolve(Paths.get(name)).normalize().toAbsolutePath();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toString(), false));
			bufferedWriter.write("zzzzzzzzzzzzzzzzz");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
		System.out.println(resultCount);
		
	};
	

}
