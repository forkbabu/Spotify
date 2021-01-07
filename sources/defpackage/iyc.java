package defpackage;

import android.app.Application;
import com.spotify.music.samsungpersonalization.customization.SamsungCustomizationClientImpl;
import com.spotify.music.samsungpersonalization.customization.a;
import com.spotify.music.samsungpersonalization.customization.c;
import com.spotify.remoteconfig.oa;
import defpackage.hyc;
import kotlin.jvm.internal.h;

/* renamed from: iyc  reason: default package */
public final class iyc implements fjf<c> {
    private final wlf<Application> a;
    private final wlf<a> b;
    private final wlf<oa> c;

    public iyc(wlf<Application> wlf, wlf<a> wlf2, wlf<oa> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static c a(Application application, a aVar, oa oaVar) {
        hyc.a aVar2 = hyc.a;
        h.e(application, "application");
        h.e(aVar, "customizationServiceAPIWrapper");
        h.e(oaVar, "properties");
        return new SamsungCustomizationClientImpl(application, aVar, new j60(), oaVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get());
    }
}
