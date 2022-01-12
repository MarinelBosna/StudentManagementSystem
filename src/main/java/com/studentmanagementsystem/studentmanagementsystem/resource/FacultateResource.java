package com.studentmanagementsystem.studentmanagementsystem.resource;

import com.studentmanagementsystem.studentmanagementsystem.model.Facultate;
import com.studentmanagementsystem.studentmanagementsystem.service.FacultateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/facultate")

public class FacultateResource {

    private final FacultateService facultateService;

    public FacultateResource(FacultateService facultateService) {
        this.facultateService = facultateService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Facultate>> getAllFacultati () {
        List<Facultate> facultati = facultateService.findAllFacultate();
        return new ResponseEntity<>(facultati, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Facultate> addFacultate(@RequestBody Facultate facultate) {
        Facultate newFacultate = facultateService.addFacultate(facultate);
        return new ResponseEntity<>(newFacultate, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Facultate> updateFacultate(@RequestBody Facultate facultate) {
        Facultate updateFacultate = facultateService.updateFacultate(facultate);
        return new ResponseEntity<>(updateFacultate, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFacultate(@PathVariable("id") Long id) {
        facultateService.deleteFacultate(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
