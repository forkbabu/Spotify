package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* access modifiers changed from: package-private */
/* renamed from: di4  reason: default package */
public final class di4<Upstream, Downstream> implements w<ug4, bh4> {
    final /* synthetic */ nmf a;

    /* renamed from: di4$a */
    static final class a<T, R> implements l<ug4, v<? extends bh4>> {
        final /* synthetic */ di4 a;

        a(di4 di4) {
            this.a = di4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends bh4> apply(ug4 ug4) {
            ug4 ug42 = ug4;
            h.e(ug42, "effect");
            String a2 = ug42.a();
            h.e(a2, "$this$substringAfterLast");
            h.e("spotify:playlist:", "delimiter");
            h.e(a2, "missingDelimiterValue");
            int p = e.p(a2, "spotify:playlist:", 0, false, 6);
            if (p != -1) {
                a2 = a2.substring(p + 17, a2.length());
                h.d(a2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            return ((io.reactivex.a) this.a.a.invoke(a2)).p(bi4.a).q(ci4.a).B().N();
        }
    }

    di4(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.w
    public final v<bh4> apply(s<ug4> sVar) {
        h.e(sVar, "upstream");
        return sVar.W(new a(this), false, Integer.MAX_VALUE);
    }
}
