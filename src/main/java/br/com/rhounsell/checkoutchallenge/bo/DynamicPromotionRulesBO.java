package br.com.rhounsell.checkoutchallenge.bo;

import org.springframework.stereotype.Service;

import br.com.rhounsell.checkoutchallenge.base.bo.BaseBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.DynamicPromotionRulesDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.DynamicPromotionRules;
import br.com.rhounsell.checkoutchallenge.repository.DynamicPromotionRulesRepository;

@Service
public class DynamicPromotionRulesBO extends BaseBO<DynamicPromotionRulesDTO, DynamicPromotionRules, DynamicPromotionRulesRepository>{

	public DynamicPromotionRulesBO(DynamicPromotionRulesRepository instance) {
		super(instance);
	}

}
