package defpackage;

import com.spotify.playlist.endpoints.i;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: ai4  reason: default package */
final class ai4<Upstream, Downstream> implements w<wg4, bh4> {
    final /* synthetic */ ui4 a;
    final /* synthetic */ i b;

    /* renamed from: ai4$a */
    static final class a<T, R> implements l<wg4, v<? extends bh4>> {
        final /* synthetic */ ai4 a;

        a(ai4 ai4) {
            this.a = ai4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends bh4> apply(wg4 wg4) {
            String str;
            wg4 wg42 = wg4;
            h.e(wg42, "effect");
            List<ty4> a2 = wg42.a();
            ArrayList arrayList = new ArrayList(d.e(a2, 10));
            for (T t : a2) {
                if (t instanceof uy4) {
                    T t2 = t;
                    this.a.a.a(t2.c(), wg42.b());
                    str = t2.c();
                } else if (t instanceof sy4) {
                    T t3 = t;
                    this.a.a.d(t3.a(), wg42.b());
                    str = t3.a();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(str);
            }
            return this.a.b.e(wg42.b(), arrayList, "spotify:care-package", "spotify:care-package").P(yg4.a).F((T) xg4.a).P();
        }
    }

    ai4(ui4 ui4, i iVar) {
        this.a = ui4;
        this.b = iVar;
    }

    @Override // io.reactivex.w
    public final v<bh4> apply(s<wg4> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
