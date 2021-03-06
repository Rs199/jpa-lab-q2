package jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "author_table")
public class Author {
	
	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="name")
	private String name;
	
	public Author() {
		super();
	}

	public Author(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Author [ID=" + id + ", name="+name+ "]";
	}

}
