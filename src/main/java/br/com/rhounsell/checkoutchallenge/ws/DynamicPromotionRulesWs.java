package br.com.rhounsell.checkoutchallenge.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhounsell.checkoutchallenge.base.controller.BaseController;
import br.com.rhounsell.checkoutchallenge.bo.DynamicPromotionRulesBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.DynamicPromotionRulesDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.DynamicPromotionRules;
import br.com.rhounsell.checkoutchallenge.repository.DynamicPromotionRulesRepository;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Promotion Rules Controller", description = "Basket Controller")
@RestController
@RequestMapping(name = "Promotion Rules Controller", path = "/promo-rules")
public class DynamicPromotionRulesWs extends BaseController<DynamicPromotionRulesDTO, DynamicPromotionRules, DynamicPromotionRulesRepository, DynamicPromotionRulesBO>{
}
