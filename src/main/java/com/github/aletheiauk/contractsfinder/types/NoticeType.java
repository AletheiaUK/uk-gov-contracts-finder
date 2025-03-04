package com.github.aletheiauk.contractsfinder.types;

/**
 * Enum representing the types of notices in the Contracts Finder API, as defined in the NoticeType
 * model.
 */
public enum NoticeType {
  CONTRACT("Contract", "Contract Notice", 1),
  PIPELINE("Pipeline", "Future Opportunity Notice", 2),
  PRE_PROCUREMENT("PreProcurement", "Pre-Procurement Notice", 4);

  private final String name;
  private final String displayName;
  private final int id;

  /**
   * Constructor for NoticeType enum.
   *
   * @param name The original name of the notice type.
   * @param displayName The human-readable name of the notice type.
   * @param id The integer identifier associated with the notice type.
   */
  NoticeType(String name, String displayName, int id) {
    this.name = name;
    this.displayName = displayName;
    this.id = id;
  }

  /**
   * Gets the original name of the notice type.
   *
   * @return The original name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the display name of the notice type.
   *
   * @return The human-readable name.
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the integer identifier of the notice type.
   *
   * @return The integer id.
   */
  public int getId() {
    return id;
  }

  /**
   * Converts an original name to the corresponding NoticeType enum value.
   *
   * @param name The original name to convert (case-sensitive).
   * @return The matching NoticeType, or null if no match is found.
   */
  public static NoticeType fromName(String name) {
    if (name == null) {
      return null;
    }
    for (NoticeType type : values()) {
      if (type.name.equals(name)) {
        return type;
      }
    }
    return null;
  }

  /**
   * Converts an integer id to the corresponding NoticeType enum value.
   *
   * @param id The integer id to convert.
   * @return The matching NoticeType, or null if no match is found.
   */
  public static NoticeType fromId(int id) {
    for (NoticeType type : values()) {
      if (type.id == id) {
        return type;
      }
    }
    throw new RuntimeException(String.format("No Notice Type with id [%d] recognised", id));
  }

  @Override
  public String toString() {
    return displayName;
  }
}
