package com.spotify.music.features.connectui.picker.frictionlessjoin.model;

import kotlin.jvm.internal.h;

public final class d {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final String e;

    public d(String str, String str2, String str3, boolean z, String str4) {
        je.x(str, "id", str2, "displayName", str4, "username");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && h.a(this.b, dVar.b) && h.a(this.c, dVar.c) && this.d == dVar.d && h.a(this.e, dVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("UiParticipant(id=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", imageUrl=");
        V0.append(this.c);
        V0.append(", isHost=");
        V0.append(this.d);
        V0.append(", username=");
        return je.I0(V0, this.e, ")");
    }
}
