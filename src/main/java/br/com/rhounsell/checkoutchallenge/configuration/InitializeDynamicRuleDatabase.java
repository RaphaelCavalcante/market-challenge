package br.com.rhounsell.checkoutchallenge.configuration;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import br.com.rhounsell.checkoutchallenge.entity.model.DynamicPromotionRules;
import br.com.rhounsell.checkoutchallenge.entity.model.PromotionType;
import br.com.rhounsell.checkoutchallenge.entity.model.enums.SalePromoCategory;
import br.com.rhounsell.checkoutchallenge.entity.model.enums.SalesPromoFieldType;
import br.com.rhounsell.checkoutchallenge.repository.DynamicPromotionRulesRepository;
import br.com.rhounsell.checkoutchallenge.repository.PromotionTypeRepository;

@Configuration
public class InitializeDynamicRuleDatabase implements ApplicationRunner {
	@Autowired
	private DynamicPromotionRulesRepository dprRepo;
	@Autowired
	private PromotionTypeRepository ptRepo;

	private Collection<DynamicPromotionRules> defineBaseRules(SalePromoCategory category) {
		ArrayList<DynamicPromotionRules> rules = new ArrayList<DynamicPromotionRules>();
		switch (category) {
		case DISCOUNT:
			DynamicPromotionRules percentRule = new DynamicPromotionRules();
			percentRule.setPromoFieldName("percentage");
			percentRule.setPromoFiledType(SalesPromoFieldType.INTEGER);

			rules.add(percentRule);
			break;
		case PERIOD:
			DynamicPromotionRules dateInit = new DynamicPromotionRules();
			dateInit.setPromoFieldName("date_begin");
			dateInit.setPromoFiledType(SalesPromoFieldType.DATE);
			DynamicPromotionRules dateEnd = new DynamicPromotionRules();
			dateEnd.setPromoFieldName("date_end");
			dateEnd.setPromoFiledType(SalesPromoFieldType.DATE);

			rules.add(dateInit);
			rules.add(dateEnd);
			break;
		case FLASH_SALE:
			DynamicPromotionRules promoTime = new DynamicPromotionRules();
			promoTime.setPromoFieldName("hours");
			promoTime.setPromoFiledType(SalesPromoFieldType.INTEGER);

			rules.add(promoTime);
			break;
		case SAME_PRODUCT_AMOUNT:
			DynamicPromotionRules sameProductQnt = new DynamicPromotionRules();
			sameProductQnt.setPromoFieldName("prod_qnt");
			sameProductQnt.setPromoFiledType(SalesPromoFieldType.INTEGER);

			DynamicPromotionRules product = new DynamicPromotionRules();
			product.setPromoFieldName("product");
			product.setPromoFiledType(SalesPromoFieldType.ENTITY);

			rules.add(product);
			rules.add(sameProductQnt);
			break;
		case PRODUCT_GIVE_AWAY:
			DynamicPromotionRules productGive = new DynamicPromotionRules();
			productGive.setPromoFieldName("product");
			productGive.setPromoFiledType(SalesPromoFieldType.ENTITY);

			rules.add(productGive);
			break;
//		case STORE_POINTS:
//			break;
		case COUPON:
			DynamicPromotionRules coupon = new DynamicPromotionRules();
			coupon.setPromoFieldName("coupon");
			coupon.setPromoFiledType(SalesPromoFieldType.TEXT);

			rules.add(coupon);
			break;
		case PRICE_MATCH:
			DynamicPromotionRules priceMatch = new DynamicPromotionRules();
			priceMatch.setPromoFieldName("price");
			priceMatch.setPromoFiledType(SalesPromoFieldType.INTEGER);

			rules.add(priceMatch);
			break;
		case VALUE_AMOUNT:
			DynamicPromotionRules priceAmount = new DynamicPromotionRules();
			priceAmount.setPromoFieldName("price");
			priceAmount.setPromoFiledType(SalesPromoFieldType.INTEGER);

			rules.add(priceAmount);
			break;
		case PRODUCT_AMOUNT:
			DynamicPromotionRules prodAmount = new DynamicPromotionRules();
			prodAmount.setPromoFieldName("quantity");
			prodAmount.setPromoFiledType(SalesPromoFieldType.INTEGER);

			rules.add(prodAmount);
			break;
		case STORAGE_LIMIT:
			DynamicPromotionRules store = new DynamicPromotionRules();
			store.setPromoFieldName("store_quantity");
			store.setPromoFiledType(SalesPromoFieldType.INTEGER);

			rules.add(store);
			break;
		}
		return rules;
	}

	private Collection<PromotionType> createBasePromotionTypes() {
		Collection<PromotionType> types = new ArrayList<PromotionType>();

		PromotionType discount = new PromotionType();
		discount.setCategory(SalePromoCategory.DISCOUNT);
		PromotionType period = new PromotionType();
		period.setCategory(SalePromoCategory.PERIOD);
		PromotionType flashSale = new PromotionType();
		flashSale.setCategory(SalePromoCategory.FLASH_SALE);
		PromotionType sameProdAmount = new PromotionType();
		sameProdAmount.setCategory(SalePromoCategory.SAME_PRODUCT_AMOUNT);
		PromotionType prodGiveAway = new PromotionType();
		prodGiveAway.setCategory(SalePromoCategory.PRODUCT_GIVE_AWAY);
		PromotionType coupon = new PromotionType();
		coupon.setCategory(SalePromoCategory.COUPON);
		PromotionType priceMatch = new PromotionType();
		priceMatch.setCategory(SalePromoCategory.PRICE_MATCH);
		PromotionType valueAmount = new PromotionType();
		valueAmount.setCategory(SalePromoCategory.VALUE_AMOUNT);
		PromotionType productsAmount = new PromotionType();
		productsAmount.setCategory(SalePromoCategory.PRODUCT_AMOUNT);
		PromotionType storageLimit = new PromotionType();
		storageLimit.setCategory(SalePromoCategory.STORAGE_LIMIT);

		discount.setDescription("Porcentagem de desconto");
		period.setDescription("Inicio e Fim da Promoção");
		flashSale.setDescription("Duração da Promoção");
		sameProdAmount.setDescription("Quantidade do produto");
		prodGiveAway.setDescription("Ganhe um e leve outro");
		coupon.setDescription("Cupom de promoção");
		priceMatch.setDescription("Preços iguais");
		valueAmount.setDescription("Preço maior ou igual");
		productsAmount.setDescription("Quantidade de produtos");
		storageLimit.setDescription("Quantidade de produtos no estoque");

		discount.setRules(this.defineBaseRules(SalePromoCategory.DISCOUNT));
		period.setRules(this.defineBaseRules(SalePromoCategory.PERIOD));
		flashSale.setRules(this.defineBaseRules(SalePromoCategory.FLASH_SALE));
		sameProdAmount.setRules(this.defineBaseRules(SalePromoCategory.SAME_PRODUCT_AMOUNT));
		prodGiveAway.setRules(this.defineBaseRules(SalePromoCategory.PRODUCT_GIVE_AWAY));
		coupon.setRules(this.defineBaseRules(SalePromoCategory.COUPON));
		priceMatch.setRules(this.defineBaseRules(SalePromoCategory.PRICE_MATCH));
		valueAmount.setRules(this.defineBaseRules(SalePromoCategory.VALUE_AMOUNT));
		productsAmount.setRules(this.defineBaseRules(SalePromoCategory.PRODUCT_AMOUNT));
		storageLimit.setRules(this.defineBaseRules(SalePromoCategory.STORAGE_LIMIT));

		types.add(discount);
		types.add(period);
		types.add(flashSale);
		types.add(sameProdAmount);
		types.add(prodGiveAway);
		types.add(coupon);
		types.add(priceMatch);
		types.add(valueAmount);
		types.add(productsAmount);
		types.add(storageLimit);
		
		return types;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for(PromotionType type:this.createBasePromotionTypes()) {
			this.ptRepo.save(type);
		}

	}
}
