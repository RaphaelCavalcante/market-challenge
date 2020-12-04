package br.com.rhounsell.checkoutchallenge.entity.model.enums;

public enum SalePromoCategory {
	DISCOUNT(1), // um campo, amount, com o valor em porcentagem do desconto
	PERIOD(2), //  dois campos, data, que define quando a promoção fica em vigor
	FLASH_SALE(3), // tempo em horas da promoção
	SAME_PRODUCT_AMOUNT(4), // quantidade de um mesmo produto ganha desconto
	PRODUCT_GIVE_AWAY(5), // compra um produto e leva outro
//	STORE_POINTS(6), // cada produto com promo recebe ponto, ao fim com maior pontos recebe uma outra promo
	COUPON(6), // outra promo ao inserir o cupom
	PRICE_MATCH(7), // produtos com o mesmo valor, ganha outra promo
	VALUE_AMOUNT(8), // quantidade de valor, atingiu o valor, precisa de outra promo
	PRODUCT_AMOUNT(9), // quantidade de produtos no cesto, inteiro, amont
	STORAGE_LIMIT (10); // booleano, ate duar os estoques
	
	private Integer saleIndex;
	
	private SalePromoCategory(Integer saleIndex) {
		this.saleIndex = saleIndex;
	}
	public Integer getPromoCode() {
		return this.saleIndex;
	}
}
