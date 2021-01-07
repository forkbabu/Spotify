package com.spotify.music.newplaying.scroll.widgets.lyrics.view;

import android.view.View;
import com.spotify.music.newplaying.scroll.widgets.lyrics.view.b;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ b.AbstractC0311b a;

    public /* synthetic */ a(b.AbstractC0311b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b.AbstractC0311b bVar = this.a;
        int i = LyricsWidgetView.t;
        if (bVar != null) {
            ((xmb) bVar).a();
        }
    }
}
