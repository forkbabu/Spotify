package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;
import io.reactivex.s;
import org.json.JSONObject;

/* renamed from: oid  reason: default package */
public final /* synthetic */ class oid implements l {
    public final /* synthetic */ vod a;

    public /* synthetic */ oid(vod vod) {
        this.a = vod;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        vod vod = this.a;
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        vod.getClass();
        return s.c0(new pod(vod, bVar, (String) obj));
    }
}
