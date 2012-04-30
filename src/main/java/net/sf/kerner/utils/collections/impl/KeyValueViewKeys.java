package net.sf.kerner.utils.collections.impl;

import java.util.Collection;
import java.util.List;

import net.sf.kerner.utils.KeyValue;
import net.sf.kerner.utils.ViewKeyValueKey;
import net.sf.kerner.utils.collections.TransformerCollection;
import net.sf.kerner.utils.collections.list.ListFactory;
import net.sf.kerner.utils.collections.list.TransformerList;
import net.sf.kerner.utils.collections.list.impl.ArrayListFactory;

public class KeyValueViewKeys<K> extends ViewKeyValueKey<K> implements
		TransformerCollection<KeyValue<K, ?>, K> {

	private final ListFactory<K> factory;

	public KeyValueViewKeys(ListFactory<K> factory) {
		this.factory = factory;
	}

	public KeyValueViewKeys() {
		this(new ArrayListFactory<K>());
	}

	public List<K> transformCollection(Collection<? extends KeyValue<K, ?>> element) {
		List<K> result = factory.createCollection();
		for (KeyValue<K, ?> e : element) {
			result.add(transform(e));
		}
		return result;
	}

}
