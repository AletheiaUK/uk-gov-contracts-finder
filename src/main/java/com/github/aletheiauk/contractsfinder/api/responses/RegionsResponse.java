package com.github.aletheiauk.contractsfinder.api.responses;

import com.github.aletheiauk.contractsfinder.types.Region;
import java.util.List;

public record RegionsResponse(List<Region> regions) {
  public RegionsResponse(final List<Region> regions) {
    this.regions = List.copyOf(regions);
  }

  @Override
  public List<Region> regions() {
    return List.copyOf(regions);
  }
}
