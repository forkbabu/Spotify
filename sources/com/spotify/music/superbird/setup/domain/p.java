package com.spotify.music.superbird.setup.domain;

import kotlin.jvm.internal.h;

public final class p {
    private final SetupStep a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final c g;
    private final boolean h;
    private final boolean i;
    private final Mount j;

    static {
        boolean z = true & true;
        boolean z2 = true & true;
        boolean z3 = true & true;
        boolean z4 = true & true;
        h.e(SetupStep.WELCOME, "step");
    }

    public p(SetupStep setupStep, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, c cVar, boolean z6, boolean z7, Mount mount) {
        h.e(setupStep, "step");
        this.a = setupStep;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = cVar;
        this.h = z6;
        this.i = z7;
        this.j = mount;
    }

    public static p a(p pVar, SetupStep setupStep, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, c cVar, boolean z6, boolean z7, Mount mount, int i2) {
        SetupStep setupStep2 = (i2 & 1) != 0 ? pVar.a : setupStep;
        boolean z8 = (i2 & 2) != 0 ? pVar.b : z;
        boolean z9 = (i2 & 4) != 0 ? pVar.c : z2;
        boolean z10 = (i2 & 8) != 0 ? pVar.d : z3;
        boolean z11 = (i2 & 16) != 0 ? pVar.e : z4;
        boolean z12 = (i2 & 32) != 0 ? pVar.f : z5;
        c cVar2 = (i2 & 64) != 0 ? pVar.g : cVar;
        boolean z13 = (i2 & 128) != 0 ? pVar.h : z6;
        boolean z14 = (i2 & 256) != 0 ? pVar.i : z7;
        Mount mount2 = (i2 & 512) != 0 ? pVar.j : mount;
        pVar.getClass();
        h.e(setupStep2, "step");
        return new p(setupStep2, z8, z9, z10, z11, z12, cVar2, z13, z14, mount2);
    }

    public final c b() {
        return this.g;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.i;
    }

    public final Mount e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.a(this.a, pVar.a) && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && h.a(this.g, pVar.g) && this.h == pVar.h && this.i == pVar.i && h.a(this.j, pVar.j);
    }

    public final SetupStep f() {
        return this.a;
    }

    public final boolean g() {
        return this.c;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        SetupStep setupStep = this.a;
        int i2 = 0;
        int hashCode = (setupStep != null ? setupStep.hashCode() : 0) * 31;
        boolean z = this.b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.e;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z5 = this.f;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        c cVar = this.g;
        int hashCode2 = (i23 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        boolean z6 = this.h;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (hashCode2 + i24) * 31;
        boolean z7 = this.i;
        if (!z7) {
            i3 = z7 ? 1 : 0;
        }
        int i28 = (i27 + i3) * 31;
        Mount mount = this.j;
        if (mount != null) {
            i2 = mount.hashCode();
        }
        return i28 + i2;
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        return this.d;
    }

    public final boolean k() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetupModel(step=");
        V0.append(this.a);
        V0.append(", bluetoothEnabled=");
        V0.append(this.b);
        V0.append(", superbirdConnected=");
        V0.append(this.c);
        V0.append(", isOnline=");
        V0.append(this.d);
        V0.append(", superbirdFound=");
        V0.append(this.e);
        V0.append(", isWifiConnected=");
        V0.append(this.f);
        V0.append(", availableUpdates=");
        V0.append(this.g);
        V0.append(", isDownloading=");
        V0.append(this.h);
        V0.append(", hasSelectedToDownloadOverWiFi=");
        V0.append(this.i);
        V0.append(", selectedMount=");
        V0.append(this.j);
        V0.append(")");
        return V0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(SetupStep setupStep, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, c cVar, boolean z6, boolean z7, Mount mount, int i2) {
        this(setupStep, z, z2, z3, (i2 & 16) != 0 ? false : z4, z5, null, (i2 & 128) != 0 ? false : z6, (i2 & 256) != 0 ? false : z7, null);
        int i3 = i2 & 512;
    }
}
