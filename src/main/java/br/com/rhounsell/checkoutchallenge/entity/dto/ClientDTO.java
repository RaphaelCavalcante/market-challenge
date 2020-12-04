package br.com.rhounsell.checkoutchallenge.entity.dto;

import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.entity.model.Client;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class ClientDTO extends EntityDTOBase{
	private BasketDTO basket;
	@Override
	public Client toEntity() {
		Client entity = new Client();
		entity.setId(this.getId());
		entity.setDescription(this.getDescription());
		entity.setBasket(this.getBasket().toEntity());
		return entity;
	}

}
