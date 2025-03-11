package com.github.aletheiauk.contractsfinder.types;

import com.google.gson.annotations.SerializedName;

public record PartyDetails(String url, String scale, @SerializedName("vcse") String vcse) {}
