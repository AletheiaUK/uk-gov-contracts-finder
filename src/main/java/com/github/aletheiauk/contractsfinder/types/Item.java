package com.github.aletheiauk.contractsfinder.types;

import java.util.List;

public record Item(String id, List<DeliveryAddress> deliveryAddresses) {}
