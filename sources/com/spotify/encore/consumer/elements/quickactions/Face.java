package com.spotify.encore.consumer.elements.quickactions;

import kotlin.jvm.internal.h;

public final class Face {
    private final String imageUrl;
    private final Initials initials;

    public Face(String str, Initials initials2) {
        h.e(initials2, "initials");
        this.imageUrl = str;
        this.initials = initials2;
    }

    public static /* synthetic */ Face copy$default(Face face, String str, Initials initials2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = face.imageUrl;
        }
        if ((i & 2) != 0) {
            initials2 = face.initials;
        }
        return face.copy(str, initials2);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final Initials component2() {
        return this.initials;
    }

    public final Face copy(String str, Initials initials2) {
        h.e(initials2, "initials");
        return new Face(str, initials2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Face)) {
            return false;
        }
        Face face = (Face) obj;
        return h.a(this.imageUrl, face.imageUrl) && h.a(this.initials, face.initials);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Initials getInitials() {
        return this.initials;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Initials initials2 = this.initials;
        if (initials2 != null) {
            i = initials2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Face(imageUrl=");
        V0.append(this.imageUrl);
        V0.append(", initials=");
        V0.append(this.initials);
        V0.append(")");
        return V0.toString();
    }
}
