package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONObject;

/* renamed from: vid  reason: default package */
public final class vid implements fjf<Runnable> {
    private final wlf<vod<Offer>> a;

    public vid(wlf<vod<Offer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        vod<Offer> vod = this.a.get();
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        vod.getClass();
        return new qod(vod, bVar);
    }
}
