package com.spotify.music.features.playlistentity;

import android.content.Intent;
import com.google.common.collect.Collections2;
import com.spotify.music.features.playlistentity.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class h implements j {
    private final Map<Integer, g.a> a = new HashMap();
    private final List<a> b = new ArrayList();

    /* access modifiers changed from: package-private */
    public static abstract class a {
        a() {
        }

        public abstract Intent a();

        public abstract int b();

        public abstract int c();
    }

    h() {
    }

    @Override // com.spotify.music.features.playlistentity.j
    public void a() {
        this.a.clear();
    }

    @Override // com.spotify.music.features.playlistentity.j
    public void b(int i, int i2, Intent intent) {
        this.b.add(new k(i, i2, intent));
    }

    @Override // com.spotify.music.features.playlistentity.j
    public void c() {
        Iterator it = Collections2.newArrayList(this.b).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            g.a aVar2 = this.a.get(Integer.valueOf(aVar.b()));
            if (aVar2 != null) {
                aVar2.b(aVar.b(), aVar.c(), aVar.a());
                this.b.remove(aVar);
            }
        }
    }

    @Override // com.spotify.music.features.playlistentity.g
    public void d(int i, g.a aVar) {
        this.a.put(Integer.valueOf(i), aVar);
    }
}
