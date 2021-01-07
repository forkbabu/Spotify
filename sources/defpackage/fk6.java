package defpackage;

import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.remoteconfig.s9;
import defpackage.zo6;

/* renamed from: fk6  reason: default package */
public class fk6 implements zo6.a {
    private final zo6.c a;
    private final s9 b;

    public fk6(hk6 hk6, s9 s9Var) {
        this.a = hk6;
        this.b = s9Var;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return bVar.a() == FormatListType.p && this.b.a();
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return ek6.class;
    }
}
