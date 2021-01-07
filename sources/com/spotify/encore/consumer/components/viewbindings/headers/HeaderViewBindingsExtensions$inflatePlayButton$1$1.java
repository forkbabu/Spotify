package com.spotify.encore.consumer.components.viewbindings.headers;

import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import kotlin.jvm.internal.h;

public final class HeaderViewBindingsExtensions$inflatePlayButton$1$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ PlayButtonView $playButton;

    HeaderViewBindingsExtensions$inflatePlayButton$1$1(PlayButtonView playButtonView) {
        this.$playButton = playButtonView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        h.e(view, "view");
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((CoordinatorLayout) parent).addView(this.$playButton);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        h.e(view, "view");
    }
}
