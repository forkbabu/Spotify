package com.spotify.encore.consumer.elements.thumb;

import android.view.View;

final class ThumbButtonView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ ThumbButtonView this$0;

    ThumbButtonView$onEvent$1(ThumbButtonView thumbButtonView, nmf nmf) {
        this.this$0 = thumbButtonView;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nmf nmf = this.$event;
        ThumbButtonView thumbButtonView = this.this$0;
        nmf.invoke(new ThumbButtonEvent(thumbButtonView, thumbButtonView.getType(), this.this$0.state));
    }
}
