package com.ssafy.h_fileio.io.process.object;

import java.io.Serializable;

// TODO: Person 을 직렬화 가능하도록 처리하시오.
public class Person implements Serializable{
	private static final long serialVersionUID = 1114463759574236215L;
	
	private String id;
	private transient String pass;
	
	public Person(String id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s, %s", id, pass);
	}
}
