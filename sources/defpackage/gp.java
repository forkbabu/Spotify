package defpackage;

import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: gp  reason: default package */
public final class gp {
    public final String a;
    public final int b;

    /* access modifiers changed from: package-private */
    /* renamed from: gp$a */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        private a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public static a a(String str) {
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < split.length; i3++) {
                String Q = f0.Q(split[i3].trim());
                Q.hashCode();
                if (Q.equals("name")) {
                    i = i3;
                } else if (Q.equals("alignment")) {
                    i2 = i3;
                }
            }
            if (i != -1) {
                return new a(i, i2, split.length);
            }
            return null;
        }
    }

    /* renamed from: gp$b */
    static final class b {
        private static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern d = Pattern.compile(f0.l("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern e = Pattern.compile(f0.l("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern f = Pattern.compile("\\\\an(\\d+)");
        public final int a;
        public final PointF b;

        private b(int i, PointF pointF) {
            this.a = i;
            this.b = pointF;
        }

        public static b a(String str) {
            Matcher matcher = c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String group = matcher.group(1);
                try {
                    PointF b2 = b(group);
                    if (b2 != null) {
                        pointF = b2;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f.matcher(group);
                    int c2 = matcher2.find() ? gp.c(matcher2.group(1)) : -1;
                    if (c2 != -1) {
                        i = c2;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i, pointF);
        }

        private static PointF b(String str) {
            String str2;
            String str3;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                String group = matcher2.group(1);
                str3 = matcher2.group(2);
                str2 = group;
            }
            str2.getClass();
            float parseFloat = Float.parseFloat(str2.trim());
            str3.getClass();
            return new PointF(parseFloat, Float.parseFloat(str3.trim()));
        }

        public static String c(String str) {
            return c.matcher(str).replaceAll("");
        }
    }

    private gp(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static gp b(String str, a aVar) {
        g.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = aVar.c;
        if (length != i) {
            f0.l("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str);
            return null;
        }
        try {
            return new gp(split[aVar.a].trim(), c(split[aVar.b]));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static int c(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
