package defpackage;

import com.google.firebase.crashlytics.internal.common.a;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.b;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.io.IOException;

/* renamed from: l00  reason: default package */
public class l00 extends a implements j00 {
    private final String f;

    public l00(String str, String str2, b bVar, String str3) {
        super(str, str2, bVar, HttpMethod.POST);
        this.f = str3;
    }

    @Override // defpackage.j00
    public boolean a(com.google.firebase.crashlytics.internal.report.model.a aVar, boolean z) {
        if (z) {
            com.google.firebase.crashlytics.internal.network.a b = b();
            String str = aVar.b;
            b.b("User-Agent", "Crashlytics Android SDK/17.2.1");
            b.b("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
            b.b("X-CRASHLYTICS-API-CLIENT-VERSION", this.f);
            b.b("X-CRASHLYTICS-GOOGLE-APP-ID", str);
            String str2 = aVar.a;
            Report report = aVar.c;
            if (str2 != null) {
                b.e("org_id", str2);
            }
            b.e("report_id", report.b());
            File[] e = report.e();
            for (File file : e) {
                if (file.getName().equals("minidump")) {
                    b.f("minidump_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("metadata")) {
                    b.f("crash_meta_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("binaryImages")) {
                    b.f("binary_images_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("session")) {
                    b.f("session_meta_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("app")) {
                    b.f("app_meta_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("device")) {
                    b.f("device_meta_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("os")) {
                    b.f("os_meta_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("user")) {
                    b.f("user_meta_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("logs")) {
                    b.f("logs_file", file.getName(), "application/octet-stream", file);
                } else if (file.getName().equals("keys")) {
                    b.f("keys_file", file.getName(), "application/octet-stream", file);
                }
            }
            ty f2 = ty.f();
            StringBuilder V0 = je.V0("Sending report to: ");
            V0.append(d());
            f2.b(V0.toString());
            try {
                int b2 = b.a().b();
                ty.f().b("Result was: " + b2);
                if (rw.p(b2) == 0) {
                    return true;
                }
                return false;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }
}
