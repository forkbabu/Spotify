package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PlaylistUserDecorationPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final boolean link;
    private final boolean name;
    private final boolean username;

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

        public final PlaylistUserDecorationPolicy a() {
            return new PlaylistUserDecorationPolicy(this.c, this.a, this.b);
        }

        public final a b(boolean z) {
            this.a = z;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }

        public final a d(boolean z) {
            this.c = z;
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
            StringBuilder V0 = je.V0("Builder(link=");
            V0.append(this.a);
            V0.append(", name=");
            V0.append(this.b);
            V0.append(", username=");
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
            return new PlaylistUserDecorationPolicy(z2, z3, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistUserDecorationPolicy[i];
        }
    }

    public PlaylistUserDecorationPolicy() {
        this(false, false, false, 7, null);
    }

    public PlaylistUserDecorationPolicy(boolean z, boolean z2, boolean z3) {
        this.username = z;
        this.link = z2;
        this.name = z3;
    }

    public static final a builder() {
        Companion.getClass();
        return new a(false, false, false, 7);
    }

    public static /* synthetic */ PlaylistUserDecorationPolicy copy$default(PlaylistUserDecorationPolicy playlistUserDecorationPolicy, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = playlistUserDecorationPolicy.username;
        }
        if ((i & 2) != 0) {
            z2 = playlistUserDecorationPolicy.link;
        }
        if ((i & 4) != 0) {
            z3 = playlistUserDecorationPolicy.name;
        }
        return playlistUserDecorationPolicy.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.username;
    }

    public final boolean component2() {
        return this.link;
    }

    public final boolean component3() {
        return this.name;
    }

    public final PlaylistUserDecorationPolicy copy(boolean z, boolean z2, boolean z3) {
        return new PlaylistUserDecorationPolicy(z, z2, z3);
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
        if (!(obj instanceof PlaylistUserDecorationPolicy)) {
            return false;
        }
        PlaylistUserDecorationPolicy playlistUserDecorationPolicy = (PlaylistUserDecorationPolicy) obj;
        return this.username == playlistUserDecorationPolicy.username && this.link == playlistUserDecorationPolicy.link && this.name == playlistUserDecorationPolicy.name;
    }

    @Override // java.lang.Object
    public int hashCode() {
        boolean z = this.username;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.link;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.name;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return i9 + i;
    }

    @JsonProperty("link")
    public final boolean link() {
        return this.link;
    }

    @JsonProperty("name")
    public final boolean name() {
        return this.name;
    }

    public final a toBuilder() {
        return new a(this.link, this.name, this.username);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PlaylistUserDecorationPolicy(username=");
        V0.append(this.username);
        V0.append(", link=");
        V0.append(this.link);
        V0.append(", name=");
        return je.P0(V0, this.name, ")");
    }

    @JsonProperty("username")
    public final boolean username() {
        return this.username;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.username ? 1 : 0);
        parcel.writeInt(this.link ? 1 : 0);
        parcel.writeInt(this.name ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlaylistUserDecorationPolicy(boolean z, boolean z2, boolean z3, int i, f fVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
