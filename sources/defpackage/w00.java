package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.a;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.b;
import com.google.firebase.crashlytics.internal.network.c;
import com.spotify.cosmos.router.Request;
import com.spotify.music.features.ads.model.Ad;
import java.io.IOException;

/* renamed from: w00  reason: default package */
abstract class w00 extends a {
    private final String f;

    public w00(String str, String str2, b bVar, HttpMethod httpMethod, String str3) {
        super(str, str2, bVar, httpMethod);
        this.f = str3;
    }

    public boolean e(p00 p00, boolean z) {
        if (z) {
            com.google.firebase.crashlytics.internal.network.a b = b();
            b.b("X-CRASHLYTICS-ORG-ID", p00.a);
            b.b("X-CRASHLYTICS-GOOGLE-APP-ID", p00.b);
            b.b("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
            b.b("X-CRASHLYTICS-API-CLIENT-VERSION", this.f);
            b.e("org_id", p00.a);
            b.e("app[identifier]", p00.c);
            b.e("app[name]", p00.g);
            b.e("app[display_version]", p00.d);
            b.e("app[build_version]", p00.e);
            b.e("app[source]", Integer.toString(p00.h));
            b.e("app[minimum_sdk_version]", p00.i);
            b.e("app[built_sdk_version]", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            if (!CommonUtils.s(p00.f)) {
                b.e("app[instance_identifier]", p00.f);
            }
            ty f2 = ty.f();
            StringBuilder V0 = je.V0("Sending app info to ");
            V0.append(d());
            f2.b(V0.toString());
            try {
                c a = b.a();
                int b2 = a.b();
                String str = Request.POST.equalsIgnoreCase(b.d()) ? "Create" : "Update";
                ty f3 = ty.f();
                f3.b(str + " app request ID: " + a.c("X-REQUEST-ID"));
                ty f4 = ty.f();
                f4.b("Result was " + b2);
                return rw.p(b2) == 0;
            } catch (IOException e) {
                ty.f().e("HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
