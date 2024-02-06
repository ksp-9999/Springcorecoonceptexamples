package com.durgasoft.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.durgasoft.beans.Calculator;

public class Test {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		ExpressionParser parser= new SpelExpressionParser();
		StandardEvaluationContext context= new StandardEvaluationContext(cal);
		context.setVariable("number1", 10);
		context.setVariable("number2", 20);
		
		Expression expr1= parser.parseExpression("num1=#number1");
		expr1.getValue(context);
		Expression expr2= parser.parseExpression("num2=#number2");
		expr2.getValue(context);

		
		System.out.println(cal.add());
		System.out.println(cal.mul());
		System.out.println(cal.sub());
		

	}

}
