package defpackage;

import com.spotify.music.features.assistedcuration.AssistedCurationActivity;

/* renamed from: m14  reason: default package */
public final class m14 implements fjf<String> {
    private final wlf<AssistedCurationActivity> a;

    public m14(wlf<AssistedCurationActivity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
