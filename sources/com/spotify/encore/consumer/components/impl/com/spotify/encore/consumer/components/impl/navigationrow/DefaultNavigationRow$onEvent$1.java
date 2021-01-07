package com.spotify.encore.consumer.components.impl.com.spotify.encore.consumer.components.impl.navigationrow;

import android.view.View;
import com.spotify.encore.consumer.components.api.navigationrow.NavigationRow;

final class DefaultNavigationRow$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultNavigationRow$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(NavigationRow.Events.RowClicked);
    }
}
