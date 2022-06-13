package domain.model;

import domain.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public interface Stock {

    List<List<Product>>  getProductList();
    List<ProductRepository> getProductRepositoriesList();


/**
 * Filter the given list, and create a new list that only contains
 * the elements that are (subtypes) of the class c
 *
 * @param listA The input list
 * @param c The class to filter for
 * @return The filtered list
 * https://stackoverflow.com/questions/933447/how-do-you-cast-a-list-of-supertypes-to-a-list-of-subtypes
 */
    default  <T> List<T> filter(List<?> listA, Class<T> c)
    {
        List<T> listB = new ArrayList<>();
        for (Object a : listA)
        {
            if (c.isInstance(a))
            {
                listB.add(c.cast(a));
            }
        }
        listB = (List<T>) listA;
        return listB;
    }

}
