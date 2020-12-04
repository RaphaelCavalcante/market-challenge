package br.com.rhounsell.checkoutchallenge.bo;

import org.springframework.stereotype.Service;

import br.com.rhounsell.checkoutchallenge.base.bo.BaseBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.PromotionTypeDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.PromotionType;
import br.com.rhounsell.checkoutchallenge.repository.PromotionTypeRepository;

@Service
public class PromotionTypeBO extends BaseBO<PromotionTypeDTO, PromotionType, PromotionTypeRepository>{

	public PromotionTypeBO(PromotionTypeRepository instance) {
		super(instance);
	}

}
