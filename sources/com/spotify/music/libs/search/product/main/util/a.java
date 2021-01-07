package com.spotify.music.libs.search.product.main.util;

import com.google.common.base.Optional;
import com.spotify.music.libs.search.product.main.util.SearchModelParcelable;
import org.apache.commons.lang3.tuple.Pair;

/* access modifiers changed from: package-private */
public abstract class a extends SearchModelParcelable {
    private final String a;
    private final Optional<Pair<SearchModelParcelable.SearchResultType, Object>> b;
    private final Optional<SearchModelParcelable.SearchErrorType> c;

    a(String str, Optional<Pair<SearchModelParcelable.SearchResultType, Object>> optional, Optional<SearchModelParcelable.SearchErrorType> optional2) {
        if (str != null) {
            this.a = str;
            if (optional != null) {
                this.b = optional;
                if (optional2 != null) {
                    this.c = optional2;
                    return;
                }
                throw new NullPointerException("Null error");
            }
            throw new NullPointerException("Null result");
        }
        throw new NullPointerException("Null query");
    }

    @Override // com.spotify.music.libs.search.product.main.util.SearchModelParcelable
    public Optional<SearchModelParcelable.SearchErrorType> b() {
        return this.c;
    }

    @Override // com.spotify.music.libs.search.product.main.util.SearchModelParcelable
    public String c() {
        return this.a;
    }

    @Override // com.spotify.music.libs.search.product.main.util.SearchModelParcelable
    public Optional<Pair<SearchModelParcelable.SearchResultType, Object>> e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchModelParcelable)) {
            return false;
        }
        SearchModelParcelable searchModelParcelable = (SearchModelParcelable) obj;
        if (!this.a.equals(searchModelParcelable.c()) || !this.b.equals(searchModelParcelable.e()) || !this.c.equals(searchModelParcelable.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SearchModelParcelable{query=");
        V0.append(this.a);
        V0.append(", result=");
        V0.append(this.b);
        V0.append(", error=");
        return je.F0(V0, this.c, "}");
    }
}
