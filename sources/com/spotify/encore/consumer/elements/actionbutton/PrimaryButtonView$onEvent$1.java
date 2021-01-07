package com.spotify.encore.consumer.elements.actionbutton;

import android.view.View;
import kotlin.f;

final class PrimaryButtonView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    PrimaryButtonView$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(f.a);
    }
}
