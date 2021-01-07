package com.spotify.encore.consumer.elements.playbutton;

import android.view.View;
import kotlin.f;

/* access modifiers changed from: package-private */
public final class PlayButtonView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    PlayButtonView$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(f.a);
    }
}
