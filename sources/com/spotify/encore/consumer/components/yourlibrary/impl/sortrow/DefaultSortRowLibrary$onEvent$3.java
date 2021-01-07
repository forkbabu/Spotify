package com.spotify.encore.consumer.components.yourlibrary.impl.sortrow;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.sortrow.SortRowLibrary;

final class DefaultSortRowLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultSortRowLibrary$onEvent$3(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(SortRowLibrary.Events.ViewDensityClicked);
    }
}
