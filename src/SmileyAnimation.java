// SmileyAnimation.java - Create and animate the smiley
//
// ICS 21: Lab Assignment 2
//
// Coded by Norman Jacobson October, 2006
// Direction constants added by Norman Jacobson, October, 2010


import java.awt.Color;				// so we can use colors
import java.util.Random;			// so we can use the random number generator

//	class Color color constants are
//		BLACK, BLUE, CYAN, GRAY, DARK_GRAY, LIGHT_GRAY, GREEN, MAGENTA,
//		ORANGE, PINK, RED, WHITE, YELLOW


// Panel in which smileys are drawn
public class SmileyAnimation
{
	private SmileyDisplay display;			// screen on which animation appears
	private SmileyFace movingSmiley;		// smiley that's animated

	// Change left to right, or up to down, or visa versa
	private static final int REVERSE_DIRECTION = -1;
	
	private static final int INIT_X_DIRECTION = 1; // Smiley starts moving to the right
	private static final int INIT_Y_DIRECTION = 0; // smiley starts moving with no vertical movement
	
	private int currentXMovement;			// 1 = right, -1 = left, 0 = no change
	private int currentYMovement;			// 1 = down, -1 = up, 0 = no change

	private Random generator;				// random number generator

	private static final long TIME_TO_RUN = 30000; // # of milliseconds to run animation


	// Make the smiley to be animated
	// Paint the starting screen
	// Set initial smiley movement
	// Initialize the random number generator
	public SmileyAnimation(SmileyDisplay d)
	{
		// *** REPLACE THIS COMMENT WITH YOUR CODE ***			
	}


	// Return the smiley face
	public SmileyFace getSmileyFace()
	{
		return movingSmiley;
	}


	// Animate the smiley
	public void animate()
	{
		// Set the current time
		long startTime = System.currentTimeMillis();
		

		// Run the animation for TIME_TO_RUN seconds
		do
		{
			// Continue to move smiley in current direction until it hits
			// an edge; when that happens, swap color of smiley
			// and wall and change direction
			
			// *** REPLACE THIS COMMENT WITH YOUR CODE ***			

			// Use pause() as needed to "slow down" the smiley so that
			// it does not zip across the screen so fast we can't see what
			// it's doing!
			
			// *** REPLACE THIS COMMENT WITH YOUR CODE ***			

		} while (System.currentTimeMillis() - startTime < TIME_TO_RUN);
	}


	// Hit something! Return true if hit any wall; false if not hit any of them
	private boolean hitSomething()
	{
		// *** REPLACE THIS COMMENT WITH YOUR CODE ***			
	}

	
	// Hit an edge: swap color with smiley background
	//   and move off in a new direction away from the wall
	// Use helper methods adjustColor() and adjustDirection()
	private void adjustColorAndDirection()
	{
		// *** REPLACE THIS COMMENT WITH YOUR CODE ***			
	}

	
	// Swap the colors of the wallHit wall and the smiley
	// wallHit can be "Left", "Right", "Top", or "Bottom",
	//  these strings corresponding to the walls they name
	private void adjustColor(String wallHit)
	{
		// *** REPLACE THIS COMMENT WITH YOUR CODE ***			
	}

	
	// Change the smiley's direction so it is away from
	// the wall just hit.
	// wallHit can be "Left", "Right", "Top", or "Bottom",
	//  these strings corresponding to the walls they name
	private void adjustDirection(String wallHit)
	{
		// If hit top or bottom wall, y direction is reversed,
		// x direction can be to the left, to the right, or
		// no movement at all (translation of 0); it is randomly
		// chosen

		// If hit left or right wall, x direction is reversed,
		// y direction can be up, down, or no movement
		// (translation of 0); it is randomly chosen

		// *** REPLACE THIS COMMENT WITH YOUR CODE ***			
	}

	
	// Return true if hit left wall, false otherwise
	private boolean hitLeftWall()
	{
		// Hit wall if x coordinate of leftmost point of smiley is
		// same or less than edge of the left wall,
		// and the smiley is moving toward this wall


		// *** REPLACE THIS COMMENT WITH YOUR CODE ***
		return ((movingSmiley.getLeftEdge() <= display.getEdge("Left")) && (currentXMovement == -1)) ? true: false;
	}

	
	// Return true if hit right wall, false otherwise
	private boolean hitRightWall()
	{
		// Hit wall if x coordinate of rightmost point of smiley is
		// same or greater than edge of the right wall,
		// and the smiley is moving toward this wall


		// *** REPLACE THIS COMMENT WITH YOUR CODE ***
		return ((movingSmiley.getRightEdge() >= display.getEdge("Right")) && (currentXMovement == 1)) ? true: false;
	}

	
	// Return true if hit top wall, false otherwise
	private boolean hitTopWall()
	{
		// Hit wall if y coordinate of top-most point of smiley is
		// same or less than edge of the top wall,
		// and the smiley is moving toward this wall


		// *** REPLACE THIS COMMENT WITH YOUR CODE ***			
	}

	
	// Return true if hit bottom wall, false otherwise
	private boolean hitBottomWall()
	{
		// Hit wall if y coordinate of bottom-most point of smiley is
		// same or greater than edge of the bottom wall,
		// and the smiley is moving toward this wall


		// *** REPLACE THIS COMMENT WITH YOUR CODE ***			
	}


	// Wait x milliseconds before moving to next animation frame
	private void pause(long millisec)
	{
		long startTime = System.currentTimeMillis();
		long endTime;
		do
		{
			endTime = System.currentTimeMillis();
		} while (endTime - startTime < millisec);
	}

}
