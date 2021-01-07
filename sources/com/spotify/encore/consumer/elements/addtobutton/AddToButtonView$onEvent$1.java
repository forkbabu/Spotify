package com.spotify.encore.consumer.elements.addtobutton;

import android.view.View;

final class AddToButtonView$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ AddToButtonView this$0;

    AddToButtonView$onEvent$1(AddToButtonView addToButtonView, nmf nmf) {
        this.this$0 = addToButtonView;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(this.this$0.state);
    }
}
