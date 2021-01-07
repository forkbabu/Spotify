package com.spotify.encore.consumer.elements.quickactions.hide;

import android.view.View;

/* access modifiers changed from: package-private */
public final class HideButton$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ HideButton this$0;

    HideButton$onEvent$1(HideButton hideButton, nmf nmf) {
        this.this$0 = hideButton;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(Boolean.valueOf(this.this$0.isHidden()));
    }
}
