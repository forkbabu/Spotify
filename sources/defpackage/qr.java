package defpackage;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
/* renamed from: qr  reason: default package */
public class qr {
    private static a a;

    /* renamed from: qr$a */
    public interface a {
        @RecentlyNonNull
        @Deprecated
        ScheduledExecutorService a();
    }

    @RecentlyNonNull
    @Deprecated
    public static synchronized a a() {
        a aVar;
        synchronized (qr.class) {
            if (a == null) {
                a = new rr();
            }
            aVar = a;
        }
        return aVar;
    }
}
