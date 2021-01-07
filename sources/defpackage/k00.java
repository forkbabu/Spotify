package defpackage;

import com.google.firebase.crashlytics.internal.common.a;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.b;
import com.google.firebase.crashlytics.internal.network.c;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: k00  reason: default package */
public class k00 extends a implements j00 {
    private final String f;

    public k00(String str, String str2, b bVar, String str3) {
        super(str, str2, bVar, HttpMethod.POST);
        this.f = str3;
    }

    @Override // defpackage.j00
    public boolean a(com.google.firebase.crashlytics.internal.report.model.a aVar, boolean z) {
        if (z) {
            com.google.firebase.crashlytics.internal.network.a b = b();
            b.b("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.b);
            b.b("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
            b.b("X-CRASHLYTICS-API-CLIENT-VERSION", this.f);
            for (Map.Entry<String, String> entry : aVar.c.a().entrySet()) {
                b.c(entry);
            }
            Report report = aVar.c;
            b.e("report[identifier]", report.b());
            if (report.e().length == 1) {
                ty f2 = ty.f();
                StringBuilder V0 = je.V0("Adding single file ");
                V0.append(report.c());
                V0.append(" to report ");
                V0.append(report.b());
                f2.b(V0.toString());
                b.f("report[file]", report.c(), "application/octet-stream", report.d());
            } else {
                File[] e = report.e();
                int i = 0;
                for (File file : e) {
                    ty f3 = ty.f();
                    StringBuilder V02 = je.V0("Adding file ");
                    V02.append(file.getName());
                    V02.append(" to report ");
                    V02.append(report.b());
                    f3.b(V02.toString());
                    b.f("report[file" + i + "]", file.getName(), "application/octet-stream", file);
                    i++;
                }
            }
            ty f4 = ty.f();
            StringBuilder V03 = je.V0("Sending report to: ");
            V03.append(d());
            f4.b(V03.toString());
            try {
                c a = b.a();
                int b2 = a.b();
                ty.f().b("Create report request ID: " + a.c("X-REQUEST-ID"));
                ty.f().b("Result was: " + b2);
                if (rw.p(b2) == 0) {
                    return true;
                }
                return false;
            } catch (IOException e2) {
                ty.f().e("Create report HTTP request failed.", e2);
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
