package BraceMatcher;

import java.util.Stack;

public class BraceMatch implements IBraceMatch {


	public boolean IsBraceClosingMatch(Character c1, Character c2) {
		if (c1 == null  || c2 == null){
			return false;
		}
		
		if(c1 == '(' && c2 == ')'){
			return true;
		}
		else if(c1 == '{' && c2 == '}'){
			return true;
		}
		else if(c1 == '[' && c2 == ']'){
			return true;
		}else{
			return false;
		}
	}

	public boolean CorrectBraces(String s) {
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
				st.push(s.charAt(i));
			}
			else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'){
				
				if (!st.isEmpty()){
					if(!IsBraceClosingMatch(st.pop(), s.charAt(i))){
						return false;
					}	
				}else{
					return false;
				}
			}
		}
		
		if(st.isEmpty()){
			return true; 
		}
		else { 
			return false;
		}
	}
}
