package com.ariefzuhri.tugassolid.b.good;

import java.util.Random;

public class HealthInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}