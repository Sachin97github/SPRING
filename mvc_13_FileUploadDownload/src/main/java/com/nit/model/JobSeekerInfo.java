package com.nit.model;

import org.springframework.web.multipart.MultipartFile;

public class JobSeekerInfo {
	
	private String name;
	private String location;
	private MultipartFile resume;
	private MultipartFile photo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public void setResume(MultipartFile resume) {
		this.resume = resume;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "JobSeekerInfo [name=" + name + ", location=" + location + ", resume=" + resume + ", photo=" + photo
				+ "]";
	}
	
	

}
