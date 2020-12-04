package br.com.rhounsell.checkoutchallenge.entity.dto;

import java.util.Collection;

import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.entity.model.Basket;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class BasketDTO extends EntityDTOBase{
	private Collection<ProductDTO> products;
	@Override
	public Basket toEntity() {
		Basket entity = new Basket();
		entity.setId(this.getId());
		entity.setDescription(this.getDescription());
		return entity;
	}

}
