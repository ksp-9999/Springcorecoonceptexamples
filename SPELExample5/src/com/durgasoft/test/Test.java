package com.durgasoft.test;

import java.util.ArrayList;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.durgasoft.beans.City_State;
import com.durgasoft.beans.City_State_Colection;

public class Test {

	public static void main(String[] args) {
		City_State_Colection csc= new City_State_Colection();
		StandardEvaluationContext context= new StandardEvaluationContext(csc);
		ExpressionParser parser= new SpelExpressionParser();
		Expression expr= parser.parseExpression("al.?[state == 'KA']");
		ArrayList<City_State> al= (ArrayList<City_State>) expr.getValue(context);
		System.out.println(al);

	}

}
