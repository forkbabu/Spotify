package defpackage;

import com.spotify.dac.api.proto.DacResponse;
import com.spotify.music.artist.dac.ui.b;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

/* renamed from: sj2  reason: default package */
public final class sj2 {

    /* access modifiers changed from: package-private */
    /* renamed from: sj2$a */
    public static final class a<I, O> implements sg0<DacResponse, s0> {
        final /* synthetic */ b a;
        final /* synthetic */ s80 b;

        a(b bVar, s80 s80) {
            this.a = bVar;
            this.b = s80;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(DacResponse dacResponse) {
            return this.a.b(dacResponse, this.b);
        }
    }

    public final PageLoaderView.a<DacResponse> a(zac zac, ij9 ij9, c.a aVar, b bVar, s80 s80) {
        h.e(zac, "factory");
        h.e(ij9, "pageView");
        h.e(aVar, "viewUriProvider");
        h.e(bVar, "pageElementFactory");
        h.e(s80, "dacResolver");
        PageLoaderView.a<DacResponse> b = zac.b(aVar.getViewUri(), ij9);
        b.e(new a(bVar, s80));
        h.d(b, "factory\n        .createV…cResponse, dacResolver) }");
        return b;
    }
}
