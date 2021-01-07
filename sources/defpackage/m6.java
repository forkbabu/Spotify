package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: m6  reason: default package */
public final class m6 {
    public static final m6 c = new m6(new Bundle(), null);
    private final Bundle a;
    List<String> b;

    /* renamed from: m6$a */
    public static final class a {
        private ArrayList<String> a;

        public a() {
        }

        public a a(String str) {
            if (str != null) {
                if (this.a == null) {
                    this.a = new ArrayList<>();
                }
                if (!this.a.contains(str)) {
                    this.a.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        public a b(m6 m6Var) {
            if (m6Var != null) {
                m6Var.b();
                List<String> list = m6Var.b;
                if (list != null) {
                    if (!list.isEmpty()) {
                        for (String str : list) {
                            a(str);
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException("categories must not be null");
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public m6 c() {
            if (this.a == null) {
                return m6.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new m6(bundle, this.a);
        }

        public a(m6 m6Var) {
            if (m6Var != null) {
                m6Var.b();
                if (!m6Var.b.isEmpty()) {
                    this.a = new ArrayList<>(m6Var.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    m6(Bundle bundle, List<String> list) {
        this.a = bundle;
        this.b = list;
    }

    public static m6 c(Bundle bundle) {
        if (bundle != null) {
            return new m6(bundle, null);
        }
        return null;
    }

    public Bundle a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public boolean d() {
        b();
        return this.b.isEmpty();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        b();
        m6Var.b();
        return this.b.equals(m6Var.b);
    }

    public int hashCode() {
        b();
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("MediaRouteSelector{ ", "controlCategories=");
        b();
        Z0.append(Arrays.toString(this.b.toArray()));
        Z0.append(" }");
        return Z0.toString();
    }
}
