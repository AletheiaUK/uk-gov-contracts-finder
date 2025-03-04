package com.github.aletheiauk.contractsfinder.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProcedureTypeTest {
  @Test
  public void testFromName() {
    assertEquals(ProcedureType.OPEN_OJEU, ProcedureType.fromName("OpenOJEU"));

    assertEquals(
        ProcedureType.OPEN_ACCELERATED_OJEU, ProcedureType.fromName("OpenAcceleratedOJEU"));
    assertEquals(ProcedureType.RESTRICTED_OJEU, ProcedureType.fromName("RestrictedOJEU"));
    assertEquals(
        ProcedureType.RESTRICTED_ACCELERATED_OJEU,
        ProcedureType.fromName("RestrictedAcceleratedOJEU"));
    assertEquals(
        ProcedureType.COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_OJEU,
        ProcedureType.fromName("CompetitiveProcedureWithNegotationOJEU"));
    assertEquals(
        ProcedureType.COMPETITIVE_PROCEEDURE_WITH_NEGOTIATION_ACCELERATED_OJEU,
        ProcedureType.fromName("CompetitiveProcedureWithNegotationAcceleratedOJEU"));
    assertEquals(
        ProcedureType.COMPETITIVE_DIALOGUE_OJEU, ProcedureType.fromName("CompetitiveDialogueOJEU"));
    assertEquals(
        ProcedureType.NEGOTIATED_PROCEEDURE_WITHOUT_PRIOR_PUBLICATION_OJEU,
        ProcedureType.fromName("NegotatedProcedureWithoutPriorPublicationOJEU"));
    assertEquals(
        ProcedureType.INNOVATION_PARTNERSHIP_OJEU,
        ProcedureType.fromName("InnovationPartnershipOJEU"));
    assertEquals(ProcedureType.OPEN_NON_OJEU, ProcedureType.fromName("OpenNonOJEU"));
    assertEquals(
        ProcedureType.COMPETITIVE_QUOTATION_NON_OJEU,
        ProcedureType.fromName("CompetitiveQuotationNonOJEU"));
    assertEquals(
        ProcedureType.CALL_OFF_FROM_FRAMEWORK_AGREEMENT,
        ProcedureType.fromName("CallOffFromFrameworkAgreement"));
    assertEquals(
        ProcedureType.CALL_OFF_FROM_DYNAMIC_PURCHASING_SYSTEM,
        ProcedureType.fromName("CallOffFromDynamicPurchasingSystem"));
    assertEquals(ProcedureType.CATALOGUE_PURCHASE, ProcedureType.fromName("CataloguePurchase"));
    assertEquals(
        ProcedureType.SINGLE_TENDERS_ACTION_NON_OJEU,
        ProcedureType.fromName("SingleTenderActionNonOJEU"));
    assertEquals(ProcedureType.OTHER, ProcedureType.fromName("Other"));
    assertEquals(ProcedureType.OPEN, ProcedureType.fromName("Open"));
    assertEquals(ProcedureType.RESTRICTED, ProcedureType.fromName("Restricted"));
    assertEquals(
        ProcedureType.ACCELERATED_RESTRICTED, ProcedureType.fromName("AcceleratedRestricted"));
    assertEquals(ProcedureType.NEGOTATED, ProcedureType.fromName("Negotated"));
    assertEquals(
        ProcedureType.ACCELERATED_NEGOTIATED, ProcedureType.fromName("AcceleratedNegotated"));
    assertEquals(ProcedureType.COMPETITIVE_DIALOG, ProcedureType.fromName("CompetitiveDialog"));
    assertEquals(
        ProcedureType.NEGOTIATED_WITHOUT_COMPETITION,
        ProcedureType.fromName("NegotiatedWithoutCompetition"));
    assertEquals(
        ProcedureType.AWARD_WITHOUT_PRIOR_PUBLICATION,
        ProcedureType.fromName("AwardWithoutPriorPublication"));
    assertEquals(ProcedureType.NOT_APPLICABLE, ProcedureType.fromName("NotApplicable"));
    assertEquals(ProcedureType.NOT_SPECIFIED, ProcedureType.fromName("NotSpecified"));
    assertEquals(ProcedureType.DIRECT_AWARD, ProcedureType.fromName("DirectAward"));
  }
}
