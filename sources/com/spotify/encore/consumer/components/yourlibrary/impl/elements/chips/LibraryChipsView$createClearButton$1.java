package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import android.view.View;

/* access modifiers changed from: package-private */
public final class LibraryChipsView$createClearButton$1 implements View.OnClickListener {
    final /* synthetic */ LibraryChipsView this$0;

    LibraryChipsView$createClearButton$1(LibraryChipsView libraryChipsView) {
        this.this$0 = libraryChipsView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OnFilterSelectedChangedListener listener$libs_encore_consumer_components_yourlibrary_impl;
        if (!(this.this$0.transitioning) && (listener$libs_encore_consumer_components_yourlibrary_impl = this.this$0.getListener$libs_encore_consumer_components_yourlibrary_impl()) != null) {
            listener$libs_encore_consumer_components_yourlibrary_impl.onClearFiltersClicked();
        }
    }
}
