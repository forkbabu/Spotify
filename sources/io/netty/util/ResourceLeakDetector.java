package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.i;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.r;
import io.netty.util.internal.s;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ResourceLeakDetector<T> {
    private static final int l;
    private static Level m;
    private static final b n;
    private static final String[] o = {"io.netty.util.ReferenceCountUtil.touch(", "io.netty.buffer.AdvancedLeakAwareByteBuf.touch(", "io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer(", "io.netty.buffer.AdvancedLeakAwareByteBuf.recordLeakNonRefCountingOperation("};
    private final ResourceLeakDetector<T>.a a;
    private final ResourceLeakDetector<T>.a b;
    private final ReferenceQueue<Object> c = new ReferenceQueue<>();
    private final ConcurrentMap<String, Boolean> d = PlatformDependent.P();
    private final String e;
    private final int f;
    private final int g;
    private final long h;
    private long i;
    private final AtomicBoolean j = new AtomicBoolean();
    private long k;

    public enum Level {
        DISABLED,
        SIMPLE,
        ADVANCED,
        PARANOID
    }

    /* access modifiers changed from: private */
    public final class a extends PhantomReference<Object> implements p {
        private final String a;
        private final Deque<String> b;
        private final AtomicBoolean c;
        private ResourceLeakDetector<T>.a f;
        private ResourceLeakDetector<T>.a n;
        private int o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(obj, obj != null ? ResourceLeakDetector.this.c : null);
            this.b = new ArrayDeque();
            if (obj != null) {
                if (ResourceLeakDetector.f().ordinal() >= 2) {
                    this.a = ResourceLeakDetector.h(null, 3);
                } else {
                    this.a = null;
                }
                synchronized (ResourceLeakDetector.this.a) {
                    this.f = ResourceLeakDetector.this.a;
                    this.n = ResourceLeakDetector.this.a.n;
                    ResourceLeakDetector.this.a.n.f = this;
                    ResourceLeakDetector.this.a.n = this;
                    ResourceLeakDetector.c(ResourceLeakDetector.this);
                }
                this.c = new AtomicBoolean();
                return;
            }
            this.a = null;
            this.c = new AtomicBoolean(true);
        }

        private void e(Object obj, int i) {
            if (this.a != null) {
                String h = ResourceLeakDetector.h(obj, i);
                synchronized (this.b) {
                    int size = this.b.size();
                    if (size == 0 || !this.b.getLast().equals(h)) {
                        this.b.add(h);
                    }
                    if (size > ResourceLeakDetector.l) {
                        this.b.removeFirst();
                        this.o++;
                    }
                }
            }
        }

        @Override // io.netty.util.p
        public void a(Object obj) {
            e(obj, 3);
        }

        @Override // io.netty.util.p
        public void b() {
            e(null, 3);
        }

        @Override // io.netty.util.p
        public boolean close() {
            if (!this.c.compareAndSet(false, true)) {
                return false;
            }
            synchronized (ResourceLeakDetector.this.a) {
                ResourceLeakDetector.d(ResourceLeakDetector.this);
                ResourceLeakDetector<T>.a aVar = this.f;
                aVar.n = this.n;
                this.n.f = aVar;
                this.f = null;
                this.n = null;
            }
            return true;
        }

        @Override // java.lang.Object
        public String toString() {
            Object[] array;
            int i;
            if (this.a == null) {
                return "";
            }
            synchronized (this.b) {
                array = this.b.toArray();
                i = this.o;
            }
            StringBuilder sb = new StringBuilder(16384);
            String str = r.a;
            sb.append(str);
            if (i > 0) {
                sb.append("WARNING: ");
                sb.append(i);
                sb.append(" leak records were discarded because the leak record count is limited to ");
                sb.append(ResourceLeakDetector.l);
                sb.append(". Use system property ");
                sb.append("io.netty.leakDetection.maxRecords");
                sb.append(" to increase the limit.");
                sb.append(str);
            }
            sb.append("Recent access records: ");
            sb.append(array.length);
            sb.append(str);
            if (array.length > 0) {
                for (int length = array.length - 1; length >= 0; length--) {
                    sb.append('#');
                    sb.append(length + 1);
                    sb.append(':');
                    sb.append(r.a);
                    sb.append(array[length]);
                }
            }
            sb.append("Created at:");
            String str2 = r.a;
            sb.append(str2);
            sb.append(this.a);
            sb.setLength(sb.length() - str2.length());
            return sb.toString();
        }
    }

    static {
        boolean z;
        Level level = Level.SIMPLE;
        int i2 = c.b;
        b b2 = c.b(ResourceLeakDetector.class.getName());
        n = b2;
        if (s.a("io.netty.noResourceLeakDetection", null) != null) {
            z = s.b("io.netty.noResourceLeakDetection", false);
            b2.r("-Dio.netty.noResourceLeakDetection: {}", Boolean.valueOf(z));
            b2.g("-Dio.netty.noResourceLeakDetection is deprecated. Use '-D{}={}' instead.", "io.netty.leakDetection.level", level.name().toLowerCase());
        } else {
            z = false;
        }
        String upperCase = s.a("io.netty.leakDetection.level", s.a("io.netty.leakDetectionLevel", (z ? Level.DISABLED : level).name()).trim().toUpperCase()).trim().toUpperCase();
        Iterator it = EnumSet.allOf(Level.class).iterator();
        while (it.hasNext()) {
            Level level2 = (Level) it.next();
            if (upperCase.equals(level2.name()) || upperCase.equals(String.valueOf(level2.ordinal()))) {
                level = level2;
            }
        }
        int c2 = s.c("io.netty.leakDetection.maxRecords", 4);
        l = c2;
        m = level;
        b bVar = n;
        if (bVar.c()) {
            bVar.b("-D{}: {}", "io.netty.leakDetection.level", level.name().toLowerCase());
            bVar.b("-D{}: {}", "io.netty.leakDetection.maxRecords", Integer.valueOf(c2));
        }
    }

    public ResourceLeakDetector(Class<?> cls, int i2, long j2) {
        String e2 = r.e(cls);
        ResourceLeakDetector<T>.a aVar = new a(null);
        this.a = aVar;
        ResourceLeakDetector<T>.a aVar2 = new a(null);
        this.b = aVar2;
        if (e2 == null) {
            throw new NullPointerException("resourceType");
        } else if (j2 > 0) {
            this.e = e2;
            int b2 = i.b(i2);
            this.f = b2;
            this.g = b2 - 1;
            this.h = j2;
            ((a) aVar).n = aVar2;
            ((a) aVar2).f = aVar;
        } else {
            throw new IllegalArgumentException("maxActive: " + j2 + " (expected: 1+)");
        }
    }

    static /* synthetic */ long c(ResourceLeakDetector resourceLeakDetector) {
        long j2 = resourceLeakDetector.i;
        resourceLeakDetector.i = 1 + j2;
        return j2;
    }

    static /* synthetic */ long d(ResourceLeakDetector resourceLeakDetector) {
        long j2 = resourceLeakDetector.i;
        resourceLeakDetector.i = j2 - 1;
        return j2;
    }

    public static Level f() {
        return m;
    }

    public static boolean g() {
        return m.ordinal() > 0;
    }

    static String h(Object obj, int i2) {
        boolean z;
        StringBuilder sb = new StringBuilder(4096);
        if (obj != null) {
            sb.append("\tHint: ");
            if (obj instanceof r) {
                sb.append(((r) obj).C());
            } else {
                sb.append(obj);
            }
            sb.append(r.a);
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (i2 > 0) {
                i2--;
            } else {
                String stackTraceElement2 = stackTraceElement.toString();
                String[] strArr = o;
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    } else if (stackTraceElement2.startsWith(strArr[i3])) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z) {
                    sb.append('\t');
                    sb.append(stackTraceElement2);
                    sb.append(r.a);
                }
            }
        }
        return sb.toString();
    }

    private void j(Level level) {
        b bVar = n;
        if (!bVar.o()) {
            while (true) {
                a aVar = (a) this.c.poll();
                if (aVar != null) {
                    aVar.close();
                } else {
                    return;
                }
            }
        } else {
            if (this.i * ((long) (level == Level.PARANOID ? 1 : this.f)) > this.h && this.j.compareAndSet(false, true)) {
                String str = this.e;
                bVar.d("LEAK: You are creating too many " + str + " instances.  " + str + " is a shared resource that must be reused across the JVM,so that only a few instances are created.");
            }
            while (true) {
                a aVar2 = (a) this.c.poll();
                if (aVar2 != null) {
                    aVar2.clear();
                    if (aVar2.close()) {
                        String aVar3 = aVar2.toString();
                        if (this.d.putIfAbsent(aVar3, Boolean.TRUE) == null) {
                            if (aVar3.isEmpty()) {
                                n.error("LEAK: {}.release() was not called before it's garbage-collected. Enable advanced leak reporting to find out where the leak occurred. To enable advanced leak reporting, specify the JVM option '-D{}={}' or call {}.setLevel() See http://netty.io/wiki/reference-counted-objects.html for more information.", this.e, "io.netty.leakDetection.level", Level.ADVANCED.name().toLowerCase(), r.f(this));
                            } else {
                                n.q("LEAK: {}.release() was not called before it's garbage-collected. See http://netty.io/wiki/reference-counted-objects.html for more information.{}", this.e, aVar3);
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final p i(T t) {
        Level level = m;
        if (level == Level.DISABLED) {
            return null;
        }
        if (level.ordinal() < 3) {
            long j2 = this.k + 1;
            this.k = j2;
            if ((j2 & ((long) this.g)) != 0) {
                return null;
            }
            j(level);
            return new a(t);
        }
        j(level);
        return new a(t);
    }
}
