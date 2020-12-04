package br.com.rhounsell.checkoutchallenge.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhounsell.checkoutchallenge.base.controller.BaseController;
import br.com.rhounsell.checkoutchallenge.bo.ProductBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.ProductDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Product;
import br.com.rhounsell.checkoutchallenge.repository.ProductRepository;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Product Controller", description = "Product Controller")
@RestController
@RequestMapping(name = "Product Controller", path = "/product")
public class ProductWs extends BaseController<ProductDTO, Product, ProductRepository, ProductBO>{

}
