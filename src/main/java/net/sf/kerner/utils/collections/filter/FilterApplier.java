package net.sf.kerner.utils.collections.filter;

import java.util.List;

import net.sf.kerner.utils.collections.applier.Applier;

public interface FilterApplier<E> extends Filter<E>, Applier {

    void addFilter(Filter<E> filter);

    List<Filter<E>> getFilters();

}
