package com.spotify.music.preview;

import com.spotify.music.preview.o;
import io.reactivex.functions.d;

public final /* synthetic */ class m implements d {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        o.b bVar = (o.b) ((z) obj).j();
        bVar.h(0L);
        z a2 = bVar.a();
        o.b bVar2 = (o.b) ((z) obj2).j();
        bVar2.h(0L);
        return a2.equals(bVar2.a());
    }
}
