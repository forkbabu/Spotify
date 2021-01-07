package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.s;
import org.json.JSONObject;

/* renamed from: rid  reason: default package */
public final class rid implements fjf<s<Optional<Offer>>> {
    private final wlf<vod<Offer>> a;
    private final wlf<s<String>> b;

    public rid(wlf<vod<Offer>> wlf, wlf<s<String>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        return this.b.get().W(new oid(this.a.get()), false, Integer.MAX_VALUE);
    }
}
