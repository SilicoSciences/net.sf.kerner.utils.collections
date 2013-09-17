/**********************************************************************
Copyright (c) 2012-2013 Alexander Kerner. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 ***********************************************************************/

package net.sf.kerner.utils.collections.map.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * A {@code MapCollection} represents a {@link Map}, that contains values, which
 * are itself a {@link Collection}.
 * <p>
 * <b>Example:</b><br>
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * 
 * 
 * </p>
 * 
 * 
 * <p>
 * last reviewed: 2013-08-07
 * </p>
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2013-08-07
 * @param <K>
 *            type of keys in this map
 * @param <V>
 *            type of values in this map
 * @param <L>
 *            type of implementation of {@link Collection}
 */
public interface MapCollection<K, V, L extends Collection<? extends V>> {

    void clear();

    boolean containsKey(K k);

    boolean containsValue(V v);

    Set<Entry<K, L>> entrySet();

    L get(K k);

    boolean isEmpty();

    boolean isEmpty(K k);

    Set<K> keySet();

    /**
     * Add another key value mapping to this {@code MapCollection}. </p> If this
     * {@code MapCollection} already contains this key, The value is added to
     * the {@code Collection} that is mapped by this key.</p> If the
     * {@code MapCollection} does not contain this key, a new {@code Collection}
     * is created, which will be associated by given key and holds initially
     * given value.
     */
    void put(K k, V v);

    /**
     * Add all key value mappings to this {@code MapCollection}. </p> If this
     * {@code MapCollection} already contains this key, All values are added to
     * the {@code Collection} that is mapped by this key.
     */
    void putAll(K k, Collection<? extends V> values);

    /**
     * Add all key value mappings to this {@code MapCollection}. </p> If this
     * {@code MapCollection} already contains any of given keys, All values are
     * added to the {@code Collection} that are mapped by this key.
     */
    void putAll(Map<? extends K, ? extends V> values);

    /**
     * Add all key value mappings to this {@code MapCollection}. </p> If this
     * {@code MapCollection} already contains any of given keys, All values are
     * added to the {@code Collection} that are mapped by this key.
     */
    void putAll(MapCollection<? extends K, ? extends V, L> values);

    void remove(K k);

    /**
     * Removes all values from {@code k} which are equal to {@code v}.
     * 
     */
    void removeValue(K k, V v);

    /**
     * Removes all values from all keys which are equal to {@code v}.
     * 
     */
    void removeValue(V v);

    int size();

    int size(K k);

    Collection<L> values();
}
