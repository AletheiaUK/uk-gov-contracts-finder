package com.github.aletheiauk.contractsfinder.types;

import java.time.OffsetDateTime;
import java.util.List;

public record Award(
    String id,
    String status,
    OffsetDateTime date,
    OffsetDateTime datePublished,
    Amount value,
    List<Supplier> suppliers,
    Period contractPeriod,
    String description,
    List<Document> documents) {

  public Award(
      final String id,
      final String status,
      final OffsetDateTime date,
      final OffsetDateTime datePublished,
      final Amount value,
      final List<Supplier> suppliers,
      final Period contractPeriod,
      final String description,
      final List<Document> documents) {
    this.id = id;
    this.status = status;
    this.date = date;
    this.datePublished = datePublished;
    this.value = value;
    this.suppliers = List.copyOf(suppliers);
    this.contractPeriod = contractPeriod;
    this.description = description;
    this.documents = List.copyOf(documents);
  }

  public List<Supplier> suppliers() {
    return List.copyOf(suppliers);
  }

  public List<Document> documents() {
    return List.copyOf(documents);
  }
}
