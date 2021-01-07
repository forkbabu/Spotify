package com.spotify.encore.consumer.components.viewbindings.headers;

import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import kotlin.jvm.internal.h;

public final class HeaderMotionBindingsExtensions$inflatePlayButton$1$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ PlayButtonView $playButton;

    HeaderMotionBindingsExtensions$inflatePlayButton$1$1(PlayButtonView playButtonView) {
        this.$playButton = playButtonView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        h.e(view, "view");
        ViewParent parent = view.getParent();
        if (parent != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            coordinatorLayout.addView(this.$playButton);
            q4.P(coordinatorLayout, new HeaderMotionBindingsExtensions$inflatePlayButton$1$1$onViewAttachedToWindow$1(this, coordinatorLayout));
            q4.F(coordinatorLayout);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        h.e(view, "view");
    }
}
