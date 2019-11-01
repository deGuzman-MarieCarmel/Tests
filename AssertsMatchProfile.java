package com.sampleJUnit;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertsMatchProfile {

	   @Test
	   public void testRelationShipStatus() {
		  String relationshipStatusA = new String ("Single");
	      String relationshipStatusB = new String ("Single");
	      //Check that the two are both Single
	      assertEquals(relationshipStatusA, relationshipStatusB);
	   }
	   @Test
	   public void testReligion() {
		   String religionA = "The Church of Jesus Christ of Latter-day Saints";
		   String religionB = "The Church of Jesus Christ of Latter-day Saints";
	      //Check that the two are both LDS
	      assertSame(religionA, religionB);
	   }
	   @Test
	   public void testGender() {
	      String genderA = "male";
	      String genderB = "female";
	      //Check if the two are not the same gender.
	      assertNotSame(genderA, genderB);
	   }
	   @Test
	   public void testMission() {
		  String MissionA = null;
		  String MissionB = "Philippines Cauayan Mission";	
	      //Check if profileB went on a mission
	      assertNotNull(MissionB);
	      //Check if profileA didn't go on a mission.
	      assertNull(MissionA);
	   }
	   @Test
	   public void testPriorities() {
	      String[] priorityA = {"temple marriage", "work", "school"};
	      String[] priorityB =  {"temple marriage", "work", "school"};
	      //Check whether the two has the same list and order of priorities.
	      assertArrayEquals(priorityA, priorityB);
	   }
	   @Test
	   public void testKids() {
	      int kidsA = 0;
	      int kidsB = 3;
	      //Check if profileA has kids
	      assertFalse(kidsA > 0);
	      //Check if profileB has more kids than profileA
	      assertTrue (kidsB > kidsA);
	   }
	   
	   //Note: Can't use assertThat as it tells me it is DEPRECATED. 
	   //assertThat checks if specific value match to expected value
	   //Example: assertThat(relationshipStatusA, is("Single"));
}