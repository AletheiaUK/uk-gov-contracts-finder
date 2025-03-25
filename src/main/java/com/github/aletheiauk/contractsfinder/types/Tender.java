package com.github.aletheiauk.contractsfinder.types;

import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;
import java.util.List;

public record Tender(
    String id,
    String title,
    String description,
    OffsetDateTime datePublished,
    String status,
    Classification classification,
    List<Classification> additionalClassifications,
    List<Item> items,
    Amount minValue,
    Amount value,
    String procurementMethod,
    String procurementMethodDetails,
    Period tenderPeriod,
    Period contractPeriod,
    @SerializedName("mainProcurementCategory") String mainProcurementCategory,
    List<Document> documents) {

  public Tender(
      final String id,
      final String title,
      final String description,
      final OffsetDateTime datePublished,
      final String status,
      final Classification classification,
      final List<Classification> additionalClassifications,
      final List<Item> items,
      final Amount minValue,
      final Amount value,
      final String procurementMethod,
      final String procurementMethodDetails,
      final Period tenderPeriod,
      final Period contractPeriod,
      final String mainProcurementCategory,
      final List<Document> documents) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.datePublished = datePublished;
    this.status = status;
    this.classification = classification;
    this.additionalClassifications = List.copyOf(additionalClassifications);
    this.items = List.copyOf(items);
    this.minValue = minValue;
    this.value = value;
    this.procurementMethod = procurementMethod;
    this.procurementMethodDetails = procurementMethodDetails;
    this.tenderPeriod = tenderPeriod;
    this.contractPeriod = contractPeriod;
    this.mainProcurementCategory = mainProcurementCategory;
    this.documents = List.copyOf(documents);
  }

  @Override
  public List<Classification> additionalClassifications() {
    return List.copyOf(this.additionalClassifications);
  }

  @Override
  public List<Item> items() {
    return List.copyOf(this.items);
  }

  @Override
  public List<Document> documents() {
    return List.copyOf(this.documents);
  }
}
