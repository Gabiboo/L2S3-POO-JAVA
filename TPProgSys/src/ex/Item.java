package ex;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Item {
	long id;
	String type;
	String by;
	Instant time;
	String text;
	String url;
	String title;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public long getTime() {
		return time.getEpochSecond();
	}
	public void setTime(long time) {
		this.time = Instant.ofEpochSecond(time);
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title + "\n" + " " + by + " " + time.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_TIME) + "\n";
		/*
		return "Item\n" +
			"  id=" + id + " type=" + type + " by=" + by + "\n" +
			"  time=" + time + "\n" +
			"  text=" + text + "\n" +
			"  url=" + url + "\n" +
			"  title=" + title + "\n";
		*/
	}
}
