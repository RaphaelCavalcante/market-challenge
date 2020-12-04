package br.com.rhounsell.checkoutchallenge.entity.dto;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.entity.model.PromotionType;
import br.com.rhounsell.checkoutchallenge.entity.model.enums.SalePromoCategory;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PromotionTypeDTO extends EntityDTOBase {
	private SalePromoCategory category;
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<DynamicPromotionRulesDTO> rules;

	@Override
	public PromotionType toEntity() {
		PromotionType entity = new PromotionType();
		entity.setId(this.getId());
		entity.setDescription(this.getDescription());
		entity.setCategory(this.getCategory());
		if (this.rules != null) {
			entity.setRules(this.rules.stream().sorted().map(DynamicPromotionRulesDTO::toEntity).collect(Collectors.toSet()));
		}
		return entity;
	}

}
