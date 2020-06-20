package khoks.com.test.graphqlbackend.booksandauthors.books;


public class Book {

	private Long id;
	private String name;
	private Long authorId;
	
	public Book() {
		super();
	}

	
	
	public Book(Long id, String name, Long authorId) {
		super();
		this.id = id;
		this.name = name;
		this.authorId = authorId;
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

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorId=" + authorId + "]";
	}
	
	
	
}
