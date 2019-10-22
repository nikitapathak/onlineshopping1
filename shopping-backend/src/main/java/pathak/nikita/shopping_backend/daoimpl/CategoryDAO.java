package pathak.nikita.shopping_backend.daoimpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pathak.nikita.shopping_backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAO implements pathak.nikita.shopping_backend.dao.CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	
	
	static
	{
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDesciption("hwjhdjwhjw jc");
		category.setImageURL("cat.png");
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("MOBILE");
		category.setDesciption("GOOD MOBILE");
		category.setImageURL("cat1.png");
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("rEFRIGERATOR");
		category.setDesciption("GOOD MOBILE");
		category.setImageURL("cat2.png");
		categories.add(category);
	}
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
