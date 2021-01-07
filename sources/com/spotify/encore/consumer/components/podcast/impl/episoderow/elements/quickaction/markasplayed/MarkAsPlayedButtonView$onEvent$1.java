package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.markasplayed;

import android.view.View;
import kotlin.f;

final class MarkAsPlayedButtonView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    MarkAsPlayedButtonView$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(f.a);
    }
}
