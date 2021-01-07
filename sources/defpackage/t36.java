package defpackage;

import com.spotify.playlist.formatlisttype.FormatListType;
import defpackage.zo6;

/* renamed from: t36  reason: default package */
public class t36 implements zo6.a {
    private final zo6.c a;

    public t36(v36 v36) {
        this.a = v36;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return bVar.a() == FormatListType.b;
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return s36.class;
    }
}
