package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Set;

/* renamed from: hz  reason: default package */
public class hz {
    private static final c d = new c(null);
    private final Context a;
    private final b b;
    private gz c = d;

    /* renamed from: hz$b */
    public interface b {
        File a();
    }

    /* access modifiers changed from: private */
    /* renamed from: hz$c */
    public static final class c implements gz {
        c(a aVar) {
        }

        @Override // defpackage.gz
        public void a() {
        }

        @Override // defpackage.gz
        public String b() {
            return null;
        }

        @Override // defpackage.gz
        public byte[] c() {
            return null;
        }

        @Override // defpackage.gz
        public void d() {
        }

        @Override // defpackage.gz
        public void e(long j, String str) {
        }
    }

    public hz(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
        e(null);
    }

    public void a() {
        this.c.d();
    }

    public void b(Set<String> set) {
        File[] listFiles = this.b.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(".temp");
                if (lastIndexOf != -1) {
                    name = name.substring(20, lastIndexOf);
                }
                if (!set.contains(name)) {
                    file.delete();
                }
            }
        }
    }

    public byte[] c() {
        return this.c.c();
    }

    public String d() {
        return this.c.b();
    }

    public final void e(String str) {
        this.c.a();
        this.c = d;
        if (str != null) {
            if (!CommonUtils.j(this.a, "com.crashlytics.CollectCustomLogs", true)) {
                ty.f().b("Preferences requested no custom logs. Aborting log file creation.");
                return;
            }
            this.c = new kz(new File(this.b.a(), je.y0("crashlytics-userlog-", str, ".temp")), 65536);
        }
    }

    public void f(long j, String str) {
        this.c.e(j, str);
    }

    public hz(Context context, b bVar, String str) {
        this.a = context;
        this.b = bVar;
        e(str);
    }
}
