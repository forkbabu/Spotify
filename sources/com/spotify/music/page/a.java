package com.spotify.music.page;

import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public interface a {
    public static final C0320a a = C0320a.a;

    /* renamed from: com.spotify.music.page.a$a  reason: collision with other inner class name */
    public static final class C0320a {
        static final /* synthetic */ C0320a a = new C0320a();

        private C0320a() {
        }

        public final Map<String, usd<Parcelable>> a(Set<usd<?>> set) {
            h.e(set, "pageProviders");
            int w = d.w(d.e(set, 10));
            if (w < 16) {
                w = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(w);
            for (T t : set) {
                Class<?> cls = t.getClass();
                Class<?> a2 = PageHostingModule$Companion$lookupPageProvider$1.a.invoke(cls);
                if (a2 != null) {
                    String name = a2.getName();
                    h.d(name, "lookupPageProvider(it.javaClass).name");
                    linkedHashMap.put(name, new b(t));
                } else {
                    throw new IllegalStateException(je.l0(cls, new StringBuilder(), " is not a PageProvider").toString());
                }
            }
            return linkedHashMap;
        }
    }
}
