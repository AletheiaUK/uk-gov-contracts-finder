package com.github.aletheiauk.contractsfinder.types;

import java.time.OffsetDateTime;
import java.util.List;

public record Contract(
    String uri,
    OffsetDateTime publishedDate,
    Publisher publisher,
    String version,
    List<String> extensions,
    String license,
    String publicationPolicy,
    List<ContractDetail> contractDetails) {}
