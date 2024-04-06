//final annotated ListItem POJO

//All these import statements came in by clicking the red X and using Import option from the javax.persistence package
//If you are asked to create a class, interface, constant, etc, you made a spelling or capitalization error!!
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="items")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	public ListItem(){
		super();
	}
	public ListItem(String store, String item){
		super();
		this.store = store;
		this.item = item;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String returnItemDetails( ) {
		return this.store + ": " + this.item;
	}
}