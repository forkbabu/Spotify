package com.spotify.music.sociallistening.participantlist.impl;

import android.view.View;
import com.spotify.music.sociallistening.models.Participant;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ g a;
    public final /* synthetic */ Participant b;
    public final /* synthetic */ int c;

    public /* synthetic */ b(g gVar, Participant participant, int i) {
        this.a = gVar;
        this.b = participant;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.Y(this.b, this.c, view);
    }
}
