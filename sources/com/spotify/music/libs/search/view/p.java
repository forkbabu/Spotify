package com.spotify.music.libs.search.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;

/* access modifiers changed from: package-private */
public class p extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ ToolbarSearchFieldView.d c;

    p(ToolbarSearchFieldView.d dVar, View view, View view2) {
        this.c = dVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (ToolbarSearchFieldView.this.getWidth() != 0 && ToolbarSearchFieldView.this.b == 0) {
            ToolbarSearchFieldView toolbarSearchFieldView = ToolbarSearchFieldView.this;
            toolbarSearchFieldView.b = toolbarSearchFieldView.n.getWidth();
            ToolbarSearchFieldView toolbarSearchFieldView2 = ToolbarSearchFieldView.this;
            toolbarSearchFieldView2.c = (int) toolbarSearchFieldView2.p.getX();
        }
        ToolbarSearchFieldView.this.n.setClickable(false);
        ToolbarSearchFieldView.this.r.setClickable(false);
        this.a.setVisibility(0);
    }
}
