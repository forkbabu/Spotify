package com.spotify.encore.consumer.elements.quickactions;

import kotlin.jvm.internal.h;

public final class Initials {
    private final int color;
    private final String initials;

    public Initials(String str, int i) {
        h.e(str, "initials");
        this.initials = str;
        this.color = i;
    }

    public static /* synthetic */ Initials copy$default(Initials initials2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = initials2.initials;
        }
        if ((i2 & 2) != 0) {
            i = initials2.color;
        }
        return initials2.copy(str, i);
    }

    public final String component1() {
        return this.initials;
    }

    public final int component2() {
        return this.color;
    }

    public final Initials copy(String str, int i) {
        h.e(str, "initials");
        return new Initials(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Initials)) {
            return false;
        }
        Initials initials2 = (Initials) obj;
        return h.a(this.initials, initials2.initials) && this.color == initials2.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        String str = this.initials;
        return ((str != null ? str.hashCode() : 0) * 31) + this.color;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Initials(initials=");
        V0.append(this.initials);
        V0.append(", color=");
        return je.B0(V0, this.color, ")");
    }
}
