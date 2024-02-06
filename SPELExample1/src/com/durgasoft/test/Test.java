package com.durgasoft.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.durgasoft.beans.Calculator;

public class Test {
	public static void main(String[] args) {
//		ExpressionParser parser= new SpelExpressionParser();
//		Expression expr= parser.parseExpression("10+10");
//		System.out.println(expr.getValue());
		Calculator cal = new Calculator();
		StandardEvaluationContext std= new StandardEvaluationContext(cal); //every detail of the cal object will be stored in the std context
		ExpressionParser parser= new SpelExpressionParser();
		Expression expr1= parser.parseExpression("num1");
		expr1.setValue(std, 10);
		Expression expr2= parser.parseExpression("num2");
		expr2.setValue(std, 5);
		
		System.out.println("Add: "+cal.add());
		System.out.println("Sub: "+cal.sub());
		System.out.println("Mul: "+cal.mul());
		cal.setNum1(10);
		cal.setNum2(20);
		
	}
}
