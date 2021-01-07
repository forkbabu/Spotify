package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.h;

public final class LibraryChipsViewKt {
    public static final void validate(List<FilterRowLibrary.Filter> list) {
        FilterRowLibrary.Filter filter;
        boolean z;
        if (!list.isEmpty()) {
            Boolean bool = null;
            for (FilterRowLibrary.Filter filter2 : list) {
                if (!filter2.getSelected()) {
                    bool = Boolean.FALSE;
                } else if (bool == null || bool.booleanValue()) {
                    bool = Boolean.TRUE;
                } else {
                    throw new IllegalArgumentException("Invalid model, " + list);
                }
                ListIterator<FilterRowLibrary.Filter> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        filter = null;
                        break;
                    }
                    filter = listIterator.previous();
                    if (filter.getId() == filter2.getId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                if (!h.a(filter, filter2)) {
                    throw new IllegalArgumentException("Duplicate id, " + filter2 + ", in " + list);
                }
            }
        }
    }
}
