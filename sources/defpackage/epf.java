package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: epf  reason: default package */
abstract class epf implements org.mp4parser.aspectj.lang.b {
    private static boolean g = true;
    int a = -1;
    String b;
    String c;
    Class d;
    a e;
    ClassLoader f = null;

    /* access modifiers changed from: private */
    /* renamed from: epf$a */
    public interface a {
    }

    /* access modifiers changed from: private */
    /* renamed from: epf$b */
    public static final class b implements a {
        private SoftReference a = new SoftReference(new String[3]);

        public String a(int i) {
            String[] strArr = (String[]) this.a.get();
            if (strArr == null) {
                return null;
            }
            return strArr[i];
        }

        public void b(int i, String str) {
            String[] strArr = (String[]) this.a.get();
            if (strArr == null) {
                strArr = new String[3];
                this.a = new SoftReference(strArr);
            }
            strArr[i] = str;
        }
    }

    epf(int i, String str, Class cls) {
        this.a = i;
        this.b = str;
        this.d = cls;
    }

    /* access modifiers changed from: protected */
    public abstract String a(gpf gpf);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(defpackage.gpf r3) {
        /*
            r2 = this;
            boolean r0 = defpackage.epf.g
            if (r0 == 0) goto L_0x001d
            epf$a r0 = r2.e
            if (r0 != 0) goto L_0x0014
            epf$b r0 = new epf$b     // Catch:{ all -> 0x0010 }
            r0.<init>()     // Catch:{ all -> 0x0010 }
            r2.e = r0     // Catch:{ all -> 0x0010 }
            goto L_0x001d
        L_0x0010:
            r0 = 0
            defpackage.epf.g = r0
            goto L_0x001d
        L_0x0014:
            int r1 = r3.e
            epf$b r0 = (defpackage.epf.b) r0
            java.lang.String r0 = r0.a(r1)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r2.a(r3)
        L_0x0024:
            boolean r1 = defpackage.epf.g
            if (r1 == 0) goto L_0x0031
            epf$a r1 = r2.e
            int r3 = r3.e
            epf$b r1 = (defpackage.epf.b) r1
            r1.b(r3, r0)
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epf.b(gpf):java.lang.String");
    }

    public final String toString() {
        return b(gpf.g);
    }
}
