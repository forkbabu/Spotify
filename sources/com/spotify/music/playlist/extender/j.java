package com.spotify.music.playlist.extender;

import android.view.View;
import com.spotify.music.playlist.extender.model.RecTrack;

public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ RecTrack b;
    public final /* synthetic */ int c;

    public /* synthetic */ j(d0 d0Var, RecTrack recTrack, int i) {
        this.a = d0Var;
        this.b = recTrack;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.J(this.b, this.c, view);
    }
}
