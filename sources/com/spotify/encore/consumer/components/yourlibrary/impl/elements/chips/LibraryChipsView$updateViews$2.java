package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;

/* access modifiers changed from: package-private */
public final class LibraryChipsView$updateViews$2 implements View.OnClickListener {
    final /* synthetic */ FilterRowLibrary.Filter $filter;
    final /* synthetic */ int $index;
    final /* synthetic */ LibraryChipsView this$0;

    LibraryChipsView$updateViews$2(LibraryChipsView libraryChipsView, FilterRowLibrary.Filter filter, int i) {
        this.this$0 = libraryChipsView;
        this.$filter = filter;
        this.$index = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OnFilterSelectedChangedListener listener$libs_encore_consumer_components_yourlibrary_impl;
        if (!(this.this$0.transitioning) && (listener$libs_encore_consumer_components_yourlibrary_impl = this.this$0.getListener$libs_encore_consumer_components_yourlibrary_impl()) != null) {
            FilterRowLibrary.Filter filter = this.$filter;
            listener$libs_encore_consumer_components_yourlibrary_impl.onFilterSelectedChanged(FilterRowLibrary.Filter.copy$default(filter, 0, null, !filter.getSelected(), 3, null), this.$index);
        }
    }
}
