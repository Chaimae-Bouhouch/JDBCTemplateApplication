package com.octo.repository;

import java.util.List;

import com.octo.model.Language;

public interface LanguageRepository {


	  int save(Language language);
	  int update(Language language);
	  Language findById(String id);
	  int deleteById(String id);
	  List<Language> findAll();
	  List<Language> findByfileExtension(String fileExtension);
	  int deleteAll();
}
