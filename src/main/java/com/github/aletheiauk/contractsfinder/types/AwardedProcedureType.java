package com.github.aletheiauk.contractsfinder.types;

public enum AwardedProcedureType {
  // Active values
  OPEN_OJEU("OpenOJEU", "Open (OJEU)", false),
  OPEN_ACCELERATED_OJEU("OpenAcceleratedOJEU", "Open - accelerated (OJEU)", false),
  RESTRICTED_OJEU("RestrictedOJEU", "Restricted (OJEU)", false),
  RESTRICTED_ACCELERATED_OJEU(
      "RestrictedAcceleratedOJEU", "Restricted - accelerated (OJEU)", false),
  COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_OJEU(
      "CompetitiveProcedureWithNegotationOJEU",
      "Competitive procedure with negotiation (OJEU)",
      false),
  COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_ACCELERATED_OJEU(
      "CompetitiveProcedureWithNegotationAcceleratedOJEU",
      "Competitive procedure with negotiation - accelerated (OJEU)",
      false),
  COMPETITIVE_DIALOGUE_OJEU("CompetitiveDialogueOJEU", "Competitive dialogue (OJEU)", false),
  NEGOTIATED_PROCEEDURE_WITHOUT_PRIOR_PUBLICATION_OJEU(
      "NegotatedProcedureWithoutPriorPublicationOJEU",
      "Negotiated procedure without prior publication (OJEU)",
      false),
  INNOVATION_PARTNERSHIP_OJEU("InnovationPartnershipOJEU", "Innovation partnership (OJEU)", false),
  OPEN_NON_OJEU("OpenNonOJEU", "Open (non-OJEU)", false),
  COMPETITIVE_QUOTATION_NON_OJEU(
      "CompetitiveQuotationNonOJEU", "Competitive quotation (non-OJEU)", false),
  CALL_OFF_FROM_FRAMEWORK_AGREEMENT(
      "CallOffFromFrameworkAgreement", "Call off from a Framework Agreement", false),
  CALL_OFF_FROM_DYNAMIC_PURCHASING_SYSTEM(
      "CallOffFromDynamicPurchasingSystem", "Call off from a Dynamic Purchasing System", false),
  CATALOGUE_PURCHASE("CataloguePurchase", "Catalogue purchase", false),
  SINGLE_TENDERS_ACTION_NON_OJEU(
      "SingleTenderActionNonOJEU", "Single tender action (non-OJEU)", false),
  OTHER("Other", "Other (procedure type)", false),

  // Deprecated values
  OPEN("Open", "Open", true),
  RESTRICTED("Restricted", "Restricted", true),
  ACCELERATED_RESTRICTED("AcceleratedRestricted", "Accelerated restricted", true),
  NEGOTATED("Negotated", "Negotiated", true),
  ACCELERATED_NEGOTIATED("AcceleratedNegotated", "Accelerated negotiated", true),
  COMPETITIVE_DIALOG("CompetitiveDialog", "Competitive dialog", true),
  NEGOTIATED_WITHOUT_COMPETITION(
      "NegotiatedWithoutCompetition", "Negotiated without competition", true),
  AWARD_WITHOUT_PRIOR_PUBLICATION(
      "AwardWithoutPriorPublication", "Award without a prior publication", true),
  NOT_APPLICABLE("NotApplicable", "Not applicable", true),
  NOT_SPECIFIED("NotSpecified", "Not specified", true),
  DIRECT_AWARD("DirectAward", "Direct award", true);

  private final String name;
  private final String displayName;
  private final boolean deprecated;

  AwardedProcedureType(String name, String displayName, boolean deprecated) {
    this.name = name;
    this.displayName = displayName;
    this.deprecated = deprecated;
  }

  public String getName() {
    return name;
  }

  public String getDisplayName() {
    return displayName;
  }

  public boolean isDeprecated() {
    return deprecated;
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
