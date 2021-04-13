package org.fernando.izazaga.repository;

import org.fernando.izazaga.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;



//public interface CategoriasReporitory extends CrudRepository<Categoria, Integer> {
public interface CategoriasReporitory extends JpaRepository<Categoria, Integer> {

}
