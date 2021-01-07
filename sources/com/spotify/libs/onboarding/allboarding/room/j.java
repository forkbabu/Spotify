package com.spotify.libs.onboarding.allboarding.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class j implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final y f;
    private final f n;
    private final z o;
    private final e p;
    private final d q;
    private final a0 r;
    private final b0 s;
    private final b t;
    private final c u;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (y) y.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (f) f.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (z) z.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (e) e.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (d) d.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (a0) a0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (b0) b0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (b) b.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new j[i];
        }
    }

    public j(String str, String str2, String str3, y yVar, f fVar, z zVar, e eVar, d dVar, a0 a0Var, b0 b0Var, b bVar, c cVar) {
        h.e(str, "pickerUri");
        h.e(str2, "pickerTitle");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = yVar;
        this.n = fVar;
        this.o = zVar;
        this.p = eVar;
        this.q = dVar;
        this.r = a0Var;
        this.s = b0Var;
        this.t = bVar;
        this.u = cVar;
    }

    public static j a(j jVar, String str, String str2, String str3, y yVar, f fVar, z zVar, e eVar, d dVar, a0 a0Var, b0 b0Var, b bVar, c cVar, int i) {
        c cVar2 = null;
        String str4 = (i & 1) != 0 ? jVar.a : null;
        String str5 = (i & 2) != 0 ? jVar.b : null;
        String str6 = (i & 4) != 0 ? jVar.c : str3;
        y yVar2 = (i & 8) != 0 ? jVar.f : null;
        f fVar2 = (i & 16) != 0 ? jVar.n : null;
        z zVar2 = (i & 32) != 0 ? jVar.o : zVar;
        e eVar2 = (i & 64) != 0 ? jVar.p : null;
        d dVar2 = (i & 128) != 0 ? jVar.q : null;
        a0 a0Var2 = (i & 256) != 0 ? jVar.r : null;
        b0 b0Var2 = (i & 512) != 0 ? jVar.s : null;
        b bVar2 = (i & 1024) != 0 ? jVar.t : null;
        if ((i & 2048) != 0) {
            cVar2 = jVar.u;
        }
        jVar.getClass();
        h.e(str4, "pickerUri");
        h.e(str5, "pickerTitle");
        return new j(str4, str5, str6, yVar2, fVar2, zVar2, eVar2, dVar2, a0Var2, b0Var2, bVar2, cVar2);
    }

    public final b b() {
        return this.t;
    }

    public final c c() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final d e() {
        return this.q;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.a(this.a, jVar.a) && h.a(this.b, jVar.b) && h.a(this.c, jVar.c) && h.a(this.f, jVar.f) && h.a(this.n, jVar.n) && h.a(this.o, jVar.o) && h.a(this.p, jVar.p) && h.a(this.q, jVar.q) && h.a(this.r, jVar.r) && h.a(this.s, jVar.s) && h.a(this.t, jVar.t) && h.a(this.u, jVar.u);
    }

    public final e f() {
        return this.p;
    }

    public final f g() {
        return this.n;
    }

    public final String h() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        y yVar = this.f;
        int hashCode4 = (hashCode3 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        f fVar = this.n;
        int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        z zVar = this.o;
        int hashCode6 = (hashCode5 + (zVar != null ? zVar.hashCode() : 0)) * 31;
        e eVar = this.p;
        int hashCode7 = (hashCode6 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        d dVar = this.q;
        int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        a0 a0Var = this.r;
        int hashCode9 = (hashCode8 + (a0Var != null ? a0Var.hashCode() : 0)) * 31;
        b0 b0Var = this.s;
        int hashCode10 = (hashCode9 + (b0Var != null ? b0Var.hashCode() : 0)) * 31;
        b bVar = this.t;
        int hashCode11 = (hashCode10 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        c cVar = this.u;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode11 + i;
    }

    public final String i() {
        return this.a;
    }

    public final String j() {
        return this.c;
    }

    public final y k() {
        return this.f;
    }

    public final z l() {
        return this.o;
    }

    public final a0 m() {
        return this.r;
    }

    public final b0 n() {
        return this.s;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Picker(pickerUri=");
        V0.append(this.a);
        V0.append(", pickerTitle=");
        V0.append(this.b);
        V0.append(", sectionId=");
        V0.append(this.c);
        V0.append(", sectionTitle=");
        V0.append(this.f);
        V0.append(", logging=");
        V0.append(this.n);
        V0.append(", selectable=");
        V0.append(this.o);
        V0.append(", expandable=");
        V0.append(this.p);
        V0.append(", banner=");
        V0.append(this.q);
        V0.append(", show=");
        V0.append(this.r);
        V0.append(", showMore=");
        V0.append(this.s);
        V0.append(", artist=");
        V0.append(this.t);
        V0.append(", artistMore=");
        V0.append(this.u);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        y yVar = this.f;
        if (yVar != null) {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        f fVar = this.n;
        if (fVar != null) {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        z zVar = this.o;
        if (zVar != null) {
            parcel.writeInt(1);
            zVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        e eVar = this.p;
        if (eVar != null) {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        d dVar = this.q;
        if (dVar != null) {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        a0 a0Var = this.r;
        if (a0Var != null) {
            parcel.writeInt(1);
            a0Var.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        b0 b0Var = this.s;
        if (b0Var != null) {
            parcel.writeInt(1);
            b0Var.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        b bVar = this.t;
        if (bVar != null) {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        c cVar = this.u;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, String str3, y yVar, f fVar, z zVar, e eVar, d dVar, a0 a0Var, b0 b0Var, b bVar, c cVar, int i) {
        this(str, str2, null, (i & 8) != 0 ? null : yVar, (i & 16) != 0 ? null : fVar, (i & 32) != 0 ? null : zVar, (i & 64) != 0 ? null : eVar, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : a0Var, (i & 512) != 0 ? null : b0Var, (i & 1024) != 0 ? null : bVar, (i & 2048) != 0 ? null : cVar);
        int i2 = i & 4;
    }
}
