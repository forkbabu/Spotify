package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.protocol.a;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: hla  reason: default package */
public class hla {
    private static final Short f = 7331;
    private final e92 a;
    private final r92 b;
    private final Activity c;
    private final dla d;
    private final a e;

    hla(e92 e92, r92 r92, Activity activity, dla dla, a aVar) {
        this.a = e92;
        this.b = r92;
        this.c = activity;
        this.d = dla;
        this.e = aVar;
    }

    public void a() {
        this.c.startActivity(new Intent("android.intent.action.VIEW", this.d.a(PartnerType.GOOGLE_MAPS.d())));
    }

    public void b() {
        this.b.b();
    }

    public void c(AuthorizationRequest authorizationRequest) {
        try {
            Activity activity = this.c;
            activity.startActivityForResult(this.e.b(activity, authorizationRequest), f.shortValue());
        } catch (ActivityNotFoundException e2) {
            Logger.e(e2, "Unable to start AuthorizationActivity", new Object[0]);
        }
    }

    public void d() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(PartnerType.GOOGLE_MAPS.d());
        this.c.startActivity(intent);
    }

    public void e() {
        this.a.a("com.spotify.music.internal.waze.LAUNCH");
    }
}
