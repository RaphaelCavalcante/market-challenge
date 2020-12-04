package br.com.rhounsell.checkoutchallenge.entity.model;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.entity.dto.PromotionTypeDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.enums.SalePromoCategory;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class PromotionType extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SalePromoCategory category;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<DynamicPromotionRules> rules;
	@Override
	public PromotionTypeDTO toDTO() {
		PromotionTypeDTO dto = new PromotionTypeDTO();
		dto.setId(this.getId());
		dto.setDescription(this.getDescription());
		dto.setCategory(this.getCategory());
		if(this.rules != null) {
			dto.setRules(this.rules.stream().map(DynamicPromotionRules::toDTO).collect(Collectors.toSet()));
		}
		return dto;
	}

}
