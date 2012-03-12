package net.sf.kerner.utils.collections.map.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import net.sf.kerner.utils.collections.map.CollectionMap;
import net.sf.kerner.utils.collections.map.MapFactory;

public abstract class CollectionMapAbstract<K, V, L extends Collection<V>> implements CollectionMap<K, V, L> {

	protected final Map<K, L> map;

	public CollectionMapAbstract(MapFactory<K, L> mapFactory) {
		this.map = mapFactory.create();
	}

	public CollectionMapAbstract() {
		this(new LinkedHashMapFactory<K, L>());
	}

	public void putAll(K k, Collection<? extends V> elements) {
		for (V v : elements) {
			put(k, v);
		}
	}

	public void putAll(Map<? extends K, ? extends V> m) {
		for (java.util.Map.Entry<? extends K, ? extends V> e : m.entrySet()) {
			this.put(e.getKey(), e.getValue());
		}
	}

	public int size() {
		return map.size();
	}

	public int size(K k) {
		return map.get(k).size();
	}

	public boolean isEmpty() {
		return map.isEmpty();
	}
	
	public boolean isEmpty(K k) {
		return map.get(k).isEmpty();
	}

	public boolean containsKey(K key) {
		return map.containsKey(key);
	}

	public boolean containsValue(V value) {
		for (Collection<V> v : map.values()) {
			if (v.contains(value))
				return true;
		}
		return false;
	}

	public void remove(K key) {
		for (Collection<V> c : map.values()) {
			c.remove(key);
		}
	}

	public void clear() {
		map.clear();
	}

	public Set<K> keySet() {
		return map.keySet();
	}
	
	public Set<Map.Entry<K, L>> entrySet() {
		return map.entrySet();
	}

	public boolean equals(Object o) {
		return map.equals(o);
	}

	public int hashCode() {
		return map.hashCode();
	}

	@Override
	public String toString() {
		return map.toString();
	}

}
