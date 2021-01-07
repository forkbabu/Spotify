package defpackage;

import com.spotify.music.premiummini.k;
import com.spotify.playlist.formatlisttype.FormatListType;
import defpackage.zo6;
import kotlin.jvm.internal.h;

/* renamed from: xp6  reason: default package */
public final class xp6 implements zo6.a {
    private final zp6 a;
    private final k b;

    public xp6(zp6 zp6, k kVar) {
        h.e(zp6, "factory");
        h.e(kVar, "premiumMiniProperties");
        this.a = zp6;
        this.b = kVar;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        h.e(bVar, "conditions");
        return this.b.a() && bVar.a() == FormatListType.q;
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return wp6.class;
    }
}
