package com.fileTransfer.service;

import java.util.List;

import com.fileTransfer.model.FileObject;

public class FileSenderServiceImpl implements FileSenderService {

	@Override
	public void sendFiles(List<FileObject> files) {
		// TODO Auto-generated method stub
		for(FileObject fileObject: files) {
			sendFile(fileObject);
		}
		
	}

	@Override
	public void getFile(FileObject file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendFile(FileObject file) {
		// TODO Auto-generated method stub
		
	}

}
