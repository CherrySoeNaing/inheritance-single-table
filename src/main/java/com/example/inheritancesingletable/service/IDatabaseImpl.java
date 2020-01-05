package com.example.inheritancesingletable.service;

import com.example.inheritancesingletable.domain.ExternalVet;
import com.example.inheritancesingletable.domain.InternalVet;
import com.example.inheritancesingletable.domain.Vet;
import com.example.inheritancesingletable.repository.ExternalVetRepository;
import com.example.inheritancesingletable.repository.InternalVetRepository;
import org.springframework.stereotype.Service;

@Service
public class IDatabaseImpl implements IDatabase {
    private final InternalVetRepository internalVetRepository;
    private final ExternalVetRepository externalVetRepository;

    public IDatabaseImpl(InternalVetRepository internalVetRepository, ExternalVetRepository externalVetRepository) {
        this.internalVetRepository = internalVetRepository;
        this.externalVetRepository = externalVetRepository;
    }

    @Override
    public void createTable() {

        InternalVet invert1 = new InternalVet("Thaw Thaw","MSc",500000);
        InternalVet invert2 = new InternalVet("Thaw Maw","MSc",300000);

        ExternalVet exvert1 = new ExternalVet("John","USA",1000000);
        ExternalVet exvert2 = new ExternalVet("Thomas","India",1000000);


        internalVetRepository.save(invert1);
        internalVetRepository.save(invert2);

        externalVetRepository.save(exvert1);
        externalVetRepository.save(exvert2);




    }
}
