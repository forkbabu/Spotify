package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: xof  reason: default package */
public final class xof implements HostnameVerifier {
    public static final xof a = new xof();

    private xof() {
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> b = b(x509Certificate, 7);
        List<String> b2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b2.size() + b.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    private static List<String> b(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        Integer num = (Integer) list.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) list.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
            r9 = this;
            boolean r0 = defpackage.rnf.C(r10)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            r0 = 7
            java.util.List r11 = b(r11, r0)
            int r0 = r11.size()
            r2 = 0
        L_0x0012:
            if (r2 >= r0) goto L_0x00e4
            java.lang.Object r3 = r11.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r10.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0022
            goto L_0x00e3
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0025:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r10.toLowerCase(r0)
            r0 = 2
            java.util.List r11 = b(r11, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0034:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r10 == 0) goto L_0x00e0
            int r3 = r10.length()
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = "."
            boolean r4 = r10.startsWith(r3)
            if (r4 != 0) goto L_0x00e0
            java.lang.String r4 = ".."
            boolean r5 = r10.endsWith(r4)
            if (r5 == 0) goto L_0x005a
            goto L_0x00e0
        L_0x005a:
            if (r0 == 0) goto L_0x00e0
            int r5 = r0.length()
            if (r5 == 0) goto L_0x00e0
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto L_0x00e0
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L_0x0070
            goto L_0x00e0
        L_0x0070:
            boolean r4 = r10.endsWith(r3)
            r5 = 46
            if (r4 != 0) goto L_0x007d
            java.lang.String r4 = defpackage.je.o0(r10, r5)
            goto L_0x007e
        L_0x007d:
            r4 = r10
        L_0x007e:
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x0088
            java.lang.String r0 = defpackage.je.o0(r0, r5)
        L_0x0088:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x009b
            boolean r0 = r4.equals(r0)
            goto L_0x00e1
        L_0x009b:
            java.lang.String r3 = "*."
            boolean r6 = r0.startsWith(r3)
            if (r6 == 0) goto L_0x00e0
            r6 = 42
            int r6 = r0.indexOf(r6, r2)
            r7 = -1
            if (r6 == r7) goto L_0x00ad
            goto L_0x00e0
        L_0x00ad:
            int r6 = r4.length()
            int r8 = r0.length()
            if (r6 >= r8) goto L_0x00b8
            goto L_0x00e0
        L_0x00b8:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00bf
            goto L_0x00e0
        L_0x00bf:
            java.lang.String r0 = r0.substring(r2)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto L_0x00ca
            goto L_0x00e0
        L_0x00ca:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x00de
            int r3 = r3 + -1
            int r0 = r4.lastIndexOf(r5, r3)
            if (r0 == r7) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            r0 = 1
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            if (r0 == 0) goto L_0x0034
        L_0x00e3:
            r1 = 1
        L_0x00e4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xof.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
