package com.fileTransfer.model;

import java.util.List;

public class Sender {
	private String ip;
	private String name;
	private List<FileObject> files;
	private int totalFiles;
	private long totalFilesSize;
	
	public Sender() {
		// TODO Auto-generated constructor stub
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FileObject> getFiles() {
		return files;
	}

	public void setFiles(List<FileObject> files) {
		this.files = files;
	}

	public int getTotalFiles() {
		return totalFiles;
	}

	public void setTotalFiles(int totalFiles) {
		this.totalFiles = totalFiles;
	}

	public long getTotalFilesSize() {
		return totalFilesSize;
	}

	public void setTotalFilesSize(long totalFilesSize) {
		this.totalFilesSize = totalFilesSize;
	}

	@Override
	public String toString() {
		return "Sender [ip=" + ip + ", name=" + name + ", files=" + files + ", totalFiles=" + totalFiles
				+ ", totalFilesSize=" + totalFilesSize + "]";
	}
	
}
