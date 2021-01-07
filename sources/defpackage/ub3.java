package defpackage;

import com.spotify.mobile.android.rx.w;
import io.reactivex.s;

/* renamed from: ub3  reason: default package */
public final class ub3 implements fjf<s<ng0>> {
    private final wlf<w> a;

    public ub3(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a("payment-state").E().j0(qb3.a);
    }
}
