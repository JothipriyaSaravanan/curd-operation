package com.curd.project.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curd.project.exception.CurdNotFoundException;
import com.curd.project.model.Curd;
import com.curd.project.repository.CurdRepo;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class CurdController {

	@Autowired
    private CurdRepo curdRepo;

    @PostMapping("/add")  
    public Curd addCurd(@RequestBody Curd curd) {
        return curdRepo.save(curd);
    }

    @GetMapping("/getAll")
    public List<Curd> getAllCurd() {
        return curdRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public Curd getCurd(@PathVariable int id) {
        return curdRepo.findById(id).orElseThrow(() -> new CurdNotFoundException(id));
    }

    @PutMapping("/update/{id}")
    public Curd updateCurd(@PathVariable int id, @RequestBody Curd updatedCurd) {
        return curdRepo.findById(id)
                .map(curd -> {
                    curd.setUsername(updatedCurd.getUsername());
                    curd.setPhone(updatedCurd.getPhone());
                    curd.setEmail(updatedCurd.getEmail());
                   

                    return curdRepo.save(curd);
                })
                .orElseThrow(() -> new CurdNotFoundException(id));
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCurd(@PathVariable int id) {
        curdRepo.deleteById(id);
        return "Successfully Deleted";
    }
   

 
}