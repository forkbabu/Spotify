package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.assistedcuration.AssistedCurationActivity;

/* renamed from: k14  reason: default package */
public final class k14 implements fjf<Optional<Integer>> {
    private final wlf<AssistedCurationActivity> a;

    public k14(wlf<AssistedCurationActivity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Optional<Integer> b1 = this.a.get().b1();
        yif.g(b1, "Cannot return null from a non-@Nullable @Provides method");
        return b1;
    }
}
