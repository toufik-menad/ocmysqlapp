/**
 * 
 */
package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author MENAD
 *
 */
@Entity(name="Product")
@Table(name="ITEM")
public class Product 
implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="code", nullable=false,length=40)
	private String code;
	
	
	@Column(name="name", nullable=false,length=40)
	private String name;
	
	
	
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	

}
