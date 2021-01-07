package defpackage;

import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.remoteconfig.q9;
import defpackage.zo6;

/* renamed from: i26  reason: default package */
public class i26 implements zo6.a {
    private final zo6.c a;
    private final q9 b;

    public i26(k26 k26, q9 q9Var) {
        this.a = k26;
        this.b = q9Var;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return this.b.a() && bVar.a() == FormatListType.n;
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return h26.class;
    }
}
