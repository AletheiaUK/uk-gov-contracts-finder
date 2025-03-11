package com.github.aletheiauk.contractsfinder.types;

import java.time.OffsetDateTime;
import java.util.List;

public record ContractDetail(
    String ocid,
    String id,
    String language,
    OffsetDateTime date,
    List<String> tag,
    String initiationType,
    String title,
    Planning planning,
    Tender tender,
    Buyer buyer,
    List<Party> parties,
    List<Award> awards,
    List<RelatedProcess> relatedProcesses) {}
