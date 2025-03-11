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
    List<Document> documents) {}
