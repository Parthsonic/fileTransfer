package com.fileTransfer.service;

import com.fileTransfer.model.FileObject;

public interface FileSenderService {
	void sendFile(FileObject file);
	void getFile(FileObject file);
}
