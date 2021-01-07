package com.spotify.music.page;

import kotlin.collections.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class PageHostingModule$Companion$lookupPageProvider$1 extends Lambda implements nmf<Class<?>, Class<?>> {
    public static final PageHostingModule$Companion$lookupPageProvider$1 a = new PageHostingModule$Companion$lookupPageProvider$1();

    PageHostingModule$Companion$lookupPageProvider$1() {
        super(1);
    }

    /* renamed from: a */
    public final Class<?> invoke(Class<?> cls) {
        h.e(cls, "clazz");
        Class<?>[] interfaces = cls.getInterfaces();
        h.d(interfaces, "clazz.interfaces");
        if (d.f(interfaces, usd.class)) {
            return cls;
        }
        Class<?>[] interfaces2 = cls.getInterfaces();
        h.d(interfaces2, "clazz.interfaces");
        for (Class<?> cls2 : interfaces2) {
            if (usd.class.isAssignableFrom(cls2)) {
                h.d(cls2, "it");
                Class<?> a2 = invoke(cls2);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
