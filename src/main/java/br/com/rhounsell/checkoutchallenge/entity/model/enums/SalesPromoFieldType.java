package br.com.rhounsell.checkoutchallenge.entity.model.enums;

public enum SalesPromoFieldType {
	INTEGER(0),
	TEXT(1),
	DATE(3),
	ENTITY(4);
	
	private Integer fieldType;
	
	private SalesPromoFieldType(Integer fieldType) {
		this.fieldType = fieldType;
	}
	
	public Integer getFiledType() {
		return this.fieldType;
	}

}
