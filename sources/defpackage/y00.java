package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.a;
import com.google.firebase.crashlytics.internal.common.n0;
import com.google.firebase.crashlytics.internal.network.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: y00  reason: default package */
public class y00 extends a implements z00 {
    private ty f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y00(java.lang.String r3, java.lang.String r4, com.google.firebase.crashlytics.internal.network.b r5) {
        /*
            r2 = this;
            com.google.firebase.crashlytics.internal.network.HttpMethod r0 = com.google.firebase.crashlytics.internal.network.HttpMethod.GET
            ty r1 = defpackage.ty.f()
            r2.<init>(r3, r4, r5, r0)
            r2.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y00.<init>(java.lang.String, java.lang.String, com.google.firebase.crashlytics.internal.network.b):void");
    }

    private com.google.firebase.crashlytics.internal.network.a e(com.google.firebase.crashlytics.internal.network.a aVar, v00 v00) {
        String str = v00.a;
        if (str != null) {
            aVar.b("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        aVar.b("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        aVar.b("X-CRASHLYTICS-API-CLIENT-VERSION", "17.2.1");
        aVar.b("Accept", "application/json");
        String str2 = v00.b;
        if (str2 != null) {
            aVar.b("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = v00.c;
        if (str3 != null) {
            aVar.b("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = v00.d;
        if (str4 != null) {
            aVar.b("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String c = ((n0) v00.e).c();
        if (c != null) {
            aVar.b("X-CRASHLYTICS-INSTALLATION-ID", c);
        }
        return aVar;
    }

    private Map<String, String> f(v00 v00) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", v00.h);
        hashMap.put("display_version", v00.g);
        hashMap.put("source", Integer.toString(v00.i));
        String str = v00.f;
        if (!CommonUtils.s(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public JSONObject g(c cVar) {
        int b = cVar.b();
        ty tyVar = this.f;
        tyVar.b("Settings result was: " + b);
        if (b == 200 || b == 201 || b == 202 || b == 203) {
            String a = cVar.a();
            try {
                return new JSONObject(a);
            } catch (Exception e) {
                ty tyVar2 = this.f;
                StringBuilder V0 = je.V0("Failed to parse settings JSON from ");
                V0.append(d());
                tyVar2.c(V0.toString(), e);
                ty tyVar3 = this.f;
                tyVar3.b("Settings response " + a);
                return null;
            }
        } else {
            ty tyVar4 = this.f;
            StringBuilder V02 = je.V0("Failed to retrieve settings from ");
            V02.append(d());
            tyVar4.d(V02.toString());
            return null;
        }
    }

    public JSONObject h(v00 v00, boolean z) {
        if (z) {
            try {
                Map<String, String> f2 = f(v00);
                com.google.firebase.crashlytics.internal.network.a c = c(f2);
                e(c, v00);
                ty tyVar = this.f;
                tyVar.b("Requesting settings from " + d());
                ty tyVar2 = this.f;
                tyVar2.b("Settings query params were: " + f2);
                c a = c.a();
                ty tyVar3 = this.f;
                tyVar3.b("Settings request ID: " + a.c("X-REQUEST-ID"));
                return g(a);
            } catch (IOException e) {
                this.f.e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
