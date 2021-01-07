package okhttp3;

import java.util.ArrayList;
import java.util.List;
import okio.e;
import okio.f;

public final class r extends c0 {
    private static final w c = w.c("application/x-www-form-urlencoded");
    private final List<String> a;
    private final List<String> b;

    public static final class a {
        private final List<String> a = new ArrayList();
        private final List<String> b = new ArrayList();

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.a.add(u.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
                this.b.add(u.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.a.add(u.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, null));
                this.b.add(u.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, null));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public r c() {
            return new r(this.a, this.b);
        }
    }

    r(List<String> list, List<String> list2) {
        this.a = rnf.q(list);
        this.b = rnf.q(list2);
    }

    private long g(f fVar, boolean z) {
        e eVar;
        if (z) {
            eVar = new e();
        } else {
            eVar = fVar.c();
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVar.J(38);
            }
            eVar.b0(this.a.get(i));
            eVar.J(61);
            eVar.b0(this.b.get(i));
        }
        if (!z) {
            return 0;
        }
        long size2 = eVar.size();
        eVar.b();
        return size2;
    }

    @Override // okhttp3.c0
    public long a() {
        return g(null, true);
    }

    @Override // okhttp3.c0
    public w b() {
        return c;
    }

    @Override // okhttp3.c0
    public void f(f fVar) {
        g(fVar, false);
    }
}
