package defpackage;

import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.Show;

/* renamed from: u32  reason: default package */
public final class u32 implements fjf<t32> {
    private final wlf<z3<Show>> a;

    public u32(wlf<z3<Show>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t32(this.a.get());
    }
}
