package com.bikkadit.services;

import com.bikkadit.entity.Personal;

public interface Service {
    public Personal savePersonalData(Personal personal);
    public Personal getPersonalDataById(Integer id);

}
