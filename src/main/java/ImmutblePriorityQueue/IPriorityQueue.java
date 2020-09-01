package ImmutblePriorityQueue;

public interface IPriorityQueue {

  /**
   * Creates and returns an empty IPriorityQueue
   * @return an empty IPriorityQueue
   */
  IPriorityQueue createEmpty();

  /**
   * isEmpty check if IPriorityQueue is empty
   * @return true if the IPriorityQueue contains no items, and return false otherwise
   */
  Boolean isEmpty();

  /**
   * Adds the given element(the priority and its associated value) to the IPriorityQueue
   * @param priority - the given element's priority
   * @param value - the given element's value
   * @return the new IPriorityQueue with the given element
   */
  IPriorityQueue add(Integer priority, String value);

  /**
   * Return the value in the IPriorityQueue that has the highest priority
   * @return the value in the IPriorityQueue that has the highest priority
   * @throws BaseCaseQueueException if the queue is empty
   */

//   * Return the value in the IPriorityQueue that has the highest priority
//   * @return the value in the IPriorityQueue that has the highest priority
//   * @throws -

  String peek() throws BaseCaseQueueException;

  /**
   * Return a copy of the IPriorityQueue without the element with the highest priority
   * @return a copy of the IPriorityQueue without the element with the highest priority
   * @throws BaseCaseQueueException if the queue is empty
   */
  IPriorityQueue pop() throws BaseCaseQueueException;
}
