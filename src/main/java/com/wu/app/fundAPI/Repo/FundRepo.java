package com.wu.app.fundAPI.Repo;
import com.wu.app.fundAPI.Models.Fund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundRepo extends JpaRepository<Fund, Long>{
    
}


