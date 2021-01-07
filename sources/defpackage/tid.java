package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.v;
import io.reactivex.s;
import org.json.JSONObject;

/* renamed from: tid  reason: default package */
public final class tid implements fjf<s<Offer>> {
    private final wlf<lid> a;
    private final wlf<vod<Offer>> b;
    private final wlf<s<String>> c;
    private final wlf<v> d;

    public tid(wlf<lid> wlf, wlf<vod<Offer>> wlf2, wlf<s<String>> wlf3, wlf<v> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        return s.d1(this.a.get().a(this.d.get().b()).P(), this.c.get(), new nid(this.b.get())).z0();
    }
}
