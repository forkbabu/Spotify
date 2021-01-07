package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.music.sociallistening.models.Participant;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: r8d  reason: default package */
public final class r8d {
    private final boolean a;
    private final boolean b;
    private final long c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final String l;
    private final List<Participant> m;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    public r8d() {
        this(false, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, AudioDriver.SPOTIFY_MAX_VOLUME);
    }

    public r8d(boolean z, long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, String str3, List<Participant> list, String str4, boolean z8, boolean z9, boolean z10) {
        h.e(list, "participants");
        this.b = z;
        this.c = j2;
        this.d = str;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = str2;
        this.l = str3;
        this.m = list;
        this.n = str4;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.a = list.size() >= 2;
    }

    public static r8d b(r8d r8d, boolean z, long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, String str3, List list, String str4, boolean z8, boolean z9, boolean z10, int i2) {
        boolean z11 = (i2 & 1) != 0 ? r8d.b : z;
        long j3 = (i2 & 2) != 0 ? r8d.c : j2;
        String str5 = (i2 & 4) != 0 ? r8d.d : str;
        boolean z12 = (i2 & 8) != 0 ? r8d.e : z2;
        boolean z13 = (i2 & 16) != 0 ? r8d.f : z3;
        boolean z14 = (i2 & 32) != 0 ? r8d.g : z4;
        boolean z15 = (i2 & 64) != 0 ? r8d.h : z5;
        boolean z16 = (i2 & 128) != 0 ? r8d.i : z6;
        boolean z17 = (i2 & 256) != 0 ? r8d.j : z7;
        String str6 = (i2 & 512) != 0 ? r8d.k : str2;
        String str7 = (i2 & 1024) != 0 ? r8d.l : str3;
        List list2 = (i2 & 2048) != 0 ? r8d.m : list;
        String str8 = (i2 & 4096) != 0 ? r8d.n : str4;
        boolean z18 = (i2 & 8192) != 0 ? r8d.o : z8;
        boolean z19 = (i2 & 16384) != 0 ? r8d.p : z9;
        boolean z20 = (i2 & 32768) != 0 ? r8d.q : z10;
        r8d.getClass();
        h.e(list2, "participants");
        return new r8d(z11, j3, str5, z12, z13, z14, z15, z16, z17, str6, str7, list2, str8, z18, z19, z20);
    }

    public final r8d a() {
        return b(this, false, 0, null, false, false, false, false, false, false, null, null, EmptyList.a, null, false, false, false, 36867);
    }

    public final String c() {
        return this.n;
    }

    public final boolean d() {
        return this.p;
    }

    public final String e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8d)) {
            return false;
        }
        r8d r8d = (r8d) obj;
        return this.b == r8d.b && this.c == r8d.c && h.a(this.d, r8d.d) && this.e == r8d.e && this.f == r8d.f && this.g == r8d.g && this.h == r8d.h && this.i == r8d.i && this.j == r8d.j && h.a(this.k, r8d.k) && h.a(this.l, r8d.l) && h.a(this.m, r8d.m) && h.a(this.n, r8d.n) && this.o == r8d.o && this.p == r8d.p && this.q == r8d.q;
    }

    public final String f() {
        return this.l;
    }

    public final boolean g() {
        return this.g;
    }

    public final List<Participant> h() {
        return this.m;
    }

    public int hashCode() {
        boolean z = this.b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int a2 = ((i3 * 31) + e.a(this.c)) * 31;
        String str = this.d;
        int i6 = 0;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z2 = this.e;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode + i7) * 31;
        boolean z3 = this.f;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.g;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.h;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z6 = this.i;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        boolean z7 = this.j;
        if (z7) {
            z7 = true;
        }
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        String str2 = this.k;
        int hashCode2 = (i30 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.l;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Participant> list = this.m;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.n;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        int i31 = (hashCode4 + i6) * 31;
        boolean z8 = this.o;
        if (z8) {
            z8 = true;
        }
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int i34 = z8 ? 1 : 0;
        int i35 = (i31 + i32) * 31;
        boolean z9 = this.p;
        if (z9) {
            z9 = true;
        }
        int i36 = z9 ? 1 : 0;
        int i37 = z9 ? 1 : 0;
        int i38 = z9 ? 1 : 0;
        int i39 = (i35 + i36) * 31;
        boolean z10 = this.q;
        if (!z10) {
            i2 = z10 ? 1 : 0;
        }
        return i39 + i2;
    }

    public final boolean i() {
        return this.j;
    }

    public final String j() {
        return this.d;
    }

    public final boolean k() {
        return this.o;
    }

    public final long l() {
        return this.c;
    }

    public final boolean m() {
        return this.a;
    }

    public final boolean n() {
        return this.e;
    }

    public final boolean o() {
        return this.b;
    }

    public final boolean p() {
        return this.h;
    }

    public final boolean q() {
        return this.f;
    }

    public final boolean r() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SocialListeningImplModel(isInitialized=");
        V0.append(this.b);
        V0.append(", timestamp=");
        V0.append(this.c);
        V0.append(", sessionId=");
        V0.append(this.d);
        V0.append(", isHost=");
        V0.append(this.e);
        V0.append(", isObtainingSession=");
        V0.append(this.f);
        V0.append(", obtainSessionFailed=");
        V0.append(this.g);
        V0.append(", isJoiningSession=");
        V0.append(this.h);
        V0.append(", isTerminatingSession=");
        V0.append(this.i);
        V0.append(", sessionDeleted=");
        V0.append(this.j);
        V0.append(", joinToken=");
        V0.append(this.k);
        V0.append(", joinUri=");
        V0.append(this.l);
        V0.append(", participants=");
        V0.append(this.m);
        V0.append(", currentUsername=");
        V0.append(this.n);
        V0.append(", sessionShared=");
        V0.append(this.o);
        V0.append(", hasBeenJoinedByOther=");
        V0.append(this.p);
        V0.append(", nearbyEnabled=");
        return je.P0(V0, this.q, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8d(boolean z, long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, String str3, List list, String str4, boolean z8, boolean z9, boolean z10, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : j2, null, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? false : z6, (i2 & 256) != 0 ? false : z7, null, null, (i2 & 2048) != 0 ? EmptyList.a : null, (i2 & 4096) == 0 ? str4 : null, (i2 & 8192) != 0 ? false : z8, (i2 & 16384) != 0 ? false : z9, (i2 & 32768) != 0 ? false : z10);
        int i3 = i2 & 4;
        int i4 = i2 & 512;
        int i5 = i2 & 1024;
    }
}
