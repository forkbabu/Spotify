package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONObject;

/* renamed from: sid  reason: default package */
public final class sid implements fjf<uod<Offer>> {
    private final wlf<sod> a;
    private final wlf<ObjectMapper> b;

    public sid(wlf<sod> wlf, wlf<ObjectMapper> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        return new uod(Offer.class, this.a.get(), this.b.get());
    }
}
