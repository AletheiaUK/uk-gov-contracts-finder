package com.github.aletheiauk.contractsfinder.types;

public enum AwardedProcedureType {
  // Active values
  OPEN_OJEU("OpenOJEU", "Open (OJEU)", 0),
  OPEN_ACCELERATED_OJEU("OpenAcceleratedOJEU", "Open - accelerated (OJEU)", 1),
  RESTRICTED_OJEU("RestrictedOJEU", "Restricted (OJEU)", 2),
  RESTRICTED_ACCELERATED_OJEU("RestrictedAcceleratedOJEU", "Restricted - accelerated (OJEU)", 3),
  COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_OJEU(
      "CompetitiveProcedureWithNegotationOJEU", "Competitive procedure with negotiation (OJEU)", 4),
  COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_ACCELERATED_OJEU(
      "CompetitiveProcedureWithNegotationAcceleratedOJEU",
      "Competitive procedure with negotiation - accelerated (OJEU)",
      5),
  COMPETITIVE_DIALOGUE_OJEU("CompetitiveDialogueOJEU", "Competitive dialogue (OJEU)", 6),
  NEGOTIATED_PROCEEDURE_WITHOUT_PRIOR_PUBLICATION_OJEU(
      "NegotatedProcedureWithoutPriorPublicationOJEU",
      "Negotiated procedure without prior publication (OJEU)",
      7),
  INNOVATION_PARTNERSHIP_OJEU("InnovationPartnershipOJEU", "Innovation partnership (OJEU)", 8),
  OPEN_NON_OJEU("OpenNonOJEU", "Open (non-OJEU)", 9),
  COMPETITIVE_QUOTATION_NON_OJEU(
      "CompetitiveQuotationNonOJEU", "Competitive quotation (non-OJEU)", 10),
  CALL_OFF_FROM_FRAMEWORK_AGREEMENT(
      "CallOffFromFrameworkAgreement", "Call off from a Framework Agreement", 11),
  CALL_OFF_FROM_DYNAMIC_PURCHASING_SYSTEM(
      "CallOffFromDynamicPurchasingSystem", "Call off from a Dynamic Purchasing System", 12),
  CATALOGUE_PURCHASE("CataloguePurchase", "Catalogue purchase", 13),
  SINGLE_TENDERS_ACTION_NON_OJEU(
      "SingleTenderActionNonOJEU", "Single tender action (non-OJEU)", 14),
  OTHER("Other", "Other (procedure type)", 15),

  // Deprecated values
  OPEN("Open", "Open", 16),
  RESTRICTED("Restricted", "Restricted", 17),
  ACCELERATED_RESTRICTED("AcceleratedRestricted", "Accelerated restricted", 18),
  NEGOTATED("Negotated", "Negotiated", 19),
  ACCELERATED_NEGOTIATED("AcceleratedNegotated", "Accelerated negotiate d", 20),
  COMPETITIVE_DIALOG("CompetitiveDialog", "Competitive dialog", 21),
  NEGOTIATED_WITHOUT_COMPETITION(
      "NegotiatedWithoutCompetition", "Negotiated without competition", 22),
  AWARD_WITHOUT_PRIOR_PUBLICATION(
      "AwardWithoutPriorPublication", "Award without a prior publication", 23),
  NOT_APPLICABLE("NotApplicable", "Not applicable", 24),
  NOT_SPECIFIED("NotSpecified", "Not specified", 25),
  DIRECT_AWARD("DirectAward", "Direct award", 26);

  private final String name;
  private final String displayName;
  private final int value;

  AwardedProcedureType(String name, String displayName, int value) {
    this.name = name;
    this.displayName = displayName;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public String getDisplayName() {
    return displayName;
  }

  public int getValue() {
    return value;
  }

  public static AwardedProcedureType fromName(String name) {
    if (name == null) {
      return null;
    }
    for (AwardedProcedureType type : values()) {
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
