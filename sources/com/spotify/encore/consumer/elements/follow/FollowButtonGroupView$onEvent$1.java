package com.spotify.encore.consumer.elements.follow;

import android.view.View;
import kotlin.jvm.internal.h;

final class FollowButtonGroupView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ FollowButtonGroupView this$0;

    FollowButtonGroupView$onEvent$1(FollowButtonGroupView followButtonGroupView, nmf nmf) {
        this.this$0 = followButtonGroupView;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nmf nmf = this.$event;
        FollowButtonView followButtonView = this.this$0.binding.followButtonGroupButton;
        h.d(followButtonView, "binding.followButtonGroupButton");
        nmf.invoke(Boolean.valueOf(followButtonView.isChecked()));
    }
}
