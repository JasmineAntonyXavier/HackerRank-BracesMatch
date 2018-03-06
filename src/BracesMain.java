import BraceMatcher.BraceMatch;
import BraceMatcher.IBraceMatch;

public class BracesMain {

	public static void main(String[] args) {
		IBraceMatch match = new BraceMatch();
		System.out.println(match.CorrectBraces("()"));	
	}
}
