package com.github.aletheiauk.contractsfinder.api.responses;

import com.github.aletheiauk.contractsfinder.types.Contract;
import java.util.List;

public record ContractListResponse(List<Contract> contracts) {
  public ContractListResponse(final List<Contract> contracts) {
    this.contracts = List.copyOf(contracts);
  }

  @Override
  public List<Contract> contracts() {
    return List.copyOf(contracts);
  }
}
