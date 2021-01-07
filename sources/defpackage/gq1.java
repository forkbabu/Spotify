package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.service.k0;
import com.spotify.music.appprotocol.api.session.b;
import io.reactivex.s;
import java.util.List;

/* renamed from: gq1  reason: default package */
public final class gq1 implements fjf<s<List<b>>> {
    private final wlf<k0> a;

    public gq1(wlf<k0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<List<b>> a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
