package com.durgasoft.test;

import com.durgasoft.beans.MyString;
import java.lang.reflect.Method;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c= Class.forName("com.durgasoft.beans.MyString");
		Method method= c.getDeclaredMethod("reverseString", new Class[] {java.lang.String.class});
		
		StandardEvaluationContext context= new StandardEvaluationContext();
		context.registerFunction("reverse", method);
		context.setVariable("str", "sai prasad");
		
		ExpressionParser parser= new SpelExpressionParser();
		Expression expr=parser.parseExpression("#reverse(#str)");
		expr.getValue(context);
		
		expr=parser.parseExpression("new java.util.Date().toString()");
		System.out.println(expr.getValue());
		
		expr= parser.parseExpression("'sai prasad'".toUpperCase());
		System.out.println(expr.getValue());
		

	}

}
