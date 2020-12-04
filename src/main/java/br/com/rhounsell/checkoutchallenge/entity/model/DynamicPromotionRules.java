package br.com.rhounsell.checkoutchallenge.entity.model;

import javax.persistence.Entity;

import br.com.rhounsell.checkoutchallenge.base.model.EntityBase;
import br.com.rhounsell.checkoutchallenge.entity.dto.DynamicPromotionRulesDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.enums.SalesPromoFieldType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class DynamicPromotionRules extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String promoFieldName;
	private String promoFieldValue;
	private SalesPromoFieldType promoFiledType;

	@Override
	public DynamicPromotionRulesDTO toDTO() {
		DynamicPromotionRulesDTO dto = new DynamicPromotionRulesDTO();
		dto.setId(this.getId());
		
		dto.setDescription(this.getDescription());
		dto.setPromoFieldName(this.getPromoFieldName());
		dto.setPromoFieldValue(this.getPromoFieldValue());
		dto.setPromoFiledType(this.getPromoFiledType());
		return dto;
	}
}
