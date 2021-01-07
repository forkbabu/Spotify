package com.spotify.encore.consumer.components.impl.trackrowplaylistextender.elements;

import android.animation.ValueAnimator;
import android.view.View;

/* access modifiers changed from: package-private */
public final class AddToPlaylistButton$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ AddToPlaylistButton this$0;

    AddToPlaylistButton$onEvent$1(AddToPlaylistButton addToPlaylistButton, nmf nmf) {
        this.this$0 = addToPlaylistButton;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.this$0.addButtonAnimation == null) {
            AddToPlaylistButton addToPlaylistButton = this.this$0;
            addToPlaylistButton.addButtonAnimation = AddButtonAnimationUtils.make(addToPlaylistButton);
            AddToPlaylistButton$onEvent$1$animationUpdateListener$1 addToPlaylistButton$onEvent$1$animationUpdateListener$1 = new AddToPlaylistButton$onEvent$1$animationUpdateListener$1(this);
            ValueAnimator valueAnimator = this.this$0.addButtonAnimation;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(addToPlaylistButton$onEvent$1$animationUpdateListener$1);
            }
            AddToPlaylistButton$onEvent$1$animatorListener$1 addToPlaylistButton$onEvent$1$animatorListener$1 = new AddToPlaylistButton$onEvent$1$animatorListener$1(this);
            ValueAnimator valueAnimator2 = this.this$0.addButtonAnimation;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(addToPlaylistButton$onEvent$1$animatorListener$1);
            }
            ValueAnimator valueAnimator3 = this.this$0.addButtonAnimation;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }
}
