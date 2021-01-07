package com.spotify.encore.consumer.components.yourlibrary.impl.filterrow;

import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.OnFilterSelectedChangedListener;
import kotlin.jvm.internal.h;

public final class DefaultFilterRowLibrary$onEvent$1 implements OnFilterSelectedChangedListener {
    final /* synthetic */ nmf $event;

    DefaultFilterRowLibrary$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.OnFilterSelectedChangedListener
    public void onClearFiltersClicked() {
        this.$event.invoke(FilterRowLibrary.Event.ClearClicked.INSTANCE);
    }

    @Override // com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.OnFilterSelectedChangedListener
    public void onFilterSelectedChanged(FilterRowLibrary.Filter filter, int i) {
        h.e(filter, "filter");
        this.$event.invoke(new FilterRowLibrary.Event.FilterChanged(filter, i));
    }
}
