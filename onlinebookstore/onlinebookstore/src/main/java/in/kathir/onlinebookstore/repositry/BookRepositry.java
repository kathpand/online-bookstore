package in.kathir.onlinebookstore.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kathir.onlinebookstore.entity.Book;

public interface BookRepositry extends JpaRepository<Book, Long> {

}
