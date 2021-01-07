package io.netty.handler.ssl;

import io.netty.util.internal.j;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.s;
import java.security.PrivilegedAction;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.tomcat.jni.Buffer;
import org.apache.tomcat.jni.Library;
import org.apache.tomcat.jni.SSL;

public final class q {
    private static final b a = c.b(q.class.getName());
    private static final Throwable b;
    static final Set<String> c;
    private static final Set<String> d;
    private static final Set<String> e;
    private static final boolean f;
    private static final String[] g;
    static final Set<String> h;

    static class a implements PrivilegedAction<Boolean> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public Boolean run() {
            return Boolean.valueOf(s.b("io.netty.handler.ssl.openssl.useKeyManagerFactory", true));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c5 A[LOOP:1: B:76:0x01bf->B:78:0x01c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01fe A[LOOP:2: B:80:0x01f8->B:82:0x01fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0214 A[LOOP:3: B:84:0x020e->B:86:0x0214, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0227  */
    static {
        /*
        // Method dump skipped, instructions count: 572
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.q.<clinit>():void");
    }

    private q() {
    }

    @Deprecated
    public static Set<String> a() {
        return d;
    }

    public static void b() {
        Throwable th = b;
        if (th != null) {
            throw ((Error) new UnsatisfiedLinkError("failed to load the required native library").initCause(th));
        }
    }

    private static void c() {
        Library.initialize("provided");
        SSL.initialize((String) null);
    }

    public static boolean d() {
        return b == null;
    }

    public static boolean e(String str) {
        String c2 = c.c(str);
        if (c2 != null) {
            str = c2;
        }
        return d.contains(str);
    }

    private static void f() {
        String a2 = s.a("os.name", "");
        Locale locale = Locale.US;
        String replaceAll = a2.toLowerCase(locale).replaceAll("[^a-z0-9]+", "");
        String str = "aix";
        String str2 = "unknown";
        if (!replaceAll.startsWith(str)) {
            str = "hpux";
            if (!replaceAll.startsWith(str)) {
                str = "os400";
                if (!replaceAll.startsWith(str) || (replaceAll.length() > 5 && Character.isDigit(replaceAll.charAt(5)))) {
                    if (replaceAll.startsWith("linux")) {
                        str = "linux";
                    } else {
                        String str3 = "osx";
                        if (!replaceAll.startsWith("macosx") && !replaceAll.startsWith(str3)) {
                            str = "freebsd";
                            if (!replaceAll.startsWith(str)) {
                                str = "openbsd";
                                if (!replaceAll.startsWith(str)) {
                                    str = "netbsd";
                                    if (!replaceAll.startsWith(str)) {
                                        str3 = "sunos";
                                        if (!replaceAll.startsWith("solaris") && !replaceAll.startsWith(str3)) {
                                            str = "windows";
                                            if (!replaceAll.startsWith(str)) {
                                                str = str2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        str = str3;
                    }
                }
            }
        }
        String replaceAll2 = s.a("os.arch", "").toLowerCase(locale).replaceAll("[^a-z0-9]+", "");
        if (replaceAll2.matches("^(x8664|amd64|ia32e|em64t|x64)$")) {
            str2 = "x86_64";
        } else if (replaceAll2.matches("^(x8632|x86|i[3-6]86|ia32|x32)$")) {
            str2 = "x86_32";
        } else if (replaceAll2.matches("^(ia64|itanium64)$")) {
            str2 = "itanium_64";
        } else if (replaceAll2.matches("^(sparc|sparc32)$")) {
            str2 = "sparc_32";
        } else if (replaceAll2.matches("^(sparcv9|sparc64)$")) {
            str2 = "sparc_64";
        } else if (replaceAll2.matches("^(arm|arm32)$")) {
            str2 = "arm_32";
        } else if ("aarch64".equals(replaceAll2)) {
            str2 = "aarch_64";
        } else if (replaceAll2.matches("^(ppc|ppc32)$")) {
            str2 = "ppc_32";
        } else if ("ppc64".equals(replaceAll2)) {
            str2 = "ppc_64";
        } else if ("ppc64le".equals(replaceAll2)) {
            str2 = "ppcle_64";
        } else if ("s390".equals(replaceAll2)) {
            str2 = "s390_32";
        } else if ("s390x".equals(replaceAll2)) {
            str2 = "s390_64";
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(3);
        linkedHashSet.add("netty-tcnative-" + str + '-' + str2);
        if ("linux".equalsIgnoreCase(str)) {
            linkedHashSet.add("netty-tcnative-" + str + '-' + str2 + "-fedora");
        }
        linkedHashSet.add("netty-tcnative");
        j.b(SSL.class.getClassLoader(), (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
    }

    static long g(io.netty.buffer.j jVar) {
        return jVar.F0() ? jVar.N0() : Buffer.address(jVar.O0());
    }

    static boolean h() {
        return f;
    }
}
