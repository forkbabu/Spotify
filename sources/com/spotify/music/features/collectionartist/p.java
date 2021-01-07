package com.spotify.music.features.collectionartist;

import com.spotify.music.features.collectionartist.x;
import io.reactivex.functions.h;

public final /* synthetic */ class p implements h {
    public static final /* synthetic */ p a = new p();

    private /* synthetic */ p() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        li0 li0 = (li0) obj;
        li0 li02 = (li0) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        int i = CollectionArtistFragment.z1;
        li0 li03 = new li0(li0.c() || li02.c(), li0.a(), li02.e(), li02.d(), li02.b());
        x.b bVar = new x.b();
        bVar.a(li03);
        bVar.c(booleanValue);
        return bVar.b();
    }
}
