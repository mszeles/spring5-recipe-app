package guru.springframework.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CategoryTest {

	Category category;
	
	@BeforeEach
	public void setUp() {
		category = new Category();
	}
	@Test
	void testGetId() {
		Long id = 4L;
		category.setId(id);
		assertEquals(id, category.getId());
	}

	@Test
	void testGetDescription() {
	}

	@Test
	void testGetRecipes() {
	}

}
