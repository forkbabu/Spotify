package defpackage;

import com.spotify.playlist.formatlisttype.FormatListType;
import defpackage.zo6;

/* renamed from: y26  reason: default package */
public class y26 implements zo6.a {
    private final a36 a;

    public y26(a36 a36) {
        this.a = a36;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return bVar.a() == FormatListType.a;
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return x26.class;
    }
}
