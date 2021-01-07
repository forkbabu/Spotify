package com.spotify.libs.onboarding.allboarding.room;

import kotlin.jvm.internal.h;

public final class u {
    private final String a;
    private final String b;

    public u(String str, String str2) {
        h.e(str, "pickerUri");
        h.e(str2, "relatedPickerUri");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.a(this.a, uVar.a) && h.a(this.b, uVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RelatedPickerItemCrossRef(pickerUri=");
        V0.append(this.a);
        V0.append(", relatedPickerUri=");
        return je.I0(V0, this.b, ")");
    }
}
