package com.store2;

import model.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
//@NoRepositoryBean
public interface MagazineRepository  extends JpaRepository<Magazine,Long> {
}
