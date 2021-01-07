package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONObject;

/* renamed from: wid  reason: default package */
public final class wid implements fjf<vod<Offer>> {
    private final wlf<uod<Offer>> a;

    public wid(wlf<uod<Offer>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        return new vod(this.a.get());
    }
}
