package br.com.rhounsell.checkoutchallenge.entity.dto;

import java.util.Collection;
import java.util.stream.Collectors;

import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.entity.model.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper=true)
public class ProductDTO extends EntityDTOBase {
	private Integer  price;
	private Integer quantity;
	private BasketDTO basket;
	private Collection<PromotionDTO> promo;
	@Override
	public Product toEntity() {
		Product entity = new Product();
		entity.setId(this.getId());
		entity.setQuantity(this.getQuantity());
		entity.setDescription(this.getDescription());
		entity.setPrice(this.getPrice());
		if(this.promo != null) {
			entity.setPromos(this.promo.stream().sorted().map(PromotionDTO::toEntity).collect(Collectors.toList()));
		}
		return entity;
	}

}
