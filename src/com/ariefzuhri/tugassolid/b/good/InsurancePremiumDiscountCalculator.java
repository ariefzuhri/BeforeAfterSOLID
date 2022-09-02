package com.ariefzuhri.tugassolid.b.good;

public class InsurancePremiumDiscountCalculator {
    // Penerapan dependency inversion principle: fungsi bergantung dengan abstraction
    // Penerapan open-closed principle: fungsi cukup 1 dan behavior tetap sama meski type dari CustomerProfile bertambah
    public int calculatePremiumDiscountPercent(CustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}