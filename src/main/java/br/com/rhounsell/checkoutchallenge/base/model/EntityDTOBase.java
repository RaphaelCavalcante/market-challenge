package br.com.rhounsell.checkoutchallenge.base.model;

import java.time.Instant;
import java.util.Date;

import lombok.Data;

@Data
public abstract class EntityDTOBase {
	private Long id;
	private Date timestamp = Date.from(Instant.now());
	private String description;
	
	public abstract EntityBase toEntity();
}
