package com.octo.model;

import java.util.Objects;


public class Language {

	  private String id;
	  
	  public void setId(String id) {
		this.id = id;
	}

	private String name;
	  private String author;
	  private String fileExtension;

	  public Language(String id,String name, String author, String fileExtension) {
		this.id=id;
	    this.name = name;
	    this.author = author;
	    this.fileExtension = fileExtension;
	  }

	  public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getId() {
	    return id;
	  }

	  public void setName(String name) {
		  this.name=name;
	  }
	  
	  public void setFileExtention(String filaExtention) {
		  this.fileExtension=filaExtention;
	  }
	  
	  public void setAuthor(String author) {
		  this.author=author;
	  }
	  public String getName() {
	    return name;
	  }

	  public String getAuthor() {
	    return author;
	  }

	  public String getFileExtension() {
	    return fileExtension;
	  }

	  @Override
	  public boolean equals(final Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Language)) return false;
	    final Language language = (Language) o;
	    return id.equals(language.id);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(id);
	  }

	  @Override
	  public String toString() {
	    return "Language{" +
	        "id='" + id + '\'' +
	        ", name='" + name + '\'' +
	        ", author='" + author + '\'' +
	        ", fileExtension='" + fileExtension + '\'' +
	        '}';
	  }
}
