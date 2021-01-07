package com.spotify.libs.nudges;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import kotlin.f;

public final class h implements k {
    private final PopupWindow a;
    private final int b;

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View a;
        final /* synthetic */ nmf b;

        a(View view, nmf nmf) {
            this.a = view;
            this.b = nmf;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = this.a;
            kotlin.jvm.internal.h.d(view, "arrow");
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            kotlin.jvm.internal.h.d(viewTreeObserver, "arrow.viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                View view2 = this.a;
                kotlin.jvm.internal.h.d(view2, "arrow");
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                nmf nmf = this.b;
                View view3 = this.a;
                kotlin.jvm.internal.h.d(view3, "arrow");
                nmf.invoke(view3);
                return;
            }
            View view4 = this.a;
            kotlin.jvm.internal.h.d(view4, "arrow");
            view4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public h(Context context, int i) {
        kotlin.jvm.internal.h.e(context, "context");
        PopupWindow popupWindow = new PopupWindow(context);
        this.a = popupWindow;
        LayoutInflater from = LayoutInflater.from(context);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(from.inflate(C0707R.layout.nudge, (ViewGroup) null));
        popupWindow.setAnimationStyle(i);
        Resources resources = context.getResources();
        kotlin.jvm.internal.h.d(resources, "context.resources");
        this.b = resources.getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp) * 4);
    }

    @Override // com.spotify.libs.nudges.k
    public void a(cmf<f> cmf) {
        kotlin.jvm.internal.h.e(cmf, "listener");
        View findViewById = this.a.getContentView().findViewById(C0707R.id.nudge_content);
        if (findViewById != null) {
            ((NudgeContentView) findViewById).setOnSwipeDownListener(cmf);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.libs.nudges.NudgeContentView");
    }

    @Override // com.spotify.libs.nudges.k
    public void b(View view, int i, int i2) {
        kotlin.jvm.internal.h.e(view, "view");
        this.a.showAsDropDown(view, i, i2);
    }

    @Override // com.spotify.libs.nudges.k
    public void c(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.a.getContentView().findViewById(C0707R.id.nudge_content);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.L = this.b;
        constraintLayout.removeAllViews();
        constraintLayout.addView(view, layoutParams);
        this.a.getContentView().measure(-2, -2);
        this.a.setHeight(-2);
        PopupWindow popupWindow = this.a;
        View contentView = popupWindow.getContentView();
        kotlin.jvm.internal.h.d(contentView, "popupWindow.contentView");
        popupWindow.setWidth(contentView.getMeasuredWidth());
    }

    @Override // com.spotify.libs.nudges.k
    public void d(nmf<? super View, f> nmf) {
        kotlin.jvm.internal.h.e(nmf, "transformationCallback");
        View findViewById = this.a.getContentView().findViewById(C0707R.id.nudge_arrow);
        kotlin.jvm.internal.h.d(findViewById, "arrow");
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new a(findViewById, nmf));
    }

    @Override // com.spotify.libs.nudges.k
    public void dismiss() {
        this.a.dismiss();
    }

    @Override // com.spotify.libs.nudges.k
    public View e() {
        View contentView = this.a.getContentView();
        kotlin.jvm.internal.h.d(contentView, "popupWindow.contentView");
        return contentView;
    }
}
