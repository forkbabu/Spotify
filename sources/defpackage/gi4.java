package defpackage;

import com.spotify.playlist.endpoints.i;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: gi4  reason: default package */
public final class gi4<Upstream, Downstream> implements w<xh4, bh4> {
    final /* synthetic */ i a;

    /* renamed from: gi4$a */
    static final class a<T, R> implements l<xh4, v<? extends bh4>> {
        final /* synthetic */ gi4 a;

        a(gi4 gi4) {
            this.a = gi4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends bh4> apply(xh4 xh4) {
            xh4 xh42 = xh4;
            h.e(xh42, "effect");
            return this.a.a.e(xh42.b(), d.t(xh42.a()), "spotify:care-package", "spotify:care-package").P(yg4.a).F((T) xg4.a).P();
        }
    }

    gi4(i iVar) {
        this.a = iVar;
    }

    @Override // io.reactivex.w
    public final v<bh4> apply(s<xh4> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
