package com.spotify.encore.consumer.components.viewbindings.headers;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.a;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderMotionLayoutBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.PlayButtonBinding;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import kotlin.jvm.internal.h;

public final class HeaderMotionBindingsExtensions {
    public static final void applyMotionScene(HeaderMotionLayoutBinding headerMotionLayoutBinding, int i) {
        h.e(headerMotionLayoutBinding, "$this$applyMotionScene");
        headerMotionLayoutBinding.motionContainer.loadLayoutDescription(i);
    }

    public static final PlayButtonView inflatePlayButton(HeaderMotionLayoutBinding headerMotionLayoutBinding) {
        h.e(headerMotionLayoutBinding, "$this$inflatePlayButton");
        AppBarLayout root = headerMotionLayoutBinding.getRoot();
        h.d(root, "root");
        LayoutInflater from = LayoutInflater.from(root.getContext());
        AppBarLayout root2 = headerMotionLayoutBinding.getRoot();
        h.d(root2, "root");
        PlayButtonBinding inflate = PlayButtonBinding.inflate(from, new CoordinatorLayout(root2.getContext(), null), false);
        h.d(inflate, "PlayButtonBinding.inflat…ext),\n        false\n    )");
        PlayButtonView root3 = inflate.getRoot();
        h.d(root3, "PlayButtonBinding.inflat…\n        false\n    ).root");
        headerMotionLayoutBinding.getRoot().addOnAttachStateChangeListener(new HeaderMotionBindingsExtensions$inflatePlayButton$1$1(root3));
        return root3;
    }

    public static final void init(HeaderMotionLayoutBinding headerMotionLayoutBinding) {
        h.e(headerMotionLayoutBinding, "$this$init");
        AppBarLayout root = headerMotionLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        AppBarLayout root2 = headerMotionLayoutBinding.getRoot();
        h.d(root2, "root");
        setHeaderColor(headerMotionLayoutBinding, a.b(root2.getContext(), R.color.header_background_default));
        headerMotionLayoutBinding.getRoot().a(new HeaderMotionBindingsExtensions$init$1(headerMotionLayoutBinding));
    }

    public static final View mergeContent(HeaderMotionLayoutBinding headerMotionLayoutBinding, int i) {
        h.e(headerMotionLayoutBinding, "$this$mergeContent");
        AppBarLayout root = headerMotionLayoutBinding.getRoot();
        h.d(root, "root");
        View inflate = LayoutInflater.from(root.getContext()).inflate(i, (ViewGroup) headerMotionLayoutBinding.motionContainer, true);
        h.d(inflate, "LayoutInflater.from(root…s, motionContainer, true)");
        return inflate;
    }

    public static final void setHeaderColor(HeaderMotionLayoutBinding headerMotionLayoutBinding, int i) {
        h.e(headerMotionLayoutBinding, "$this$setHeaderColor");
        headerMotionLayoutBinding.getRoot().setBackgroundColor(i);
        Toolbar toolbar = headerMotionLayoutBinding.toolbar;
        h.d(toolbar, "toolbar");
        Drawable background = toolbar.getBackground();
        h.d(background, "toolbar.background");
        background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.DST_OVER));
    }

    public static final void updateToolbarWithOffset(HeaderMotionLayoutBinding headerMotionLayoutBinding, int i, View view) {
        h.e(headerMotionLayoutBinding, "$this$updateToolbarWithOffset");
        h.e(view, "dependency");
        AppBarLayout root = headerMotionLayoutBinding.getRoot();
        h.d(root, "root");
        Context context = root.getContext();
        h.d(context, "root.context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.toolbar_visibility_offset);
        float y = view.getY();
        Toolbar toolbar = headerMotionLayoutBinding.toolbar;
        h.d(toolbar, "toolbar");
        Toolbar toolbar2 = headerMotionLayoutBinding.toolbar;
        h.d(toolbar2, "toolbar");
        toolbar2.setAlpha(knf.b(((float) (-i)) - ((y - ((float) toolbar.getHeight())) - ((float) dimensionPixelSize)), 0.0f, (float) view.getHeight()) / ((float) view.getHeight()));
    }
}
