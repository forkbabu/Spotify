package defpackage;

import com.spotify.music.features.premiumdestination.domain.m;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger;
import java.util.Locale;

/* renamed from: aj7  reason: default package */
public class aj7 {
    private final jz1 a;
    private final cqe b;

    public aj7(jz1 jz1, cqe cqe) {
        this.a = jz1;
        this.b = cqe;
    }

    public void a(m mVar) {
        ifd ifd = kfd.X0;
        mVar.getClass();
        if (mVar instanceof m.b) {
            this.a.a(new da1(null, ifd.getName(), ViewUris.b1.toString(), null, -1, null, ImpressionLogger.ImpressionType.PAGE.toString(), null, (double) this.b.d()));
        } else if (mVar instanceof m.a) {
            this.a.a(new da1(null, ifd.getName(), ViewUris.b1.toString(), null, -1, null, ImpressionLogger.ImpressionType.ERROR.toString(), ((m.a) mVar).c().name().toLowerCase(Locale.US), (double) this.b.d()));
        }
    }
}
