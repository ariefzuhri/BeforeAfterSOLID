package com.ariefzuhri.tugassolid.b.bad;

public class InsurancePremiumDiscountCalculator {
    // Pelanggaran terhadap dependency inversion principle,
    // yakni fungsi ini bergantung dengan concreation
    public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }

    // Pelanggaran terhadap open-closed principle,
    // yakni terdapat duplikasi fungsi dengan perbedaan hanya terletak pada type dari CustomerProfile
    // sehingga calculatePremiumDiscountPercent akan ditulis lagi jika ada type baru dari CustomerProfile
    public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}