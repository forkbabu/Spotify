package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.playlist.endpoints.d;
import defpackage.l06;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: g06  reason: default package */
public final class g06 {

    /* access modifiers changed from: package-private */
    /* renamed from: g06$a */
    public static final class a<I, O> implements sg0<s<d.a>, s0> {
        final /* synthetic */ l06.a a;

        a(l06.a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(s<d.a> sVar) {
            s<d.a> sVar2 = sVar;
            h.e(sVar2, "collaboratorsObservable");
            return ((m06) this.a).b(sVar2);
        }
    }

    public static final PageLoaderView.a<s<d.a>> a(zac zac, c.a aVar, ij9 ij9, l06.a aVar2) {
        h.e(zac, "pageLoaderFactory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageViewObservable");
        h.e(aVar2, "pageElementFactory");
        PageLoaderView.a<s<d.a>> b = zac.b(aVar.getViewUri(), ij9);
        b.e(new a(aVar2));
        h.d(b, "pageLoaderFactory\n      …          )\n            }");
        return b;
    }
}
