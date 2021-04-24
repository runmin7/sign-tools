package com.develop.create;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.develop.create.file.CreateFileService;
import com.develop.create.storage.FileSystemStorageService;
import com.example.uploadingfiles.FileUploadController;

@Controller
public class CreateFileController {

	@Autowired
	FileSystemStorageService storageService;
	
	@Autowired
	CreateFileService createFileService;
	
	@GetMapping("/")
	public String test(Model model) throws IOException {
		
		model.addAttribute("files", storageService.loadAll()
				.map(
//						path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class, "serveFile", path.getFileName().toString())
						path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class, "serveFile", path.toString().replace("\\", "/"))
					.build()
					.toUri()
					.toString())
			.collect(Collectors.toList()));
		
		return "createFileForm";
	}
	
	@PostMapping("/")
	public String handleFileUpload(RedirectAttributes redirectAttributes, @RequestParam Map<String, String> param) {
		
		String a = param.get("itext");
		
		redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + a + "!");
		
		return "redirect:/";
	}
	
	@GetMapping("/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) throws IOException {

		System.out.println(filename);
		
		//파일을 만들고
		createFileService.createFile(filename);
		
		//파일을 반환한다.
		Resource file = storageService.loadAsResource(filename);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
				"attachment; filename=\"" + file.getFilename() + "\"").body(file);
	}
	
	
	@GetMapping("/files/{dir:.+}/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile2(@PathVariable String dir, @PathVariable String filename) throws IOException {

		System.out.println(filename);
		System.out.println(dir);
		
		//파일을 만들고
		createFileService.createFile(filename);
		
		//파일을 반환한다.
		Resource file = storageService.loadAsResource(filename);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
				"attachment; filename=\"" + file.getFilename() + "\"").body(file);
	}
	
	
}
