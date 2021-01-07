package defpackage;

import android.content.Context;
import com.google.android.datatransport.b;
import com.google.android.datatransport.c;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.d;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import com.google.firebase.crashlytics.internal.common.g0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: o00  reason: default package */
public class o00 {
    private static final sz b = new sz();
    private static final String c = c("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String d = c("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final d<CrashlyticsReport, byte[]> e = n00.a();
    public static final /* synthetic */ int f = 0;
    private final e<CrashlyticsReport> a;

    o00(e<CrashlyticsReport> eVar, d<CrashlyticsReport, byte[]> dVar) {
        this.a = eVar;
    }

    public static o00 a(Context context) {
        yg.c(context);
        f d2 = yg.a().d(new a(c, d));
        b b2 = b.b("json");
        d<CrashlyticsReport, byte[]> dVar = e;
        return new o00(d2.b("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, b2, dVar), dVar);
    }

    private static String c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public g<g0> d(g0 g0Var) {
        CrashlyticsReport b2 = g0Var.b();
        h hVar = new h();
        this.a.a(c.g(b2), m00.b(hVar, g0Var));
        return hVar.a();
    }
}
