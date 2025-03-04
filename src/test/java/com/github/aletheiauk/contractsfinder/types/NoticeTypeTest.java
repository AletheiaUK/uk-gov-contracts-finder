package com.github.aletheiauk.contractsfinder.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NoticeTypeTest {

  @Test
  public void testById() {
    assertEquals(NoticeType.CONTRACT, NoticeType.byId(1));
    assertEquals(NoticeType.PIPELINE, NoticeType.byId(2));
    assertEquals(NoticeType.PRE_PROCUREMENT, NoticeType.byId(4));
  }

  @Test
  public void byIdThrowsExceptionOnInvalidValue() {
    assertThrows(RuntimeException.class, () -> NoticeType.byId(0));
  }
}
