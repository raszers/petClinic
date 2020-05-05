package com.gr.pet.bootstrap;

import com.gr.pet.model.Owner;
import com.gr.pet.model.Vet;
import com.gr.pet.services.OwnerService;
import com.gr.pet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataInitializer(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Tom");
        owner1.setLastName("Brady");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jarrett");
        owner2.setLastName("Stidham");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Bill");
        vet1.setLastName("Bellichick");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Josh");
        vet2.setLastName("McDaniels");

        vetService.save(vet2);

        System.out.println("Loaded vets...");


    }
}
