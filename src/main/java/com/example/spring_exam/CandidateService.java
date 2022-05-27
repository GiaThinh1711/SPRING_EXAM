package com.example.spring_exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    public List<CandidateDetail> findAll(){
        return candidateRepository.findAll();
    }
    public Optional<CandidateDetail> findById(int id){
        return candidateRepository.findById(id);
    }
    public CandidateDetail save(CandidateDetail candidateDetail){
        return candidateRepository.save(candidateDetail);
    }
    public void deleteById(int id){
        candidateRepository.deleteById(id);
    }
}
