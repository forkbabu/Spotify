package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.tasteonboarding.logging.a;
import com.spotify.music.features.tasteonboarding.logging.b;

/* renamed from: aq8  reason: default package */
public final class aq8 implements fjf<b> {
    private final wlf<k> a;

    public aq8(wlf<k> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a("key_session_id", this.a.get());
    }
}
