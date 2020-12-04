package br.com.rhounsell.checkoutchallenge.bo;

import org.springframework.stereotype.Service;

import br.com.rhounsell.checkoutchallenge.base.bo.BaseBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.PromotionDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Promotion;
import br.com.rhounsell.checkoutchallenge.repository.PromotionRepository;

@Service
public class PromotionBO extends BaseBO<PromotionDTO, Promotion, PromotionRepository>{

	public PromotionBO(PromotionRepository instance) {
		super(instance);
	}

}
