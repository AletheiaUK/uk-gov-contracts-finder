package com.github.aletheiauk.contractsfinder.types;

public enum OjeuContractType {
  WORKS("Works", "Works", 0),
  SERVICES("Services", "Services", 1),
  PRODUCTS("Products", "Products", 2),
  NOT_APPLICABLE("NotApplicable", "Not applicable", 3),
  NOT_SPECIFIED("NotSpecified", "Not specified", 4);

  private final String name;
  private final String displayName;
  private final int id;

  OjeuContractType(String name, String displayName, int id) {
    this.name = name;
    this.displayName = displayName;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getDisplayName() {
    return displayName;
  }

  public int getId() {
    return id;
  }

  public static OjeuContractType fromName(String name) {
    if (name == null) {
      return null;
    }
    for (OjeuContractType type : values()) {
      if (type.name.equals(name)) {
        return type;
      }
    }
    return null;
  }

  public static OjeuContractType fromId(Integer id) {
    if (id == null) {
      return null;
    }
    for (OjeuContractType type : values()) {
      if (type.id == id) {
        return type;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return displayName;
  }
}
