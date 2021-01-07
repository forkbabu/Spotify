package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class RootlistRequestDecorationPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final boolean isLoadingContents;
    private final boolean unfilteredLength;
    private final boolean unrangedLength;

    public static final class a {
        private boolean a;
        private boolean b;
        private boolean c;

        public a() {
            this(false, false, false, 7);
        }

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final RootlistRequestDecorationPolicy a() {
            return new RootlistRequestDecorationPolicy(this.b, this.a, this.c);
        }

        public final a b(boolean z) {
            this.c = z;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }

        public final a d(boolean z) {
            this.a = z;
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
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            boolean z = this.a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.c;
            if (!z3) {
                i = z3 ? 1 : 0;
            }
            return i9 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(unrangedLength=");
            V0.append(this.a);
            V0.append(", unfilteredLength=");
            V0.append(this.b);
            V0.append(", isLoadingContents=");
            return je.P0(V0, this.c, ")");
        }

        public a(boolean z, boolean z2, boolean z3, int i) {
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 2) != 0 ? false : z2;
            z3 = (i & 4) != 0 ? false : z3;
            this.a = z;
            this.b = z2;
            this.c = z3;
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
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new RootlistRequestDecorationPolicy(z2, z3, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RootlistRequestDecorationPolicy[i];
        }
    }

    public RootlistRequestDecorationPolicy() {
        this(false, false, false, 7, null);
    }

    public RootlistRequestDecorationPolicy(boolean z, boolean z2, boolean z3) {
        this.unfilteredLength = z;
        this.unrangedLength = z2;
        this.isLoadingContents = z3;
    }

    public static final a builder() {
        Companion.getClass();
        return new a(false, false, false, 7);
    }

    public static /* synthetic */ RootlistRequestDecorationPolicy copy$default(RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rootlistRequestDecorationPolicy.unfilteredLength;
        }
        if ((i & 2) != 0) {
            z2 = rootlistRequestDecorationPolicy.unrangedLength;
        }
        if ((i & 4) != 0) {
            z3 = rootlistRequestDecorationPolicy.isLoadingContents;
        }
        return rootlistRequestDecorationPolicy.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.unfilteredLength;
    }

    public final boolean component2() {
        return this.unrangedLength;
    }

    public final boolean component3() {
        return this.isLoadingContents;
    }

    public final RootlistRequestDecorationPolicy copy(boolean z, boolean z2, boolean z3) {
        return new RootlistRequestDecorationPolicy(z, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RootlistRequestDecorationPolicy)) {
            return false;
        }
        RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = (RootlistRequestDecorationPolicy) obj;
        return this.unfilteredLength == rootlistRequestDecorationPolicy.unfilteredLength && this.unrangedLength == rootlistRequestDecorationPolicy.unrangedLength && this.isLoadingContents == rootlistRequestDecorationPolicy.isLoadingContents;
    }

    @Override // java.lang.Object
    public int hashCode() {
        boolean z = this.unfilteredLength;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.unrangedLength;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isLoadingContents;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return i9 + i;
    }

    @JsonProperty("isLoadingContents")
    public final boolean isLoadingContents() {
        return this.isLoadingContents;
    }

    public final a toBuilder() {
        return new a(this.unrangedLength, this.unfilteredLength, this.isLoadingContents);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("RootlistRequestDecorationPolicy(unfilteredLength=");
        V0.append(this.unfilteredLength);
        V0.append(", unrangedLength=");
        V0.append(this.unrangedLength);
        V0.append(", isLoadingContents=");
        return je.P0(V0, this.isLoadingContents, ")");
    }

    @JsonProperty("unfilteredLength")
    public final boolean unfilteredLength() {
        return this.unfilteredLength;
    }

    @JsonProperty("unrangedLength")
    public final boolean unrangedLength() {
        return this.unrangedLength;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.unfilteredLength ? 1 : 0);
        parcel.writeInt(this.unrangedLength ? 1 : 0);
        parcel.writeInt(this.isLoadingContents ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RootlistRequestDecorationPolicy(boolean z, boolean z2, boolean z3, int i, f fVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
