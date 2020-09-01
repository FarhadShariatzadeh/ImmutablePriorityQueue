package ImmutblePriorityQueue;

import java.util.Objects;

public class PriorityQueue implements IPriorityQueue{

  private Integer priority;
  private String value;
  private IPriorityQueue rest;

  public PriorityQueue(Integer priority, String value, IPriorityQueue rest) {
    this.priority = priority;
    this.value = value;
    this.rest = rest;
  }

  public Integer getPriority() {
    return this.priority;
  }

  public String getValue() {
    return this.value;
  }

  public IPriorityQueue getRest() {
    return this.rest;
  }

  /**
   * Creates and returns an empty IPriorityQueue
   *
   * @return an empty IPriorityQueue
   */
  @Override
  public IPriorityQueue createEmpty() {
    return new BaseCasePriorityQueue();
  }

  /**
   * isEmpty check if IPriorityQueue is empty
   *
   * @return true if the IPriorityQueue contains no items, and return false otherwise
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Adds the given element(the priority and its associated value) to the IPriorityQueue
   *
   * @param priority - the given element's priority
   * @param value    - the given element's value
   * @return the new IPriorityQueue with the given element
   */
  @Override
  public IPriorityQueue add(Integer priority, String value) {
    if (priority >= this.priority) {
      return new PriorityQueue(priority, value, this);
    }
    else {
      return new PriorityQueue(this.priority, this.value, this.rest.add(priority, value));
    }
  }

  /**
   * Return the value in the IPriorityQueue that has the highest priority
   *
   * @return the value in the IPriorityQueue that has the highest priority
   * @throws BaseCaseQueueException if the queue is empty
   */
  @Override
  public String peek() throws BaseCaseQueueException {
    return this.value;
  }

  /**
   * Return a copy of the IPriorityQueue without the element with the highest priority
   *
   * @return a copy of the IPriorityQueue without the element with the highest priority
   * @throws BaseCaseQueueException if the queue is empty
   */
  @Override
  public IPriorityQueue pop() throws BaseCaseQueueException {

    return this.rest;

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PriorityQueue)) {
      return false;
    }
    PriorityQueue that = (PriorityQueue) o;
    return Objects.equals(getPriority(), that.getPriority()) &&
        Objects.equals(getValue(), that.getValue()) &&
        Objects.equals(getRest(), that.getRest());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPriority(), getValue(), getRest());
  }
}
