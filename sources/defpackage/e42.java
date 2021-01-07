package defpackage;

import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.o;

/* renamed from: e42  reason: default package */
public final class e42 implements fjf<d42> {
    private final wlf<z3<o>> a;

    public e42(wlf<z3<o>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d42(this.a.get());
    }
}
