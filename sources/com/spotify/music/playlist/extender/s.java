package com.spotify.music.playlist.extender;

import com.spotify.music.playlist.extender.u;
import io.reactivex.functions.g;
import java.util.List;

public final /* synthetic */ class s implements g {
    public final /* synthetic */ u.a a;

    public /* synthetic */ s(u.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((List) obj);
    }
}
