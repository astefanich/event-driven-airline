package io.astefanich.airline.common.domain;

import lombok.EqualsAndHashCode;
import org.axonframework.common.IdentifierFactory;

import java.io.Serializable;

@EqualsAndHashCode
public class FlightNumber implements Serializable {

  private String identifier;

  public FlightNumber() {
    this.identifier = IdentifierFactory.getInstance().generateIdentifier().toUpperCase();
  }

  public FlightNumber(String flightNumber) {
    this.identifier = flightNumber.toUpperCase();
  }


  public String getIdentifier() {
    return identifier;
  }

  @Override
  public String toString() {
    return identifier;
  }

}
