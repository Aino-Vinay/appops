package com.infra.demo;

public class LibraryServiceNoopImpl implements LibraryService {

	@Override
	public String getMyBooks(String name) {
		return "Nothing";
	}

}
