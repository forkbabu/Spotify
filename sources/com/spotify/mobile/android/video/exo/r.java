package com.spotify.mobile.android.video.exo;

import com.google.android.exoplayer2.offline.t;
import com.google.android.exoplayer2.offline.x;
import com.spotify.mobile.android.video.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class r implements t<r> {
    private final com.spotify.mobile.android.video.thumbnails.a a;
    private final com.spotify.mobile.android.video.exo.model.a b;
    private final List<c> c;
    private final boolean d;

    public static class b {
        private List<c> a = new ArrayList();
        private com.spotify.mobile.android.video.thumbnails.a b;
        private com.spotify.mobile.android.video.exo.model.a c;
        private boolean d;

        public r a() {
            return new r(this.a, this.b, this.c, this.d, null);
        }

        public b b(List<c> list) {
            this.a = list;
            return this;
        }

        public b c() {
            this.d = true;
            return this;
        }

        public b d(String str, List<i0> list) {
            this.c = new com.spotify.mobile.android.video.exo.model.a(str, list);
            return this;
        }

        public b e(com.spotify.mobile.android.video.thumbnails.a aVar) {
            this.b = aVar;
            return this;
        }
    }

    r(List list, com.spotify.mobile.android.video.thumbnails.a aVar, com.spotify.mobile.android.video.exo.model.a aVar2, boolean z, a aVar3) {
        this.c = list;
        this.a = aVar;
        this.b = aVar2;
        this.d = z;
    }

    /* renamed from: b */
    public r a(List<x> list) {
        ArrayList arrayList = new ArrayList(3);
        c cVar = this.c.get(0);
        List<k> d2 = cVar.d();
        List<k> d3 = this.c.get(0).d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        for (x xVar : list) {
            int i = xVar.b;
            int i2 = xVar.c;
            List list2 = (List) linkedHashMap.get(Integer.valueOf(i));
            if (list2 == null) {
                list2 = new ArrayList(1);
            }
            list2.add(d3.get(i).b.get(i2));
            linkedHashMap.put(Integer.valueOf(i), list2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new k(d2.get(((Integer) entry.getKey()).intValue()).a, (List) entry.getValue()));
        }
        c cVar2 = new c(cVar.e(), cVar.f(), cVar.b(), arrayList);
        b bVar = new b();
        bVar.b(this.c);
        com.spotify.mobile.android.video.thumbnails.a aVar = this.a;
        if (aVar != null) {
            bVar.e(aVar);
        }
        com.spotify.mobile.android.video.exo.model.a aVar2 = this.b;
        if (aVar2 != null) {
            bVar.d(aVar2.b(), this.b.a());
        }
        if (this.d) {
            bVar.c();
        }
        bVar.b(Collections.singletonList(cVar2));
        return bVar.a();
    }

    public c c(int i) {
        return this.c.get(i);
    }

    public com.spotify.mobile.android.video.exo.model.a d() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }
}
