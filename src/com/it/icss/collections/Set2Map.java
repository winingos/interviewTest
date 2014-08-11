package com.it.icss.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class SimpleEntry<K, V> implements Map.Entry<K, V>, java.io.Serializable {
	private final K key;
	private V value;
	// Constructor1
	public SimpleEntry(K key,V value) {
		this.key=key;
		this.value=value;
	}
	// Constructor2
	public SimpleEntry(Map.Entry<? extends K,? extends V> entry) {
		this.key=entry.getKey();
		this.value=entry.getValue();
	}
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public V getValue() {
		return value;
	}
//	change value 
	@Override
	public V setValue(V value) {
		V oldValue = this.value;
		this.value = value;
		return oldValue;
	}
//	key to compare SimpleEntry is equal
	public boolean equals(Object o) {
		if (o==this) {
			return true;
		}
		if (o.getClass()==SimpleEntry.class) {
			SimpleEntry se = (SimpleEntry) o;
			return se.key.equals(getKey());
		}
		return false;
	}
//	to produce hashcode form key
	public int hashCode() {
		return key==null?0:key.hashCode();
	}
	@Override
	public String toString() {
		return getKey().toString()+"="+getValue().toString();
	}
}
// implement hashset to map
public class Set2Map<K,V> extends HashSet<SimpleEntry<K, V>>{
private static final String SimpleEntry = null;
	//	clear all key-value
	public void clear() {
		super.clear();
	}
//	is contains key;
	public boolean containsKey(K key){
		return super.contains(new SimpleEntry<K, V>(key,null));
	}
//	is contains value
	public boolean containsValue(V value) {
		for (SimpleEntry se : this) {
			if(se.getValue().equals(value))
				return true;
		}
		return false;
	}
//	根据指定key取出指定value
	public V get(K key){
		for (SimpleEntry se : this) {
			if(se.getKey().equals(key))
				return (V) se.getValue();
		}
		return null;
	}
// put key-value in map
	public boolean put(K key,V value) {
		add(new SimpleEntry<K, V>(key,value));
		return true;
	}
// 将另一个Map中的Key-value对放入该map中
	public void putAll(Map<? extends K,? extends V> map){
		for (K key:map.keySet()) {
			add(new SimpleEntry<K, V>(key,map.get(key)));
		}
	}
//	根据key删除指定key-value对
	public boolean removeEntry(K key){
		Iterator<SimpleEntry<K, V>> it = this.iterator();
		while(it.hasNext()){
			SimpleEntry<K, V> se=it.next();
			if(se.getKey().equals(key)){
				it.remove();
				return true;
			}
		}
		return false;
	}
//	size
	public int size() {
		return super.size();
	}
}
