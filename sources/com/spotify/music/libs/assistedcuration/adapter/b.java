package com.spotify.music.libs.assistedcuration.adapter;

import com.spotify.music.libs.assistedcuration.adapter.AssistedCurationCardAdapter;
import com.spotify.music.libs.assistedcuration.adapter.a;
import com.spotify.music.preview.q;
import com.spotify.music.preview.v;
import com.squareup.picasso.Picasso;

public final class b implements a.AbstractC0280a {
    private final wlf<q.a> a;
    private final wlf<Picasso> b;
    private final wlf<com.spotify.music.libs.assistedcuration.b> c;

    public b(wlf<q.a> wlf, wlf<Picasso> wlf2, wlf<com.spotify.music.libs.assistedcuration.b> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.libs.assistedcuration.adapter.a.AbstractC0280a
    public a a(AssistedCurationCardAdapter.a aVar, v vVar) {
        q.a aVar2 = this.a.get();
        b(aVar2, 1);
        q.a aVar3 = aVar2;
        Picasso picasso = this.b.get();
        b(picasso, 2);
        Picasso picasso2 = picasso;
        com.spotify.music.libs.assistedcuration.b bVar = this.c.get();
        b(bVar, 3);
        b(aVar, 4);
        b(vVar, 5);
        return new a(aVar3, picasso2, bVar, aVar, vVar);
    }
}
