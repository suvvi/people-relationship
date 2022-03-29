package com.pr.pr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestCases {
	
	
	@Test
	public void testGetAllPeople() {
	    ReadPersonAndRelationship r = new ReadPersonAndRelationship();

	    List<People> allPeople = r.getAllPeople();

	    assertEquals(12, allPeople.size());
	}
	
	@Test
	public void testGetRelationshipCount() {
	    ReadPersonAndRelationship r = new ReadPersonAndRelationship();

	    int bobRelationshipsCount = r.getRelationShipCount("Bob");
	    int jennyRelationshipsCount = r.getRelationShipCount("Jenny");

	    assertEquals(4, bobRelationshipsCount);
	    assertEquals(3, jennyRelationshipsCount);
	}

	@Test
	public void testExtendedFamily() {
		
		 ReadPersonAndRelationship r = new ReadPersonAndRelationship();
		 int count = r.getExtendedFamilyCount("Bob");
		 assertEquals(4, count);
		 
		 int Jcount = r.getExtendedFamilyCount("Jenny");
		 assertEquals(4, Jcount);
	}		
	
	
}
