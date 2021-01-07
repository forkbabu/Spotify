package defpackage;

import defpackage.fg9;
import java.util.Date;

/* access modifiers changed from: package-private */
/* renamed from: yf9  reason: default package */
public final class yf9 extends fg9 {
    private final Date c;
    private final String d;

    /* access modifiers changed from: package-private */
    /* renamed from: yf9$b */
    public static final class b implements fg9.b {
        private Date a;
        private String b;

        b() {
        }

        public fg9 a() {
            return new yf9(this.a, this.b, null);
        }

        public fg9.b b(Date date) {
            this.a = date;
            return this;
        }

        public fg9.b c(String str) {
            this.b = str;
            return this;
        }
    }

    yf9(Date date, String str, a aVar) {
        this.c = date;
        this.d = str;
    }

    @Override // defpackage.fg9
    public Date b() {
        return this.c;
    }

    @Override // defpackage.fg9
    public String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fg9)) {
            return false;
        }
        fg9 fg9 = (fg9) obj;
        Date date = this.c;
        if (date != null ? date.equals(fg9.b()) : fg9.b() == null) {
            String str = this.d;
            if (str == null) {
                if (fg9.d() == null) {
                    return true;
                }
            } else if (str.equals(fg9.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Date date = this.c;
        int i = 0;
        int hashCode = ((date == null ? 0 : date.hashCode()) ^ 1000003) * 1000003;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("QuickScrollInfo{date=");
        V0.append(this.c);
        V0.append(", label=");
        return je.I0(V0, this.d, "}");
    }
}
