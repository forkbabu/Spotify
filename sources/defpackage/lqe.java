package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.lqe;
import defpackage.lqe.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: lqe  reason: default package */
public abstract class lqe<E extends lqe<?, ?>, B extends a<E, B>> {
    private final rqe a;
    private final pqe b;
    private final List<String> c;
    private final transient String d;

    /* renamed from: lqe$a */
    static abstract class a<E extends lqe<?, ?>, B extends a<E, B>> {
        private rqe a;
        private pqe b;
        private List<String> c;

        a() {
        }

        static List<String> a(List<String> list, List<String> list2) {
            ArrayList arrayList = new ArrayList(list2.size() + (list != null ? list.size() : 0));
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.addAll(list2);
            return arrayList;
        }

        static List<String> b(List<String> list, String... strArr) {
            return a(list, Arrays.asList(strArr));
        }

        public E c() {
            pqe pqe = this.b;
            if (pqe == null) {
                pqe = pqe.b;
            }
            List<String> list = this.c;
            rqe rqe = this.a;
            tqe.c(rqe, "location");
            if (rqe == null) {
                return d(rqe.i, pqe, b(this.c, "No location!"));
            }
            List<String> a2 = this.a.a();
            if (!a2.isEmpty()) {
                list = a(list, a2);
            }
            List<String> a3 = pqe.a();
            if (!a3.isEmpty()) {
                list = a(list, a3);
            }
            return d(this.a, pqe, list);
        }

        /* access modifiers changed from: package-private */
        public abstract E d(rqe rqe, pqe pqe, List<String> list);

        public B e(rqe rqe) {
            tqe.a(rqe, "location");
            this.a = rqe;
            return this;
        }

        public B f(pqe pqe) {
            this.b = pqe;
            return this;
        }

        public B g(String str) {
            if (this.c == null) {
                this.c = new ArrayList(1);
            }
            List<String> list = this.c;
            tqe.a(str, AppProtocol.LogMessage.SEVERITY_ERROR);
            list.add(str);
            return this;
        }
    }

    lqe(rqe rqe, pqe pqe, List<String> list) {
        tqe.a(rqe, "location");
        this.a = rqe;
        tqe.a(pqe, "parent absolute location");
        this.b = pqe;
        if (list == null || list.isEmpty()) {
            this.c = Collections.emptyList();
        } else {
            this.c = Collections.unmodifiableList(list);
        }
        this.d = UUID.randomUUID().toString();
    }

    public final List<String> a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final rqe c() {
        return this.a;
    }

    public final pqe d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lqe lqe = (lqe) obj;
        if (this.a.equals(lqe.a) && this.b.equals(lqe.b)) {
            return this.c.equals(lqe.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0042: APUT  (r0v1 java.lang.Object[]), (2 ??[int, float, short, byte, char]), (r1v4 java.lang.String) */
    public String toString() {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = this.a;
        boolean z = true;
        objArr[1] = this.b;
        if (this.c.isEmpty()) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("; errors=");
            for (String str2 : this.c) {
                if (!z) {
                    sb.append(";");
                }
                sb.append(str2);
                z = false;
            }
            str = sb.toString();
        }
        objArr[2] = str;
        objArr[3] = this.d;
        return String.format("{where=%s; parent=%s%s}[id %s]", objArr);
    }
}
