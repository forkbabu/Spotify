package defpackage;

import defpackage.sqe;
import defpackage.tqe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rqe  reason: default package */
public final class rqe implements tqe.b {
    public static final rqe i = new rqe("", "", "", Collections.singletonList(sqe.f), Boolean.FALSE, "", "");
    private final String a;
    private final String b;
    private final String c;
    private final sqe d;
    private final List<sqe> e;
    private final Boolean f;
    private final String g;
    private final String h;

    /* renamed from: rqe$b */
    public static final class b {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private List<sqe> i;
        private Boolean j;
        private String k;
        private String l;

        private b() {
        }

        public b a(String str) {
            this.l = str;
            return this;
        }

        public b b(String str) {
            this.k = str;
            return this;
        }

        public b c(String str) {
            tqe.a(str, "app");
            this.h = str;
            return this;
        }

        public rqe d() {
            List<sqe> list = this.i;
            ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 1);
            sqe.b c2 = sqe.c();
            String str = this.a;
            tqe.a(str, "spec id");
            c2.c(str);
            c2.b(this.b);
            c2.f(this.d);
            c2.d(this.c);
            c2.e(this.e);
            arrayList.add(c2.a());
            List<sqe> list2 = this.i;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            String str2 = this.f;
            String str3 = this.g;
            String str4 = this.h;
            tqe.a(str4, "app");
            return new rqe(str2, str3, str4, arrayList, this.j, this.k, this.l);
        }

        public b e(String str) {
            this.g = str;
            return this;
        }

        public b f(Boolean bool) {
            this.j = bool;
            return this;
        }

        public b g(String str) {
            this.b = str;
            return this;
        }

        public b h(Integer num) {
            this.c = num;
            return this;
        }

        public b i(String str) {
            this.e = str;
            return this;
        }

        public b j(String str) {
            this.d = str;
            return this;
        }

        public b k(List<sqe> list) {
            tqe.a(list, "path");
            this.i = new ArrayList(list);
            return this;
        }

        public b l(String str) {
            tqe.a(str, "spec id");
            this.a = str;
            return this;
        }

        public b m(String str) {
            this.f = str;
            return this;
        }

        public b n(sqe sqe) {
            if (this.i == null) {
                this.i = new ArrayList(1);
            }
            List<sqe> list = this.i;
            tqe.a(sqe, "path node");
            list.add(sqe);
            return this;
        }

        b(a aVar) {
        }
    }

    public static b e() {
        return new b(null);
    }

    @Override // defpackage.tqe.b
    public List<String> a() {
        List<String> b2 = tqe.b(this.e);
        if (!n().isEmpty() && !this.c.isEmpty() && b2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(b2.size() + 4);
        arrayList.addAll(b2);
        if (n().isEmpty()) {
            arrayList.add("spec id is empty");
        }
        if (this.c.isEmpty()) {
            arrayList.add("app is empty");
        }
        return arrayList;
    }

    public String b() {
        String str = this.h;
        return str == null ? "" : str;
    }

    public String c() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rqe.class != obj.getClass()) {
            return false;
        }
        rqe rqe = (rqe) obj;
        if (!this.a.equals(rqe.a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? rqe.b != null : !str.equals(rqe.b)) {
            return false;
        }
        if (!this.c.equals(rqe.c) || !this.d.equals(rqe.d) || !this.e.equals(rqe.e) || !this.f.equals(rqe.f)) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null ? rqe.g != null : !str2.equals(rqe.g)) {
            return false;
        }
        String str3 = this.h;
        if (str3 != null) {
            return str3.equals(rqe.h);
        }
        if (rqe.h == null) {
            return true;
        }
        return false;
    }

    public String f() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public Boolean g() {
        return this.f;
    }

    public String h() {
        return this.d.d();
    }

    public int hashCode() {
        int i2;
        int i3;
        int hashCode = this.a.hashCode();
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode() + (hashCode * 31);
        } else {
            i2 = 0;
        }
        int Y0 = je.Y0(this.c, i2 * 31, 31);
        int hashCode2 = this.e.hashCode();
        int hashCode3 = this.f.hashCode() + ((hashCode2 + ((this.d.hashCode() + Y0) * 31)) * 31);
        String str2 = this.g;
        if (str2 != null) {
            i3 = str2.hashCode() + (hashCode3 * 31);
        } else {
            i3 = 0;
        }
        String str3 = this.h;
        if (str3 == null) {
            return 0;
        }
        return str3.hashCode() + (i3 * 31);
    }

    public Integer i() {
        return this.d.f();
    }

    public String j() {
        return this.d.g();
    }

    public String k() {
        return this.d.h();
    }

    public List<sqe> l() {
        List<sqe> list = this.e;
        return list.subList(1, list.size());
    }

    public List<sqe> m() {
        return this.e;
    }

    public String n() {
        return this.d.e();
    }

    public String o() {
        return this.a;
    }

    public b p() {
        b e2 = e();
        e2.c(this.c);
        e2.e(f());
        e2.l(n());
        e2.m(this.a);
        e2.g(this.d.d());
        e2.j(this.d.h());
        e2.h(this.d.f());
        e2.i(j());
        e2.k(l());
        e2.f(this.f);
        e2.b(c());
        e2.a(b());
        return e2;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x003c: APUT  (r0v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r1v3 java.lang.String) */
    public String toString() {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = this.c;
        if (this.e.isEmpty()) {
            str = "no path";
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (sqe sqe : this.e) {
                if (!z) {
                    sb.append("/");
                }
                sb.append(sqe);
                z = false;
            }
            str = sb.toString();
        }
        objArr[1] = str;
        objArr[2] = this.a;
        objArr[3] = this.b;
        return String.format("[%s][%s] <spec version %s><generator version %s>", objArr);
    }

    private rqe(String str, String str2, String str3, List<sqe> list, Boolean bool, String str4, String str5) {
        tqe.a(str, "specification version");
        this.a = str;
        this.b = str2;
        tqe.a(str3, "app");
        this.c = str3;
        tqe.a(list, "path");
        this.e = Collections.unmodifiableList(list);
        this.d = list.get(0);
        if (bool != null) {
            this.f = bool;
        } else {
            this.f = Boolean.FALSE;
        }
        this.g = str4;
        this.h = str5;
    }
}
