package br.com.rhounsell.checkoutchallenge.entity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.entity.dto.ClientDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Client extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Basket basket;

	@Override
	public ClientDTO toDTO() {
		ClientDTO dto = new ClientDTO();
		dto.setId(this.getId());
		dto.setDescription(this.getDescription());
		dto.setBasket(this.getBasket().toDTO());
		return dto;
	}
}
