package br.com.rhounsell.checkoutchallenge.entity.model;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.entity.dto.BasketDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Basket extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable
	private Collection<Product> products;
	
	@Override
	public BasketDTO toDTO() {
		BasketDTO dto = new BasketDTO();
		dto.setId(this.getId());
		dto.setDescription(this.getDescription());
		if(this.products != null) {
			this.products.stream().sorted().map(Product::toDTO).collect(Collectors.toList());
		}
		return dto;
	}

}
