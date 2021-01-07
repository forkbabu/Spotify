package com.spotify.music.nowplaying.common.view.canvas.artist;

import android.view.View;

public final /* synthetic */ class g implements m4 {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        int i = CanvasArtistWidgetView.r;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), b5Var.g());
        return b5Var;
    }
}
