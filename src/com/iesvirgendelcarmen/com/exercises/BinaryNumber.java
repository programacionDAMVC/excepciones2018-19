package com.iesvirgendelcarmen.com.exercises;

public class BinaryNumber {

	private String binaryValue;

	public BinaryNumber(String binaryValue) throws IlegalFormatNumberBinaryException {
		if ( !binaryValue.matches("^[01]+$"))
			throw new IlegalFormatNumberBinaryException("Incorrect format binary number");
		this.binaryValue = binaryValue;
	}

	public String getBinaryValue() {
		return binaryValue;
	}

	public void setBinaryValue(String binaryValue) throws IlegalFormatNumberBinaryException {
		if ( !binaryValue.matches("^[01]+$"))
			throw new IlegalFormatNumberBinaryException("Incorrect format binary number");
		this.binaryValue = binaryValue;
	}

	@Override
	public String toString() {
		return "BinaryNumber [binaryValue=" + binaryValue + "]";
	}

	public static int convertBinaryToDecimal(String binaryString)
			throws IlegalFormatNumberBinaryException {
		if ( !binaryString.matches("^[01]+$"))
			throw new IlegalFormatNumberBinaryException("Incorrect format binary number");
//		int sum = 0;
//		StringBuilder sBuilder = new StringBuilder(binaryString);
//		String binaryStringReverse = sBuilder.reverse().toString();
//		for (int i = 0; i < binaryStringReverse.length(); i++) {
//			if ( binaryStringReverse.charAt(i) == '1' )
//				sum += Math.pow(2, i);
//		}
//
//		return sum;
		return Integer.parseInt(binaryString, 2);


	}

}
