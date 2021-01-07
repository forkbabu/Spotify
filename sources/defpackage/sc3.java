package defpackage;

import com.spotify.base.java.logging.LogLevel;
import java.util.EnumSet;

/* renamed from: sc3  reason: default package */
public final class sc3 implements fjf<EnumSet<LogLevel>> {

    /* access modifiers changed from: private */
    /* renamed from: sc3$a */
    public static final class a {
        private static final sc3 a = new sc3();
    }

    public static sc3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        EnumSet of = EnumSet.of(LogLevel.INFO, LogLevel.WARNING, LogLevel.ERROR);
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
