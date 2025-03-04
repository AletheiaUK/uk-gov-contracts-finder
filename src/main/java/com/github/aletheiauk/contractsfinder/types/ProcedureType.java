package com.github.aletheiauk.contractsfinder.types;

/**
 * Enum representing procedure types in the Contracts Finder API, as defined in the ProcedureType
 * model.
 */
public enum ProcedureType {
  // Active values (not deprecated)
  OPEN_OJEU("OpenOJEU", "Open (OJEU)", 0, false),
  OPEN_ACCELERATED_OJEU("OpenAcceleratedOJEU", "Open - accelerated (OJEU)", 1, false),
  RESTRICTED_OJEU("RestrictedOJEU", "Restricted (OJEU)", 2, false),
  RESTRICTED_ACCELERATED_OJEU(
      "RestrictedAcceleratedOJEU", "Restricted - accelerated (OJEU)", 3, false),
  COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_OJEU(
      "CompetitiveProcedureWithNegotationOJEU",
      "Competitive procedure with negotiation (OJEU)",
      4,
      false),
  COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_ACCELERATED_OJEU(
      "CompetitiveProcedureWithNegotationAcceleratedOJEU",
      "Competitive procedure with negotiation - accelerated (OJEU)",
      5,
      false),
  COMPETITIVE_DIALOGUE_OJEU("CompetitiveDialogueOJEU", "Competitive dialogue (OJEU)", 6, false),
  NEGOTIATED_PROCEEDURE_WITHOUT_PRIOR_PUBLICATION_OJEU(
      "NegotatedProcedureWithoutPriorPublicationOJEU",
      "Negotiated procedure without prior publication (OJEU)",
      7,
      false),
  INNOVATION_PARTNERSHIP_OJEU(
      "InnovationPartnershipOJEU", "Innovation partnership (OJEU)", 8, false),
  OPEN_NON_OJEU("OpenNonOJEU", "Open (non-OJEU)", 9, false),
  COMPETITIVE_QUOTATION_NON_OJEU(
      "CompetitiveQuotationNonOJEU", "Competitive quotation (non-OJEU)", 10, false),
  CALL_OFF_FROM_FRAMEWORK_AGREEMENT(
      "CallOffFromFrameworkAgreement", "Call off from a Framework Agreement", 11, false),
  CALL_OFF_FROM_DYNAMIC_PURCHASING_SYSTEM(
      "CallOffFromDynamicPurchasingSystem", "Call off from a Dynamic Purchasing System", 12, false),
  CATALOGUE_PURCHASE("CataloguePurchase", "Catalogue purchase", 13, false),
  SINGLE_TENDERS_ACTION_NON_OJEU(
      "SingleTenderActionNonOJEU", "Single tender action (non-OJEU)", 14, false),
  OTHER("Other", "Other (procedure type)", 15, false),

  // Deprecated values
  OPEN("Open", "Open", 16, true),
  RESTRICTED("Restricted", "Restricted", 17, true),
  ACCELERATED_RESTRICTED("AcceleratedRestricted", "Accelerated restricted", 18, true),
  NEGOTATED("Negotated", "Negotiated", 19, true),
  ACCELERATED_NEGOTIATED("AcceleratedNegotated", "Accelerated negotiated", 20, true),
  COMPETITIVE_DIALOG("CompetitiveDialog", "Competitive dialog", 21, true),
  NEGOTIATED_WITHOUT_COMPETITION(
      "NegotiatedWithoutCompetition", "Negotiated without competition", 22, true),
  AWARD_WITHOUT_PRIOR_PUBLICATION(
      "AwardWithoutPriorPublication", "Award without a prior publication", 23, true),
  NOT_APPLICABLE("NotApplicable", "Not applicable", 24, true),
  NOT_SPECIFIED("NotSpecified", "Not specified", 25, true),
  DIRECT_AWARD("DirectAward", "Direct award", 26, true);

  private final String name;
  private final String displayName;
  private final int value;
  private final boolean isDeprecated;

  /**
   * Constructor for ProcedureType enum.
   *
   * @param name The original camelCase name of the procedure type.
   * @param displayName The human-readable name of the procedure type.
   * @param value The integer value associated with the procedure type.
   * @param isDeprecated Indicates whether the procedure type is deprecated.
   */
  ProcedureType(String name, String displayName, int value, boolean isDeprecated) {
    this.name = name;
    this.displayName = displayName;
    this.value = value;
    this.isDeprecated = isDeprecated;
  }

  /**
   * Gets the original camelCase name of the procedure type.
   *
   * @return The original name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the display name of the procedure type.
   *
   * @return The human-readable name.
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the integer value of the procedure type.
   *
   * @return The integer value.
   */
  public int getValue() {
    return value;
  }

  /**
   * Indicates whether the procedure type is deprecated.
   *
   * @return true if deprecated, false otherwise.
   */
  public boolean isDeprecated() {
    return isDeprecated;
  }

  /**
   * Converts a camelCase name to the corresponding ProcedureType enum value.
   *
   * @param name The camelCase name to convert (case-sensitive).
   * @return The matching ProcedureType, or null if no match is found.
   */
  public static ProcedureType fromName(String name) {
    if (name == null) {
      return null;
    }
    for (ProcedureType type : values()) {
      if (type.name.equals(name)) {
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
