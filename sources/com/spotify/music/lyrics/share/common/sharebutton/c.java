package com.spotify.music.lyrics.share.common.sharebutton;

import android.view.View;
import com.spotify.music.lyrics.share.common.sharebutton.b;

final class c implements View.OnClickListener {
    final /* synthetic */ b.C0307b a;

    c(b.C0307b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b.C0307b bVar = this.a;
        bVar.a.b(bVar.b.getCurrScrollY());
    }
}
