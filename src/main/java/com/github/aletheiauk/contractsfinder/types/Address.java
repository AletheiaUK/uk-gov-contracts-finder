package com.github.aletheiauk.contractsfinder.types;

public record Address(
    String streetAddress, String locality, String postalCode, String countryName) {}
