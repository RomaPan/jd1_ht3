package by.htp.lib.dao;

import java.util.List;

import by.htp.lib.entity.Book;

public interface LibDAO {

	void add(Book b);
	boolean remove(int id);
	List<Book> find(String title);
}
