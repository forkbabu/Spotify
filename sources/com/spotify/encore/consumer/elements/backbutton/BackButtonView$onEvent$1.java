package com.spotify.encore.consumer.elements.backbutton;

import android.view.View;
import kotlin.f;

/* access modifiers changed from: package-private */
public final class BackButtonView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    BackButtonView$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(f.a);
    }
}
