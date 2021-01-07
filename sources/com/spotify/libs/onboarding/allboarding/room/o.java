package com.spotify.libs.onboarding.allboarding.room;

import kotlin.jvm.internal.h;

public final class o {
    private final int a;
    private final String b;
    private final String c;

    public o(int i, String str, String str2) {
        h.e(str, "pickerUri");
        h.e(str2, "sectionId");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && h.a(this.b, oVar.b) && h.a(this.c, oVar.c);
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PickerSectionCrossRef(sortOrder=");
        V0.append(this.a);
        V0.append(", pickerUri=");
        V0.append(this.b);
        V0.append(", sectionId=");
        return je.I0(V0, this.c, ")");
    }
}
