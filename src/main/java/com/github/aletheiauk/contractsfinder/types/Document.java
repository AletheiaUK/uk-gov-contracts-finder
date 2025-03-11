package com.github.aletheiauk.contractsfinder.types;

import java.time.OffsetDateTime;

public record Document(
    String id,
    String documentType,
    String description,
    String url,
    OffsetDateTime datePublished,
    OffsetDateTime dateModified,
    String format,
    String language) {}
