package org.jspider.springbootrestapi.controller;
import org.jspider.springbootrestapi.model.Laptop;
import org.jspider.springbootrestapi.service.LapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class LaptopController {
    @Autowired
    private LapService lapService;
    @GetMapping("/laptop")
    public List<Laptop> getAllLaptop()
    {
        return lapService.getalaptops();
    }

    @PostMapping("/addLaptop")
    public void addLaptop( @RequestBody Laptop l1)
    {
        lapService.addLap(l1);
    }

    @GetMapping("/laptopById/{id}")
    public Laptop getLaptop(@PathVariable("id") int id)
    {
        return  lapService.getByid(id);
    }

    @PutMapping("/update")
    public void  updateLaptop(@RequestBody Laptop l)
    {
        lapService.updatelap(l);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") int id)
    {
        lapService.deletebyId(id);
    }

    @GetMapping("/laptopByName/{name}")
    public Laptop geyByName(@PathVariable("name") String name)
    {
        return lapService.getByName(name);
    }

    @GetMapping("/getAllName")
    public List<String> getAllNames(String name)
    {
        return  lapService.getAllName();
    }

    @GetMapping("/byColor")
    public List<String>getColorContainS()
    {
        return lapService.getColorContainS();
    }

}
