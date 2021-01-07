package defpackage;

import android.text.Spannable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: oqc  reason: default package */
public class oqc {
    private final long a;
    private final b b;
    private final Pattern c = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");
    private final Pattern d = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\s?-\\s?((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");

    /* renamed from: oqc$a */
    public static class a {
    }

    /* renamed from: oqc$b */
    public interface b {
        void a(long j);
    }

    public oqc(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.text.Spannable r13, java.util.regex.Matcher r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = r14.group(r15)
            r1 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0048
        L_0x0009:
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            int r3 = r3 + -1
            r4 = r1
        L_0x0013:
            if (r3 < 0) goto L_0x004a
            double r4 = (double) r4
            r6 = r0[r3]     // Catch:{ NumberFormatException -> 0x0048 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0048 }
            double r6 = (double) r6     // Catch:{ NumberFormatException -> 0x0048 }
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r10 = r0.length     // Catch:{ NumberFormatException -> 0x0048 }
            int r10 = r10 + -1
            int r10 = r10 - r3
            double r10 = (double) r10     // Catch:{ NumberFormatException -> 0x0048 }
            double r8 = java.lang.Math.pow(r8, r10)     // Catch:{ NumberFormatException -> 0x0048 }
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
            r8 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = r6 * r8
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r4)
            double r6 = r6 + r4
            long r4 = (long) r6
            int r3 = r3 + -1
            goto L_0x0013
        L_0x0048:
            r4 = -1
        L_0x004a:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            long r0 = r12.a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x006b
            int r0 = r14.start(r15)
            int r14 = r14.end(r15)
            nqc r15 = new nqc
            r15.<init>(r12, r4)
            r1 = 33
            r13.setSpan(r15, r0, r14, r1)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqc.c(android.text.Spannable, java.util.regex.Matcher, int):void");
    }

    public Spannable b(Spannable spannable) {
        Matcher matcher = this.c.matcher(spannable);
        while (matcher.find()) {
            c(spannable, matcher, 1);
        }
        Matcher matcher2 = this.d.matcher(spannable);
        while (matcher2.find()) {
            c(spannable, matcher2, 1);
            c(spannable, matcher2, 2);
        }
        return spannable;
    }
}
