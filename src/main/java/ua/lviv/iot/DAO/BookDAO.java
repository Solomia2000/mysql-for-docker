package ua.lviv.iot.DAO;

import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Book;

@Repository
public interface BookDAO extends JpaRepository<Book, Long> {

}
