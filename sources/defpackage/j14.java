package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.assistedcuration.AssistedCurationActivity;
import com.spotify.music.libs.assistedcuration.b;

/* renamed from: j14  reason: default package */
public final class j14 implements fjf<b> {
    private final wlf<AssistedCurationActivity> a;

    public j14(wlf<AssistedCurationActivity> wlf) {
        this.a = wlf;
    }

    public static b a(AssistedCurationActivity assistedCurationActivity) {
        b.AbstractC0281b h = b.a.h();
        if (assistedCurationActivity.X0() != null) {
            h.c(assistedCurationActivity.X0());
        }
        if (assistedCurationActivity.a1() != null) {
            h.d(Optional.of(assistedCurationActivity.a1()));
        }
        return h.build();
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
