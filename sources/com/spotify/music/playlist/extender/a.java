package com.spotify.music.playlist.extender;

import com.spotify.music.playlist.extender.u;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ u.a a;

    public /* synthetic */ a(u.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
