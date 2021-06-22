package model;

public class Libraries implements Comparable<Libraries>{

	private int library_id;
	private String library_name;
	
	public int getLibrary_id() {
		return library_id;
	}
	public void setLibrary_id(int library_id) {
		this.library_id = library_id;
	}
	public String getLibrary_name() {
		return library_name;
	}
	public void setLibrary_name(String library_name2) {
		this.library_name = library_name2;
	}
	
	public Libraries(int library_id, String library_name) {
		super();
		this.library_id = library_id;
		this.library_name = library_name;
	}
	
	public Libraries() {
		super();
	}
	
	@Override
	public String toString() {
		return "Libraries [library_id=" + library_id + ", library_name=" + library_name + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((library_name == null) ? 0 : library_name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libraries other = (Libraries) obj;
		if (library_name == null) {
			if (other.library_name != null)
				return false;
		} else if (!library_name.equals(other.library_name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Libraries o) {
		
		return this.getLibrary_name().compareTo(o.getLibrary_name());
	}
}
	
