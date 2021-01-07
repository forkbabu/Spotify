package com.spotify.playlist.endpoints;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.endpoints.policy.playlist.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.p;
import com.spotify.playlist.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

public interface d {

    public static final class a {
        private final String a;
        private final int b;
        private final List<C0369a> c;

        /* renamed from: com.spotify.playlist.endpoints.d$a$a  reason: collision with other inner class name */
        public static final class C0369a {
            private final p a;
            private final boolean b;
            private final int c;
            private final int d;
            private final int e;

            public C0369a(p pVar, boolean z, int i, int i2, int i3) {
                h.e(pVar, "user");
                this.a = pVar;
                this.b = z;
                this.c = i;
                this.d = i2;
                this.e = i3;
            }

            public final boolean a() {
                return this.b;
            }

            public final int b() {
                return this.e;
            }

            public final int c() {
                return this.d;
            }

            public final p d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0369a)) {
                    return false;
                }
                C0369a aVar = (C0369a) obj;
                return h.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
            }

            public int hashCode() {
                p pVar = this.a;
                int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
                boolean z = this.b;
                if (z) {
                    z = true;
                }
                int i = z ? 1 : 0;
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                return ((((((hashCode + i) * 31) + this.c) * 31) + this.d) * 31) + this.e;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Collaborator(user=");
                V0.append(this.a);
                V0.append(", isOwner=");
                V0.append(this.b);
                V0.append(", numberOfItems=");
                V0.append(this.c);
                V0.append(", numberOfTracks=");
                V0.append(this.d);
                V0.append(", numberOfEpisodes=");
                return je.B0(V0, this.e, ")");
            }
        }

        public a(String str, int i, List<C0369a> list) {
            h.e(str, "name");
            h.e(list, "allCollaborators");
            this.a = str;
            this.b = i;
            this.c = list;
        }

        public final List<C0369a> a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            List<C0369a> list = this.c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Collaborators(name=");
            V0.append(this.a);
            V0.append(", totalNumberOfCollaborators=");
            V0.append(this.b);
            V0.append(", allCollaborators=");
            return je.L0(V0, this.c, ")");
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0370b();
        private final Policy a;
        private final PlaylistRequestDecorationPolicy b;
        private final ane c;
        private final String f;
        private final Boolean n;
        private final Boolean o;
        private final Boolean p;
        private final Boolean q;
        private final boolean r;
        private final boolean s;
        private final Boolean t;
        private final qxd u;
        private final Integer v;
        private final int w;

        public static final class a {
            private qxd a;
            private String b;
            private Boolean c;
            private Boolean d;
            private ane e;
            private boolean f;
            private Boolean g;
            private boolean h;
            private Boolean i;
            private Integer j;
            private Boolean k;
            private int l;
            private Policy m;
            private PlaylistRequestDecorationPolicy n;

            public a() {
                this(null, null, null, null, null, false, null, false, null, null, null, 0, null, null, 16383);
            }

            public a(qxd qxd, String str, Boolean bool, Boolean bool2, ane ane, boolean z, Boolean bool3, boolean z2, Boolean bool4, Integer num, Boolean bool5, int i2, Policy policy, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
                h.e(str, "textFilter");
                this.a = qxd;
                this.b = str;
                this.c = bool;
                this.d = bool2;
                this.e = ane;
                this.f = z;
                this.g = bool3;
                this.h = z2;
                this.i = bool4;
                this.j = num;
                this.k = bool5;
                this.l = i2;
                this.m = policy;
                this.n = playlistRequestDecorationPolicy;
            }

            public final a a(Boolean bool) {
                this.k = bool;
                return this;
            }

            public final b b() {
                qxd qxd = this.a;
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = this.n;
                Boolean bool = this.c;
                ane ane = this.e;
                String str = this.b;
                Policy policy = this.m;
                Boolean bool2 = this.d;
                boolean z = this.f;
                return new b(policy, playlistRequestDecorationPolicy, ane, str, this.k, bool, bool2, this.g, this.h, z, this.i, qxd, this.j, this.l);
            }

            public final a c(boolean z) {
                this.h = z;
                return this;
            }

            public final a d(boolean z) {
                this.f = z;
                return this;
            }

            public final a e(Boolean bool) {
                this.g = bool;
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
                return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && this.f == aVar.f && h.a(this.g, aVar.g) && this.h == aVar.h && h.a(this.i, aVar.i) && h.a(this.j, aVar.j) && h.a(this.k, aVar.k) && this.l == aVar.l && h.a(this.m, aVar.m) && h.a(this.n, aVar.n);
            }

            public final a f(Boolean bool) {
                this.c = bool;
                return this;
            }

            public final a g(Policy policy) {
                h.e(policy, "policy");
                this.m = policy;
                return this;
            }

            public final a h(Integer num) {
                this.j = num;
                return this;
            }

            public int hashCode() {
                qxd qxd = this.a;
                int i2 = 0;
                int hashCode = (qxd != null ? qxd.hashCode() : 0) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
                ane ane = this.e;
                int hashCode5 = (hashCode4 + (ane != null ? ane.hashCode() : 0)) * 31;
                boolean z = this.f;
                int i3 = 1;
                if (z) {
                    z = true;
                }
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                int i6 = z ? 1 : 0;
                int i7 = (hashCode5 + i4) * 31;
                Boolean bool3 = this.g;
                int hashCode6 = (i7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
                boolean z2 = this.h;
                if (!z2) {
                    i3 = z2 ? 1 : 0;
                }
                int i8 = (hashCode6 + i3) * 31;
                Boolean bool4 = this.i;
                int hashCode7 = (i8 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
                Integer num = this.j;
                int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
                Boolean bool5 = this.k;
                int hashCode9 = (((hashCode8 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.l) * 31;
                Policy policy = this.m;
                int hashCode10 = (hashCode9 + (policy != null ? policy.hashCode() : 0)) * 31;
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = this.n;
                if (playlistRequestDecorationPolicy != null) {
                    i2 = playlistRequestDecorationPolicy.hashCode();
                }
                return hashCode10 + i2;
            }

            public final a i(qxd qxd) {
                this.a = qxd;
                return this;
            }

            public final a j(Boolean bool) {
                this.i = bool;
                return this;
            }

            public final a k(ane ane) {
                this.e = ane;
                return this;
            }

            public final a l(String str) {
                h.e(str, "textFilter");
                this.b = str;
                return this;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(range=");
                V0.append(this.a);
                V0.append(", textFilter=");
                V0.append(this.b);
                V0.append(", isBanned=");
                V0.append(this.c);
                V0.append(", isExplicit=");
                V0.append(this.d);
                V0.append(", sortOrder=");
                V0.append(this.e);
                V0.append(", includeRecs=");
                V0.append(this.f);
                V0.append(", isArtistBanned=");
                V0.append(this.g);
                V0.append(", includeEpisodes=");
                V0.append(this.h);
                V0.append(", showUnavailable=");
                V0.append(this.i);
                V0.append(", originalIndexLessThan=");
                V0.append(this.j);
                V0.append(", availableOfflineOnly=");
                V0.append(this.k);
                V0.append(", updateThrottling=");
                V0.append(this.l);
                V0.append(", jsonPolicy=");
                V0.append(this.m);
                V0.append(", policy=");
                V0.append(this.n);
                V0.append(")");
                return V0.toString();
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(qxd qxd, String str, Boolean bool, Boolean bool2, ane ane, boolean z, Boolean bool3, boolean z2, Boolean bool4, Integer num, Boolean bool5, int i2, Policy policy, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, int i3) {
                this(null, (i3 & 2) != 0 ? "" : null, null, null, null, (i3 & 32) != 0 ? false : z, null, (i3 & 128) != 0 ? true : z2, null, null, null, (i3 & 2048) != 0 ? 500 : i2, null, null);
                int i4 = i3 & 1;
                int i5 = i3 & 4;
                int i6 = i3 & 8;
                int i7 = i3 & 16;
                int i8 = i3 & 64;
                int i9 = i3 & 256;
                int i10 = i3 & 512;
                int i11 = i3 & 1024;
                int i12 = i3 & 4096;
                int i13 = i3 & 8192;
            }
        }

        /* renamed from: com.spotify.playlist.endpoints.d$b$b  reason: collision with other inner class name */
        public static class C0370b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean bool;
                Boolean bool2;
                Boolean bool3;
                Boolean bool4;
                Boolean bool5;
                h.e(parcel, "in");
                Policy policy = parcel.readInt() != 0 ? (Policy) Policy.CREATOR.createFromParcel(parcel) : null;
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) parcel.readValue(PlaylistRequestDecorationPolicy.class.getClassLoader());
                ane ane = (ane) parcel.readParcelable(b.class.getClassLoader());
                String readString = parcel.readString();
                boolean z = true;
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                } else {
                    bool = null;
                }
                if (parcel.readInt() != 0) {
                    bool2 = Boolean.valueOf(parcel.readInt() != 0);
                } else {
                    bool2 = null;
                }
                if (parcel.readInt() != 0) {
                    bool3 = Boolean.valueOf(parcel.readInt() != 0);
                } else {
                    bool3 = null;
                }
                if (parcel.readInt() != 0) {
                    bool4 = Boolean.valueOf(parcel.readInt() != 0);
                } else {
                    bool4 = null;
                }
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    bool5 = Boolean.valueOf(z);
                } else {
                    bool5 = null;
                }
                return new b(policy, playlistRequestDecorationPolicy, ane, readString, bool, bool2, bool3, bool4, z2, z3, bool5, parcel.readInt() != 0 ? (qxd) qxd.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new b[i];
            }
        }

        public interface c {
            public static final ane a;
            public static final ane b;
            public static final ane c;
            public static final ane d;
            public static final ane e;
            public static final ane f;
            public static final ane g;
            public static final ane h;
            public static final List<ane> i;

            static {
                ane ane = new ane("album.artist.name", false, null, 6);
                a = ane;
                ane ane2 = new ane("trackNumber", false, null, 6);
                b = ane2;
                ane ane3 = new ane("discNumber", false, ane2, 2);
                c = ane3;
                ane ane4 = new ane("album.name", false, ane3, 2);
                d = ane4;
                ane ane5 = new ane("artist.name", false, ane4, 2);
                e = ane5;
                ane ane6 = new ane("", false, null, 6);
                f = ane6;
                ane ane7 = new ane("name", false, null, 6);
                g = ane7;
                ane ane8 = new ane("addTime", false, ane4, 2);
                h = ane8;
                i = kotlin.collections.d.u(ane, ane2, ane3, ane4, ane5, ane6, ane7, ane8);
            }
        }

        public b(Policy policy, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, ane ane, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z, boolean z2, Boolean bool5, qxd qxd, Integer num, int i) {
            h.e(str, "textFilter");
            this.a = policy;
            this.b = playlistRequestDecorationPolicy;
            this.c = ane;
            this.f = str;
            this.n = bool;
            this.o = bool2;
            this.p = bool3;
            this.q = bool4;
            this.r = z;
            this.s = z2;
            this.t = bool5;
            this.u = qxd;
            this.v = num;
            this.w = i;
        }

        public static final a b() {
            return new a(null, null, null, null, null, false, null, false, null, null, null, 0, null, null, 16383);
        }

        public final Boolean a() {
            return this.n;
        }

        public final boolean c() {
            return this.r;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.s;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c) && h.a(this.f, bVar.f) && h.a(this.n, bVar.n) && h.a(this.o, bVar.o) && h.a(this.p, bVar.p) && h.a(this.q, bVar.q) && this.r == bVar.r && this.s == bVar.s && h.a(this.t, bVar.t) && h.a(this.u, bVar.u) && h.a(this.v, bVar.v) && this.w == bVar.w;
        }

        public final Boolean f() {
            return this.q;
        }

        public final Boolean g() {
            return this.o;
        }

        public final Boolean h() {
            return this.p;
        }

        @Override // java.lang.Object
        public int hashCode() {
            Policy policy = this.a;
            int i = 0;
            int hashCode = (policy != null ? policy.hashCode() : 0) * 31;
            PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = this.b;
            int hashCode2 = (hashCode + (playlistRequestDecorationPolicy != null ? playlistRequestDecorationPolicy.hashCode() : 0)) * 31;
            ane ane = this.c;
            int hashCode3 = (hashCode2 + (ane != null ? ane.hashCode() : 0)) * 31;
            String str = this.f;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
            Boolean bool = this.n;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.o;
            int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.p;
            int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.q;
            int hashCode8 = (hashCode7 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            boolean z = this.r;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode8 + i3) * 31;
            boolean z2 = this.s;
            if (!z2) {
                i2 = z2 ? 1 : 0;
            }
            int i7 = (i6 + i2) * 31;
            Boolean bool5 = this.t;
            int hashCode9 = (i7 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            qxd qxd = this.u;
            int hashCode10 = (hashCode9 + (qxd != null ? qxd.hashCode() : 0)) * 31;
            Integer num = this.v;
            if (num != null) {
                i = num.hashCode();
            }
            return ((hashCode10 + i) * 31) + this.w;
        }

        public final Policy i() {
            return this.a;
        }

        public final Integer j() {
            return this.v;
        }

        public final PlaylistRequestDecorationPolicy k() {
            return this.b;
        }

        public final qxd l() {
            return this.u;
        }

        public final Boolean m() {
            return this.t;
        }

        public final ane n() {
            return this.c;
        }

        public final String o() {
            return this.f;
        }

        public final a p() {
            qxd qxd = this.u;
            PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = this.b;
            Boolean bool = this.o;
            ane ane = this.c;
            String str = this.f;
            Policy policy = this.a;
            Boolean bool2 = this.p;
            boolean z = this.s;
            Boolean bool3 = this.q;
            boolean z2 = this.r;
            Boolean bool4 = this.t;
            int i = this.w;
            return new a(qxd, str, bool, bool2, ane, z, bool3, z2, bool4, this.v, this.n, i, policy, playlistRequestDecorationPolicy);
        }

        public final int q() {
            return this.w;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("Configuration(jsonPolicy=");
            V0.append(this.a);
            V0.append(", policy=");
            V0.append(this.b);
            V0.append(", sortOrder=");
            V0.append(this.c);
            V0.append(", textFilter=");
            V0.append(this.f);
            V0.append(", availableOfflineOnly=");
            V0.append(this.n);
            V0.append(", isBanned=");
            V0.append(this.o);
            V0.append(", isExplicit=");
            V0.append(this.p);
            V0.append(", isArtistBanned=");
            V0.append(this.q);
            V0.append(", includeEpisodes=");
            V0.append(this.r);
            V0.append(", includeRecs=");
            V0.append(this.s);
            V0.append(", showUnavailable=");
            V0.append(this.t);
            V0.append(", range=");
            V0.append(this.u);
            V0.append(", originalIndexLessThan=");
            V0.append(this.v);
            V0.append(", updateThrottling=");
            return je.B0(V0, this.w, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            Policy policy = this.a;
            if (policy != null) {
                parcel.writeInt(1);
                policy.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeValue(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.f);
            Boolean bool = this.n;
            if (bool != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            Boolean bool2 = this.o;
            if (bool2 != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            Boolean bool3 = this.p;
            if (bool3 != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            Boolean bool4 = this.q;
            if (bool4 != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool4.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.r ? 1 : 0);
            parcel.writeInt(this.s ? 1 : 0);
            Boolean bool5 = this.t;
            if (bool5 != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool5.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            qxd qxd = this.u;
            if (qxd != null) {
                parcel.writeInt(1);
                qxd.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            Integer num = this.v;
            if (num != null) {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.w);
        }

        public b() {
            this(null, PlaylistRequestDecorationPolicy.h(), null, "", null, null, null, null, true, false, null, null, null, 500);
        }
    }

    public static final class c {
        private final List<String> a;
        private final List<String> b;

        public static final class a {
            private List<String> a;
            private List<String> b;

            public a() {
                this(null, null, 3);
            }

            public a(List list, List list2, int i) {
                int i2 = i & 1;
                int i3 = i & 2;
                this.a = null;
                this.b = null;
            }

            public final a a(List<String> list) {
                h.e(list, "allItems");
                this.a = list;
                return this;
            }

            public final c b() {
                List<String> list = this.a;
                h.c(list);
                List<String> list2 = this.b;
                h.c(list2);
                return new c(list, list2);
            }

            public final a c(List<String> list) {
                h.e(list, "nonDuplicateItems");
                this.b = list;
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
                return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
            }

            public int hashCode() {
                List<String> list = this.a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<String> list2 = this.b;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(allItems=");
                V0.append(this.a);
                V0.append(", nonDuplicateItems=");
                return je.L0(V0, this.b, ")");
            }
        }

        public c(List<String> list, List<String> list2) {
            h.e(list, "allItems");
            h.e(list2, "nonDuplicateItems");
            this.a = list;
            this.b = list2;
        }

        public final List<String> a() {
            return this.a;
        }

        public final boolean b() {
            return this.b.isEmpty() && (this.a.isEmpty() ^ true);
        }

        public final boolean c() {
            return this.b.size() != this.a.size();
        }

        public final List<String> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
        }

        public int hashCode() {
            List<String> list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<String> list2 = this.b;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DuplicateResult(allItems=");
            V0.append(this.a);
            V0.append(", nonDuplicateItems=");
            return je.L0(V0, this.b, ")");
        }
    }

    s<k> a(String str, b bVar);

    z<c> b(String str, List<String> list);

    io.reactivex.a c(String str, b bVar, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map<String, String> map, String str2, String str3);

    z<k> d(String str, b bVar);

    s<a> e(String str, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy);
}
