package defpackage;

import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.remoteconfig.u9;
import defpackage.zo6;

/* renamed from: rk6  reason: default package */
public class rk6 implements zo6.a {
    private final zo6.c a;
    private final u9 b;

    public rk6(tk6 tk6, u9 u9Var) {
        this.a = tk6;
        this.b = u9Var;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return bVar.a() == FormatListType.q && this.b.a();
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return qk6.class;
    }
}
