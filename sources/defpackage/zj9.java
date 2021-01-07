package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import io.reactivex.s;
import java.io.IOException;
import java.util.NoSuchElementException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zj9  reason: default package */
public class zj9 {
    public static final SpSharedPreferences.b<Object, JSONObject> c = SpSharedPreferences.b.e("premium_badge_campaign");
    public static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.e("premium_badge_campaign_has_viewed");
    private final SpSharedPreferences<Object> a;
    private final ObjectMapper b;

    public zj9(SpSharedPreferences<Object> spSharedPreferences, g gVar) {
        this.a = spSharedPreferences;
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.b = b2.build();
    }

    public Optional<tj9> a() {
        try {
            return Optional.of(this.b.readValue(this.a.h(c).toString(), tj9.class));
        } catch (IOException | NoSuchElementException | JSONException unused) {
            return Optional.absent();
        }
    }

    public boolean b() {
        return this.a.d(d, false);
    }

    public /* synthetic */ Optional c(SpSharedPreferences.Update update) {
        T t = update.a;
        if (t != null) {
            return Optional.of((tj9) this.b.readValue(t.toString(), tj9.class));
        }
        return Optional.absent();
    }

    public s<Optional<tj9>> d() {
        SpSharedPreferences.Update<JSONObject> update;
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, JSONObject> bVar = c;
        s<SpSharedPreferences.Update<JSONObject>> q = spSharedPreferences.q(bVar);
        try {
            update = new SpSharedPreferences.Update<>(SpSharedPreferences.Update.Type.CHANGED, this.a.h(bVar));
        } catch (NoSuchElementException | JSONException unused) {
            update = new SpSharedPreferences.Update<>(SpSharedPreferences.Update.Type.NOT_IN_PREFS, null);
        }
        return q.G0(update).j0(new mj9(this));
    }

    public void e(tj9 tj9) {
        try {
            Optional<tj9> a2 = a();
            if (!a2.isPresent() || !a2.get().equals(tj9)) {
                SpSharedPreferences.a<Object> b2 = this.a.b();
                b2.a(d, false);
                b2.i();
                SpSharedPreferences.a<Object> b3 = this.a.b();
                b3.d(c, new JSONObject(this.b.writeValueAsString(tj9)));
                b3.i();
            }
        } catch (IOException | JSONException e) {
            Logger.b(e.getMessage(), new Object[0]);
        }
    }

    public void f(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(d, z);
        b2.i();
    }
}
