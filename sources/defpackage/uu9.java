package defpackage;

import com.spotify.remoteconfig.tj;

/* renamed from: uu9  reason: default package */
public final class uu9 implements fjf<Integer> {
    private final wlf<tj> a;

    public uu9(wlf<tj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf(this.a.get().b());
    }
}
