package com.example.rafael.onlineShopping;

public enum Status {
    Processing, Delivery;

    @Override
    public String toString() {
        if (this == Delivery) return "Delivery";
        else                  return "Processing";
    }

    public static Status fromString(String string) {
        if (string.toLowerCase().equals("delivery")) return Delivery;
        else                                        return Processing;

    }
}