package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import com.spotify.music.internal.util.process.ProcessType;
import com.spotify.music.json.g;
import defpackage.ov9;
import java.io.PrintStream;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: jv9  reason: default package */
public final class jv9 {
    private final qw9 a;
    private final ProcessType b;
    private final zw9 c;
    private final yw9 d;
    private final cqe e;
    private final ov9.a f;
    private final g g;
    private final nx9 h;
    private final ov9.b i;

    jv9(qw9 qw9, ProcessType processType, zw9 zw9, yw9 yw9, cqe cqe, ov9.a aVar, g gVar, nx9 nx9, ov9.b bVar) {
        this.a = qw9;
        this.b = processType;
        this.c = zw9;
        this.d = yw9;
        this.e = cqe;
        this.f = aVar;
        this.g = gVar;
        this.h = nx9;
        this.i = bVar;
    }

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        this.c.x();
        if (this.b == ProcessType.MAIN) {
            if (this.d.a()) {
                new qx9(context, this.c, this.h, this.g, this.f.d()).b();
            }
            if (this.f.a()) {
                StrictMode.ThreadPolicy.Builder penaltyLog = new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog();
                if (!this.i.a()) {
                    penaltyLog = penaltyLog.penaltyFlashScreen();
                }
                StrictMode.setThreadPolicy(penaltyLog.build());
                StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
                builder.detectLeakedSqlLiteObjects();
                builder.detectLeakedRegistrationObjects();
                if (Build.VERSION.SDK_INT >= 18) {
                    builder.detectFileUriExposure();
                }
                builder.penaltyLog();
                if (this.f.c()) {
                    builder.penaltyDeath();
                    PrintStream printStream = System.err;
                    String str = Build.BRAND;
                    Locale locale = Locale.US;
                    System.setErr(new iv9(this, printStream, "generic".equals(str.toLowerCase(locale)) && !"vbox86p".equals(Build.HARDWARE.toLowerCase(locale)), printStream));
                }
                StrictMode.setVmPolicy(builder.build());
            }
            this.a.e();
        }
    }
}
