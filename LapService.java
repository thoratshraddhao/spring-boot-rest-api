package org.jspider.springbootrestapi.service;
import org.jspider.springbootrestapi.model.Laptop;
import org.jspider.springbootrestapi.repository.LapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LapService {
    @Autowired
    private LapRepository lapRepository;
    public List<Laptop> getalaptops()
    {
        List<Laptop> laptop= lapRepository.findAll();
        return laptop;
    }

    public void addLap( Laptop l1)
    {
        lapRepository.save(l1);
    }

    public  Laptop getByid(int id)
    {
        return lapRepository.findById(id).orElse(null);
    }

    public void updatelap(Laptop l)
    {
        lapRepository.save(l);
    }

    public void deletebyId( int id)
    {
        lapRepository.deleteById(id);
    }

    public Laptop getByName(String name)
    {
      return  lapRepository.findByName(name);
    }

    public List<String> getAllName()
    {
        return lapRepository.findAllName();
    }

    public List<String> getColorContainS()
    {
        return lapRepository.getColorContainS("s");
    }

}
