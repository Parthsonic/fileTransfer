package com.fileTransfer.service;

import java.util.List;

import com.fileTransfer.model.FileObject;

public interface FileReceiverService {
	void receiveFiles(List<FileObject> files);
	void receiveFile(FileObject file);

}
