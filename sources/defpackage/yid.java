package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.s;
import org.json.JSONObject;

/* renamed from: yid  reason: default package */
public final class yid implements fjf<s<Offer>> {
    private final wlf<s<Optional<Offer>>> a;
    private final wlf<s<Offer>> b;

    public yid(wlf<s<Optional<Offer>>> wlf, wlf<s<Offer>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        s P = s.s(this.a.get().Q(mid.a).j0(pid.a), this.b.get()).T().P();
        yif.g(P, "Cannot return null from a non-@Nullable @Provides method");
        return P;
    }
}
