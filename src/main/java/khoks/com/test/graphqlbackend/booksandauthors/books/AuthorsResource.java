package khoks.com.test.graphqlbackend.booksandauthors.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorsResource {

	@GetMapping(path="/getauthors")
	public Map<String, List<Author>> getAuthors() {
		List<Book> books = null;
		Map<String, Object> map = null;
		List<Map<String, Object>> list = null;
		List<Author> authors = new ArrayList<Author>();
		
		books = new ArrayList<Book>();
		books.add(new Book(1l, "book1", 1l));
		books.add(new Book(2l, "book2", 1l));
		authors.add(new Author(1l, "author1", books));
		
		books = new ArrayList<Book>();
		books.add(new Book(3l, "book3", 2l));
		authors.add(new Author(2l, "author2", books));
		
		Map<String, List<Author>> returnObj = new HashMap<String, List<Author>>();
		returnObj.put("listOfAuthors", authors);
		
		return returnObj;
		
	}
	
	@GetMapping(path = "/getauthors/{id}")
	public Author getAuthorById(@PathVariable(name = "id", required = true) Long id) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1l, "book1", 1l));
		books.add(new Book(2l, "book2", 1l));
		return new Author(1l, "author1", books);
	}
	
}
