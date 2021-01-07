package defpackage;

import com.google.common.base.Optional;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: i87  reason: default package */
public final class i87 extends k87 {
    private final Optional<String> a;
    private final String b;
    private final String c;
    private final List<j87> d;
    private final boolean e;

    i87(Optional<String> optional, String str, String str2, List<j87> list, boolean z) {
        if (optional != null) {
            this.a = optional;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (list != null) {
                        this.d = list;
                        this.e = z;
                        return;
                    }
                    throw new NullPointerException("Null trackListViewModelItems");
                }
                throw new NullPointerException("Null trackListEpisodeUri");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null imageUri");
    }

    @Override // defpackage.k87
    public boolean a() {
        return this.e;
    }

    @Override // defpackage.k87
    public Optional<String> c() {
        return this.a;
    }

    @Override // defpackage.k87
    public String d() {
        return this.b;
    }

    @Override // defpackage.k87
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k87)) {
            return false;
        }
        k87 k87 = (k87) obj;
        if (!this.a.equals(k87.c()) || !this.b.equals(k87.d()) || !this.c.equals(k87.e()) || !this.d.equals(k87.f()) || this.e != k87.a()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.k87
    public List<j87> f() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListViewModel{imageUri=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", trackListEpisodeUri=");
        V0.append(this.c);
        V0.append(", trackListViewModelItems=");
        V0.append(this.d);
        V0.append(", canUpsell=");
        return je.P0(V0, this.e, "}");
    }
}
