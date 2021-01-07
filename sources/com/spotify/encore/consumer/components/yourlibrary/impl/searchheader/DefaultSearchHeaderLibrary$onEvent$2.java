package com.spotify.encore.consumer.components.yourlibrary.impl.searchheader;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;

final class DefaultSearchHeaderLibrary$onEvent$2 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultSearchHeaderLibrary$onEvent$2(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(SearchHeaderLibrary.Events.BackButtonClicked.INSTANCE);
    }
}
