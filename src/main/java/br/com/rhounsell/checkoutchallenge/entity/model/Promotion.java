package br.com.rhounsell.checkoutchallenge.entity.model;

import javax.persistence.Entity;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.entity.dto.PromotionDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Promotion extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PromotionType type;
	
	@Override
	public PromotionDTO toDTO() {
		PromotionDTO dto = new PromotionDTO();
		dto.setId(this.getId());
		dto.setDescription(this.getDescription());
		dto.setType(this.getType());
		return dto;
	}

}
