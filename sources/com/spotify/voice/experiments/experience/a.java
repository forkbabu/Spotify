package com.spotify.voice.experiments.experience;

import android.view.View;

public final /* synthetic */ class a implements m4 {
    public final /* synthetic */ View a;

    public /* synthetic */ a(View view) {
        this.a = view;
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        View view2 = this.a;
        int i = VoiceExperimentsFragment.l0;
        view2.setPadding(0, b5Var.j(), 0, 0);
        q4.P(view2, null);
        return b5Var.c();
    }
}
