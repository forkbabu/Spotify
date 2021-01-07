package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.i;
import defpackage.q19;

/* renamed from: m19  reason: default package */
final class m19 extends q19 {
    private final ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> b;
    private final Optional<YourLibraryPageId> c;
    private final i d;
    private final boolean e;
    private final ImmutableMap<YourLibraryPageId, LoadingState> f;

    m19(ImmutableSortedMap immutableSortedMap, Optional optional, i iVar, boolean z, ImmutableMap immutableMap, a aVar) {
        this.b = immutableSortedMap;
        this.c = optional;
        this.d = iVar;
        this.e = z;
        this.f = immutableMap;
    }

    @Override // defpackage.q19
    public Optional<YourLibraryPageId> a() {
        return this.c;
    }

    @Override // defpackage.q19
    public boolean b() {
        return this.e;
    }

    @Override // defpackage.q19
    public ImmutableMap<YourLibraryPageId, LoadingState> c() {
        return this.f;
    }

    @Override // defpackage.q19
    public ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> d() {
        return this.b;
    }

    @Override // defpackage.q19
    public q19.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q19)) {
            return false;
        }
        q19 q19 = (q19) obj;
        if (!this.b.equals(q19.d()) || !this.c.equals(q19.a()) || !this.d.equals(q19.g()) || this.e != q19.b() || !this.f.equals(q19.c())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.q19
    public i g() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryModel{pageConfiguration=");
        V0.append(this.b);
        V0.append(", focusedPageId=");
        V0.append(this.c);
        V0.append(", yourLibraryState=");
        V0.append(this.d);
        V0.append(", initialNavigationPerformed=");
        V0.append(this.e);
        V0.append(", loadingStateMap=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }

    /* renamed from: m19$b */
    static final class b extends q19.a {
        private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a;
        private Optional<YourLibraryPageId> b = Optional.absent();
        private i c;
        private Boolean d;
        private ImmutableMap<YourLibraryPageId, LoadingState> e;

        b() {
        }

        @Override // defpackage.q19.a
        public q19 a() {
            String str = this.a == null ? " pageConfiguration" : "";
            if (this.c == null) {
                str = je.x0(str, " yourLibraryState");
            }
            if (this.d == null) {
                str = je.x0(str, " initialNavigationPerformed");
            }
            if (this.e == null) {
                str = je.x0(str, " loadingStateMap");
            }
            if (str.isEmpty()) {
                return new m19(this.a, this.b, this.c, this.d.booleanValue(), this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.q19.a
        public q19.a b(Optional<YourLibraryPageId> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null focusedPageId");
        }

        @Override // defpackage.q19.a
        public q19.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.q19.a
        public q19.a d(ImmutableMap<YourLibraryPageId, LoadingState> immutableMap) {
            if (immutableMap != null) {
                this.e = immutableMap;
                return this;
            }
            throw new NullPointerException("Null loadingStateMap");
        }

        @Override // defpackage.q19.a
        public q19.a e(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
            if (immutableSortedMap != null) {
                this.a = immutableSortedMap;
                return this;
            }
            throw new NullPointerException("Null pageConfiguration");
        }

        @Override // defpackage.q19.a
        public q19.a f(i iVar) {
            if (iVar != null) {
                this.c = iVar;
                return this;
            }
            throw new NullPointerException("Null yourLibraryState");
        }

        b(q19 q19, a aVar) {
            this.a = q19.d();
            this.b = q19.a();
            this.c = q19.g();
            this.d = Boolean.valueOf(q19.b());
            this.e = q19.c();
        }
    }
}
