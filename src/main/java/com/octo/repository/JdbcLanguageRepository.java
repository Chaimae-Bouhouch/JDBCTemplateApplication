package com.octo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.octo.model.Language;

public class JdbcLanguageRepository implements LanguageRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Language language) {
		
		return jdbcTemplate.update("INSERT INTO languages (id, name, author, fileExtension) VALUES(?,?,?,?)",
		        new Object[] { language.getId(),language.getName(),language.getAuthor(),language.getFileExtension() });
	}

	@Override
	public int update(Language language) {
		return jdbcTemplate.update("UPDATE languages SET name=?, author=?, fileExtension=? WHERE id=?",
		        new Object[] { language.getId(),language.getName(),language.getAuthor(),language.getFileExtension() });
	}

	@Override
	public Language findById(String id) {
		try {
		      Language language = jdbcTemplate.queryForObject("SELECT * FROM languages WHERE id=?",
		          BeanPropertyRowMapper.newInstance(Language.class), id);
		      return language;
		    } catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		    }
	}

	@Override
	public int deleteById(String id) {
		return jdbcTemplate.update("DELETE FROM languages WHERE id=?", id);
	}

	@Override
	public List<Language> findAll() {
	    return jdbcTemplate.query("SELECT * from languages", BeanPropertyRowMapper.newInstance(Language.class));

	}

	@Override
	public List<Language> findByfileExtension(String fileExtension) {
		return jdbcTemplate.query("SELECT * from languages WHERE fileExtention=?",
		        BeanPropertyRowMapper.newInstance(Language.class), fileExtension);
	}

	@Override
	public int deleteAll() {
		return jdbcTemplate.update("DELETE from languages");
	}

}
