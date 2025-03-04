package com.github.aletheiauk.contractsfinder.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AwardedProcedureTypeTest {
  @Test
  public void testFromId() {
    assertEquals(AwardedProcedureType.OPEN_OJEU, AwardedProcedureType.fromName("OpenOJEU"));
    assertEquals(
        AwardedProcedureType.OPEN_ACCELERATED_OJEU,
        AwardedProcedureType.fromName("OpenAcceleratedOJEU"));
    assertEquals(
        AwardedProcedureType.RESTRICTED_OJEU, AwardedProcedureType.fromName("RestrictedOJEU"));
    assertEquals(
        AwardedProcedureType.RESTRICTED_ACCELERATED_OJEU,
        AwardedProcedureType.fromName("RestrictedAcceleratedOJEU"));
    assertEquals(
        AwardedProcedureType.COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_OJEU,
        AwardedProcedureType.fromName("CompetitiveProcedureWithNegotationOJEU"));
    assertEquals(
        AwardedProcedureType.COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_ACCELERATED_OJEU,
        AwardedProcedureType.fromName("CompetitiveProcedureWithNegotationAcceleratedOJEU"));
    assertEquals(
        AwardedProcedureType.COMPETITIVE_DIALOGUE_OJEU,
        AwardedProcedureType.fromName("CompetitiveDialogueOJEU"));
    assertEquals(
        AwardedProcedureType.NEGOTIATED_PROCEEDURE_WITHOUT_PRIOR_PUBLICATION_OJEU,
        AwardedProcedureType.fromName("NegotatedProcedureWithoutPriorPublicationOJEU"));
    assertEquals(
        AwardedProcedureType.INNOVATION_PARTNERSHIP_OJEU,
        AwardedProcedureType.fromName("InnovationPartnershipOJEU"));
    assertEquals(AwardedProcedureType.OPEN_NON_OJEU, AwardedProcedureType.fromName("OpenNonOJEU"));
    assertEquals(
        AwardedProcedureType.COMPETITIVE_QUOTATION_NON_OJEU,
        AwardedProcedureType.fromName("CompetitiveQuotationNonOJEU"));
    assertEquals(
        AwardedProcedureType.CALL_OFF_FROM_FRAMEWORK_AGREEMENT,
        AwardedProcedureType.fromName("CallOffFromFrameworkAgreement"));
    assertEquals(
        AwardedProcedureType.CALL_OFF_FROM_DYNAMIC_PURCHASING_SYSTEM,
        AwardedProcedureType.fromName("CallOffFromDynamicPurchasingSystem"));
    assertEquals(
        AwardedProcedureType.CATALOGUE_PURCHASE,
        AwardedProcedureType.fromName("CataloguePurchase"));
    assertEquals(
        AwardedProcedureType.SINGLE_TENDERS_ACTION_NON_OJEU,
        AwardedProcedureType.fromName("SingleTenderActionNonOJEU"));
    assertEquals(AwardedProcedureType.OTHER, AwardedProcedureType.fromName("Other"));

    assertEquals(AwardedProcedureType.OPEN, AwardedProcedureType.fromName("Open"));
    assertEquals(AwardedProcedureType.RESTRICTED, AwardedProcedureType.fromName("Restricted"));
    assertEquals(
        AwardedProcedureType.ACCELERATED_RESTRICTED,
        AwardedProcedureType.fromName("AcceleratedRestricted"));
    assertEquals(AwardedProcedureType.NEGOTATED, AwardedProcedureType.fromName("Negotated"));
    assertEquals(
        AwardedProcedureType.ACCELERATED_NEGOTIATED,
        AwardedProcedureType.fromName("AcceleratedNegotated"));
    assertEquals(
        AwardedProcedureType.COMPETITIVE_DIALOG,
        AwardedProcedureType.fromName("CompetitiveDialog"));
    assertEquals(
        AwardedProcedureType.NEGOTIATED_WITHOUT_COMPETITION,
        AwardedProcedureType.fromName("NegotiatedWithoutCompetition"));
    assertEquals(
        AwardedProcedureType.AWARD_WITHOUT_PRIOR_PUBLICATION,
        AwardedProcedureType.fromName("AwardWithoutPriorPublication"));
    assertEquals(
        AwardedProcedureType.NOT_APPLICABLE, AwardedProcedureType.fromName("NotApplicable"));
    assertEquals(AwardedProcedureType.NOT_SPECIFIED, AwardedProcedureType.fromName("NotSpecified"));
    assertEquals(AwardedProcedureType.DIRECT_AWARD, AwardedProcedureType.fromName("DirectAward"));
  }
}
