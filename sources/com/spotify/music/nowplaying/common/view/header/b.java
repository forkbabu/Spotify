package com.spotify.music.nowplaying.common.view.header;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ TitleHeader a;

    public /* synthetic */ b(TitleHeader titleHeader) {
        this.a = titleHeader;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(view);
    }
}
