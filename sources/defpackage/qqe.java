package defpackage;

import defpackage.tqe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: qqe  reason: default package */
public final class qqe implements tqe.b {
    public static final qqe e = new qqe("", 0, "", null);
    private final String a;
    private final int b;
    private final String c;
    private final Map<String, String> d;

    /* renamed from: qqe$b */
    public static final class b {
        private String a;
        private int b;
        private String c;
        private Map<String, String> d;

        b(a aVar) {
        }

        public qqe a() {
            String str = this.a;
            tqe.a(str, "action name");
            String str2 = str;
            int i = this.b;
            String str3 = this.c;
            tqe.a(str3, "interaction type");
            return new qqe(str2, i, str3, this.d);
        }

        public b b(String str) {
            tqe.a(str, "interaction type");
            this.c = str;
            return this;
        }

        public b c(String str) {
            tqe.a(str, "action name");
            this.a = str;
            return this;
        }

        public b d(String str, Object obj) {
            if (this.d == null) {
                this.d = new HashMap(1);
            }
            Map<String, String> map = this.d;
            tqe.a(str, "parameter name");
            tqe.c(obj, "parameter value");
            map.put(str, obj != null ? String.valueOf(obj) : "");
            return this;
        }

        public b e(int i) {
            this.b = i;
            return this;
        }
    }

    public static b b() {
        return new b(null);
    }

    @Override // defpackage.tqe.b
    public List<String> a() {
        if (!this.a.isEmpty() && !this.c.isEmpty() && this.b > 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(3);
        if (this.a.isEmpty()) {
            arrayList.add("Empty action id");
        }
        if (this.b <= 0) {
            arrayList.add("Non-positive version");
        }
        if (this.c.isEmpty()) {
            arrayList.add("Empty interaction type");
        }
        return arrayList;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public Map<String, String> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qqe.class != obj.getClass()) {
            return false;
        }
        qqe qqe = (qqe) obj;
        if (this.b == qqe.b && this.a.equals(qqe.a) && this.c.equals(qqe.c)) {
            return this.d.equals(qqe.d);
        }
        return false;
    }

    public int f() {
        return this.b;
    }

    public int hashCode() {
        return this.d.hashCode() + je.Y0(this.c, ((this.a.hashCode() * 31) + this.b) * 31, 31);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0068: APUT  (r0v1 java.lang.Object[]), (3 ??[int, float, short, byte, char]), (r1v6 java.lang.String) */
    public String toString() {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = this.c;
        boolean z = true;
        objArr[1] = this.a;
        objArr[2] = Integer.valueOf(this.b);
        if (this.d.isEmpty()) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("(");
            for (Map.Entry<String, String> entry : this.d.entrySet()) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append(")");
            str = sb.toString();
        }
        objArr[3] = str;
        return String.format("{%s/%s%s%s}", objArr);
    }

    private qqe(String str, int i, String str2, Map<String, String> map) {
        tqe.a(str, "action name");
        this.a = str;
        this.b = i;
        tqe.a(str2, "interaction type");
        this.c = str2;
        this.d = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
    }
}
