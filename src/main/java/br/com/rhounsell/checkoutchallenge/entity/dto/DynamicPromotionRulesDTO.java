package br.com.rhounsell.checkoutchallenge.entity.dto;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.base.model.EntityDTOBase;
import br.com.rhounsell.checkoutchallenge.entity.model.DynamicPromotionRules;
import br.com.rhounsell.checkoutchallenge.entity.model.enums.SalesPromoFieldType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class DynamicPromotionRulesDTO extends EntityDTOBase {
	private String promoFieldName;
	private String promoFieldValue;
	private SalesPromoFieldType promoFiledType;

	@Override
	public DynamicPromotionRules toEntity() {
		DynamicPromotionRules entity = new DynamicPromotionRules();
		entity.setId(this.getId());
		entity.setDescription(this.getDescription());
		entity.setPromoFieldName(this.getPromoFieldName());
		entity.setPromoFieldValue(this.getPromoFieldValue());
		entity.setPromoFiledType(this.getPromoFiledType());
		
		return entity;
	}

}
