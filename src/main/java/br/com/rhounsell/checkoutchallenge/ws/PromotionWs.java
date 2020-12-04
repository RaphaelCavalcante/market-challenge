package br.com.rhounsell.checkoutchallenge.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhounsell.checkoutchallenge.base.controller.BaseController;
import br.com.rhounsell.checkoutchallenge.bo.PromotionBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.PromotionDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.Promotion;
import br.com.rhounsell.checkoutchallenge.repository.PromotionRepository;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Promotion Controller", description = "Promotion Controller")
@RestController
@RequestMapping(name = "Promotion Controller", path = "/promo")
public class PromotionWs extends BaseController<PromotionDTO, Promotion, PromotionRepository, PromotionBO>{

}
