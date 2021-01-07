package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.spotify.android.flags.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.ads.api.h;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.Targetings;
import com.spotify.rxjava2.p;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.internal.operators.observable.z;
import io.reactivex.s;
import io.reactivex.y;
import java.io.IOException;

/* renamed from: jn1  reason: default package */
public class jn1 implements d {
    private final Context a;
    private final g<c> b;
    private final h c;
    private final y f;
    private final p n = new p();
    private final p o = new p();

    jn1(Context context, g<c> gVar, h hVar, y yVar) {
        this.a = context.getApplicationContext();
        this.b = gVar;
        this.c = hVar;
        this.f = yVar;
    }

    public static e a(jn1 jn1, gn1 gn1) {
        s<Targetings> sVar;
        jn1.getClass();
        s<Object> sVar2 = o.a;
        Logger.b("[FetchAdIdTaskPlugin] advertising id: %s", gn1.a);
        if (TextUtils.isEmpty(gn1.a)) {
            sVar = sVar2;
        } else {
            sVar = jn1.c.a("rdid", gn1.a).N(hm1.a);
        }
        s<Targetings> N = jn1.c.a("idtype", "gaid").N(dm1.a);
        Boolean bool = gn1.b;
        if (bool != null) {
            sVar2 = jn1.c.a("is_lat", bool.booleanValue() ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY).N(em1.a);
        }
        return new z(s.l0(sVar, N, sVar2).q(new m1e()));
    }

    public static gn1 c(jn1 jn1) {
        jn1.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Boolean bool = null;
        int i = 3;
        String str = "";
        while (i > 0) {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(jn1.a);
                str = advertisingIdInfo.getId();
                bool = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                Logger.b("[FetchAdIdTaskPlugin] Ad id fetched in %d ms.", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (IOException unused) {
                Logger.b("[FetchAdIdTaskPlugin] Error connecting to Google Play services (e.g.the old version of the service doesn't support getting AdvertisingId).", new Object[0]);
            } catch (SecurityException unused2) {
                Logger.b("[FetchAdIdTaskPlugin] Encountered security error connecting to Google Play services.", new Object[0]);
            } catch (GooglePlayServicesNotAvailableException unused3) {
                Logger.b("[FetchAdIdTaskPlugin] Google Play services is not available entirely.", new Object[0]);
            } catch (GooglePlayServicesRepairableException unused4) {
                Logger.b("[FetchAdIdTaskPlugin] Encountered a recoverable error connecting to Google Play services.", new Object[0]);
                i--;
            }
            i = 0;
        }
        return new gn1(str, bool);
    }

    public void b(c cVar) {
        this.o.b(io.reactivex.z.y(new km1(this)).t(new gm1(this)).G(this.f).subscribe(jm1.a, im1.a));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.n.b(this.b.subscribe(new fm1(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.n.a();
        this.o.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "FetchAdIdTask";
    }
}
