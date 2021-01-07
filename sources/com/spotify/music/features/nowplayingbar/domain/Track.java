package com.spotify.music.features.nowplayingbar.domain;

import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class Track {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final Type h;

    public enum Type {
        AD,
        INTERRUPTION,
        TRACK
    }

    public Track(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, Type type) {
        h.e(str, "uid");
        h.e(str2, "uri");
        h.e(str3, "title");
        h.e(str4, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(type, "type");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
        this.h = type;
    }

    public final boolean a() {
        return this.e;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final Type e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        return h.a(this.a, track.a) && h.a(this.b, track.b) && h.a(this.c, track.c) && h.a(this.d, track.d) && this.e == track.e && this.f == track.f && h.a(this.g, track.g) && h.a(this.h, track.h);
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.b;
    }

    public final boolean h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.e;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        boolean z2 = this.f;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (i6 + i2) * 31;
        String str5 = this.g;
        int hashCode5 = (i7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Type type = this.h;
        if (type != null) {
            i = type.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Track(uid=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", subtitle=");
        V0.append(this.d);
        V0.append(", canAddToCollection=");
        V0.append(this.e);
        V0.append(", isInCollection=");
        V0.append(this.f);
        V0.append(", coverArtUri=");
        V0.append(this.g);
        V0.append(", type=");
        V0.append(this.h);
        V0.append(")");
        return V0.toString();
    }
}
