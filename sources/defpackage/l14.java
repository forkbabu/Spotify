package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.assistedcuration.AssistedCurationActivity;
import java.util.Collection;

/* renamed from: l14  reason: default package */
public final class l14 implements fjf<ImmutableList<String>> {
    private final wlf<AssistedCurationActivity> a;

    public l14(wlf<AssistedCurationActivity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) this.a.get().W0());
        yif.g(copyOf, "Cannot return null from a non-@Nullable @Provides method");
        return copyOf;
    }
}
