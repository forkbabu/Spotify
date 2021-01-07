package com.spotify.music.features.podcast.episode;

import com.spotify.playlist.models.Episode;
import io.reactivex.functions.g;
import java.util.Map;

public final /* synthetic */ class w implements g {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ Episode b;
    public final /* synthetic */ ojc c;

    public /* synthetic */ w(l0 l0Var, Episode episode, ojc ojc) {
        this.a = l0Var;
        this.b = episode;
        this.c = ojc;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, this.c, (Map) obj);
    }
}
