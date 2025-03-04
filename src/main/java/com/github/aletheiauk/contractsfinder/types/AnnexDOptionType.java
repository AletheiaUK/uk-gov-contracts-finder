package com.github.aletheiauk.contractsfinder.types;

/**
 * Enum representing the Annex D option types used to justify direct awards or exceptions in the
 * Contracts Finder API, as defined in the AnnexDOptionType model.
 */
public enum AnnexDOptionType {
  NO_SUITABLE_TENDERS_IN_RESPONSE_TO_OPEN_PROCEDURE(
      "NoSuitableTendersInResponseToOpenProcedure",
      "No Suitable Tenders In Response To Open Procedure",
      0),
  NO_SUITABLE_TENDERS_IN_RESPONSE_TO_RESTRICTED_PROCEDURE(
      "NoSuitableTendersInResponseToRestrictedProcedure",
      "No Suitable Tenders In Response To Restricted Procedure",
      1),
  MANUFACTURE_BY_DIRECTIVE("ManufactureByDirective", "Manufacture By Directive", 2),
  PARTICULAR_TENDERER_TECHNICAL("ParticularTendererTechnical", "Particular Tenderer Technical", 3),
  PARTICULAR_TENDERER_ARTISTIC("ParticularTendererArtistic", "Particular Tenderer Artistic", 4),
  PARTICULAR_TENDERER_EXCLUSIVE_RIGHTS(
      "ParticularTendererExclusiveRights", "Particular Tenderer Exclusive Rights", 5),
  EXTREME_URGENCY_EVENTS_UNFORESEEABLE(
      "ExtremeUrgencyEventsUnforeseeable", "Extreme Urgency Events Unforeseeable", 6),
  ADDITIONAL_WORKS("AdditionalWorks", "Additional Works", 7),
  WORKS_REPETITION_EXISTING_WORKS(
      "WorksRepetitionExistingWorks", "Works Repetition Existing Works", 8),
  SERVICE_CONTRACT_AWARDED_SUCCESSFUL(
      "ServiceContractAwardedSuccessful", "Service Contract Awarded Successful", 9),
  SUPPLIES_QUOTED_PURCHASED_ON_COMMODITY_MARKET(
      "SuppliesQuotedPurchasedOnCommodityMarket",
      "Supplies Quoted Purchased On Commodity Market",
      10),
  RECEIVERS_ARRANGEMENT_WITH_CREDITORS(
      "ReceiversArrangementWithCreditors", "Receivers Arrangement With Creditors", 11),
  SUPPLIER_WINDING_UP_BUSINESS("SupplierWindingUpBusiness", "Supplier Winding Up Business", 12),
  ONLY_IRREGULAR_INACCEPTABLE_REPLIES(
      "OnlyIrregularInacceptableReplies", "Only Irregular Inacceptable Replies", 13),
  CONTRACTED_SERVICES_LISTED("ContractedServicesListed", "Contracted Services Listed", 14),
  CONTRACT_SERVICES_NOT_LISTED("ContractServicesNotListed", "Contract Services Not Listed", 15);

  private final String name;
  private final String displayName;
  private final int id;

  /**
   * Constructor for AnnexDOptionType enum.
   *
   * @param name The original camelCase name of the option type.
   * @param displayName The human-readable name of the Annex D option type.
   * @param id The integer value associated with the option type.
   */
  AnnexDOptionType(String name, String displayName, int id) {
    this.name = name;
    this.displayName = displayName;
    this.id = id;
  }

  /**
   * Gets the original camelCase name of the Annex D option type.
   *
   * @return The original name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the display name of the Annex D option type.
   *
   * @return The human-readable name.
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the integer value of the Annex D option type.
   *
   * @return The integer value.
   */
  public int getId() {
    return id;
  }

  public static AnnexDOptionType fromId(final Integer id) {
    if (id == null) {
      return null;
    }

    for (AnnexDOptionType type : values()) {
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
