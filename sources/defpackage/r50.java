package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.b;

/* renamed from: r50  reason: default package */
public final class r50 {
    private static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Application application) {
        if (!a.getAndSet(true)) {
            b.c(new s50(application));
        }
    }
}
