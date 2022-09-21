package learning.collection.framework.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class MapIterationDemo {
	
	public static void main(String[] args) {
		Map<Book, Author> bookAuthorMap = new HashMap<>();
		Book book1 = new Book(1, "Harry Potter and the Philosopher's Stone");
		Book book2 = new Book(2, "A Game of Thrones");
		Book book3 = new Book(3, "A Clash of Kings");
		
		Author author1 = new Author(1, "J K Rowling");
		Author author2 = new Author(2, "George R R Martin");
		
		bookAuthorMap.put(book1, author1);
		bookAuthorMap.put(book2, author2);
		bookAuthorMap.put(book3, author2);
		
		//Iterating over value column of the Map using map.values()
		Collection<Author> authorsList = bookAuthorMap.values();
		System.out.println("The different authors are: ");
		for (Author author : authorsList) {
			System.out.println(author.authorName);
		}
		System.out.println();
		
		//Iterating over key column of the Map using map.keySet()
		Set<Book> booksSet = bookAuthorMap.keySet();
		System.out.println("The different books with their respective authors are (using KeySet):");
		for (Book book : booksSet) {
			Author author = bookAuthorMap.get(book);
			System.out.println(book.getBookName()+": "+author.authorName);
		}
		System.out.println();
		
		//Iterating over key and value of the Map using Set<Entry>
		Set<Entry<Book, Author>> bookAuthorEntries = bookAuthorMap.entrySet();
		System.out.println("The different books with their respective authors are (using EntrySet):");
		for (Entry<Book, Author> bookAuthorEntry : bookAuthorEntries) {
			Book book = bookAuthorEntry.getKey();
			Author author = bookAuthorEntry.getValue();
			System.out.println(book.getBookName()+": "+author.authorName);
		}
	}
}

class Book {	
	private Integer bookId;
	private String bookName;
	
	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public Book(Integer bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}
}

class Author {
	Integer authorId;
	String authorName;
	
	public Author(Integer authorId, String authorName) {
		this.authorId = authorId;
		this.authorName = authorName;
	}
}
