package com.spotify.encore.consumer.elements.heart;

import android.view.View;

/* access modifiers changed from: package-private */
public final class HeartButton$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ HeartButton this$0;

    HeartButton$onEvent$1(HeartButton heartButton, nmf nmf) {
        this.this$0 = heartButton;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(Boolean.valueOf(this.this$0.isHearted));
    }
}
