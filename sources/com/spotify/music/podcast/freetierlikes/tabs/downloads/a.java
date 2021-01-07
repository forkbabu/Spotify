package com.spotify.music.podcast.freetierlikes.tabs.downloads;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import com.spotify.podcast.endpoints.collection.d;
import com.spotify.podcast.endpoints.r;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class a implements vjc {
    private final d a;
    private final String b;
    private final d.a c;
    private final pnc d;
    private final y e;

    /* renamed from: com.spotify.music.podcast.freetierlikes.tabs.downloads.a$a  reason: collision with other inner class name */
    static final class C0326a<T, R> implements l<i<Episode>, wjc> {
        public static final C0326a a = new C0326a();

        C0326a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public wjc apply(i<Episode> iVar) {
            i<Episode> iVar2 = iVar;
            h.e(iVar2, "it");
            return new wjc(iVar2, false, 0, null, 14);
        }
    }

    static final class b<T, R> implements l<i<Episode>, wjc> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public wjc apply(i<Episode> iVar) {
            i<Episode> iVar2 = iVar;
            h.e(iVar2, "it");
            return new wjc(iVar2, false, 0, null, 14);
        }
    }

    public a(d dVar, String str, d.a aVar, pnc pnc, y yVar) {
        h.e(dVar, "endpoint");
        h.e(str, "username");
        h.e(aVar, "configuration");
        h.e(pnc, "playerStateProvider");
        h.e(yVar, "computationScheduler");
        this.a = dVar;
        this.b = str;
        this.c = aVar;
        this.d = pnc;
        this.e = yVar;
    }

    @Override // defpackage.vjc
    public z<wjc> a(int i, int i2) {
        d dVar = this.a;
        String str = this.b;
        d.a aVar = this.c;
        Optional<r> a2 = r.a(i, i2);
        h.d(a2, "Range.create(start, end)");
        z<R> A = dVar.b(str, d.a.a(aVar, null, null, null, a2, null, 23)).A(b.a);
        h.d(A, "getEpisodesSingle(start,…astTabPageDataModel(it) }");
        return sjc.b(A, this.d.a(this.e));
    }

    @Override // defpackage.vjc
    public s<wjc> b(int i, int i2) {
        d.a aVar = this.c;
        Optional<r> a2 = r.a(i, i2);
        h.d(a2, "Range.create(start, end)");
        s<R> j0 = this.a.a(this.b, d.a.a(aVar, null, null, null, a2, null, 23)).j0(C0326a.a);
        h.d(j0, "getEpisodes(start, end)\n…astTabPageDataModel(it) }");
        s<wjc> a3 = sjc.a(j0, this.d.a(this.e));
        h.d(a3, "getEpisodes(start, end)\n…te(computationScheduler))");
        return a3;
    }
}
