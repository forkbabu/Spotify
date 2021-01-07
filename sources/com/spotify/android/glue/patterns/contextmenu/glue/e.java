package com.spotify.android.glue.patterns.contextmenu.glue;

import android.view.View;

public final /* synthetic */ class e implements m4 {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        view.setPadding(view.getPaddingLeft(), b5Var.j() + view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        return b5Var.c();
    }
}
