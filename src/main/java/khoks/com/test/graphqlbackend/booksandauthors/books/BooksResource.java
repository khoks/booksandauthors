package khoks.com.test.graphqlbackend.booksandauthors.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksResource {

	@GetMapping(path = "/getbooks")
	public Map<String, List<Book>> getBooks() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(1l, "book1", 1l));
		books.add(new Book(2l, "book2", 1l));
		books.add(new Book(3l, "book3", 2l));
		Map<String, List<Book>> returnObj = new HashMap<String, List<Book>>();
		returnObj.put("listOfBooks", books);
		return returnObj;
	}
	
	@GetMapping(path = "/getbooks/{id}")
	public Book getBookById(@PathVariable(name = "id", required = true) Long id) {
		ArrayList<Book> books = new ArrayList<Book>();
		return new Book(id, "book" + id, 1l);
	}
	
}
