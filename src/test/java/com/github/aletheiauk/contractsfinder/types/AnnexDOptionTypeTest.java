package com.github.aletheiauk.contractsfinder.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnnexDOptionTypeTest {
  @Test
  public void testFromId() {
    assertEquals(
        AnnexDOptionType.NO_SUITABLE_TENDERS_IN_RESPONSE_TO_OPEN_PROCEDURE,
        AnnexDOptionType.fromId(0));
    assertEquals(
        AnnexDOptionType.NO_SUITABLE_TENDERS_IN_RESPONSE_TO_RESTRICTED_PROCEDURE,
        AnnexDOptionType.fromId(1));
    assertEquals(AnnexDOptionType.MANUFACTURE_BY_DIRECTIVE, AnnexDOptionType.fromId(2));
    assertEquals(AnnexDOptionType.PARTICULAR_TENDERER_TECHNICAL, AnnexDOptionType.fromId(3));
    assertEquals(AnnexDOptionType.PARTICULAR_TENDERER_ARTISTIC, AnnexDOptionType.fromId(4));
    assertEquals(AnnexDOptionType.PARTICULAR_TENDERER_EXCLUSIVE_RIGHTS, AnnexDOptionType.fromId(5));
    assertEquals(AnnexDOptionType.EXTREME_URGENCY_EVENTS_UNFORESEEABLE, AnnexDOptionType.fromId(6));
    assertEquals(AnnexDOptionType.ADDITIONAL_WORKS, AnnexDOptionType.fromId(7));
    assertEquals(AnnexDOptionType.WORKS_REPETITION_EXISTING_WORKS, AnnexDOptionType.fromId(8));
    assertEquals(AnnexDOptionType.SERVICE_CONTRACT_AWARDED_SUCCESSFUL, AnnexDOptionType.fromId(9));
    assertEquals(
        AnnexDOptionType.SUPPLIES_QUOTED_PURCHASED_ON_COMMODITY_MARKET,
        AnnexDOptionType.fromId(10));
    assertEquals(
        AnnexDOptionType.RECEIVERS_ARRANGEMENT_WITH_CREDITORS, AnnexDOptionType.fromId(11));
    assertEquals(AnnexDOptionType.SUPPLIER_WINDING_UP_BUSINESS, AnnexDOptionType.fromId(12));
    assertEquals(AnnexDOptionType.ONLY_IRREGULAR_INACCEPTABLE_REPLIES, AnnexDOptionType.fromId(13));
    assertEquals(AnnexDOptionType.CONTRACTED_SERVICES_LISTED, AnnexDOptionType.fromId(14));
    assertEquals(AnnexDOptionType.CONTRACT_SERVICES_NOT_LISTED, AnnexDOptionType.fromId(15));
  }
}
