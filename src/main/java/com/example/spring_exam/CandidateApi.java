package com.example.spring_exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/candidates")
public class CandidateApi {
    @Autowired
    CandidateService candidateService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CandidateDetail>> getList(){
        return ResponseEntity.ok(candidateService.findAll());
    }

    @PostMapping
    public ResponseEntity<CandidateDetail> save(@RequestBody CandidateDetail cd){
        return ResponseEntity.ok(candidateService.save(cd));
    }
}
