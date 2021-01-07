package com.spotify.music.libs.search.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;

/* access modifiers changed from: package-private */
public class o extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ ToolbarSearchFieldView.d c;

    o(ToolbarSearchFieldView.d dVar, View view, View view2) {
        this.c = dVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ToolbarSearchFieldView.this.n.setClickable(true);
        ToolbarSearchFieldView.this.r.setClickable(true);
        if (ToolbarSearchFieldView.this.C) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ToolbarSearchFieldView.this.p.getLayoutParams();
            layoutParams.rightMargin = ToolbarSearchFieldView.this.f;
            e2.s(layoutParams, ToolbarSearchFieldView.this.f);
            ToolbarSearchFieldView.this.p.setLayoutParams(layoutParams);
            ToolbarSearchFieldView.this.p.setTranslationX(0.0f);
        }
        this.b.setVisibility(4);
        Editable text = ToolbarSearchFieldView.this.o.getText();
        text.getClass();
        text.clear();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (ToolbarSearchFieldView.this.b == 0) {
            ToolbarSearchFieldView toolbarSearchFieldView = ToolbarSearchFieldView.this;
            toolbarSearchFieldView.b = toolbarSearchFieldView.n.getWidth() - ToolbarSearchFieldView.this.f;
            ToolbarSearchFieldView toolbarSearchFieldView2 = ToolbarSearchFieldView.this;
            toolbarSearchFieldView2.c = ((int) toolbarSearchFieldView2.p.getX()) - ToolbarSearchFieldView.this.f;
        }
        this.a.setVisibility(0);
        if (!(ToolbarSearchFieldView.this.C)) {
            return;
        }
        if (nud.n(ToolbarSearchFieldView.this.n)) {
            ToolbarSearchFieldView.d dVar = this.c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.p, "x", (float) ToolbarSearchFieldView.this.f);
            ofFloat.setDuration(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            animatorSet.start();
            return;
        }
        ToolbarSearchFieldView.d dVar2 = this.c;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.p, "x", (float) ToolbarSearchFieldView.this.c);
        ofFloat2.setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat2);
        animatorSet2.start();
    }
}
