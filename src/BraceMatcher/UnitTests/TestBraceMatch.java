package BraceMatcher.UnitTests;
import org.junit.runners.JUnit4;

import BraceMatcher.BraceMatch;
import BraceMatcher.IBraceMatch;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class TestBraceMatch {

	private IBraceMatch matcher;
    @Before
    public void runBeforeTestMethod() {
        matcher = new BraceMatch();
    }
    
    @Test
    public void IsBraceClosingMatch_Paranthesis_ReturnsTrue(){
    	assertEquals(true, matcher.IsBraceClosingMatch('(', ')'));
    }
    
    @Test
    public void IsBraceClosingMatch_Braces_ReturnsTrue(){
    	assertEquals(true, matcher.IsBraceClosingMatch('{', '}'));
    }
    
    @Test
    public void IsBraceClosingMatch_SquareBracket_ReturnsTrue(){
    	assertEquals(true, matcher.IsBraceClosingMatch('[', ']'));
    }
    
    @Test
    public void IsBraceClosingMatch_MisMatchedOpenParen2_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch('(', '}'));
    }
    
    @Test
    public void IsBraceClosingMatch_MisMatchedOpenParen_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch('(', ']'));
    }
    
    @Test
    public void IsBraceClosingMatch_MisMatchedOpenBrace2_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch('{', ')'));
    }
    
    @Test
    public void IsBraceClosingMatch_MisMatchedOpenBrace_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch('{', ']'));
    }
    
    @Test
    public void IsBraceClosingMatch_MisMatchedOpenSquare2_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch('[', '}'));
    }
    
    @Test
    public void IsBraceClosingMatch_MisMatchedOpenSquare_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch('[', ')'));
    }
    
    @Test
    public void IsBraceClosingMatch_NullFirstCharacter_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch((Character)null, ')'));
    }
    
    @Test
    public void IsBraceClosingMatch_NullSecondCharacter_ReturnsFalse(){
    	assertEquals(false, matcher.IsBraceClosingMatch('(', (Character)null));
    }
    
    
    @Test
    public void CorrectBraces_ValidBraces_ReturnsTrue(){
    	assertEquals(true, matcher.CorrectBraces("({[]})"));
    }
    
    @Test
    public void CorrectBraces_OpenBraceOnly_ReturnsTrue(){
    	assertEquals(false, matcher.CorrectBraces("("));
    }
    
    @Test
    public void CorrectBraces_CloseBraceOnly_ReturnsTrue(){
    	assertEquals(false, matcher.CorrectBraces("}"));
    }
    
}

