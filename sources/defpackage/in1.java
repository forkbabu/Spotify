package defpackage;

import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.SpotifyServiceCommandHandlingStatus;
import io.reactivex.s;

/* renamed from: in1  reason: default package */
public final class in1 implements fjf<s<SpotifyServiceCommandHandlingStatus>> {
    private final wlf<SpotifyService> a;

    public in1(wlf<SpotifyService> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<SpotifyServiceCommandHandlingStatus> j = this.a.get().j();
        yif.g(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }
}
