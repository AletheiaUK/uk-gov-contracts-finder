package com.github.aletheiauk.contractsfinder.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NoticeTypeTest {

  @Test
  public void testFromId() {
    assertEquals(NoticeType.CONTRACT, NoticeType.fromId(1));
    assertEquals(NoticeType.PIPELINE, NoticeType.fromId(2));
    assertEquals(NoticeType.PRE_PROCUREMENT, NoticeType.fromId(4));
  }

  @Test
  public void fromIdThrowsExceptionOnInvalidValue() {
    assertThrows(RuntimeException.class, () -> NoticeType.fromId(0));
  }
}
