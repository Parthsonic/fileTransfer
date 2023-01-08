package com.fileTransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fileTransfer.model.FileObject;
import com.fileTransfer.service.FileSenderService;

@RestController
@RequestMapping("/sendFile")
public class FileSenderController {
	
	@Autowired
	private FileSenderService fileSenderService;
	
	public void sendFile(@RequestBody List<FileObject> files) {
		fileSenderService.sendFiles(files);
	}
}
