package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.s;
import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.security.PrivilegedAction;

public abstract class q {
    private static final b a = c.b(q.class.getName());
    private static volatile q b = new a();

    private static final class a extends q {
        private final Constructor<?> c;

        /* renamed from: io.netty.util.q$a$a  reason: collision with other inner class name */
        class C0607a implements PrivilegedAction<String> {
            C0607a(a aVar) {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.security.PrivilegedAction
            public String run() {
                return s.a("io.netty.customResourceLeakDetector", null);
            }
        }

        a() {
            String str;
            Constructor<?> constructor = null;
            try {
                str = (String) AccessController.doPrivileged(new C0607a(this));
            } catch (Throwable th) {
                q.a.n("Could not access System property: io.netty.customResourceLeakDetector", th);
                str = null;
            }
            if (str != null) {
                try {
                    Class<?> cls = Class.forName(str, true, PlatformDependent.x());
                    if (ResourceLeakDetector.class.isAssignableFrom(cls)) {
                        constructor = cls.getConstructor(Class.class, Integer.TYPE, Long.TYPE);
                    } else {
                        q.a.s("Class {} does not inherit from ResourceLeakDetector.", str);
                    }
                } catch (Throwable th2) {
                    q.a.q("Could not load custom resource leak detector class provided: {}", str, th2);
                }
            }
            this.c = constructor;
        }

        @Override // io.netty.util.q
        public <T> ResourceLeakDetector<T> c(Class<T> cls, int i, long j) {
            Constructor<?> constructor = this.c;
            if (constructor != null) {
                try {
                    ResourceLeakDetector<T> resourceLeakDetector = (ResourceLeakDetector) constructor.newInstance(cls, Integer.valueOf(i), Long.valueOf(j));
                    q.a.r("Loaded custom ResourceLeakDetector: {}", this.c.getDeclaringClass().getName());
                    return resourceLeakDetector;
                } catch (Throwable th) {
                    q.a.error("Could not load custom resource leak detector provided: {} with the given resource: {}", this.c.getDeclaringClass().getName(), cls, th);
                }
            }
            ResourceLeakDetector<T> resourceLeakDetector2 = new ResourceLeakDetector<>(cls, i, j);
            q.a.r("Loaded default ResourceLeakDetector: {}", resourceLeakDetector2);
            return resourceLeakDetector2;
        }
    }

    static {
        int i = c.b;
    }

    public static q b() {
        return b;
    }

    public abstract <T> ResourceLeakDetector<T> c(Class<T> cls, int i, long j);
}
