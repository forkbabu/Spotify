package defpackage;

import com.spotify.mobile.android.share.menu.preview.api.d;
import com.spotify.mobile.android.share.menu.preview.domain.b;
import io.reactivex.functions.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: co1  reason: default package */
final class co1<T, R> implements l<d, b> {
    public static final co1 a = new co1();

    co1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b apply(d dVar) {
        d dVar2 = dVar;
        h.e(dVar2, "result");
        if (dVar2 instanceof d.b) {
            return new b.C0187b(((d.b) dVar2).a());
        }
        if (dVar2 instanceof d.a) {
            return b.a.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
