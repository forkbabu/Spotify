package defpackage;

import com.spotify.mobile.android.util.connectivity.g0;
import com.spotify.mobile.android.util.connectivity.h0;
import com.spotify.music.connection.g;
import com.spotify.music.connection.l;
import com.spotify.music.settings.a;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: md9  reason: default package */
public class md9 {
    private final g0 a;
    private final a b;
    private final l c;
    private final y d;

    public md9(g0 g0Var, a aVar, l lVar, y yVar) {
        this.a = g0Var;
        this.b = aVar;
        this.c = lVar;
        this.d = yVar;
    }

    public /* synthetic */ v a(Boolean bool) {
        if (bool.booleanValue()) {
            return s.i0(Boolean.TRUE);
        }
        return s.i0(bool).C(15000, TimeUnit.MILLISECONDS, this.d);
    }

    public s<Boolean> b() {
        s<R> E = this.a.a().G0(h0.a().build()).j0(id9.a).E();
        s<R> j0 = this.b.a().j0(ld9.a);
        R r = (R) Boolean.FALSE;
        return s.m(E, j0.G0(r).E(), this.c.a().G0(g.c()).j0(kd9.a).E().J0(new jd9(this)), hd9.a).r0(gd9.a).G0(r).E();
    }
}
