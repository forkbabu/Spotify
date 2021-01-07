package com.spotify.encore.consumer.components.impl.trackrowplaylistextender.elements;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class AddToPlaylistButton$onEvent$1$animatorListener$1 extends AnimatorListenerAdapter {
    final /* synthetic */ AddToPlaylistButton$onEvent$1 this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    AddToPlaylistButton$onEvent$1$animatorListener$1(AddToPlaylistButton$onEvent$1 addToPlaylistButton$onEvent$1) {
        this.this$0 = addToPlaylistButton$onEvent$1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        h.e(animator, "animation");
        this.this$0.$event.invoke(f.a);
        this.this$0.this$0.addButtonAnimation = null;
    }
}
