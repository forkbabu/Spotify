package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem;
import defpackage.zb9;

/* renamed from: vb9  reason: default package */
final class vb9 extends zb9 {
    private final String b;
    private final ImmutableList<FilterTagsResponseItem> c;
    private final ImmutableMap<String, Boolean> d;

    /* renamed from: vb9$b */
    static final class b extends zb9.a {
        private String a;
        private ImmutableList<FilterTagsResponseItem> b;
        private ImmutableMap<String, Boolean> c;

        b() {
        }

        @Override // defpackage.zb9.a
        public zb9 a() {
            String str = this.a == null ? " contextUri" : "";
            if (this.b == null) {
                str = je.x0(str, " filterTagsItemList");
            }
            if (this.c == null) {
                str = je.x0(str, " filterStates");
            }
            if (str.isEmpty()) {
                return new vb9(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.zb9.a
        public zb9.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        @Override // defpackage.zb9.a
        public zb9.a c(ImmutableMap<String, Boolean> immutableMap) {
            if (immutableMap != null) {
                this.c = immutableMap;
                return this;
            }
            throw new NullPointerException("Null filterStates");
        }

        @Override // defpackage.zb9.a
        public zb9.a d(ImmutableList<FilterTagsResponseItem> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null filterTagsItemList");
        }

        b(zb9 zb9, a aVar) {
            this.a = zb9.a();
            this.b = zb9.c();
            this.c = zb9.b();
        }
    }

    vb9(String str, ImmutableList immutableList, ImmutableMap immutableMap, a aVar) {
        this.b = str;
        this.c = immutableList;
        this.d = immutableMap;
    }

    @Override // defpackage.zb9
    public String a() {
        return this.b;
    }

    @Override // defpackage.zb9
    public ImmutableMap<String, Boolean> b() {
        return this.d;
    }

    @Override // defpackage.zb9
    public ImmutableList<FilterTagsResponseItem> c() {
        return this.c;
    }

    @Override // defpackage.zb9
    public zb9.a d() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb9)) {
            return false;
        }
        zb9 zb9 = (zb9) obj;
        if (!this.b.equals(zb9.a()) || !this.c.equals(zb9.c()) || !this.d.equals(zb9.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("FilterTagsModel{contextUri=");
        V0.append(this.b);
        V0.append(", filterTagsItemList=");
        V0.append(this.c);
        V0.append(", filterStates=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
