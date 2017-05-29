package models;

public class EventModel {

	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String data;
	String name;
	public String toString()
	{
		return "{ \"id\":"+id+" , \"name\":"+name+"\" ,\"data\":\""+data+"\"}";
	}
}
