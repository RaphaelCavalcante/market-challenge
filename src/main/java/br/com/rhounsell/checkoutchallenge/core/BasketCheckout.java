package br.com.rhounsell.checkoutchallenge.core;

import java.util.Collection;

import br.com.rhounsell.checkoutchallenge.entity.dto.ProductDTO;
import br.com.rhounsell.checkoutchallenge.entity.dto.PromotionDTO;
import br.com.rhounsell.checkoutchallenge.entity.model.DynamicPromotionRules;
import br.com.rhounsell.checkoutchallenge.entity.model.enums.SalePromoCategory;

public class BasketCheckout {
	public void calculateAmountOfProducts(Collection<ProductDTO> products) {
		Integer checkoutValue = 0;
		for (ProductDTO product : products) {
			checkoutValue += product.getPrice();
		}
	}

	public void test(Collection<ProductDTO> products) {
		for (ProductDTO product : products) {
			for (PromotionDTO promo : product.getPromo()) {
				if (promo.getType().getCategory().equals(SalePromoCategory.SAME_PRODUCT_AMOUNT)) {
					handleSameProductAmount(promo.getType().getRules(), products);
				}
			}
		}
	}

	void handleSameProductAmount(Collection<DynamicPromotionRules> rules, Collection<ProductDTO> products) {
		Integer sameProduct = 0;
		for(ProductDTO prod: products) {
		}
	}
}
