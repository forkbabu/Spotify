package defpackage;

import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import defpackage.be6;
import java.util.List;

/* renamed from: xd6  reason: default package */
final class xd6 extends be6.a {
    private final j a;
    private final ve6 b;
    private final List<l> c;
    private final HomeMix d;

    /* access modifiers changed from: package-private */
    /* renamed from: xd6$b */
    public static final class b extends be6.a.AbstractC0059a {
        private j a;
        private ve6 b;
        private List<l> c;
        private HomeMix d;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.be6.a.AbstractC0059a
        public be6.a a() {
            String str = this.a == null ? " playlist" : "";
            if (this.b == null) {
                str = je.x0(str, " uiState");
            }
            if (this.c == null) {
                str = je.x0(str, " items");
            }
            if (str.isEmpty()) {
                return new xd6(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.be6.a.AbstractC0059a
        public be6.a.AbstractC0059a b(HomeMix homeMix) {
            this.d = homeMix;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.be6.a.AbstractC0059a
        public be6.a.AbstractC0059a c(List<l> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.be6.a.AbstractC0059a
        public be6.a.AbstractC0059a d(j jVar) {
            if (jVar != null) {
                this.a = jVar;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.be6.a.AbstractC0059a
        public be6.a.AbstractC0059a e(ve6 ve6) {
            this.b = ve6;
            return this;
        }
    }

    xd6(j jVar, ve6 ve6, List list, HomeMix homeMix, a aVar) {
        this.a = jVar;
        this.b = ve6;
        this.c = list;
        this.d = homeMix;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.be6.a
    public HomeMix a() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.be6.a
    public List<l> b() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.be6.a
    public j c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.be6.a
    public ve6 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof be6.a)) {
            return false;
        }
        be6.a aVar = (be6.a) obj;
        if (this.a.equals(aVar.c()) && this.b.equals(aVar.d()) && this.c.equals(aVar.b())) {
            HomeMix homeMix = this.d;
            if (homeMix == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (homeMix.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        HomeMix homeMix = this.d;
        return hashCode ^ (homeMix == null ? 0 : homeMix.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMixItemContext{playlist=");
        V0.append(this.a);
        V0.append(", uiState=");
        V0.append(this.b);
        V0.append(", items=");
        V0.append(this.c);
        V0.append(", homeMix=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
