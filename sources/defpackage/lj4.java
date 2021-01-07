package defpackage;

import com.spotify.playlist.formatlisttype.FormatListType;
import defpackage.zo6;

/* renamed from: lj4  reason: default package */
public class lj4 implements zo6.a {
    private final zo6.c a;

    public lj4(nj4 nj4) {
        this.a = nj4;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return bVar.a() == FormatListType.c;
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return kj4.class;
    }
}
