# event-driven-airline
demonstrating DDD, CQRS, event sourcing, and the Axon framework with a simplified example

The concepts of DDD (Domain Driven Design), CQRS (Command Query Responsibility Segregation), and Event Sourcing are quite deep.
The following [LINK](https://www.kenneth-truyers.net/2013/12/05/introduction-to-domain-driven-design-cqrs-and-event-sourcing/), should help to explain.

-DDD: Essentially, DDD revolves around domain-driven terminology in code, and limits interaction of domain entities to the concept of aggregates.<br>
-CQRS: In most applications, you have significantly more reads than writes. CQRS helps to split apart actions which change application state (commands) from actions which query state (queries), in order to help scalability.<br>
-Event Sourcing: Event sourcing is the concept of building state from a series of events. Rather than maintaining application state, every bit of state information is built up from an application of domain event streams.

The [Axon Framework](https://axoniq.io/product-overview/axon-framework) is a Java framework which helps to implement applications which adhere to these design principles.

This application is a prototype for an airline booking system. It is not fully functional but should help one get a glimpse into the aforementioned concepts.

These ideas (especially event storming and event sourcing) are awesome, and I hope they catch on!
