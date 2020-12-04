package br.com.rhounsell.checkoutchallenge.base.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import jdk.jfr.Timestamp;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class EntityBase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	
	@Timestamp
	private Date timestamp;
	
	public abstract EntityDTOBase toDTO();

}
