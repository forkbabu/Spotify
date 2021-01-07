package com.spotify.music.sociallistening.models;

import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    public static final b n = new b(false, false, false, false, false, false, false, false, false, null, null, null, false, 8191);
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final String j;
    private final String k;
    private final List<Participant> l;
    private final boolean m;

    public b() {
        this(false, false, false, false, false, false, false, false, false, null, null, null, false, 8191);
    }

    public b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, String str2, List<Participant> list, boolean z10) {
        h.e(str, "joinToken");
        h.e(str2, "joinUri");
        h.e(list, "participants");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = str;
        this.k = str2;
        this.l = list;
        this.m = z10;
    }

    public final boolean a() {
        return this.h;
    }

    public final String b() {
        return this.j;
    }

    public final String c() {
        return this.k;
    }

    public final List<Participant> d() {
        return this.l;
    }

    public final boolean e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && h.a(this.j, bVar.j) && h.a(this.k, bVar.k) && h.a(this.l, bVar.l) && this.m == bVar.m;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }

    public int hashCode() {
        boolean z = this.a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.d;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.e;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z6 = this.f;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        boolean z7 = this.g;
        if (z7) {
            z7 = true;
        }
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z8 = this.h;
        if (z8) {
            z8 = true;
        }
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int i34 = (i30 + i31) * 31;
        boolean z9 = this.i;
        if (z9) {
            z9 = true;
        }
        int i35 = z9 ? 1 : 0;
        int i36 = z9 ? 1 : 0;
        int i37 = z9 ? 1 : 0;
        int i38 = (i34 + i35) * 31;
        String str = this.j;
        int i39 = 0;
        int hashCode = (i38 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Participant> list = this.l;
        if (list != null) {
            i39 = list.hashCode();
        }
        int i40 = (hashCode2 + i39) * 31;
        boolean z10 = this.m;
        if (!z10) {
            i2 = z10 ? 1 : 0;
        }
        return i40 + i2;
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean j() {
        return this.e;
    }

    public final boolean k() {
        return this.d;
    }

    public final boolean l() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SocialListeningState(isInitialized=");
        V0.append(this.a);
        V0.append(", isActive=");
        V0.append(this.b);
        V0.append(", isHost=");
        V0.append(this.c);
        V0.append(", isObtainingSession=");
        V0.append(this.d);
        V0.append(", isJoiningSession=");
        V0.append(this.e);
        V0.append(", isTerminatingSession=");
        V0.append(this.f);
        V0.append(", wasDeletedByHost=");
        V0.append(this.g);
        V0.append(", failedToObtain=");
        V0.append(this.h);
        V0.append(", sessionShared=");
        V0.append(this.i);
        V0.append(", joinToken=");
        V0.append(this.j);
        V0.append(", joinUri=");
        V0.append(this.k);
        V0.append(", participants=");
        V0.append(this.l);
        V0.append(", hasBeenJoinedByOther=");
        return je.P0(V0, this.m, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, java.lang.String r25, java.lang.String r26, java.util.List r27, boolean r28, int r29) {
        /*
            r15 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = 0
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = 0
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = 0
            goto L_0x0023
        L_0x0021:
            r5 = r19
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = 0
            goto L_0x002b
        L_0x0029:
            r6 = r20
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = 0
            goto L_0x0033
        L_0x0031:
            r7 = r21
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = 0
            goto L_0x003b
        L_0x0039:
            r8 = r22
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = 0
            goto L_0x0043
        L_0x0041:
            r9 = r23
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = 0
            goto L_0x004b
        L_0x0049:
            r10 = r24
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            java.lang.String r12 = ""
            r13 = 0
            if (r11 == 0) goto L_0x0054
            r11 = r12
            goto L_0x0055
        L_0x0054:
            r11 = r13
        L_0x0055:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r12 = r13
        L_0x005b:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0061
            kotlin.collections.EmptyList r13 = kotlin.collections.EmptyList.a
        L_0x0061:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r2 = r28
        L_0x0068:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.sociallistening.models.b.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.util.List, boolean, int):void");
    }
}
