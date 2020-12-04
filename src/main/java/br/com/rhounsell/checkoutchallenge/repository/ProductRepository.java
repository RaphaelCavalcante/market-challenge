package br.com.rhounsell.checkoutchallenge.repository;

import org.springframework.stereotype.Repository;

import br.com.rhounsell.checkoutchallenge.base.repository.IRepositoryBase;
import br.com.rhounsell.checkoutchallenge.entity.model.Product;

@Repository
public interface ProductRepository extends IRepositoryBase<Product>{

}
