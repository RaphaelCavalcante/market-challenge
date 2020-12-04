package br.com.rhounsell.checkoutchallenge.entity.dto;

import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.entity.model.Promotion;
import br.com.rhounsell.checkoutchallenge.entity.model.PromotionType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class PromotionDTO extends EntityDTOBase {
	private PromotionType type;
	@Override
	public Promotion toEntity() {
		Promotion entity = new Promotion();
		entity.setId(this.getId());
		entity.setDescription(this.getDescription());
		entity.setType(this.getType());
		return entity;
	}

}
