package br.com.rhounsell.checkoutchallenge.bo;

import org.springframework.stereotype.Service;

import br.com.rhounsell.checkoutchallenge.base.bo.BaseBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.ProductDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Product;
import br.com.rhounsell.checkoutchallenge.repository.ProductRepository;

@Service
public class ProductBO extends BaseBO<ProductDTO, Product, ProductRepository>{

	public ProductBO(ProductRepository instance) {
		super(instance);
	}

}
