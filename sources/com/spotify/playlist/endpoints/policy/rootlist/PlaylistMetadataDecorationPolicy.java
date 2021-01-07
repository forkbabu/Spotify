package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PlaylistMetadataDecorationPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final boolean addTime;
    private final boolean browsableOffline;
    private final boolean canReportAnnotationAbuse;
    private final boolean collaborative;
    private final boolean description;
    private final boolean descriptionFromAnnotate;
    private final boolean duration;
    private final boolean followed;
    private final boolean followers;
    private final boolean formatListAttributes;
    private final boolean formatListType;
    private final boolean groupLabel;
    private final boolean isOnDemandInFree;
    private final boolean lastModification;
    private final boolean length;
    private final boolean link;
    private final boolean loadState;
    private final boolean loaded;
    private final PlaylistUserDecorationPolicy madeFor;
    private final boolean name;
    private final boolean offline;
    private final boolean ownedBySelf;
    private final PlaylistUserDecorationPolicy owner;
    private final boolean picture;
    private final boolean pictureFromAnnotate;
    private final boolean playable;
    private final boolean published;
    private final boolean rowId;
    private final boolean syncProgress;
    private final boolean totalLength;

    public static final class a {
        private boolean A;
        private boolean B;
        private PlaylistUserDecorationPolicy C;
        private PlaylistUserDecorationPolicy D;
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;
        private boolean s;
        private boolean t;
        private boolean u;
        private boolean v;
        private boolean w;
        private boolean x;
        private boolean y;
        private boolean z;

        public a() {
            this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, 1073741823);
        }

        public a(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2) {
            h.e(playlistUserDecorationPolicy, "owner");
            h.e(playlistUserDecorationPolicy2, "madeFor");
            this.a = z2;
            this.b = z3;
            this.c = z4;
            this.d = z5;
            this.e = z6;
            this.f = z7;
            this.g = z8;
            this.h = z9;
            this.i = z10;
            this.j = z11;
            this.k = z12;
            this.l = z13;
            this.m = z14;
            this.n = z15;
            this.o = z16;
            this.p = z17;
            this.q = z18;
            this.r = z19;
            this.s = z20;
            this.t = z21;
            this.u = z22;
            this.v = z23;
            this.w = z24;
            this.x = z25;
            this.y = z26;
            this.z = z27;
            this.A = z28;
            this.B = z29;
            this.C = playlistUserDecorationPolicy;
            this.D = playlistUserDecorationPolicy2;
        }

        public final a a(boolean z2) {
            this.f = z2;
            return this;
        }

        public final a b(boolean z2) {
            this.x = z2;
            return this;
        }

        public final PlaylistMetadataDecorationPolicy c() {
            boolean z2 = this.a;
            boolean z3 = this.b;
            boolean z4 = this.c;
            PlaylistUserDecorationPolicy playlistUserDecorationPolicy = this.C;
            boolean z5 = this.d;
            boolean z6 = this.e;
            boolean z7 = this.f;
            PlaylistUserDecorationPolicy playlistUserDecorationPolicy2 = this.D;
            boolean z8 = this.h;
            boolean z9 = this.g;
            boolean z10 = this.j;
            boolean z11 = this.k;
            boolean z12 = this.i;
            boolean z13 = this.l;
            boolean z14 = this.m;
            boolean z15 = this.n;
            boolean z16 = this.o;
            boolean z17 = this.p;
            boolean z18 = this.q;
            boolean z19 = this.r;
            boolean z20 = this.s;
            boolean z21 = this.t;
            boolean z22 = this.u;
            boolean z23 = this.v;
            boolean z24 = this.w;
            boolean z25 = this.x;
            return new PlaylistMetadataDecorationPolicy(z4, z7, z23, z2, z3, z13, z5, z21, z6, z24, z17, z12, z18, z8, z10, this.A, this.y, this.B, z11, z14, z19, z9, z16, z20, z15, z25, z22, this.z, playlistUserDecorationPolicy, playlistUserDecorationPolicy2);
        }

        public final a d(boolean z2) {
            this.u = z2;
            return this;
        }

        public final a e(boolean z2) {
            this.o = z2;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r && this.s == aVar.s && this.t == aVar.t && this.u == aVar.u && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && this.y == aVar.y && this.z == aVar.z && this.A == aVar.A && this.B == aVar.B && h.a(this.C, aVar.C) && h.a(this.D, aVar.D);
        }

        public final a f(boolean z2) {
            this.v = z2;
            return this;
        }

        public final a g(boolean z2) {
            this.a = z2;
            return this;
        }

        public final a h(PlaylistUserDecorationPolicy playlistUserDecorationPolicy) {
            h.e(playlistUserDecorationPolicy, "madeFor");
            this.D = playlistUserDecorationPolicy;
            return this;
        }

        public int hashCode() {
            boolean z2 = this.a;
            int i2 = 1;
            if (z2) {
                z2 = true;
            }
            int i3 = z2 ? 1 : 0;
            int i4 = z2 ? 1 : 0;
            int i5 = z2 ? 1 : 0;
            int i6 = i3 * 31;
            boolean z3 = this.b;
            if (z3) {
                z3 = true;
            }
            int i7 = z3 ? 1 : 0;
            int i8 = z3 ? 1 : 0;
            int i9 = z3 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            boolean z4 = this.c;
            if (z4) {
                z4 = true;
            }
            int i11 = z4 ? 1 : 0;
            int i12 = z4 ? 1 : 0;
            int i13 = z4 ? 1 : 0;
            int i14 = (i10 + i11) * 31;
            boolean z5 = this.d;
            if (z5) {
                z5 = true;
            }
            int i15 = z5 ? 1 : 0;
            int i16 = z5 ? 1 : 0;
            int i17 = z5 ? 1 : 0;
            int i18 = (i14 + i15) * 31;
            boolean z6 = this.e;
            if (z6) {
                z6 = true;
            }
            int i19 = z6 ? 1 : 0;
            int i20 = z6 ? 1 : 0;
            int i21 = z6 ? 1 : 0;
            int i22 = (i18 + i19) * 31;
            boolean z7 = this.f;
            if (z7) {
                z7 = true;
            }
            int i23 = z7 ? 1 : 0;
            int i24 = z7 ? 1 : 0;
            int i25 = z7 ? 1 : 0;
            int i26 = (i22 + i23) * 31;
            boolean z8 = this.g;
            if (z8) {
                z8 = true;
            }
            int i27 = z8 ? 1 : 0;
            int i28 = z8 ? 1 : 0;
            int i29 = z8 ? 1 : 0;
            int i30 = (i26 + i27) * 31;
            boolean z9 = this.h;
            if (z9) {
                z9 = true;
            }
            int i31 = z9 ? 1 : 0;
            int i32 = z9 ? 1 : 0;
            int i33 = z9 ? 1 : 0;
            int i34 = (i30 + i31) * 31;
            boolean z10 = this.i;
            if (z10) {
                z10 = true;
            }
            int i35 = z10 ? 1 : 0;
            int i36 = z10 ? 1 : 0;
            int i37 = z10 ? 1 : 0;
            int i38 = (i34 + i35) * 31;
            boolean z11 = this.j;
            if (z11) {
                z11 = true;
            }
            int i39 = z11 ? 1 : 0;
            int i40 = z11 ? 1 : 0;
            int i41 = z11 ? 1 : 0;
            int i42 = (i38 + i39) * 31;
            boolean z12 = this.k;
            if (z12) {
                z12 = true;
            }
            int i43 = z12 ? 1 : 0;
            int i44 = z12 ? 1 : 0;
            int i45 = z12 ? 1 : 0;
            int i46 = (i42 + i43) * 31;
            boolean z13 = this.l;
            if (z13) {
                z13 = true;
            }
            int i47 = z13 ? 1 : 0;
            int i48 = z13 ? 1 : 0;
            int i49 = z13 ? 1 : 0;
            int i50 = (i46 + i47) * 31;
            boolean z14 = this.m;
            if (z14) {
                z14 = true;
            }
            int i51 = z14 ? 1 : 0;
            int i52 = z14 ? 1 : 0;
            int i53 = z14 ? 1 : 0;
            int i54 = (i50 + i51) * 31;
            boolean z15 = this.n;
            if (z15) {
                z15 = true;
            }
            int i55 = z15 ? 1 : 0;
            int i56 = z15 ? 1 : 0;
            int i57 = z15 ? 1 : 0;
            int i58 = (i54 + i55) * 31;
            boolean z16 = this.o;
            if (z16) {
                z16 = true;
            }
            int i59 = z16 ? 1 : 0;
            int i60 = z16 ? 1 : 0;
            int i61 = z16 ? 1 : 0;
            int i62 = (i58 + i59) * 31;
            boolean z17 = this.p;
            if (z17) {
                z17 = true;
            }
            int i63 = z17 ? 1 : 0;
            int i64 = z17 ? 1 : 0;
            int i65 = z17 ? 1 : 0;
            int i66 = (i62 + i63) * 31;
            boolean z18 = this.q;
            if (z18) {
                z18 = true;
            }
            int i67 = z18 ? 1 : 0;
            int i68 = z18 ? 1 : 0;
            int i69 = z18 ? 1 : 0;
            int i70 = (i66 + i67) * 31;
            boolean z19 = this.r;
            if (z19) {
                z19 = true;
            }
            int i71 = z19 ? 1 : 0;
            int i72 = z19 ? 1 : 0;
            int i73 = z19 ? 1 : 0;
            int i74 = (i70 + i71) * 31;
            boolean z20 = this.s;
            if (z20) {
                z20 = true;
            }
            int i75 = z20 ? 1 : 0;
            int i76 = z20 ? 1 : 0;
            int i77 = z20 ? 1 : 0;
            int i78 = (i74 + i75) * 31;
            boolean z21 = this.t;
            if (z21) {
                z21 = true;
            }
            int i79 = z21 ? 1 : 0;
            int i80 = z21 ? 1 : 0;
            int i81 = z21 ? 1 : 0;
            int i82 = (i78 + i79) * 31;
            boolean z22 = this.u;
            if (z22) {
                z22 = true;
            }
            int i83 = z22 ? 1 : 0;
            int i84 = z22 ? 1 : 0;
            int i85 = z22 ? 1 : 0;
            int i86 = (i82 + i83) * 31;
            boolean z23 = this.v;
            if (z23) {
                z23 = true;
            }
            int i87 = z23 ? 1 : 0;
            int i88 = z23 ? 1 : 0;
            int i89 = z23 ? 1 : 0;
            int i90 = (i86 + i87) * 31;
            boolean z24 = this.w;
            if (z24) {
                z24 = true;
            }
            int i91 = z24 ? 1 : 0;
            int i92 = z24 ? 1 : 0;
            int i93 = z24 ? 1 : 0;
            int i94 = (i90 + i91) * 31;
            boolean z25 = this.x;
            if (z25) {
                z25 = true;
            }
            int i95 = z25 ? 1 : 0;
            int i96 = z25 ? 1 : 0;
            int i97 = z25 ? 1 : 0;
            int i98 = (i94 + i95) * 31;
            boolean z26 = this.y;
            if (z26) {
                z26 = true;
            }
            int i99 = z26 ? 1 : 0;
            int i100 = z26 ? 1 : 0;
            int i101 = z26 ? 1 : 0;
            int i102 = (i98 + i99) * 31;
            boolean z27 = this.z;
            if (z27) {
                z27 = true;
            }
            int i103 = z27 ? 1 : 0;
            int i104 = z27 ? 1 : 0;
            int i105 = z27 ? 1 : 0;
            int i106 = (i102 + i103) * 31;
            boolean z28 = this.A;
            if (z28) {
                z28 = true;
            }
            int i107 = z28 ? 1 : 0;
            int i108 = z28 ? 1 : 0;
            int i109 = z28 ? 1 : 0;
            int i110 = (i106 + i107) * 31;
            boolean z29 = this.B;
            if (!z29) {
                i2 = z29 ? 1 : 0;
            }
            int i111 = (i110 + i2) * 31;
            PlaylistUserDecorationPolicy playlistUserDecorationPolicy = this.C;
            int i112 = 0;
            int hashCode = (i111 + (playlistUserDecorationPolicy != null ? playlistUserDecorationPolicy.hashCode() : 0)) * 31;
            PlaylistUserDecorationPolicy playlistUserDecorationPolicy2 = this.D;
            if (playlistUserDecorationPolicy2 != null) {
                i112 = playlistUserDecorationPolicy2.hashCode();
            }
            return hashCode + i112;
        }

        public final a i(boolean z2) {
            this.b = z2;
            return this;
        }

        public final a j(boolean z2) {
            this.g = z2;
            return this;
        }

        public final a k(boolean z2) {
            this.r = z2;
            return this;
        }

        public final a l(PlaylistUserDecorationPolicy playlistUserDecorationPolicy) {
            h.e(playlistUserDecorationPolicy, "owner");
            this.C = playlistUserDecorationPolicy;
            return this;
        }

        public final a m(boolean z2) {
            this.h = z2;
            return this;
        }

        public final a n(boolean z2) {
            this.c = z2;
            return this;
        }

        public final a o(boolean z2) {
            this.s = z2;
            return this;
        }

        public final a p(boolean z2) {
            this.p = z2;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(link=");
            V0.append(this.a);
            V0.append(", name=");
            V0.append(this.b);
            V0.append(", rowId=");
            V0.append(this.c);
            V0.append(", loaded=");
            V0.append(this.d);
            V0.append(", length=");
            V0.append(this.e);
            V0.append(", addTime=");
            V0.append(this.f);
            V0.append(", offline=");
            V0.append(this.g);
            V0.append(", picture=");
            V0.append(this.h);
            V0.append(", duration=");
            V0.append(this.i);
            V0.append(", playable=");
            V0.append(this.j);
            V0.append(", followed=");
            V0.append(this.k);
            V0.append(", loadState=");
            V0.append(this.l);
            V0.append(", followers=");
            V0.append(this.m);
            V0.append(", published=");
            V0.append(this.n);
            V0.append(", groupLabel=");
            V0.append(this.o);
            V0.append(", totalLength=");
            V0.append(this.p);
            V0.append(", description=");
            V0.append(this.q);
            V0.append(", ownedBySelf=");
            V0.append(this.r);
            V0.append(", syncProgress=");
            V0.append(this.s);
            V0.append(", collaborative=");
            V0.append(this.t);
            V0.append(", formatListType=");
            V0.append(this.u);
            V0.append(", isOnDemandInFree=");
            V0.append(this.v);
            V0.append(", lastModification=");
            V0.append(this.w);
            V0.append(", browsableOffline=");
            V0.append(this.x);
            V0.append(", pictureFromAnnotate=");
            V0.append(this.y);
            V0.append(", formatListAttributes=");
            V0.append(this.z);
            V0.append(", descriptionFromAnnotate=");
            V0.append(this.A);
            V0.append(", canReportAnnotationAbuse=");
            V0.append(this.B);
            V0.append(", owner=");
            V0.append(this.C);
            V0.append(", madeFor=");
            V0.append(this.D);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2, int i2) {
            this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? false : z4, (i2 & 8) != 0 ? false : z5, (i2 & 16) != 0 ? false : z6, (i2 & 32) != 0 ? false : z7, (i2 & 64) != 0 ? false : z8, (i2 & 128) != 0 ? false : z9, (i2 & 256) != 0 ? false : z10, (i2 & 512) != 0 ? false : z11, (i2 & 1024) != 0 ? false : z12, (i2 & 2048) != 0 ? false : z13, (i2 & 4096) != 0 ? false : z14, (i2 & 8192) != 0 ? false : z15, (i2 & 16384) != 0 ? false : z16, (i2 & 32768) != 0 ? false : z17, (i2 & 65536) != 0 ? false : z18, (i2 & 131072) != 0 ? false : z19, (i2 & 262144) != 0 ? false : z20, (i2 & 524288) != 0 ? false : z21, (i2 & 1048576) != 0 ? false : z22, (i2 & 2097152) != 0 ? false : z23, (i2 & 4194304) != 0 ? false : z24, (i2 & 8388608) != 0 ? false : z25, (i2 & 16777216) != 0 ? false : z26, (i2 & 33554432) != 0 ? false : z27, (i2 & 67108864) != 0 ? false : z28, (i2 & 134217728) != 0 ? false : z29, (i2 & 268435456) != 0 ? new PlaylistUserDecorationPolicy(false, false, false, 7, null) : null, (i2 & 536870912) != 0 ? new PlaylistUserDecorationPolicy(false, false, false, 7, null) : null);
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public static class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            boolean z20 = parcel.readInt() != 0;
            boolean z21 = parcel.readInt() != 0;
            boolean z22 = parcel.readInt() != 0;
            boolean z23 = parcel.readInt() != 0;
            boolean z24 = parcel.readInt() != 0;
            boolean z25 = parcel.readInt() != 0;
            boolean z26 = parcel.readInt() != 0;
            boolean z27 = parcel.readInt() != 0;
            boolean z28 = parcel.readInt() != 0;
            Parcelable.Creator creator = PlaylistUserDecorationPolicy.CREATOR;
            return new PlaylistMetadataDecorationPolicy(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, (PlaylistUserDecorationPolicy) creator.createFromParcel(parcel), (PlaylistUserDecorationPolicy) creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistMetadataDecorationPolicy[i];
        }
    }

    public PlaylistMetadataDecorationPolicy() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, 1073741823, null);
    }

    public PlaylistMetadataDecorationPolicy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2) {
        h.e(playlistUserDecorationPolicy, "owner");
        h.e(playlistUserDecorationPolicy2, "madeFor");
        this.rowId = z;
        this.addTime = z2;
        this.isOnDemandInFree = z3;
        this.link = z4;
        this.name = z5;
        this.loadState = z6;
        this.loaded = z7;
        this.collaborative = z8;
        this.length = z9;
        this.lastModification = z10;
        this.totalLength = z11;
        this.duration = z12;
        this.description = z13;
        this.picture = z14;
        this.playable = z15;
        this.descriptionFromAnnotate = z16;
        this.pictureFromAnnotate = z17;
        this.canReportAnnotationAbuse = z18;
        this.followed = z19;
        this.followers = z20;
        this.ownedBySelf = z21;
        this.offline = z22;
        this.groupLabel = z23;
        this.syncProgress = z24;
        this.published = z25;
        this.browsableOffline = z26;
        this.formatListType = z27;
        this.formatListAttributes = z28;
        this.owner = playlistUserDecorationPolicy;
        this.madeFor = playlistUserDecorationPolicy2;
    }

    public static final a builder() {
        Companion.getClass();
        return new a(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, 1073741823);
    }

    public static /* synthetic */ PlaylistMetadataDecorationPolicy copy$default(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2, int i, Object obj) {
        return playlistMetadataDecorationPolicy.copy((i & 1) != 0 ? playlistMetadataDecorationPolicy.rowId : z, (i & 2) != 0 ? playlistMetadataDecorationPolicy.addTime : z2, (i & 4) != 0 ? playlistMetadataDecorationPolicy.isOnDemandInFree : z3, (i & 8) != 0 ? playlistMetadataDecorationPolicy.link : z4, (i & 16) != 0 ? playlistMetadataDecorationPolicy.name : z5, (i & 32) != 0 ? playlistMetadataDecorationPolicy.loadState : z6, (i & 64) != 0 ? playlistMetadataDecorationPolicy.loaded : z7, (i & 128) != 0 ? playlistMetadataDecorationPolicy.collaborative : z8, (i & 256) != 0 ? playlistMetadataDecorationPolicy.length : z9, (i & 512) != 0 ? playlistMetadataDecorationPolicy.lastModification : z10, (i & 1024) != 0 ? playlistMetadataDecorationPolicy.totalLength : z11, (i & 2048) != 0 ? playlistMetadataDecorationPolicy.duration : z12, (i & 4096) != 0 ? playlistMetadataDecorationPolicy.description : z13, (i & 8192) != 0 ? playlistMetadataDecorationPolicy.picture : z14, (i & 16384) != 0 ? playlistMetadataDecorationPolicy.playable : z15, (i & 32768) != 0 ? playlistMetadataDecorationPolicy.descriptionFromAnnotate : z16, (i & 65536) != 0 ? playlistMetadataDecorationPolicy.pictureFromAnnotate : z17, (i & 131072) != 0 ? playlistMetadataDecorationPolicy.canReportAnnotationAbuse : z18, (i & 262144) != 0 ? playlistMetadataDecorationPolicy.followed : z19, (i & 524288) != 0 ? playlistMetadataDecorationPolicy.followers : z20, (i & 1048576) != 0 ? playlistMetadataDecorationPolicy.ownedBySelf : z21, (i & 2097152) != 0 ? playlistMetadataDecorationPolicy.offline : z22, (i & 4194304) != 0 ? playlistMetadataDecorationPolicy.groupLabel : z23, (i & 8388608) != 0 ? playlistMetadataDecorationPolicy.syncProgress : z24, (i & 16777216) != 0 ? playlistMetadataDecorationPolicy.published : z25, (i & 33554432) != 0 ? playlistMetadataDecorationPolicy.browsableOffline : z26, (i & 67108864) != 0 ? playlistMetadataDecorationPolicy.formatListType : z27, (i & 134217728) != 0 ? playlistMetadataDecorationPolicy.formatListAttributes : z28, (i & 268435456) != 0 ? playlistMetadataDecorationPolicy.owner : playlistUserDecorationPolicy, (i & 536870912) != 0 ? playlistMetadataDecorationPolicy.madeFor : playlistUserDecorationPolicy2);
    }

    @JsonProperty("addTime")
    public final boolean addTime() {
        return this.addTime;
    }

    @JsonProperty("browsableOffline")
    public final boolean browsableOffline() {
        return this.browsableOffline;
    }

    @JsonProperty("canReportAnnotationAbuse")
    public final boolean canReportAnnotationAbuse() {
        return this.canReportAnnotationAbuse;
    }

    @JsonProperty("collaborative")
    public final boolean collaborative() {
        return this.collaborative;
    }

    public final boolean component1() {
        return this.rowId;
    }

    public final boolean component10() {
        return this.lastModification;
    }

    public final boolean component11() {
        return this.totalLength;
    }

    public final boolean component12() {
        return this.duration;
    }

    public final boolean component13() {
        return this.description;
    }

    public final boolean component14() {
        return this.picture;
    }

    public final boolean component15() {
        return this.playable;
    }

    public final boolean component16() {
        return this.descriptionFromAnnotate;
    }

    public final boolean component17() {
        return this.pictureFromAnnotate;
    }

    public final boolean component18() {
        return this.canReportAnnotationAbuse;
    }

    public final boolean component19() {
        return this.followed;
    }

    public final boolean component2() {
        return this.addTime;
    }

    public final boolean component20() {
        return this.followers;
    }

    public final boolean component21() {
        return this.ownedBySelf;
    }

    public final boolean component22() {
        return this.offline;
    }

    public final boolean component23() {
        return this.groupLabel;
    }

    public final boolean component24() {
        return this.syncProgress;
    }

    public final boolean component25() {
        return this.published;
    }

    public final boolean component26() {
        return this.browsableOffline;
    }

    public final boolean component27() {
        return this.formatListType;
    }

    public final boolean component28() {
        return this.formatListAttributes;
    }

    public final PlaylistUserDecorationPolicy component29() {
        return this.owner;
    }

    public final boolean component3() {
        return this.isOnDemandInFree;
    }

    public final PlaylistUserDecorationPolicy component30() {
        return this.madeFor;
    }

    public final boolean component4() {
        return this.link;
    }

    public final boolean component5() {
        return this.name;
    }

    public final boolean component6() {
        return this.loadState;
    }

    public final boolean component7() {
        return this.loaded;
    }

    public final boolean component8() {
        return this.collaborative;
    }

    public final boolean component9() {
        return this.length;
    }

    public final PlaylistMetadataDecorationPolicy copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2) {
        h.e(playlistUserDecorationPolicy, "owner");
        h.e(playlistUserDecorationPolicy2, "madeFor");
        return new PlaylistMetadataDecorationPolicy(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, playlistUserDecorationPolicy, playlistUserDecorationPolicy2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JsonProperty("description")
    public final boolean description() {
        return this.description;
    }

    @JsonProperty("descriptionFromAnnotate")
    public final boolean descriptionFromAnnotate() {
        return this.descriptionFromAnnotate;
    }

    @JsonProperty("duration")
    public final boolean duration() {
        return this.duration;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistMetadataDecorationPolicy)) {
            return false;
        }
        PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy = (PlaylistMetadataDecorationPolicy) obj;
        return this.rowId == playlistMetadataDecorationPolicy.rowId && this.addTime == playlistMetadataDecorationPolicy.addTime && this.isOnDemandInFree == playlistMetadataDecorationPolicy.isOnDemandInFree && this.link == playlistMetadataDecorationPolicy.link && this.name == playlistMetadataDecorationPolicy.name && this.loadState == playlistMetadataDecorationPolicy.loadState && this.loaded == playlistMetadataDecorationPolicy.loaded && this.collaborative == playlistMetadataDecorationPolicy.collaborative && this.length == playlistMetadataDecorationPolicy.length && this.lastModification == playlistMetadataDecorationPolicy.lastModification && this.totalLength == playlistMetadataDecorationPolicy.totalLength && this.duration == playlistMetadataDecorationPolicy.duration && this.description == playlistMetadataDecorationPolicy.description && this.picture == playlistMetadataDecorationPolicy.picture && this.playable == playlistMetadataDecorationPolicy.playable && this.descriptionFromAnnotate == playlistMetadataDecorationPolicy.descriptionFromAnnotate && this.pictureFromAnnotate == playlistMetadataDecorationPolicy.pictureFromAnnotate && this.canReportAnnotationAbuse == playlistMetadataDecorationPolicy.canReportAnnotationAbuse && this.followed == playlistMetadataDecorationPolicy.followed && this.followers == playlistMetadataDecorationPolicy.followers && this.ownedBySelf == playlistMetadataDecorationPolicy.ownedBySelf && this.offline == playlistMetadataDecorationPolicy.offline && this.groupLabel == playlistMetadataDecorationPolicy.groupLabel && this.syncProgress == playlistMetadataDecorationPolicy.syncProgress && this.published == playlistMetadataDecorationPolicy.published && this.browsableOffline == playlistMetadataDecorationPolicy.browsableOffline && this.formatListType == playlistMetadataDecorationPolicy.formatListType && this.formatListAttributes == playlistMetadataDecorationPolicy.formatListAttributes && h.a(this.owner, playlistMetadataDecorationPolicy.owner) && h.a(this.madeFor, playlistMetadataDecorationPolicy.madeFor);
    }

    @JsonProperty("followed")
    public final boolean followed() {
        return this.followed;
    }

    @JsonProperty("followers")
    public final boolean followers() {
        return this.followers;
    }

    @JsonProperty("formatListAttributes")
    public final boolean formatListAttributes() {
        return this.formatListAttributes;
    }

    @JsonProperty("formatListType")
    public final boolean formatListType() {
        return this.formatListType;
    }

    @JsonProperty("groupLabel")
    public final boolean groupLabel() {
        return this.groupLabel;
    }

    @Override // java.lang.Object
    public int hashCode() {
        boolean z = this.rowId;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.addTime;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isOnDemandInFree;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.link;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.name;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        boolean z6 = this.loadState;
        if (z6) {
            z6 = true;
        }
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        boolean z7 = this.loaded;
        if (z7) {
            z7 = true;
        }
        int i26 = z7 ? 1 : 0;
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        boolean z8 = this.collaborative;
        if (z8) {
            z8 = true;
        }
        int i30 = z8 ? 1 : 0;
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = (i29 + i30) * 31;
        boolean z9 = this.length;
        if (z9) {
            z9 = true;
        }
        int i34 = z9 ? 1 : 0;
        int i35 = z9 ? 1 : 0;
        int i36 = z9 ? 1 : 0;
        int i37 = (i33 + i34) * 31;
        boolean z10 = this.lastModification;
        if (z10) {
            z10 = true;
        }
        int i38 = z10 ? 1 : 0;
        int i39 = z10 ? 1 : 0;
        int i40 = z10 ? 1 : 0;
        int i41 = (i37 + i38) * 31;
        boolean z11 = this.totalLength;
        if (z11) {
            z11 = true;
        }
        int i42 = z11 ? 1 : 0;
        int i43 = z11 ? 1 : 0;
        int i44 = z11 ? 1 : 0;
        int i45 = (i41 + i42) * 31;
        boolean z12 = this.duration;
        if (z12) {
            z12 = true;
        }
        int i46 = z12 ? 1 : 0;
        int i47 = z12 ? 1 : 0;
        int i48 = z12 ? 1 : 0;
        int i49 = (i45 + i46) * 31;
        boolean z13 = this.description;
        if (z13) {
            z13 = true;
        }
        int i50 = z13 ? 1 : 0;
        int i51 = z13 ? 1 : 0;
        int i52 = z13 ? 1 : 0;
        int i53 = (i49 + i50) * 31;
        boolean z14 = this.picture;
        if (z14) {
            z14 = true;
        }
        int i54 = z14 ? 1 : 0;
        int i55 = z14 ? 1 : 0;
        int i56 = z14 ? 1 : 0;
        int i57 = (i53 + i54) * 31;
        boolean z15 = this.playable;
        if (z15) {
            z15 = true;
        }
        int i58 = z15 ? 1 : 0;
        int i59 = z15 ? 1 : 0;
        int i60 = z15 ? 1 : 0;
        int i61 = (i57 + i58) * 31;
        boolean z16 = this.descriptionFromAnnotate;
        if (z16) {
            z16 = true;
        }
        int i62 = z16 ? 1 : 0;
        int i63 = z16 ? 1 : 0;
        int i64 = z16 ? 1 : 0;
        int i65 = (i61 + i62) * 31;
        boolean z17 = this.pictureFromAnnotate;
        if (z17) {
            z17 = true;
        }
        int i66 = z17 ? 1 : 0;
        int i67 = z17 ? 1 : 0;
        int i68 = z17 ? 1 : 0;
        int i69 = (i65 + i66) * 31;
        boolean z18 = this.canReportAnnotationAbuse;
        if (z18) {
            z18 = true;
        }
        int i70 = z18 ? 1 : 0;
        int i71 = z18 ? 1 : 0;
        int i72 = z18 ? 1 : 0;
        int i73 = (i69 + i70) * 31;
        boolean z19 = this.followed;
        if (z19) {
            z19 = true;
        }
        int i74 = z19 ? 1 : 0;
        int i75 = z19 ? 1 : 0;
        int i76 = z19 ? 1 : 0;
        int i77 = (i73 + i74) * 31;
        boolean z20 = this.followers;
        if (z20) {
            z20 = true;
        }
        int i78 = z20 ? 1 : 0;
        int i79 = z20 ? 1 : 0;
        int i80 = z20 ? 1 : 0;
        int i81 = (i77 + i78) * 31;
        boolean z21 = this.ownedBySelf;
        if (z21) {
            z21 = true;
        }
        int i82 = z21 ? 1 : 0;
        int i83 = z21 ? 1 : 0;
        int i84 = z21 ? 1 : 0;
        int i85 = (i81 + i82) * 31;
        boolean z22 = this.offline;
        if (z22) {
            z22 = true;
        }
        int i86 = z22 ? 1 : 0;
        int i87 = z22 ? 1 : 0;
        int i88 = z22 ? 1 : 0;
        int i89 = (i85 + i86) * 31;
        boolean z23 = this.groupLabel;
        if (z23) {
            z23 = true;
        }
        int i90 = z23 ? 1 : 0;
        int i91 = z23 ? 1 : 0;
        int i92 = z23 ? 1 : 0;
        int i93 = (i89 + i90) * 31;
        boolean z24 = this.syncProgress;
        if (z24) {
            z24 = true;
        }
        int i94 = z24 ? 1 : 0;
        int i95 = z24 ? 1 : 0;
        int i96 = z24 ? 1 : 0;
        int i97 = (i93 + i94) * 31;
        boolean z25 = this.published;
        if (z25) {
            z25 = true;
        }
        int i98 = z25 ? 1 : 0;
        int i99 = z25 ? 1 : 0;
        int i100 = z25 ? 1 : 0;
        int i101 = (i97 + i98) * 31;
        boolean z26 = this.browsableOffline;
        if (z26) {
            z26 = true;
        }
        int i102 = z26 ? 1 : 0;
        int i103 = z26 ? 1 : 0;
        int i104 = z26 ? 1 : 0;
        int i105 = (i101 + i102) * 31;
        boolean z27 = this.formatListType;
        if (z27) {
            z27 = true;
        }
        int i106 = z27 ? 1 : 0;
        int i107 = z27 ? 1 : 0;
        int i108 = z27 ? 1 : 0;
        int i109 = (i105 + i106) * 31;
        boolean z28 = this.formatListAttributes;
        if (!z28) {
            i = z28 ? 1 : 0;
        }
        int i110 = (i109 + i) * 31;
        PlaylistUserDecorationPolicy playlistUserDecorationPolicy = this.owner;
        int i111 = 0;
        int hashCode = (i110 + (playlistUserDecorationPolicy != null ? playlistUserDecorationPolicy.hashCode() : 0)) * 31;
        PlaylistUserDecorationPolicy playlistUserDecorationPolicy2 = this.madeFor;
        if (playlistUserDecorationPolicy2 != null) {
            i111 = playlistUserDecorationPolicy2.hashCode();
        }
        return hashCode + i111;
    }

    @JsonProperty("isOnDemandInFree")
    public final boolean isOnDemandInFree() {
        return this.isOnDemandInFree;
    }

    @JsonProperty("lastModification")
    public final boolean lastModification() {
        return this.lastModification;
    }

    @JsonProperty("length")
    public final boolean length() {
        return this.length;
    }

    @JsonProperty("link")
    public final boolean link() {
        return this.link;
    }

    @JsonProperty("loadState")
    public final boolean loadState() {
        return this.loadState;
    }

    @JsonProperty("loaded")
    public final boolean loaded() {
        return this.loaded;
    }

    @JsonProperty("madeFor")
    public final PlaylistUserDecorationPolicy madeFor() {
        return this.madeFor;
    }

    @JsonProperty("name")
    public final boolean name() {
        return this.name;
    }

    @JsonProperty("offline")
    public final boolean offline() {
        return this.offline;
    }

    @JsonProperty("ownedBySelf")
    public final boolean ownedBySelf() {
        return this.ownedBySelf;
    }

    @JsonProperty("owner")
    public final PlaylistUserDecorationPolicy owner() {
        return this.owner;
    }

    @JsonProperty("picture")
    public final boolean picture() {
        return this.picture;
    }

    @JsonProperty("pictureFromAnnotate")
    public final boolean pictureFromAnnotate() {
        return this.pictureFromAnnotate;
    }

    @JsonProperty("playable")
    public final boolean playable() {
        return this.playable;
    }

    @JsonProperty("published")
    public final boolean published() {
        return this.published;
    }

    @JsonProperty("rowId")
    public final boolean rowId() {
        return this.rowId;
    }

    @JsonProperty("syncProgress")
    public final boolean syncProgress() {
        return this.syncProgress;
    }

    public final a toBuilder() {
        boolean z = this.link;
        boolean z2 = this.name;
        boolean z3 = this.rowId;
        PlaylistUserDecorationPolicy playlistUserDecorationPolicy = this.owner;
        boolean z4 = this.loaded;
        boolean z5 = this.length;
        boolean z6 = this.addTime;
        PlaylistUserDecorationPolicy playlistUserDecorationPolicy2 = this.madeFor;
        boolean z7 = this.picture;
        return new a(z, z2, z3, z4, z5, z6, this.offline, z7, this.duration, this.playable, this.followed, this.loadState, this.followers, this.published, this.groupLabel, this.totalLength, this.description, this.ownedBySelf, this.syncProgress, this.collaborative, this.formatListType, this.isOnDemandInFree, this.lastModification, this.browsableOffline, this.pictureFromAnnotate, this.formatListAttributes, this.descriptionFromAnnotate, this.canReportAnnotationAbuse, playlistUserDecorationPolicy, playlistUserDecorationPolicy2);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PlaylistMetadataDecorationPolicy(rowId=");
        V0.append(this.rowId);
        V0.append(", addTime=");
        V0.append(this.addTime);
        V0.append(", isOnDemandInFree=");
        V0.append(this.isOnDemandInFree);
        V0.append(", link=");
        V0.append(this.link);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", loadState=");
        V0.append(this.loadState);
        V0.append(", loaded=");
        V0.append(this.loaded);
        V0.append(", collaborative=");
        V0.append(this.collaborative);
        V0.append(", length=");
        V0.append(this.length);
        V0.append(", lastModification=");
        V0.append(this.lastModification);
        V0.append(", totalLength=");
        V0.append(this.totalLength);
        V0.append(", duration=");
        V0.append(this.duration);
        V0.append(", description=");
        V0.append(this.description);
        V0.append(", picture=");
        V0.append(this.picture);
        V0.append(", playable=");
        V0.append(this.playable);
        V0.append(", descriptionFromAnnotate=");
        V0.append(this.descriptionFromAnnotate);
        V0.append(", pictureFromAnnotate=");
        V0.append(this.pictureFromAnnotate);
        V0.append(", canReportAnnotationAbuse=");
        V0.append(this.canReportAnnotationAbuse);
        V0.append(", followed=");
        V0.append(this.followed);
        V0.append(", followers=");
        V0.append(this.followers);
        V0.append(", ownedBySelf=");
        V0.append(this.ownedBySelf);
        V0.append(", offline=");
        V0.append(this.offline);
        V0.append(", groupLabel=");
        V0.append(this.groupLabel);
        V0.append(", syncProgress=");
        V0.append(this.syncProgress);
        V0.append(", published=");
        V0.append(this.published);
        V0.append(", browsableOffline=");
        V0.append(this.browsableOffline);
        V0.append(", formatListType=");
        V0.append(this.formatListType);
        V0.append(", formatListAttributes=");
        V0.append(this.formatListAttributes);
        V0.append(", owner=");
        V0.append(this.owner);
        V0.append(", madeFor=");
        V0.append(this.madeFor);
        V0.append(")");
        return V0.toString();
    }

    @JsonProperty("totalLength")
    public final boolean totalLength() {
        return this.totalLength;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.rowId ? 1 : 0);
        parcel.writeInt(this.addTime ? 1 : 0);
        parcel.writeInt(this.isOnDemandInFree ? 1 : 0);
        parcel.writeInt(this.link ? 1 : 0);
        parcel.writeInt(this.name ? 1 : 0);
        parcel.writeInt(this.loadState ? 1 : 0);
        parcel.writeInt(this.loaded ? 1 : 0);
        parcel.writeInt(this.collaborative ? 1 : 0);
        parcel.writeInt(this.length ? 1 : 0);
        parcel.writeInt(this.lastModification ? 1 : 0);
        parcel.writeInt(this.totalLength ? 1 : 0);
        parcel.writeInt(this.duration ? 1 : 0);
        parcel.writeInt(this.description ? 1 : 0);
        parcel.writeInt(this.picture ? 1 : 0);
        parcel.writeInt(this.playable ? 1 : 0);
        parcel.writeInt(this.descriptionFromAnnotate ? 1 : 0);
        parcel.writeInt(this.pictureFromAnnotate ? 1 : 0);
        parcel.writeInt(this.canReportAnnotationAbuse ? 1 : 0);
        parcel.writeInt(this.followed ? 1 : 0);
        parcel.writeInt(this.followers ? 1 : 0);
        parcel.writeInt(this.ownedBySelf ? 1 : 0);
        parcel.writeInt(this.offline ? 1 : 0);
        parcel.writeInt(this.groupLabel ? 1 : 0);
        parcel.writeInt(this.syncProgress ? 1 : 0);
        parcel.writeInt(this.published ? 1 : 0);
        parcel.writeInt(this.browsableOffline ? 1 : 0);
        parcel.writeInt(this.formatListType ? 1 : 0);
        parcel.writeInt(this.formatListAttributes ? 1 : 0);
        this.owner.writeToParcel(parcel, 0);
        this.madeFor.writeToParcel(parcel, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlaylistMetadataDecorationPolicy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2, int i, f fVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) != 0 ? false : z11, (i & 2048) != 0 ? false : z12, (i & 4096) != 0 ? false : z13, (i & 8192) != 0 ? false : z14, (i & 16384) != 0 ? false : z15, (i & 32768) != 0 ? false : z16, (i & 65536) != 0 ? false : z17, (i & 131072) != 0 ? false : z18, (i & 262144) != 0 ? false : z19, (i & 524288) != 0 ? false : z20, (i & 1048576) != 0 ? false : z21, (i & 2097152) != 0 ? false : z22, (i & 4194304) != 0 ? false : z23, (i & 8388608) != 0 ? false : z24, (i & 16777216) != 0 ? false : z25, (i & 33554432) != 0 ? false : z26, (i & 67108864) != 0 ? false : z27, (i & 134217728) != 0 ? false : z28, (i & 268435456) != 0 ? new PlaylistUserDecorationPolicy(false, false, false, 7, null) : playlistUserDecorationPolicy, (i & 536870912) != 0 ? new PlaylistUserDecorationPolicy(false, false, false, 7, null) : playlistUserDecorationPolicy2);
    }
}
