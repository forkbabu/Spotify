package defpackage;

import com.spotify.music.sociallistening.models.a;
import io.reactivex.functions.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: k7d  reason: default package */
public final /* synthetic */ class k7d implements l {
    public static final /* synthetic */ k7d a = new k7d();

    private /* synthetic */ k7d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Object obj2;
        a aVar = (a) obj;
        o7d o7d = o7d.a;
        h7d h7d = h7d.a;
        l7d l7d = l7d.a;
        n7d n7d = n7d.a;
        j7d j7d = j7d.a;
        i7d i7d = i7d.a;
        aVar.getClass();
        h.e(o7d, "ss");
        h.e(h7d, "ftss");
        h.e(l7d, "ftes");
        h.e(n7d, "ftjs");
        h.e(j7d, "ftjfs");
        h.e(i7d, "ftls");
        if (aVar instanceof a.f) {
            obj2 = o7d.invoke(aVar);
        } else if (aVar instanceof a.e) {
            obj2 = h7d.invoke(aVar);
        } else if (aVar instanceof a.C0344a) {
            obj2 = l7d.invoke(aVar);
        } else if (aVar instanceof a.c) {
            obj2 = n7d.invoke(aVar);
        } else if (aVar instanceof a.b) {
            obj2 = j7d.invoke(aVar);
        } else if (aVar instanceof a.d) {
            obj2 = i7d.invoke(aVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (i6d) obj2;
    }
}
