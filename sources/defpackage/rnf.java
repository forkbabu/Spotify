package defpackage;

import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.t;
import okhttp3.u;
import okio.ByteString;
import okio.e;
import okio.g;
import okio.w;

/* renamed from: rnf  reason: default package */
public final class rnf {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final e0 c;
    private static final ByteString d = ByteString.h("efbbbf");
    private static final ByteString e = ByteString.h("feff");
    private static final ByteString f = ByteString.h("fffe");
    private static final ByteString g = ByteString.h("0000ffff");
    private static final ByteString h = ByteString.h("ffff0000");
    public static final Charset i = Charset.forName(Constants.ENCODING);
    public static final Charset j = Charset.forName("ISO-8859-1");
    private static final Charset k = Charset.forName("UTF-16BE");
    private static final Charset l = Charset.forName("UTF-16LE");
    private static final Charset m = Charset.forName("UTF-32BE");
    private static final Charset n = Charset.forName("UTF-32LE");
    public static final TimeZone o = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> p = new a();
    private static final Method q;
    private static final Pattern r = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: rnf$a */
    class a implements Comparator<String> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: rnf$b */
    class b implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        e eVar = new e();
        eVar.G(bArr);
        Method method = null;
        c = e0.h(null, (long) 0, eVar);
        c0.e(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        q = method;
    }

    public static t A(List<okhttp3.internal.http2.a> list) {
        t.a aVar = new t.a();
        for (okhttp3.internal.http2.a aVar2 : list) {
            pnf.a.b(aVar, aVar2.a.C(), aVar2.b.C());
        }
        return aVar.e();
    }

    public static String B(String str, int i2, int i3) {
        int x = x(str, i2, i3);
        return str.substring(x, y(str, x, i3));
    }

    public static boolean C(String str) {
        return r.matcher(str).matches();
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = q;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static AssertionError b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset c(g gVar, Charset charset) {
        ByteString byteString = d;
        if (gVar.g0(0, byteString)) {
            gVar.skip((long) byteString.x());
            return i;
        }
        ByteString byteString2 = e;
        if (gVar.g0(0, byteString2)) {
            gVar.skip((long) byteString2.x());
            return k;
        }
        ByteString byteString3 = f;
        if (gVar.g0(0, byteString3)) {
            gVar.skip((long) byteString3.x());
            return l;
        }
        ByteString byteString4 = g;
        if (gVar.g0(0, byteString4)) {
            gVar.skip((long) byteString4.x());
            return m;
        }
        ByteString byteString5 = h;
        if (!gVar.g0(0, byteString5)) {
            return charset;
        }
        gVar.skip((long) byteString5.x());
        return n;
    }

    public static String d(String str) {
        InetAddress inetAddress;
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = j(str, 0, str.length());
            } else {
                inetAddress = j(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i2 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                e eVar = new e();
                while (i3 < address.length) {
                    if (i3 == i2) {
                        eVar.J(58);
                        i3 += i5;
                        if (i3 == 16) {
                            eVar.J(58);
                        }
                    } else {
                        if (i3 > 0) {
                            eVar.J(58);
                        }
                        eVar.J1((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return eVar.s();
            }
            throw new AssertionError(je.y0("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= lowerCase.length()) {
                    z = false;
                    break;
                }
                char charAt = lowerCase.charAt(i8);
                if (charAt <= 31) {
                    break;
                } else if (charAt >= 127) {
                    break;
                } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                    break;
                } else {
                    i8++;
                }
            }
            if (z) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int e(String str, long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException(je.x0(str, " < 0"));
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(je.x0(str, " too large."));
            } else if (millis != 0 || j2 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(je.x0(str, " too small."));
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static void f(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!u(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int i(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == 16) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r8 != -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        throw new java.lang.AssertionError();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.InetAddress j(java.lang.String r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnf.j(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int k(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int l(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean m(w wVar, int i2, TimeUnit timeUnit) {
        try {
            return w(wVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean n(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String p(u uVar, boolean z) {
        String str;
        if (uVar.k().contains(":")) {
            StringBuilder V0 = je.V0("[");
            V0.append(uVar.k());
            V0.append("]");
            str = V0.toString();
        } else {
            str = uVar.k();
        }
        if (!z && uVar.v() == u.d(uVar.z())) {
            return str;
        }
        StringBuilder Z0 = je.Z0(str, ":");
        Z0.append(uVar.v());
        return Z0.toString();
    }

    public static <T> List<T> q(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> r(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int s(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] t(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean u(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean v(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean w(w wVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = wVar.k().e() ? wVar.k().c() - nanoTime : Long.MAX_VALUE;
        wVar.k().d(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            e eVar = new e();
            while (wVar.c2(eVar, 8192) != -1) {
                eVar.b();
            }
            if (c2 == Long.MAX_VALUE) {
                wVar.k().a();
            } else {
                wVar.k().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                wVar.k().a();
            } else {
                wVar.k().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                wVar.k().a();
            } else {
                wVar.k().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int x(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int y(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static ThreadFactory z(String str, boolean z) {
        return new b(str, z);
    }
}
