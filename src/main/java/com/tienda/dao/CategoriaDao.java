package com.tienda.dao;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author AMD
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
    @Query(value = "SELECT a FROM Categoria a where a.descripcion = :descripcion ORDER BY a.activo ASC")
    public List<Categoria> metodoJPQL(@Param("descripcion") String descripcion);
}
