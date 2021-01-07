package org.threeten.bp.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public abstract class f {
    private static final AtomicReference<f> a = new AtomicReference<>();
    public static final /* synthetic */ int b = 0;

    /* access modifiers changed from: package-private */
    public static class a {
        static final f a = ((f) f.a.get());

        static {
            f.a.compareAndSet(null, new h());
        }
    }

    public abstract String b(org.threeten.bp.temporal.f fVar, long j, TextStyle textStyle, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> c(org.threeten.bp.temporal.f fVar, TextStyle textStyle, Locale locale);
}
