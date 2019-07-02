package alibrentity.rytelran.

import java.util.Arrays;

public class Book {
	private static int hashCode(Object[] array) {
		int prime = 31;
		if (array == null)
			return 0;
		int result = 1;
		for (int index = 0; index < array.length; index++) {
			result = prime * result
					+ (array[index] == null ? 0 : array[index].hashCode());
		}
		return result;
	}

	private String titl;
	private String[] authors;
	private int pages;
	private int ispn; //nomer knijki
	
	public Book(String titl, String[] authors, int pages, int ispn) {
		super();
		this.titl = titl;
		this.authors = authors;
		this.pages = pages;
		this.ispn = ispn;
	}

	public String getTitl() {
		return titl;
	}

	public void setTitl(String titl) {
		this.titl = titl;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getIspn() {
		return ispn;
	}

	public void setIspn(int ispn) {
		this.ispn = ispn;
	}

	public String toString() {
		return "Book [titl=" + titl + ", authors="
				+ (authors != null ? Arrays.asList(authors) : null)
				+ ", pages=" + pages + ", ispn=" + ispn + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Book.hashCode(authors);
		result = prime * result + ispn;
		result = prime * result + pages;
		result = prime * result + ((titl == null) ? 0 : titl.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (!Arrays.equals(authors, other.authors))
			return false;
		if (ispn != other.ispn)
			return false;
		if (pages != other.pages)
			return false;
		if (titl == null) {
			if (other.titl != null)
				return false;
		} else if (!titl.equals(other.titl))
			return false;
		return true;
	}
	
	

}
