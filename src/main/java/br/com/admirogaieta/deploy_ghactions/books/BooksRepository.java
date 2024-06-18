package br.com.admirogaieta.deploy_ghactions.books;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BooksRepository extends JpaRepository<Book, UUID> {
    
}
