package defpackage;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: kz  reason: default package */
public class kz implements gz {
    private static final Charset d = Charset.forName(Constants.ENCODING);
    private final File a;
    private final int b;
    private iz c;

    /* access modifiers changed from: private */
    /* renamed from: kz$a */
    public class a {
        public final byte[] a;
        public final int b;

        a(kz kzVar, byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    kz(File file, int i) {
        this.a = file;
        this.b = i;
    }

    private void f() {
        if (this.c == null) {
            try {
                this.c = new iz(this.a);
            } catch (IOException e) {
                ty f = ty.f();
                StringBuilder V0 = je.V0("Could not open log file: ");
                V0.append(this.a);
                f.e(V0.toString(), e);
            }
        }
    }

    @Override // defpackage.gz
    public void a() {
        CommonUtils.c(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // defpackage.gz
    public String b() {
        byte[] c2 = c();
        if (c2 != null) {
            return new String(c2, d);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    @Override // defpackage.gz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] c() {
        /*
            r7 = this;
            java.io.File r0 = r7.a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r4 = r1
            goto L_0x003b
        L_0x000c:
            r7.f()
            iz r0 = r7.c
            if (r0 != 0) goto L_0x0014
            goto L_0x000a
        L_0x0014:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.v()
            byte[] r0 = new byte[r0]
            iz r4 = r7.c     // Catch:{ IOException -> 0x002a }
            jz r5 = new jz     // Catch:{ IOException -> 0x002a }
            r5.<init>(r7, r0, r3)     // Catch:{ IOException -> 0x002a }
            r4.i(r5)     // Catch:{ IOException -> 0x002a }
            goto L_0x0034
        L_0x002a:
            r4 = move-exception
            ty r5 = defpackage.ty.f()
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            r5.e(r6, r4)
        L_0x0034:
            kz$a r4 = new kz$a
            r3 = r3[r2]
            r4.<init>(r7, r0, r3)
        L_0x003b:
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            int r0 = r4.b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz.c():byte[]");
    }

    @Override // defpackage.gz
    public void d() {
        CommonUtils.c(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
        this.a.delete();
    }

    @Override // defpackage.gz
    public void e(long j, String str) {
        f();
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.c.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
                while (!this.c.l() && this.c.v() > this.b) {
                    this.c.q();
                }
            } catch (IOException e) {
                ty.f().e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }
}
