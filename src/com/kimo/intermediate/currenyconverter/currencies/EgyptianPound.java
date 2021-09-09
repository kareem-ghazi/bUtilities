package com.kimo.intermediate.currenyconverter.currencies;

import com.kimo.intermediate.currenyconverter.Currency;

public class EgyptianPound extends Currency {

    @Override
    public double getValue() {
        return 15.71;
    }

    @Override
    public String getName() {
        return "EGYPTIAN_POUND";
    }

    @Override
    public String getSymbol() {
        return "L.E";
    }

    @Override
    public String getISOCode() {
        return "EGP";
    }
    
}
