package com.rules;

import java.util.PriorityQueue;

import com.analyzer.Lexeme;

public abstract class ExpressionDash {
	public abstract boolean parse(PriorityQueue<Lexeme> lexemes);
	public abstract void print();
}
