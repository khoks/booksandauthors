package khoks.com.test.graphqlbackend.booksandauthors.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author {
	
	private Long id;
	private String name;
	List<Map<String, Object>> booksList;
	
	public Author() {
		super();
	}
	
	public Author(Long id, String name, List<Book> listOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.booksList = addBooks(listOfBooks);
	}
	
	public Author(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.booksList = new ArrayList<Map<String, Object>>();
	}
	
	
	private List<Map<String, Object>> addBooks(List<Book> listOfBooks) {
		if(null == listOfBooks || listOfBooks.size() == 0) {
			return new ArrayList<Map<String, Object>>();
		}
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		listOfBooks.forEach( (book) -> {
			Map<String, Object> map = new HashMap<String , Object>();
			map.put("id", book.getId());
			map.put("name", book.getName());
			list.add(map);
		});
		return list;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Map<String, Object>> getBooksList() {
		return booksList;
	}
	public void setBooksList(List<Map<String, Object>> booksList) {
		this.booksList = booksList;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", booksList=" + booksList
				+ "]";
	}
	
}
