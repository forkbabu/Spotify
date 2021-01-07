package com.spotify.music.nowplaying.scroll.widgets.upnext;

import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class a {
    private final ContextTrack a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public a(ContextTrack contextTrack, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        h.e(contextTrack, "contextTrack");
        h.e(str, "trackUri");
        h.e(str3, "title");
        h.e(str4, ContextTrack.Metadata.KEY_SUBTITLE);
        this.a = contextTrack;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final ContextTrack a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public int hashCode() {
        ContextTrack contextTrack = this.a;
        int i2 = 0;
        int hashCode = (contextTrack != null ? contextTrack.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        int i3 = (hashCode5 + i2) * 31;
        boolean z = this.g;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        boolean z2 = this.h;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        boolean z3 = this.i;
        if (!z3) {
            i4 = z3 ? 1 : 0;
        }
        return i12 + i4;
    }

    public final boolean i() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpNextTrackViewModel(contextTrack=");
        V0.append(this.a);
        V0.append(", trackUri=");
        V0.append(this.b);
        V0.append(", contextUri=");
        V0.append(this.c);
        V0.append(", title=");
        V0.append(this.d);
        V0.append(", subtitle=");
        V0.append(this.e);
        V0.append(", imageUri=");
        V0.append(this.f);
        V0.append(", is19Plus=");
        V0.append(this.g);
        V0.append(", isExplicit=");
        V0.append(this.h);
        V0.append(", isPodcast=");
        return je.P0(V0, this.i, ")");
    }
}
