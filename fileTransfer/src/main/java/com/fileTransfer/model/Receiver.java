package com.fileTransfer.model;

import java.util.List;

public class Receiver {
	private String ip;
	private String name;
	private List<FileObject> files;
	
	public Receiver() {
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

	@Override
	public String toString() {
		return "Receiver [ip=" + ip + ", name=" + name + ", files=" + files + "]";
	}
	
	
}
