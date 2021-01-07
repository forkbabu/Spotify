package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import defpackage.vp;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wp  reason: default package */
public final class wp {
    public static final Pattern b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern c = Pattern.compile("(\\S+?):(\\S+)");
    private final StringBuilder a = new StringBuilder();

    /* access modifiers changed from: private */
    /* renamed from: wp$a */
    public static final class a {
        private static final String[] e = new String[0];
        public final String a;
        public final int b;
        public final String c;
        public final String[] d;

        private a(String str, int i, String str2, String[] strArr) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = strArr;
        }

        public static a a(String str, int i) {
            String str2;
            String[] strArr;
            String trim = str.trim();
            g.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] M = f0.M(trim, "\\.");
            String str3 = M[0];
            if (M.length > 1) {
                strArr = (String[]) f0.G(M, 1, M.length);
            } else {
                strArr = e;
            }
            return new a(str3, i, str2, strArr);
        }

        public static a b() {
            return new a("", 0, "", new String[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: wp$b */
    public static final class b implements Comparable<b> {
        public final int a;
        public final up b;

        public b(int i, up upVar) {
            this.a = i;
            this.b = upVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            return this.a - bVar.a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r16, defpackage.wp.a r17, android.text.SpannableStringBuilder r18, java.util.List<defpackage.up> r19, java.util.List<defpackage.wp.b> r20) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp.a(java.lang.String, wp$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    private static boolean c(String str, Matcher matcher, v vVar, vp.b bVar, StringBuilder sb, List<up> list) {
        try {
            bVar.i(yp.d(matcher.group(1)));
            bVar.c(yp.d(matcher.group(2)));
            d(matcher.group(3), bVar);
            sb.setLength(0);
            String j = vVar.j();
            while (!TextUtils.isEmpty(j)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(j.trim());
                j = vVar.j();
            }
            e(str, sb.toString(), bVar, list);
            return true;
        } catch (NumberFormatException unused) {
            matcher.group();
            return false;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (r3.equals("end") == false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void d(java.lang.String r8, defpackage.vp.b r9) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp.d(java.lang.String, vp$b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.String r16, java.lang.String r17, defpackage.vp.b r18, java.util.List<defpackage.up> r19) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp.e(java.lang.String, java.lang.String, vp$b, java.util.List):void");
    }

    private static int f(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public boolean b(v vVar, vp.b bVar, List<up> list) {
        String j = vVar.j();
        if (j == null) {
            return false;
        }
        Pattern pattern = b;
        Matcher matcher = pattern.matcher(j);
        if (matcher.matches()) {
            return c(null, matcher, vVar, bVar, this.a, list);
        }
        String j2 = vVar.j();
        if (j2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(j2);
        if (matcher2.matches()) {
            return c(j.trim(), matcher2, vVar, bVar, this.a, list);
        }
        return false;
    }
}
