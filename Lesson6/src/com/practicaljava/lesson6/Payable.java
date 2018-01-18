package com.practicaljava.lesson6;

public interface Payable {
    final static int INCREASE_CAP = 20;   // в интерфесе переменная final static всегда !!!!! 
	boolean increasePay(int percent);
}
