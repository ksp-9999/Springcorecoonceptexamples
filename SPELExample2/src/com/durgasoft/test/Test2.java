package com.durgasoft.test;

import java.util.Date;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test2 {

	public static void main(String[] args) {
		ExpressionParser parser= new SpelExpressionParser();
		Expression expr1 = parser.parseExpression("10 * 20");
		System.out.println(expr1.getValue());
		
		Expression expr2 =parser.parseExpression("true and false");
		System.out.println(expr2.getValue());
		
		Expression expr3 = parser.parseExpression("'true' || 'false'");
		System.out.println(expr3.getValue());
		
		Expression expr4= parser.parseExpression("10 gt 20");
		System.out.println(expr4.getValue());
		
		Expression expr5= parser.parseExpression("10 le 20");
		System.out.println(expr5.getValue());
		
		Expression expr6= parser.parseExpression("10 eq 20");
		System.out.println(expr6.getValue());
		
		Expression expr7= parser.parseExpression("T(Thread).MIN_PRIORITY");
		System.out.println(expr7.getValue());
		
		Date date= null;
		StandardEvaluationContext context= new StandardEvaluationContext(date);
		Expression expr8= parser.parseExpression("date?.toString()");
		System.out.println(expr8.getValue(context));
	}
}
