package com.spotify.libs.onboarding.allboarding.picker;

import com.spotify.libs.onboarding.allboarding.room.AllboardingSearch;
import com.spotify.libs.onboarding.allboarding.room.v;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class y {
    private final String a;
    private final c b;
    private final c c;
    private final List<v> d;
    private final AllboardingSearch e;
    private final boolean f;
    private final boolean g;

    public y(String str, c cVar, c cVar2, List<v> list, AllboardingSearch allboardingSearch, boolean z, boolean z2) {
        h.e(list, "sections");
        this.a = str;
        this.b = cVar;
        this.c = cVar2;
        this.d = list;
        this.e = allboardingSearch;
        this.f = z;
        this.g = z2;
    }

    public final boolean a() {
        return this.g;
    }

    public final c b() {
        return this.b;
    }

    public final AllboardingSearch c() {
        return this.e;
    }

    public final c d() {
        return this.c;
    }

    public final List<v> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.a(this.a, yVar.a) && h.a(this.b, yVar.b) && h.a(this.c, yVar.c) && h.a(this.d, yVar.d) && h.a(this.e, yVar.e) && this.f == yVar.f && this.g == yVar.g;
    }

    public final String f() {
        return this.a;
    }

    public final boolean g() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        c cVar2 = this.c;
        int hashCode3 = (hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        List<v> list = this.d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        AllboardingSearch allboardingSearch = this.e;
        if (allboardingSearch != null) {
            i = allboardingSearch.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.g;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("UiViewModel(title=");
        V0.append(this.a);
        V0.append(", primaryActionButton=");
        V0.append(this.b);
        V0.append(", secondaryActionButton=");
        V0.append(this.c);
        V0.append(", sections=");
        V0.append(this.d);
        V0.append(", search=");
        V0.append(this.e);
        V0.append(", isLoading=");
        V0.append(this.f);
        V0.append(", hasError=");
        return je.P0(V0, this.g, ")");
    }

    public y() {
        this(null, null, null, EmptyList.a, null, false, false);
    }
}
