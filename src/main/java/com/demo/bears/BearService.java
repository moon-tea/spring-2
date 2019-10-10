package com.demo.bears;

import com.demo.bears.Bear;
import com.demo.bears.BearRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BearService implements IBearService {

    @Autowired
    private BearRepository repository;

    @Override
    public List<Bear> findAll() {

        var bears = (List<Bear>) repository.findAll();

        return bears;
    }

    public Boolean createBear(Bear bear){
        try{
            repository.save(bear);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}