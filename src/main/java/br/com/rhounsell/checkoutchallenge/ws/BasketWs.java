package br.com.rhounsell.checkoutchallenge.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhounsell.checkoutchallenge.base.controller.BaseController;
import br.com.rhounsell.checkoutchallenge.bo.BasketBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.BasketDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Basket;
import br.com.rhounsell.checkoutchallenge.repository.BasketRepository;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Basket Controller", description = "Basket Controller")
@RestController
@RequestMapping(name = "Basket Controller", path = "/basket")
public class BasketWs extends BaseController<BasketDTO, Basket, BasketRepository, BasketBO>{

}
