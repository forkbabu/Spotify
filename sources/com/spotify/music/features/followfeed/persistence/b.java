package com.spotify.music.features.followfeed.persistence;

import com.spotify.music.follow.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class b implements a {
    private boolean a;
    private final Map<String, Boolean> b = new LinkedHashMap();
    private final c c;

    public b(c cVar) {
        h.e(cVar, "feedCache");
        this.c = cVar;
    }

    @Override // com.spotify.music.features.followfeed.persistence.a
    public void a(r25 r25) {
        h.e(r25, "model");
        this.c.a(r25);
    }

    @Override // com.spotify.music.features.followfeed.persistence.a
    public r25 b() {
        return this.c.b();
    }

    @Override // com.spotify.music.features.followfeed.persistence.a
    public void c(String str, boolean z) {
        h.e(str, "uri");
        this.b.put(str, Boolean.valueOf(z));
    }

    @Override // com.spotify.music.features.followfeed.persistence.a
    public void d() {
        this.a = false;
        this.c.invalidate();
    }

    @Override // com.spotify.music.features.followfeed.persistence.a
    public void e() {
        this.a = true;
    }

    @Override // com.spotify.music.features.followfeed.persistence.a
    public boolean f() {
        return this.a;
    }

    @Override // com.spotify.music.follow.l
    public void g(j jVar) {
        String e;
        List<p25> e2;
        if (!(jVar == null || (e = jVar.e()) == null)) {
            r25 r25 = null;
            if (!(e.length() > 0)) {
                e = null;
            }
            if (e != null) {
                boolean g = jVar.g();
                if (!h.a(this.b.get(e), Boolean.valueOf(g))) {
                    if (g) {
                        d();
                    } else {
                        r25 b2 = this.c.b();
                        ArrayList arrayList = new ArrayList();
                        if (!(b2 == null || (e2 = b2.e()) == null)) {
                            for (T t : e2) {
                                if (t instanceof w25) {
                                    if (!(!h.a(t.d().get(0).c(), e))) {
                                        t = null;
                                    }
                                    T t2 = t;
                                    if (t2 != null) {
                                        arrayList.add(t2);
                                    }
                                } else {
                                    arrayList.add(t);
                                }
                            }
                        }
                        c cVar = this.c;
                        if (b2 != null) {
                            r25 = r25.a(b2, arrayList, false, null, null, false, false, false, 126);
                        }
                        cVar.a(r25);
                    }
                }
                this.b.put(e, Boolean.valueOf(g));
            }
        }
    }

    @Override // com.spotify.music.features.followfeed.persistence.a
    public void reset() {
        this.b.clear();
    }
}
