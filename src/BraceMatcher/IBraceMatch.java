package BraceMatcher;

public interface IBraceMatch {

	boolean IsBraceClosingMatch(Character c1, Character c2);
	boolean CorrectBraces(String s);
}
