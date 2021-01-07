package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.c;
import org.json.JSONObject;

/* renamed from: nid  reason: default package */
public final /* synthetic */ class nid implements c {
    public final /* synthetic */ vod a;

    public /* synthetic */ nid(vod vod) {
        this.a = vod;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        vod vod = this.a;
        Offer offer = (Offer) obj;
        SpSharedPreferences.b<Object, JSONObject> bVar = qid.a;
        long j = qid.b;
        vod.getClass();
        new rod(vod, bVar, (String) obj2, j).accept(offer);
        return offer;
    }
}
