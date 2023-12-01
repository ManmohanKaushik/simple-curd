package com.bikkadit.services;

import com.bikkadit.entity.Personal;
import com.bikkadit.repository.PersonalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicesImpl implements Service{
    @Autowired
    private PersonalRepo personalRepo;

    @Override
    public Personal savePersonalData(Personal personal) {
        Personal save = this.personalRepo.save(personal);
        return save;
    }

    @Override
    public Personal getPersonalDataById(Integer id) {
        Personal personal = this.personalRepo.findById(id).get();
        return personal;
    }
}
