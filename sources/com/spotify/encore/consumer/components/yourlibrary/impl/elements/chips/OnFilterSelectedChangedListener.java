package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;

public interface OnFilterSelectedChangedListener {
    void onClearFiltersClicked();

    void onFilterSelectedChanged(FilterRowLibrary.Filter filter, int i);
}
