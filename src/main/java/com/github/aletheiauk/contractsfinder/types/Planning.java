package com.github.aletheiauk.contractsfinder.types;

import java.util.List;

public record Planning(List<Milestone> milestones, Budget budget, List<Document> documents) {}
