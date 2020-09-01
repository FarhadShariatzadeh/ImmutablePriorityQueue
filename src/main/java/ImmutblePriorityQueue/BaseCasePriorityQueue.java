package ImmutblePriorityQueue;

public class BaseCasePriorityQueue implements IPriorityQueue {


  public BaseCasePriorityQueue() {
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
    return true;
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
    return new PriorityQueue(priority, value, this);
      }

  /**
   * Return the value in the IPriorityQueue that has the highest priority
   *
   * @return the value in the IPriorityQueue that has the highest priority
   */
  @Override
  public String peek() throws BaseCaseQueueException {
    throw new BaseCaseQueueException("This queue is empty");
  }

  /**
   * Return a copy of the IPriorityQueue without the element with the highest priority
   *
   * @return a copy of the IPriorityQueue without the element with the highest priority
   */
  @Override
  public IPriorityQueue pop() throws BaseCaseQueueException {
    throw new BaseCaseQueueException("This queue is empty");
  }
}
