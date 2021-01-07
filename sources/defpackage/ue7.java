package defpackage;

import com.spotify.remoteconfig.o6;

/* renamed from: ue7  reason: default package */
public final class ue7 implements fjf<ke7> {
    private final wlf<o6> a;
    private final wlf<le7> b;

    public ue7(wlf<o6> wlf, wlf<le7> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        le7 le7;
        wlf<le7> wlf = this.b;
        if (this.a.get().a()) {
            le7 = wlf.get();
        } else {
            int i = ke7.a;
            le7 = ae7.b;
        }
        yif.g(le7, "Cannot return null from a non-@Nullable @Provides method");
        return le7;
    }
}
