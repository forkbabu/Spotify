package defpackage;

import com.spotify.mobile.android.util.v;
import java.util.Set;

/* renamed from: gid  reason: default package */
public final class gid implements fjf<fid> {
    private final wlf<hid> a;
    private final wlf<Set<tw0>> b;
    private final wlf<aid> c;
    private final wlf<v> d;
    private final wlf<jz1> e;

    public gid(wlf<hid> wlf, wlf<Set<tw0>> wlf2, wlf<aid> wlf3, wlf<v> wlf4, wlf<jz1> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fid(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
