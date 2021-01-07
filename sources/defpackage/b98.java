package defpackage;

import android.os.Bundle;
import com.spotify.music.libs.search.transition.l;

/* renamed from: b98  reason: default package */
public final class b98 implements fjf<l> {
    private final wlf<Bundle> a;

    public b98(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return (l) this.a.get().getParcelable("EXTRA_TRANSITION_PARAMS");
    }
}
