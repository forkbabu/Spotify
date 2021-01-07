package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.z;

/* renamed from: hma  reason: default package */
public final class hma implements fjf<z<HubsJsonViewModel>> {
    private final wlf<c> a;
    private final wlf<pma> b;

    public hma(wlf<c> wlf, wlf<pma> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        z<HubsJsonViewModel> a2 = this.b.get().a(this.a.get().toString());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
