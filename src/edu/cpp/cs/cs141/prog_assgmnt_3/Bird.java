/**
 * 
 */
package edu.cpp.cs.cs141.prog_assgmnt_3;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #N
 *
 * <description-of-assignment>
 *
 * Team #N / (or name if individual)
 *   <team-member-names-if-team-assignment>
 */

public class Bird extends Animals {

	/**
	 * 
	 */
	
	private String name;
	private Owners owner;
	private int age;
	private String[][] medHistory;
	private boolean vaccines;
	private String[] vacList;
	
	public Bird(String name, Owners owner, int age, boolean vaccines, String[] medHistory) {
		this.name = name;
		this.owner = owner;
		this.age = age;
		this.vaccines = vaccines;
		if (vaccines){
			for (int i=0; i <= medHistory.length; i++ ){
				for (int j=0; j <= medHistory.length; j++)
					this.medHistory[i][j] = medHistory[i];
					//fix i and j
			}
		}
	}


	@Override
	public void animals() {
		// TODO Auto-generated method stub
		
	}

}
