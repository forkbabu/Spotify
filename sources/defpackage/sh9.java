package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.di9;
import java.util.Collection;
import java.util.List;

/* renamed from: sh9  reason: default package */
abstract class sh9 extends di9 {
    private final ImmutableList<di9.d> b;
    private final String c;
    private final String f;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final ImmutableList<di9.b> q;

    /* access modifiers changed from: package-private */
    /* renamed from: sh9$b */
    public static class b extends di9.a {
        private ImmutableList<di9.d> a;
        private String b;
        private String c;
        private String d;
        private Boolean e;
        private Boolean f;
        private ImmutableList<di9.b> g;

        b() {
        }

        @Override // defpackage.di9.a
        public di9 a() {
            String str = this.a == null ? " sortItems" : "";
            if (this.b == null) {
                str = je.x0(str, " showSortOptionsTitle");
            }
            if (this.c == null) {
                str = je.x0(str, " showTextFilterTitle");
            }
            if (this.d == null) {
                str = je.x0(str, " textFilterHint");
            }
            if (this.e == null) {
                str = je.x0(str, " showFiltersButton");
            }
            if (this.f == null) {
                str = je.x0(str, " showCancelButton");
            }
            if (this.g == null) {
                str = je.x0(str, " filterOptions");
            }
            if (str.isEmpty()) {
                return new ai9(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue(), this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.di9.a
        public di9.a b(ImmutableList<di9.b> immutableList) {
            if (immutableList != null) {
                this.g = immutableList;
                return this;
            }
            throw new NullPointerException("Null filterOptions");
        }

        @Override // defpackage.di9.a
        public di9.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.di9.a
        public di9.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.di9.a
        public di9.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null showSortOptionsTitle");
        }

        @Override // defpackage.di9.a
        public di9.a f(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null showTextFilterTitle");
        }

        @Override // defpackage.di9.a
        public di9.a g(List<di9.d> list) {
            this.a = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Override // defpackage.di9.a
        public di9.a h(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null textFilterHint");
        }

        b(di9 di9, a aVar) {
            this.a = di9.h();
            this.b = di9.f();
            this.c = di9.g();
            this.d = di9.i();
            this.e = Boolean.valueOf(di9.e());
            this.f = Boolean.valueOf(di9.c());
            this.g = di9.b();
        }
    }

    sh9(ImmutableList<di9.d> immutableList, String str, String str2, String str3, boolean z, boolean z2, ImmutableList<di9.b> immutableList2) {
        if (immutableList != null) {
            this.b = immutableList;
            if (str != null) {
                this.c = str;
                if (str2 != null) {
                    this.f = str2;
                    if (str3 != null) {
                        this.n = str3;
                        this.o = z;
                        this.p = z2;
                        if (immutableList2 != null) {
                            this.q = immutableList2;
                            return;
                        }
                        throw new NullPointerException("Null filterOptions");
                    }
                    throw new NullPointerException("Null textFilterHint");
                }
                throw new NullPointerException("Null showTextFilterTitle");
            }
            throw new NullPointerException("Null showSortOptionsTitle");
        }
        throw new NullPointerException("Null sortItems");
    }

    @Override // defpackage.di9
    public ImmutableList<di9.b> b() {
        return this.q;
    }

    @Override // defpackage.di9
    public boolean c() {
        return this.p;
    }

    @Override // defpackage.di9
    public boolean e() {
        return this.o;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof di9)) {
            return false;
        }
        di9 di9 = (di9) obj;
        if (!this.b.equals(di9.h()) || !this.c.equals(di9.f()) || !this.f.equals(di9.g()) || !this.n.equals(di9.i()) || this.o != di9.e() || this.p != di9.c() || !this.q.equals(di9.b())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.di9
    public String f() {
        return this.c;
    }

    @Override // defpackage.di9
    public String g() {
        return this.f;
    }

    @Override // defpackage.di9
    public ImmutableList<di9.d> h() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003;
        if (!this.p) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.di9
    public String i() {
        return this.n;
    }

    @Override // defpackage.di9
    public di9.a j() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FilterAndSortConfiguration{sortItems=");
        V0.append(this.b);
        V0.append(", showSortOptionsTitle=");
        V0.append(this.c);
        V0.append(", showTextFilterTitle=");
        V0.append(this.f);
        V0.append(", textFilterHint=");
        V0.append(this.n);
        V0.append(", showFiltersButton=");
        V0.append(this.o);
        V0.append(", showCancelButton=");
        V0.append(this.p);
        V0.append(", filterOptions=");
        V0.append(this.q);
        V0.append("}");
        return V0.toString();
    }
}
