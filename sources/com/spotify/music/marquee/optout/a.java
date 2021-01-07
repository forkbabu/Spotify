package com.spotify.music.marquee.optout;

import android.view.View;
import com.spotify.music.marquee.optout.c;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ c.a a;
    public final /* synthetic */ int b;

    public /* synthetic */ a(c.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j0(this.b, view);
    }
}
