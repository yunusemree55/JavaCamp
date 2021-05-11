package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="departments")
public class Department {

	@Id
	@GeneratedValue
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String Name ;
	
	
	
	
	public Department() {
		
	}
	
	
	public Department(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
	
	
	
}
