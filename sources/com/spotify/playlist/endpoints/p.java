package com.spotify.playlist.endpoints;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.f;
import com.spotify.playlist.proto.RootlistRequestDecorationPolicy;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;
import kotlin.jvm.internal.h;

public interface p {

    public static final class a implements Parcelable {
        public static final Parcelable.Creator CREATOR = new b();
        private final RootlistRequestPayload a;
        private final RootlistRequestDecorationPolicy b;
        private final ane c;
        private final String f;
        private final Boolean n;
        private final Boolean o;
        private final boolean p;
        private final qxd q;
        private final int r;

        /* renamed from: com.spotify.playlist.endpoints.p$a$a  reason: collision with other inner class name */
        public static final class C0375a {
            private qxd a;
            private String b;
            private Boolean c;
            private ane d;
            private boolean e;
            private Boolean f;
            private int g;
            private RootlistRequestDecorationPolicy h;
            private RootlistRequestPayload i;

            public C0375a() {
                this(null, null, null, null, false, null, 0, null, null, 511);
            }

            public C0375a(qxd qxd, String str, Boolean bool, ane ane, boolean z, Boolean bool2, int i2, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, RootlistRequestPayload rootlistRequestPayload) {
                h.e(str, "textFilter");
                this.a = qxd;
                this.b = str;
                this.c = bool;
                this.d = ane;
                this.e = z;
                this.f = bool2;
                this.g = i2;
                this.h = rootlistRequestDecorationPolicy;
                this.i = rootlistRequestPayload;
            }

            public final C0375a a(Boolean bool) {
                this.f = bool;
                return this;
            }

            public final a b() {
                qxd qxd = this.a;
                RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.h;
                ane ane = this.d;
                String str = this.b;
                Boolean bool = this.c;
                return new a(this.i, rootlistRequestDecorationPolicy, ane, str, this.f, bool, this.e, qxd, this.g);
            }

            public final C0375a c(boolean z) {
                this.e = z;
                return this;
            }

            public final C0375a d(Boolean bool) {
                this.c = bool;
                return this;
            }

            public final C0375a e(RootlistRequestPayload rootlistRequestPayload) {
                h.e(rootlistRequestPayload, "policy");
                this.i = rootlistRequestPayload;
                return this;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0375a)) {
                    return false;
                }
                C0375a aVar = (C0375a) obj;
                return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && this.e == aVar.e && h.a(this.f, aVar.f) && this.g == aVar.g && h.a(this.h, aVar.h) && h.a(this.i, aVar.i);
            }

            public final C0375a f(qxd qxd) {
                this.a = qxd;
                return this;
            }

            public final C0375a g(ane ane) {
                this.d = ane;
                return this;
            }

            public final C0375a h(String str) {
                h.e(str, "textFilter");
                this.b = str;
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
                ane ane = this.d;
                int hashCode4 = (hashCode3 + (ane != null ? ane.hashCode() : 0)) * 31;
                boolean z = this.e;
                if (z) {
                    z = true;
                }
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                int i6 = (hashCode4 + i3) * 31;
                Boolean bool2 = this.f;
                int hashCode5 = (((i6 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.g) * 31;
                RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.h;
                int hashCode6 = (hashCode5 + (rootlistRequestDecorationPolicy != null ? rootlistRequestDecorationPolicy.hashCode() : 0)) * 31;
                RootlistRequestPayload rootlistRequestPayload = this.i;
                if (rootlistRequestPayload != null) {
                    i2 = rootlistRequestPayload.hashCode();
                }
                return hashCode6 + i2;
            }

            public final C0375a i(int i2) {
                this.g = i2;
                return this;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Builder(range=");
                V0.append(this.a);
                V0.append(", textFilter=");
                V0.append(this.b);
                V0.append(", isWritable=");
                V0.append(this.c);
                V0.append(", sortOrder=");
                V0.append(this.d);
                V0.append(", flattenTree=");
                V0.append(this.e);
                V0.append(", availableOfflineOnly=");
                V0.append(this.f);
                V0.append(", updateThrottling=");
                V0.append(this.g);
                V0.append(", policy=");
                V0.append(this.h);
                V0.append(", jsonPolicy=");
                V0.append(this.i);
                V0.append(")");
                return V0.toString();
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C0375a(qxd qxd, String str, Boolean bool, ane ane, boolean z, Boolean bool2, int i2, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, RootlistRequestPayload rootlistRequestPayload, int i3) {
                this(null, (i3 & 2) != 0 ? "" : null, null, null, (i3 & 16) != 0 ? false : z, null, (i3 & 64) != 0 ? 500 : i2, null, (i3 & 256) != 0 ? new RootlistRequestPayload(null, 1, null) : null);
                int i4 = i3 & 1;
                int i5 = i3 & 4;
                int i6 = i3 & 8;
                int i7 = i3 & 32;
                int i8 = i3 & 128;
            }
        }

        public static class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean bool;
                Boolean bool2;
                h.e(parcel, "in");
                RootlistRequestPayload rootlistRequestPayload = parcel.readInt() != 0 ? (RootlistRequestPayload) RootlistRequestPayload.CREATOR.createFromParcel(parcel) : null;
                RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = (RootlistRequestDecorationPolicy) parcel.readValue(RootlistRequestDecorationPolicy.class.getClassLoader());
                ane ane = (ane) parcel.readParcelable(a.class.getClassLoader());
                String readString = parcel.readString();
                boolean z = false;
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
                    z = true;
                }
                return new a(rootlistRequestPayload, rootlistRequestDecorationPolicy, ane, readString, bool, bool2, z, parcel.readInt() != 0 ? (qxd) qxd.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        public interface c {
            public static final ane a;
            public static final ane b;
            public static final ane c;
            public static final ane d;
            public static final ane e;
            public static final ane f;

            static {
                ane ane = new ane("originalIndex", false, null, 6);
                a = ane;
                ane ane2 = new ane("addTime", false, ane, 2);
                b = ane2;
                ane ane3 = new ane("name", false, ane2, 2);
                c = ane3;
                d = new ane("frecencyScore", false, ane3, 2);
                e = new ane("recentlyPlayedRank", false, ane3, 2);
                f = new ane("availableOffline", false, ane, 2);
            }
        }

        public a(RootlistRequestPayload rootlistRequestPayload, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, ane ane, String str, Boolean bool, Boolean bool2, boolean z, qxd qxd, int i) {
            h.e(str, "textFilter");
            this.a = rootlistRequestPayload;
            this.b = rootlistRequestDecorationPolicy;
            this.c = ane;
            this.f = str;
            this.n = bool;
            this.o = bool2;
            this.p = z;
            this.q = qxd;
            this.r = i;
        }

        public static final C0375a b() {
            return new C0375a(null, null, null, null, false, null, 0, null, null, 511);
        }

        public final Boolean a() {
            return this.n;
        }

        public final boolean c() {
            return this.p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Boolean e() {
            return this.o;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.f, aVar.f) && h.a(this.n, aVar.n) && h.a(this.o, aVar.o) && this.p == aVar.p && h.a(this.q, aVar.q) && this.r == aVar.r;
        }

        public final RootlistRequestPayload f() {
            return this.a;
        }

        public final RootlistRequestDecorationPolicy g() {
            return this.b;
        }

        public final qxd h() {
            return this.q;
        }

        @Override // java.lang.Object
        public int hashCode() {
            RootlistRequestPayload rootlistRequestPayload = this.a;
            int i = 0;
            int hashCode = (rootlistRequestPayload != null ? rootlistRequestPayload.hashCode() : 0) * 31;
            RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.b;
            int hashCode2 = (hashCode + (rootlistRequestDecorationPolicy != null ? rootlistRequestDecorationPolicy.hashCode() : 0)) * 31;
            ane ane = this.c;
            int hashCode3 = (hashCode2 + (ane != null ? ane.hashCode() : 0)) * 31;
            String str = this.f;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
            Boolean bool = this.n;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.o;
            int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            boolean z = this.p;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode6 + i2) * 31;
            qxd qxd = this.q;
            if (qxd != null) {
                i = qxd.hashCode();
            }
            return ((i5 + i) * 31) + this.r;
        }

        public final ane i() {
            return this.c;
        }

        public final String j() {
            return this.f;
        }

        public final C0375a k() {
            qxd qxd = this.q;
            RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.b;
            ane ane = this.c;
            String str = this.f;
            Boolean bool = this.o;
            RootlistRequestPayload rootlistRequestPayload = this.a;
            return new C0375a(qxd, str, bool, ane, this.p, this.n, this.r, rootlistRequestDecorationPolicy, rootlistRequestPayload);
        }

        public final int l() {
            return this.r;
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
            V0.append(", isWritable=");
            V0.append(this.o);
            V0.append(", flattenTree=");
            V0.append(this.p);
            V0.append(", range=");
            V0.append(this.q);
            V0.append(", updateThrottling=");
            return je.B0(V0, this.r, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h.e(parcel, "parcel");
            RootlistRequestPayload rootlistRequestPayload = this.a;
            if (rootlistRequestPayload != null) {
                parcel.writeInt(1);
                rootlistRequestPayload.writeToParcel(parcel, 0);
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
            parcel.writeInt(this.p ? 1 : 0);
            qxd qxd = this.q;
            if (qxd != null) {
                parcel.writeInt(1);
                qxd.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.r);
        }

        public a() {
            this(new RootlistRequestPayload(null, 1, null), null, null, "", null, null, false, null, 500);
        }
    }

    public static final class b {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            h.e(str, "uri");
            h.e(str2, "name");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ContainingPlaylist(uri=");
            V0.append(this.a);
            V0.append(", name=");
            return je.I0(V0, this.b, ")");
        }
    }

    z<List<b>> a(String str);

    z<f> b(Optional<String> optional, a aVar);

    z<List<Boolean>> c(List<String> list);

    s<f> d(Optional<String> optional, a aVar);
}
