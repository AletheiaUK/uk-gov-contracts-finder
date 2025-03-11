package com.github.aletheiauk.contractsfinder.types;

import java.time.OffsetDateTime;

public record Milestone(String id, String title, String type, OffsetDateTime dueDate) {}
