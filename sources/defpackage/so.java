package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.offline.r;
import com.google.android.exoplayer2.offline.w;
import com.google.android.exoplayer2.offline.x;
import com.google.android.exoplayer2.source.hls.playlist.e;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.playlist.g;
import com.google.android.exoplayer2.source.hls.playlist.h;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: so  reason: default package */
public final class so extends w<g> {
    public so(Uri uri, List<x> list, r rVar) {
        super(uri, list, rVar);
    }

    private void f(f fVar, f.a aVar, HashSet<Uri> hashSet, ArrayList<w.b> arrayList) {
        String str = fVar.a;
        long j = fVar.f + aVar.n;
        String str2 = aVar.p;
        if (str2 != null) {
            Uri j2 = o.j(str, str2);
            if (hashSet.add(j2)) {
                arrayList.add(new w.b(j, w.b(j2)));
            }
        }
        arrayList.add(new w.b(j, new m(o.j(str, aVar.a), aVar.r, aVar.s, null)));
    }

    /* Return type fixed from 'com.google.android.exoplayer2.offline.t' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.w
    public g c(k kVar, m mVar) {
        return (g) com.google.android.exoplayer2.upstream.x.g(kVar, new h(), mVar, 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.k, com.google.android.exoplayer2.offline.t, boolean] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.w
    public List d(k kVar, g gVar, boolean z) {
        g gVar2 = gVar;
        ArrayList arrayList = new ArrayList();
        if (gVar2 instanceof e) {
            List<Uri> list = ((e) gVar2).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(w.b(list.get(i)));
            }
        } else {
            arrayList.add(w.b(Uri.parse(gVar2.a)));
        }
        ArrayList<w.b> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            arrayList2.add(new w.b(0, mVar));
            try {
                f fVar = (f) ((g) com.google.android.exoplayer2.upstream.x.g(kVar, new h(), mVar, 4));
                f.a aVar = null;
                List<f.a> list2 = fVar.o;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    f.a aVar2 = list2.get(i2);
                    f.a aVar3 = aVar2.b;
                    if (!(aVar3 == null || aVar3 == aVar)) {
                        f(fVar, aVar3, hashSet, arrayList2);
                        aVar = aVar3;
                    }
                    f(fVar, aVar2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}
