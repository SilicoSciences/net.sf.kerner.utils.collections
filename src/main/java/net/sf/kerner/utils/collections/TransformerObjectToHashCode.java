/*******************************************************************************
 * Copyright (c) 2010-2014 Alexander Kerner. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.sf.kerner.utils.collections;

import java.util.Collection;
import java.util.Set;

import net.sf.kerner.utils.collections.set.impl.FactoryLinkedHashSet;
import net.sf.kerner.utils.collections.set.impl.TransformerSet;

public class TransformerObjectToHashCode extends TransformerAbstract<Object, Integer> implements
        TransformerSet<Object, Integer> {

    public TransformerObjectToHashCode() {
        super(new FactoryLinkedHashSet<Integer>());
    }

    public Integer transform(final Object element) {
        return element.hashCode();
    }

    @Override
    public Set<Integer> transformCollection(final Collection<? extends Object> element) {
        return (Set<Integer>) super.transformCollection(element);
    }

}
