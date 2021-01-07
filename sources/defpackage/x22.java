package defpackage;

import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.b;

/* renamed from: x22  reason: default package */
public final class x22 implements fjf<w22> {
    private final wlf<z3<b>> a;

    public x22(wlf<z3<b>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w22(this.a.get());
    }
}
