package com.github.aletheiauk.contractsfinder.types;

public enum NoticeType {
  CONTRACT(1),
  PIPELINE(2),
  PRE_PROCUREMENT(4);

  private final int id;

  NoticeType(final int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public static NoticeType byId(final int id) {
    for (NoticeType noticeType : values()) {
      if (noticeType.getId() == id) {
        return noticeType;
      }
    }

    throw new RuntimeException(String.format("Notice Type Id not recognised: %d", id));
  }
}
