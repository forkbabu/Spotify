package defpackage;

import com.spotify.http.u;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONObject;

/* renamed from: uid  reason: default package */
public final class uid implements fjf<lid> {
    private final wlf<u> a;

    public uid(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        lid lid = (lid) this.a.get().c(lid.class);
        yif.g(lid, "Cannot return null from a non-@Nullable @Provides method");
        return lid;
    }
}
