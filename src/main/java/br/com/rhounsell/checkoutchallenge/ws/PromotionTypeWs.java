package br.com.rhounsell.checkoutchallenge.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rhounsell.checkoutchallenge.base.controller.BaseController;
import br.com.rhounsell.checkoutchallenge.bo.PromotionTypeBO;
import br.com.rhounsell.checkoutchallenge.entity.dto.PromotionTypeDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.PromotionType;
import br.com.rhounsell.checkoutchallenge.repository.PromotionTypeRepository;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "PromotionType Controller", description = "Promotion Type Controller")
@RestController
@RequestMapping(name = "Promotion Type Controller", path = "/promo-type")
public class PromotionTypeWs extends BaseController<PromotionTypeDTO, PromotionType, PromotionTypeRepository, PromotionTypeBO> {

}
