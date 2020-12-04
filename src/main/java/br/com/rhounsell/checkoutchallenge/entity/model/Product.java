package br.com.rhounsell.checkoutchallenge.entity.model;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.Entity;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.entity.dto.ProductDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Product extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer price;
	private Integer quantity;
	private Collection<Promotion> promos;
	@Override
	public ProductDTO toDTO() {
		ProductDTO dto = new ProductDTO();
		dto.setDescription(this.getDescription());
		dto.setQuantity(this.getQuantity());
		dto.setPrice(price);
		if(this.promos != null) {
			dto.setPromo(this.promos.stream().sorted().map(Promotion::toDTO).collect(Collectors.toList()));
		}
		return dto;
	}

}
