package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: qid  reason: default package */
public interface qid {
    public static final SpSharedPreferences.b<Object, JSONObject> a = SpSharedPreferences.b.e("upsell.offer.Offer");
    public static final long b = TimeUnit.HOURS.toMillis(6);
}
