package com.github.aletheiauk.contractsfinder.types;

import java.util.List;

public record Budget(List<BudgetBreakdown> budgetBreakdown) {
  public Budget(final List<BudgetBreakdown> budgetBreakdown) {
    this.budgetBreakdown = List.copyOf(budgetBreakdown);
  }

  @Override
  public List<BudgetBreakdown> budgetBreakdown() {
    return List.copyOf(budgetBreakdown);
  }
}
