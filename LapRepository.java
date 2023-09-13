package org.jspider.springbootrestapi.repository;
import org.jspider.springbootrestapi.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface LapRepository extends JpaRepository<Laptop,Integer> {

public  Laptop findByName(String name);

@Query("select l.name from Laptop l")
    public List<String> findAllName();

@Query("select l.color from Laptop l where l.color like %:color%")
    public List<String> getColorContainS(String color);

}
