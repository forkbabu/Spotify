package com.spotify.music.libs.podcast.download;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.podcast.download.u;
import io.reactivex.functions.c;
import java.util.Collection;
import java.util.List;

public final /* synthetic */ class q implements c {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        u.b bVar = new u.b();
        bVar.b(false);
        bVar.c(ImmutableList.of());
        bVar.b(((Boolean) obj).booleanValue());
        bVar.c(ImmutableList.copyOf((Collection) ((List) obj2)));
        return bVar.a();
    }
}
