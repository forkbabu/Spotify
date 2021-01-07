package defpackage;

import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.libs.collection.model.a;

/* renamed from: o22  reason: default package */
public final class o22 implements fjf<n22> {
    private final wlf<z3<a>> a;

    public o22(wlf<z3<a>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n22(this.a.get());
    }
}
