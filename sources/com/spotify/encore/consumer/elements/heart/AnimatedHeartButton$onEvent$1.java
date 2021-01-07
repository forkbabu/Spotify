package com.spotify.encore.consumer.elements.heart;

import android.view.View;

/* access modifiers changed from: package-private */
public final class AnimatedHeartButton$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ AnimatedHeartButton this$0;

    AnimatedHeartButton$onEvent$1(AnimatedHeartButton animatedHeartButton, nmf nmf) {
        this.this$0 = animatedHeartButton;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AnimatedHeartButton.access$setAnimateNextRender$p(this.this$0, true);
        this.$event.invoke(Boolean.valueOf(AnimatedHeartButton.access$isHearted$p(this.this$0)));
    }
}
