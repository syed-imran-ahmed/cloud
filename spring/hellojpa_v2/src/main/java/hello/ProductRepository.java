
package hello;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>, QueryDslPredicateExecutor<Product> {

	Page<Product> findByDescriptionContaining(String description, Pageable pageable);

	@Query("select p from Product p where p.attributes[?1] = ?2")
	List<Product> findByAttributeAndValue(String attribute, String value);
}