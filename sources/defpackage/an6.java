package defpackage;

import com.spotify.playlist.formatlisttype.FormatListType;
import defpackage.zo6;

/* renamed from: an6  reason: default package */
public class an6 implements zo6.a {
    private final zo6.c a;

    public an6(cn6 cn6) {
        this.a = cn6;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return bVar.a() == FormatListType.s;
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return zm6.class;
    }
}
