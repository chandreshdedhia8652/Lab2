// Smiley.java
//
// ICS 21: Lab Assignment 2
//
// Originally coded by Norm Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Minor modification to added named constants for directions of travel
//  by Norman Jacobson, October 2010
//
// This is where the program begins.  We construct a SmileyFrame
// (i.e., the window that shows the smiley faces) and activate it
// (i.e., makes it visible).  Your animation routine takes over
// from there.
public class Smiley
{
	public static void main(String[] args)
	{
		SmileyFrame f = new SmileyFrame();
		f.activate();
	}
}
