package defpackage;

import com.spotify.libs.search.history.SearchHistoryItem;

/* access modifiers changed from: package-private */
/* renamed from: vya  reason: default package */
public final class vya extends eza {
    private final SearchHistoryItem a;
    private final String b;
    private final boolean c;

    vya(SearchHistoryItem searchHistoryItem, String str, boolean z) {
        if (searchHistoryItem != null) {
            this.a = searchHistoryItem;
            if (str != null) {
                this.b = str;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null historyItem");
    }

    @Override // defpackage.eza
    public SearchHistoryItem b() {
        return this.a;
    }

    @Override // defpackage.eza
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.eza
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eza)) {
            return false;
        }
        eza eza = (eza) obj;
        if (!this.a.equals(eza.b()) || !this.b.equals(eza.d()) || this.c != eza.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchResultItem{historyItem=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", isHistory=");
        return je.P0(V0, this.c, "}");
    }
}
