package com.spotify.encore.consumer.components.viewbindings.headers;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.a;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderLayoutBinding;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.PlayButtonBinding;
import com.spotify.encore.consumer.elements.backbutton.BackButtonView;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;
import com.spotify.encore.mobile.utils.StatusBarUtilsKt;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class HeaderViewBindingsExtensions {
    public static final void applySystemWindowInsetTop(HeaderLayoutBinding headerLayoutBinding, int i) {
        h.e(headerLayoutBinding, "$this$applySystemWindowInsetTop");
        Toolbar toolbar = headerLayoutBinding.toolbar;
        h.d(toolbar, "toolbar");
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        Toolbar toolbar2 = headerLayoutBinding.toolbar;
        h.d(toolbar2, "toolbar");
        layoutParams.height = toolbar2.getLayoutParams().height + i;
        Toolbar toolbar3 = headerLayoutBinding.toolbar;
        h.d(toolbar3, "toolbar");
        int paddingLeft = toolbar3.getPaddingLeft();
        Toolbar toolbar4 = headerLayoutBinding.toolbar;
        h.d(toolbar4, "toolbar");
        int paddingRight = toolbar4.getPaddingRight();
        Toolbar toolbar5 = headerLayoutBinding.toolbar;
        h.d(toolbar5, "toolbar");
        toolbar3.setPadding(paddingLeft, i, paddingRight, toolbar5.getPaddingBottom());
        BackButtonView backButtonView = headerLayoutBinding.backButton;
        h.d(backButtonView, "backButton");
        ViewGroup.LayoutParams layoutParams2 = backButtonView.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            BackButtonView backButtonView2 = headerLayoutBinding.backButton;
            h.d(backButtonView2, "backButton");
            ViewGroup.LayoutParams layoutParams3 = backButtonView2.getLayoutParams();
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.topMargin = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + i;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final View inflateContent(HeaderLayoutBinding headerLayoutBinding, int i) {
        h.e(headerLayoutBinding, "$this$inflateContent");
        ViewStub viewStub = headerLayoutBinding.contentContainer;
        h.d(viewStub, "contentContainer");
        viewStub.setLayoutResource(i);
        View inflate = headerLayoutBinding.contentContainer.inflate();
        h.d(inflate, "contentContainer.inflate()");
        return inflate;
    }

    public static final PlayButtonView inflatePlayButton(HeaderLayoutBinding headerLayoutBinding) {
        h.e(headerLayoutBinding, "$this$inflatePlayButton");
        AppBarLayout root = headerLayoutBinding.getRoot();
        h.d(root, "root");
        LayoutInflater from = LayoutInflater.from(root.getContext());
        AppBarLayout root2 = headerLayoutBinding.getRoot();
        h.d(root2, "root");
        PlayButtonBinding inflate = PlayButtonBinding.inflate(from, new CoordinatorLayout(root2.getContext(), null), false);
        h.d(inflate, "PlayButtonBinding.inflat…ext),\n        false\n    )");
        PlayButtonView root3 = inflate.getRoot();
        h.d(root3, "PlayButtonBinding.inflat…\n        false\n    ).root");
        headerLayoutBinding.getRoot().addOnAttachStateChangeListener(new HeaderViewBindingsExtensions$inflatePlayButton$1$1(root3));
        return root3;
    }

    public static final void init(HeaderLayoutBinding headerLayoutBinding) {
        h.e(headerLayoutBinding, "$this$init");
        AppBarLayout root = headerLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        AppBarLayout root2 = headerLayoutBinding.getRoot();
        h.d(root2, "root");
        setHeaderColor(headerLayoutBinding, a.b(root2.getContext(), R.color.header_background_default));
    }

    public static final void requestWindowInsets(HeaderLayoutBinding headerLayoutBinding, nmf<? super Integer, f> nmf) {
        h.e(headerLayoutBinding, "$this$requestWindowInsets");
        h.e(nmf, "windowInsetTopCallback");
        if (Build.VERSION.SDK_INT < 21) {
            AppBarLayout root = headerLayoutBinding.getRoot();
            h.d(root, "root");
            Context context = root.getContext();
            h.d(context, "root.context");
            int translucentStatusBarHeight = StatusBarUtilsKt.getTranslucentStatusBarHeight(context);
            applySystemWindowInsetTop(headerLayoutBinding, translucentStatusBarHeight);
            nmf.invoke(Integer.valueOf(translucentStatusBarHeight));
            return;
        }
        q4.P(headerLayoutBinding.getRoot(), new HeaderViewBindingsExtensions$requestWindowInsets$2(headerLayoutBinding, nmf));
    }

    public static /* synthetic */ void requestWindowInsets$default(HeaderLayoutBinding headerLayoutBinding, nmf nmf, int i, Object obj) {
        if ((i & 1) != 0) {
            nmf = HeaderViewBindingsExtensions$requestWindowInsets$1.INSTANCE;
        }
        requestWindowInsets(headerLayoutBinding, nmf);
    }

    public static final void setHeaderColor(HeaderLayoutBinding headerLayoutBinding, int i) {
        h.e(headerLayoutBinding, "$this$setHeaderColor");
        headerLayoutBinding.getRoot().setBackgroundColor(i);
        Toolbar toolbar = headerLayoutBinding.toolbar;
        h.d(toolbar, "toolbar");
        Drawable background = toolbar.getBackground();
        h.d(background, "toolbar.background");
        background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.DST_OVER));
    }

    public static final void updateToolbarWithOffset(HeaderLayoutBinding headerLayoutBinding, int i, View view) {
        h.e(headerLayoutBinding, "$this$updateToolbarWithOffset");
        h.e(view, "dependency");
        AppBarLayout root = headerLayoutBinding.getRoot();
        h.d(root, "root");
        Context context = root.getContext();
        h.d(context, "root.context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.toolbar_visibility_offset);
        float y = view.getY();
        Toolbar toolbar = headerLayoutBinding.toolbar;
        h.d(toolbar, "toolbar");
        float f = (float) dimensionPixelSize;
        Toolbar toolbar2 = headerLayoutBinding.toolbar;
        h.d(toolbar2, "toolbar");
        toolbar2.setAlpha(knf.b(((float) (-i)) - ((y - ((float) toolbar.getHeight())) - f), 0.0f, f) / f);
    }
}
