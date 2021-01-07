package com.spotify.encore.consumer.elements.follow;

import android.view.View;

/* access modifiers changed from: package-private */
public final class FollowButtonView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ FollowButtonView this$0;

    FollowButtonView$onEvent$1(FollowButtonView followButtonView, nmf nmf) {
        this.this$0 = followButtonView;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(Boolean.valueOf(this.this$0.isChecked()));
    }
}
