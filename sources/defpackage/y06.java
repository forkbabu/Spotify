package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.ubi.specification.factories.j2;

/* renamed from: y06  reason: default package */
public final class y06 implements fjf<j2> {
    private final wlf<s16> a;

    public y06(wlf<s16> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j2(PageIdentifiers.PLAYLIST_ALLSONGS.path(), this.a.get().a());
    }
}
