package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

class c extends AnimatorListenerAdapter {
    public boolean a;
    final /* synthetic */ ActionMenuView b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean f;
    final /* synthetic */ BottomAppBar n;

    c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.n = bottomAppBar;
        this.b = actionMenuView;
        this.c = i;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            BottomAppBar bottomAppBar = this.n;
            ActionMenuView actionMenuView = this.b;
            int i = this.c;
            boolean z = this.f;
            int i2 = BottomAppBar.r0;
            actionMenuView.setTranslationX((float) bottomAppBar.l0(actionMenuView, i, z));
        }
    }
}
