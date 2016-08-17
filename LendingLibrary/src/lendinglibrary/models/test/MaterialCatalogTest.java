package lendinglibrary.models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lendinglibrary.models.Book;
import lendinglibrary.models.Material;
import lendinglibrary.models.MaterialCatalog;
import lendinglibrary.models.MaterialNotFoundException;

public class MaterialCatalogTest {
	
	
	private MaterialCatalog bc;
	private Book book1;
	
	public MaterialCatalogTest(){
		bc = new MaterialCatalog();
		book1 = new Book("1","Learning Stuff","","","",0);
		bc.addMaterial(book1);
	}
	

	@Test
	public void testAddABook() {
		
		int intialNum = bc.getNumberOfMaterials();
	
		Book book = new Book("2","","","","",0);
		bc.addMaterial(book);
		assertTrue(intialNum == bc.getNumberOfMaterials() - 1);	
	}
	
	@Test
	public void testFindBook() throws MaterialNotFoundException {
		
		try{
			Material foundbook = bc.findMaterial("Learning Stuff");
		}
		catch(MaterialNotFoundException e)
		{
			fail("Not Found");
		}
	}
	
	@Test
	public void testFindBookIgnoreCase() throws MaterialNotFoundException {
		
		try{
			Material foundbook = bc.findMaterial("learning stuff");
		}
		catch(MaterialNotFoundException e)
		{
			fail("Not Found");
		}
	}
	
	@Test
	public void testFindBookExtraSpaces() throws MaterialNotFoundException {
		
		try{
			Material foundbook = bc.findMaterial("  learning stuff  ");
		}
		catch(MaterialNotFoundException e)
		{
			fail("Not Found");
		}
	}
	
	@Test(expected = MaterialNotFoundException.class)
	public void testFindBookNotExist() throws MaterialNotFoundException {
		
		Material foundbook = bc.findMaterial("Leaning Leon");
	}

}
