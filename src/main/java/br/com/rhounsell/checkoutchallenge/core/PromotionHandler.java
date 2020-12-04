package br.com.rhounsell.checkoutchallenge.core;

public class PromotionHandler {
	public float handleDiscountPromotion(Integer price, String discount) {
		float percentage = (price * 100)/ Integer.valueOf(discount);
		return percentage;
	}
	
	
}
