package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.offline.w;
import com.google.android.exoplayer2.offline.x;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.video.exo.e;
import com.spotify.mobile.android.video.exo.c;
import com.spotify.mobile.android.video.exo.j;
import com.spotify.mobile.android.video.exo.r;
import com.spotify.mobile.android.video.exo.s;
import com.spotify.music.json.g;
import io.reactivex.z;
import java.util.LinkedList;
import java.util.List;

/* renamed from: s82  reason: default package */
public class s82 extends w<r> {
    private final z<p62> i;

    public s82(Uri uri, List<x> list, com.google.android.exoplayer2.offline.r rVar, z<p62> zVar) {
        super(uri, list, rVar);
        this.i = zVar;
    }

    private static w.b f(j jVar, e eVar, long j) {
        return new w.b(j, new m(eVar.b(jVar.a().get(0)), eVar.a, eVar.b, null));
    }

    /* Return type fixed from 'com.google.android.exoplayer2.offline.t' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.w
    public r c(k kVar, m mVar) {
        p62 d = this.i.d();
        return (r) com.google.android.exoplayer2.upstream.x.g(kVar, new s(new g(), d.b(), d.e()), mVar, 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.k, com.google.android.exoplayer2.offline.t, boolean] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.w
    public List d(k kVar, r rVar, boolean z) {
        c c = rVar.c(0);
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < c.d().size(); i2++) {
            for (j jVar : c.c(i2).b) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(f(jVar, jVar.d(), 0));
                for (int i3 = 0; i3 < jVar.e(); i3++) {
                    long j = (long) i3;
                    linkedList2.add(f(jVar, jVar.i(j), jVar.h(j)));
                }
                linkedList.addAll(linkedList2);
            }
        }
        return linkedList;
    }
}
