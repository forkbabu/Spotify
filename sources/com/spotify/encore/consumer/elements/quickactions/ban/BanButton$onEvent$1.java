package com.spotify.encore.consumer.elements.quickactions.ban;

import android.view.View;

/* access modifiers changed from: package-private */
public final class BanButton$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ BanButton this$0;

    BanButton$onEvent$1(BanButton banButton, nmf nmf) {
        this.this$0 = banButton;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(Boolean.valueOf(this.this$0.banned));
    }
}
