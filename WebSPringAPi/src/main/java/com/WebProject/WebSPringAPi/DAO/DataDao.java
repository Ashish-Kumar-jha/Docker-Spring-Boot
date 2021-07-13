package com.WebProject.WebSPringAPi.DAO;

import com.WebProject.WebSPringAPi.ENTITY.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DataDao extends JpaRepository<Data, Integer> {
}
