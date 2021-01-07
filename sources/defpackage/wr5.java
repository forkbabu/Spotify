package defpackage;

import com.spotify.mobile.android.waze.model.b;
import io.reactivex.s;
import java.util.Set;

/* renamed from: wr5  reason: default package */
public final class wr5 implements fjf<vr5> {
    private final wlf<j4a> a;
    private final wlf<mla> b;
    private final wlf<Set<wa2>> c;
    private final wlf<b> d;
    private final wlf<s<Boolean>> e;
    private final wlf<s<Boolean>> f;

    public wr5(wlf<j4a> wlf, wlf<mla> wlf2, wlf<Set<wa2>> wlf3, wlf<b> wlf4, wlf<s<Boolean>> wlf5, wlf<s<Boolean>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vr5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
