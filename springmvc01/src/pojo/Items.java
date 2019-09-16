package pojo;

import java.util.Date;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Items {
	private  int id;
	private String name;
	private float price;
	private String detail;
	private  Date createtime;
	private String pic;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", createtime="
				+ createtime + ", pic=" + pic + "]";
	}
	

}
