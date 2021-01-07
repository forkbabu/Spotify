package defpackage;

import com.adjust.sdk.Constants;
import com.spotify.cosmos.router.Request;
import io.netty.util.concurrent.y;
import io.netty.util.internal.logging.b;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.a;
import io.reactivex.x;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result$Failure;
import kotlin.jvm.internal.h;
import kotlin.reflect.c;
import org.msgpack.value.k;
import org.msgpack.value.v;

/* renamed from: yif  reason: default package */
public final class yif {
    public static void A(upf<?> upf, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b = ExceptionHelper.b(atomicThrowable);
            if (b != null) {
                upf.onError(b);
            } else {
                upf.onComplete();
            }
        }
    }

    public static void B(x<?> xVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!ExceptionHelper.a(atomicThrowable, th)) {
            a.g(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            xVar.onError(ExceptionHelper.b(atomicThrowable));
        }
    }

    public static void C(upf<?> upf, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!ExceptionHelper.a(atomicThrowable, th)) {
            a.g(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            upf.onError(ExceptionHelper.b(atomicThrowable));
        }
    }

    public static <T> void D(x<? super T> xVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            xVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b = ExceptionHelper.b(atomicThrowable);
                if (b != null) {
                    xVar.onError(b);
                } else {
                    xVar.onComplete();
                }
            }
        }
    }

    public static <T> void E(upf<? super T> upf, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            upf.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b = ExceptionHelper.b(atomicThrowable);
                if (b != null) {
                    upf.onError(b);
                } else {
                    upf.onComplete();
                }
            }
        }
    }

    public static boolean F(String str) {
        return !str.equals(Request.GET) && !str.equals("HEAD");
    }

    public static long G(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                a.g(new IllegalStateException(je.t0("More produced than requested: ", j3)));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    public static long H(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                a.g(new IllegalStateException(je.t0("More produced than requested: ", j3)));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    public static void I(Class<?> cls) {
        String name = cls.getName();
        a.g(new ProtocolViolationException("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
    }

    public static <T> T J(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.x0(str, " must not be null"));
    }

    public static boolean K(String str) {
        return str.equals(Request.POST) || str.equals(Request.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static int L(int i) {
        if (i <= 1073741824) {
            return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        }
        throw new IllegalArgumentException(je.q0("There is no larger power of 2 int for value:", i, " since it exceeds 2^31."));
    }

    public static int M(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public static int N(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException(je.s0("Addition overflows an int: ", i, " + ", i2));
    }

    public static long O(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("Addition overflows a long: " + j + " + " + j2);
    }

    public static long P(long j, int i) {
        if (i != -1) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return j;
            }
            long j2 = (long) i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
    }

    public static long Q(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + j2);
    }

    public static int R(int i, int i2) {
        int i3 = i - i2;
        if ((i ^ i3) >= 0 || (i ^ i2) >= 0) {
            return i3;
        }
        throw new ArithmeticException(je.s0("Subtraction overflows an int: ", i, " - ", i2));
    }

    public static long S(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        throw new ArithmeticException("Subtraction overflows a long: " + j + " - " + j2);
    }

    public static int T(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        throw new ArithmeticException(je.t0("Calculation overflows an int: ", j));
    }

    public static String U(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        try {
            return new String(byteArrayOutputStream.toByteArray());
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void V(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void W(Object obj) {
        if (obj instanceof Result$Failure) {
            throw ((Result$Failure) obj).exception;
        }
    }

    public static void X(y<?> yVar, Throwable th, b bVar) {
        if (!yVar.n(th) && bVar != null) {
            Throwable r = yVar.r();
            if (r == null) {
                bVar.g("Failed to mark a promise as failure because it has succeeded already: {}", yVar, th);
            } else {
                bVar.warn("Failed to mark a promise as failure because it has failed already: {}, unnotified cause: {}", yVar, U(r), th);
            }
        }
    }

    public static <V> void Y(y<? super V> yVar, V v, b bVar) {
        if (!yVar.p(v) && bVar != null) {
            Throwable r = yVar.r();
            if (r == null) {
                bVar.l("Failed to mark a promise as success because it has succeeded already: {}", yVar);
            } else {
                bVar.g("Failed to mark a promise as success because it has failed already: {}, unnotified cause:", yVar, r);
            }
        }
    }

    public static <T extends Throwable> T Z(T t, Class<?> cls, String str) {
        t.setStackTrace(new StackTraceElement[]{new StackTraceElement(cls.getName(), str, null, -1)});
        return t;
    }

    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, c(j2, j)));
        return j2;
    }

    public static long b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, c(j2, j)));
        return j2;
    }

    public static long c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T> T f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T g(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> T h(T t, String str, Object obj) {
        String str2;
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            if (obj instanceof Class) {
                str2 = ((Class) obj).getCanonicalName();
            } else {
                str2 = String.valueOf(obj);
            }
            throw new NullPointerException(str.replace("%s", str2));
        } else {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
    }

    public static <T> T i(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static final void j(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                h.e(th, "$this$addSuppressed");
                h.e(th2, "exception");
                if (th != th2) {
                    amf.a.a(th, th2);
                }
            }
        }
    }

    public static int k(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int l(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static final Object m(Throwable th) {
        h.e(th, "exception");
        return new Result$Failure(th);
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static long o(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static int p(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public static int q(long j, int i) {
        long j2 = (long) i;
        return (int) (((j % j2) + j2) % j2);
    }

    public static long r(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static final <T> Class<T> s(c<T> cVar) {
        h.e(cVar, "$this$java");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.c) cVar).c();
        if (cls != null) {
            return cls;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    public static final <T> Class<T> t(c<T> cVar) {
        h.e(cVar, "$this$javaObjectType");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.c) cVar).c();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : cls;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return cls;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return cls;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return cls;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return Long.class;
                }
                return cls;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return cls;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return cls;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return cls;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return cls;
            default:
                return cls;
        }
    }

    public static boolean u(String str) {
        return str.equals(Request.POST) || str.equals("PATCH") || str.equals(Request.PUT) || str.equals(Request.DELETE) || str.equals("MOVE");
    }

    public static boolean v(CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                int length = charSequence.length();
                for (int i = 0; i < length; i++) {
                    if (!Character.isLowerCase(charSequence.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean w(CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                int length = charSequence.length();
                for (int i = 0; i < length; i++) {
                    if (!Character.isUpperCase(charSequence.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static long x(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j3 / j == j2) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static k y(v[] vVarArr) {
        if (vVarArr.length == 0) {
            return qpf.p0();
        }
        return new qpf((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
    }

    public static void z(x<?> xVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b = ExceptionHelper.b(atomicThrowable);
            if (b != null) {
                xVar.onError(b);
            } else {
                xVar.onComplete();
            }
        }
    }
}
