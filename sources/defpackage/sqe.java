package defpackage;

import defpackage.tqe;
import java.util.Collections;
import java.util.List;

/* renamed from: sqe  reason: default package */
public final class sqe implements tqe.b {
    public static final sqe f = new sqe("", null, null, null, null);
    private final String a;
    private final String b;
    private final String c;
    private final Integer d;
    private final String e;

    /* renamed from: sqe$b */
    public static final class b {
        private String a;
        private String b;
        private String c;
        private Integer d;
        private String e;

        b(a aVar) {
        }

        public sqe a() {
            String str = this.a;
            tqe.a(str, "path node name");
            return new sqe(str, this.b, this.c, this.d, this.e, null);
        }

        public b b(String str) {
            this.b = str;
            return this;
        }

        public b c(String str) {
            tqe.a(str, "path node name");
            this.a = str;
            return this;
        }

        public b d(Integer num) {
            this.d = num;
            return this;
        }

        public b e(String str) {
            this.e = str;
            return this;
        }

        public b f(String str) {
            this.c = str;
            return this;
        }
    }

    private sqe(String str, String str2, String str3, Integer num, String str4) {
        tqe.a(str, "path node name");
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    private static boolean b(StringBuilder sb, String str, Object obj, boolean z) {
        if (obj == null) {
            return false;
        }
        if (z) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("=");
        sb.append(obj);
        return true;
    }

    public static b c() {
        return new b(null);
    }

    @Override // defpackage.tqe.b
    public List<String> a() {
        if (this.a.isEmpty()) {
            return Collections.singletonList("empty path node name");
        }
        return Collections.emptyList();
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sqe.class != obj.getClass()) {
            return false;
        }
        sqe sqe = (sqe) obj;
        if (!this.a.equals(sqe.a)) {
            return false;
        }
        String str = this.b;
        if ((str != null && !str.equals(sqe.b)) || (this.b == null && sqe.b != null)) {
            return false;
        }
        String str2 = this.c;
        if ((str2 != null && !str2.equals(sqe.c)) || (this.c == null && sqe.c != null)) {
            return false;
        }
        Integer num = this.d;
        if ((num != null && !num.equals(sqe.d)) || (this.d == null && sqe.d != null)) {
            return false;
        }
        String str3 = this.e;
        if (str3 != null && str3.equals(sqe.e)) {
            return true;
        }
        if (this.e == null && sqe.e == null) {
            return true;
        }
        return false;
    }

    public Integer f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        if (this.b == null && this.c == null && this.d == null && this.e == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("(");
        boolean b2 = b(sb, "id", this.b, false);
        boolean b3 = b2 & b(sb, "uri", this.c, b2);
        b(sb, "reason", this.e, b3 & b(sb, "pos", this.d, b3));
        sb.append(")");
        return sb.toString();
    }

    sqe(String str, String str2, String str3, Integer num, String str4, a aVar) {
        tqe.a(str, "path node name");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
    }
}
