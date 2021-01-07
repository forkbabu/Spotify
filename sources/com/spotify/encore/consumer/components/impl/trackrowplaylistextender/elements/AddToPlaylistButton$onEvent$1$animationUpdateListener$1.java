package com.spotify.encore.consumer.components.impl.trackrowplaylistextender.elements;

import android.animation.ValueAnimator;
import com.spotify.encore.consumer.elements.R;
import kotlin.jvm.internal.h;

public final class AddToPlaylistButton$onEvent$1$animationUpdateListener$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ AddToPlaylistButton$onEvent$1 this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    AddToPlaylistButton$onEvent$1$animationUpdateListener$1(AddToPlaylistButton$onEvent$1 addToPlaylistButton$onEvent$1) {
        this.this$0 = addToPlaylistButton$onEvent$1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        h.e(valueAnimator, "valueAnimator");
        if (valueAnimator.getAnimatedFraction() > 0.2f) {
            valueAnimator.removeUpdateListener(this);
            AddToPlaylistButton addToPlaylistButton = this.this$0.this$0;
            addToPlaylistButton.setImageDrawable(addToPlaylistButton.checkDrawable);
            AddToPlaylistButton addToPlaylistButton2 = this.this$0.this$0;
            addToPlaylistButton2.setContentDescription(addToPlaylistButton2.getResources().getString(R.string.add_active_button_content_description));
        }
    }
}
