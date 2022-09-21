package learning.collection.framework.list.linkedlist;
class ETester<T> {
	T value1;
	T value2;	
	public ETester(T value1, T value2) {
		this.value1=value1;
		this.value2=value2;
	}	
	public boolean checkEquals() {
		return value1.equals(value2);
	}
}