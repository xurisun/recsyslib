package core;

/**
 * The interface <tt>DataSet</tt> presents a data set which includes users, items and rates in Recommender Systems.
 * In order to consistency, the <tt>addRate(Rate)</tt>, 
 * <tt>removeUser(int)</tt> and <tt>removeItem(int)</tt> methods are redefined. 
 * @version 1.0 2012-7-5
 * @author Tan Chang
 * @since JDK 1.7
 */
public interface DataSet extends UserSet, ItemSet, RateSet {
	/**
	 * Add a rate into this data set. If there is a rate r in this data set
	 * meeting
	 * <code>r.getUserId() == rate.getUserId() && r.getItemId == rate.getItemId()</code>
	 * , r will be replaced by rate. If <code>rate==null</code> or the user or
	 * item id does not exist in this data set, this data set will not be
	 * modified and return false�� So that if there are some rates related to new
	 * user or item needed to add into this data set, the user or item should be
	 * added by <code>addUser(User user)</code> or
	 * <code>addItem(Item item)</code> at first.
	 */
	public abstract boolean addRate(Rate rate);
	
	/**
	 * Remove the user associated with the user id from this user set. 
	 * All rates associated with the user also be removed. 
	 * @return the removed user associated with the user id, 
	 * or null if this data set contains no mapping for the user id
	 */
	public User removeUser(int userId);
	
	/**
	 * Remove the item associated with the item id from this data set. 
	 * All rates associated with the item also be removed. 
	 * @return the removed item associated with the item id, 
	 * or null if this item set contains no mapping for the item id
	 */	
	public Item removeItem(int itemId);
}
