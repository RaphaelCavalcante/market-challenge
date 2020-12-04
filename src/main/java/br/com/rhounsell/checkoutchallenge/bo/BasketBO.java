package br.com.rhounsell.checkoutchallenge.bo;

import org.springframework.stereotype.Service;

import br.com.rhounsell.checkoutchallenge.base.bo.BaseBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.BasketDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Basket;
import br.com.rhounsell.checkoutchallenge.repository.BasketRepository;
@Service
public class BasketBO extends BaseBO<BasketDTO, Basket, BasketRepository> {

	public BasketBO(BasketRepository instance) {
		super(instance);
	}

}
