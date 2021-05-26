package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job")
public class Job {
	
	@Id
	@GeneratedValue
	@Column(name="jobId")
	private int id;
	
	
	@Column(name="jobTitle")
	private String jobTitle;
	

}
