package com.github.aletheiauk.contractsfinder.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OjeuContractTypeTest {

  @Test
  public void testFromId() {
    assertEquals(OjeuContractType.WORKS, OjeuContractType.fromId(0));
    assertEquals(OjeuContractType.SERVICES, OjeuContractType.fromId(1));
    assertEquals(OjeuContractType.PRODUCTS, OjeuContractType.fromId(2));
    assertEquals(OjeuContractType.NOT_APPLICABLE, OjeuContractType.fromId(3));
    assertEquals(OjeuContractType.NOT_SPECIFIED, OjeuContractType.fromId(4));
  }

  @Test
  public void testFromName() {
    assertEquals(OjeuContractType.WORKS, OjeuContractType.fromName("Works"));
    assertEquals(OjeuContractType.SERVICES, OjeuContractType.fromName("Services"));
    assertEquals(OjeuContractType.PRODUCTS, OjeuContractType.fromName("Products"));
    assertEquals(OjeuContractType.NOT_APPLICABLE, OjeuContractType.fromName("NotApplicable"));
    assertEquals(OjeuContractType.NOT_SPECIFIED, OjeuContractType.fromName("NotSpecified"));
  }
}
