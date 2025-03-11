package com.github.aletheiauk.contractsfinder.types;

import java.util.List;

public record Party(
    String id,
    String name,
    Identifier identifier,
    Address address,
    ContactPoint contactPoint,
    PartyDetails partyDetails,
    List<String> roles) {}
