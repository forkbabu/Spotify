package defpackage;

import androidx.lifecycle.n;
import com.spotify.music.features.login.startview.StartFragment;

/* renamed from: ho5  reason: default package */
public final class ho5 implements fjf<n> {
    private final wlf<StartFragment> a;

    public ho5(wlf<StartFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        StartFragment startFragment = this.a.get();
        if (startFragment != null) {
            return startFragment;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
