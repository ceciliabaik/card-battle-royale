package cardbattleroyale.model.rules;

import cardbattleroyale.model.Hand;

public class DefensiveBattleStrategy implements BattleStrategy {

  @Override
  public boolean playCard(Hand playerHand, Hand computerHand) {
    return playerHand.getHandValue() >= computerHand.getHandValue();
  }
}