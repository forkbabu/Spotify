package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: oma  reason: default package */
public final class oma implements fjf<nma> {
    private final wlf<Resources> a;
    private final wlf<z<HubsJsonViewModel>> b;
    private final wlf<y> c;

    public oma(wlf<Resources> wlf, wlf<z<HubsJsonViewModel>> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nma(this.a.get(), this.b.get(), this.c.get());
    }
}
