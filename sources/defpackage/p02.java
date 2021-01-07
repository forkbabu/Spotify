package defpackage;

import android.app.Service;
import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import java.lang.ref.WeakReference;

/* renamed from: p02  reason: default package */
public class p02 implements o02 {
    static final SpSharedPreferences.b<Object, String> d = SpSharedPreferences.b.e("CURRENT_OFFER");
    static final SpSharedPreferences.b<Object, Long> e = SpSharedPreferences.b.e("CURRENT_OFFER_TTL");
    private final WeakReference<Context> a;
    private final SpSharedPreferences<Object> b;
    private final cqe c;

    public p02(Service service, g gVar, i iVar, cqe cqe) {
        this.a = new WeakReference<>(service);
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b2.e(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        b2.a(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        b2.e(SerializationFeature.WRAP_ROOT_VALUE, true);
        b2.d(JsonInclude.Include.NON_NULL);
        b2.build();
        this.b = iVar.d(service);
        this.c = cqe;
    }

    public void a() {
        if (this.a.get() != null) {
            SpSharedPreferences.a<Object> b2 = this.b.b();
            b2.h(d);
            b2.h(e);
            b2.j();
        }
    }
}
