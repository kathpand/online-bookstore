package in.kathir.onlinebookstore.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.kathir.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "BookCategory",path = "book-category")
public interface BookCategoryRepositry extends JpaRepository<BookCategory, Long> {

}
