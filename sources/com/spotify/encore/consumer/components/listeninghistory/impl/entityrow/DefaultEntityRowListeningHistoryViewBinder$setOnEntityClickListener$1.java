package com.spotify.encore.consumer.components.listeninghistory.impl.entityrow;

import android.view.View;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;

/* access modifiers changed from: package-private */
public final class DefaultEntityRowListeningHistoryViewBinder$setOnEntityClickListener$1 implements View.OnClickListener {
    final /* synthetic */ nmf $consumer;

    DefaultEntityRowListeningHistoryViewBinder$setOnEntityClickListener$1(nmf nmf) {
        this.$consumer = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$consumer.invoke(Events.RowClicked);
    }
}
