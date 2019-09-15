package p1;

public class Book {
private int bid;
private String bname;
private Publisher publish;
public void setBid(int bid) {
	this.bid = bid;
}
public void setBname(String bname) {
	this.bname = bname;
}
public void setPublish(Publisher publish) {
	this.publish = publish;
}
public int getBid() {
	return bid;
}
public String getBname() {
	return bname;
}
public Publisher getPublish() {
	return publish;
}

}
