package defpackage;

import com.spotify.music.connection.g;
import defpackage.b91;
import io.reactivex.k;

/* renamed from: ue4  reason: default package */
public class ue4 implements k<le4, b91> {
    private final String a;
    private final boolean b;
    private final l64 c;
    private final boolean d;
    private final e64 e;

    public ue4(String str, boolean z, l64 l64, boolean z2, e64 e64) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = l64;
        this.d = z2;
        this.e = e64;
    }

    public static b91 b(ue4 ue4, le4 le4) {
        ue4.getClass();
        b91 c2 = le4.c();
        if (!ue4.b) {
            return c2;
        }
        b91.a builder = c2.toBuilder();
        g b2 = le4.b();
        we4 a2 = le4.a();
        l64 l64 = ue4.c;
        b2.getClass();
        boolean z = !(b2 instanceof g.b);
        return builder.j(ue4.e.a(ue4.a, l64.a(z, "premium".equals(a2.c()), a2.b()), ue4.c.b(z, "premium".equals(a2.c()), a2.b()), ue4.d)).g();
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<b91> a(io.reactivex.g<le4> gVar) {
        return gVar.O(new sc4(this));
    }
}
