package com.iesvirgendelcarmen.com.exercises;

public class HexadecimalNumber {
	private String hexadecimalValue;

	public HexadecimalNumber(String hexadecimalValue) throws IlegalFormatNumberHexadecimalException {
		if ( !hexadecimalValue.matches("^[0-9a-fA-F]+$"))
			throw new IlegalFormatNumberHexadecimalException("Incorrect format hexadecimal number");
		this.hexadecimalValue = hexadecimalValue;
	}

	public String getHexadecimalValue() {
		return hexadecimalValue;
	}

	public void setHexadecimalValue(String hexadecimalValue) throws IlegalFormatNumberHexadecimalException {
		if ( !hexadecimalValue.matches("^[0-9a-fA-F]+$"))
			throw new IlegalFormatNumberHexadecimalException("Incorrect format hexadecimal number");
		this.hexadecimalValue = hexadecimalValue;
	}

	@Override
	public String toString() {
		return "HexadecimalNumber [hexadecimalValue=" + hexadecimalValue + "]";
	}

	public static int convertHexadecimalToDecimal(String hexadecimalString)
			throws IlegalFormatNumberHexadecimalException {
		if ( !hexadecimalString.matches("^[0-9a-fA-F]+$"))
			throw new IlegalFormatNumberHexadecimalException("Incorrect format hexadecimal number");
//		int sum = 0;
//		StringBuilder sBuilder = new StringBuilder(hexadecimalString);
//		String hexadecimalStringReverse = sBuilder.reverse().toString();
//		for (int i = 0; i < hexadecimalStringReverse.length(); i++) {
//			char charValue = hexadecimalStringReverse.toLowerCase().charAt(i);
//			switch (charValue) {
//			case 'a':
//				sum += Math.pow(16, i) * 10;
//				break;
//			case 'b':
//				sum += Math.pow(16, i) * 11;
//				break;
//			case 'c':
//				sum += Math.pow(16, i) * 12;
//				break;
//			case 'd':
//				sum += Math.pow(16, i) * 13;
//				break;
//			case 'e':
//				sum += Math.pow(16, i) * 14;
//				break;
//			case 'f':
//				sum += Math.pow(16, i) * 15;
//				break;
//			default:
//				System.out.println("Valor del caracter: " + Character.getNumericValue(charValue));
//				sum += Math.pow(16, i) * Character.getNumericValue(charValue);
//				break;
//			}

//		}
//
//		return sum;
		return Integer.parseInt(hexadecimalString, 16);


	}

}
