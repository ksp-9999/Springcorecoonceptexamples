package com.durgasoft.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ExpressionParser parser= new SpelExpressionParser();
		Expression expr= parser.parseExpression("10+10");
		System.out.println(expr.getValue());
		
		Expression expr2= parser.parseExpression("'abc'+'def'");
		System.out.println(expr2.getValue());
		
		Expression expr3= parser.parseExpression("'Spring' matches 'Sp.*'");
		System.out.println(expr3.getValue());
		
		Expression expr4= parser.parseExpression("'saigmail.com' matches '[a-zA-Z0-9]*@gmail.com'");
		System.out.println(expr4.getValue());

	}

}
