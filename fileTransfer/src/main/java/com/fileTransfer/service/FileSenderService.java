package com.fileTransfer.service;

import java.util.List;

import com.fileTransfer.model.FileObject;

public interface FileSenderService {
	void sendFiles(List<FileObject> files);
	void getFile(FileObject file);
	void sendFile(FileObject file);
}
