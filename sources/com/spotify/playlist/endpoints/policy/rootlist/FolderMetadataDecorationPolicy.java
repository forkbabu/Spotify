package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class FolderMetadataDecorationPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final boolean addTime;
    private final boolean folders;
    private final boolean groupLabel;
    private final boolean id;
    private final boolean link;
    private final boolean name;
    private final boolean playlists;
    private final boolean recursiveFolders;
    private final boolean recursivePlaylists;
    private final boolean rowId;
    private final boolean rows;

    public static final class a {
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

        public a() {
            this(false, false, false, false, false, false, false, false, false, false, false, 2047);
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
            this.g = z7;
            this.h = z8;
            this.i = z9;
            this.j = z10;
            this.k = z11;
        }

        public final a a(boolean z) {
            this.g = z;
            return this;
        }

        public final FolderMetadataDecorationPolicy b() {
            boolean z = this.a;
            boolean z2 = this.b;
            boolean z3 = this.d;
            boolean z4 = this.c;
            return new FolderMetadataDecorationPolicy(this.e, this.g, z, z2, z3, this.f, this.h, this.j, this.k, z4, this.i);
        }

        public final a c(boolean z) {
            this.f = z;
            return this;
        }

        public final a d(boolean z) {
            this.i = z;
            return this;
        }

        public final a e(boolean z) {
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
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k;
        }

        public final a f(boolean z) {
            this.b = z;
            return this;
        }

        public final a g(boolean z) {
            this.d = z;
            return this;
        }

        public final a h(boolean z) {
            this.h = z;
            return this;
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
            boolean z10 = this.j;
            if (z10) {
                z10 = true;
            }
            int i39 = z10 ? 1 : 0;
            int i40 = z10 ? 1 : 0;
            int i41 = z10 ? 1 : 0;
            int i42 = (i38 + i39) * 31;
            boolean z11 = this.k;
            if (!z11) {
                i2 = z11 ? 1 : 0;
            }
            return i42 + i2;
        }

        public final a i(boolean z) {
            this.k = z;
            return this;
        }

        public final a j(boolean z) {
            this.e = z;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(id=");
            V0.append(this.a);
            V0.append(", link=");
            V0.append(this.b);
            V0.append(", rows=");
            V0.append(this.c);
            V0.append(", name=");
            V0.append(this.d);
            V0.append(", rowId=");
            V0.append(this.e);
            V0.append(", folders=");
            V0.append(this.f);
            V0.append(", addTime=");
            V0.append(this.g);
            V0.append(", playlists=");
            V0.append(this.h);
            V0.append(", groupLabel=");
            V0.append(this.i);
            V0.append(", recursiveFolders=");
            V0.append(this.j);
            V0.append(", recursivePlaylists=");
            return je.P0(V0, this.k, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i2) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (i2 & 64) != 0 ? false : z7, (i2 & 128) != 0 ? false : z8, (i2 & 256) != 0 ? false : z9, (i2 & 512) != 0 ? false : z10, (i2 & 1024) == 0 ? z11 : false);
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
            return new FolderMetadataDecorationPolicy(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FolderMetadataDecorationPolicy[i];
        }
    }

    public FolderMetadataDecorationPolicy() {
        this(false, false, false, false, false, false, false, false, false, false, false, 2047, null);
    }

    public FolderMetadataDecorationPolicy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.rowId = z;
        this.addTime = z2;
        this.id = z3;
        this.link = z4;
        this.name = z5;
        this.folders = z6;
        this.playlists = z7;
        this.recursiveFolders = z8;
        this.recursivePlaylists = z9;
        this.rows = z10;
        this.groupLabel = z11;
    }

    public static final a builder() {
        Companion.getClass();
        return new a(false, false, false, false, false, false, false, false, false, false, false, 2047);
    }

    public static /* synthetic */ FolderMetadataDecorationPolicy copy$default(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, Object obj) {
        return folderMetadataDecorationPolicy.copy((i & 1) != 0 ? folderMetadataDecorationPolicy.rowId : z, (i & 2) != 0 ? folderMetadataDecorationPolicy.addTime : z2, (i & 4) != 0 ? folderMetadataDecorationPolicy.id : z3, (i & 8) != 0 ? folderMetadataDecorationPolicy.link : z4, (i & 16) != 0 ? folderMetadataDecorationPolicy.name : z5, (i & 32) != 0 ? folderMetadataDecorationPolicy.folders : z6, (i & 64) != 0 ? folderMetadataDecorationPolicy.playlists : z7, (i & 128) != 0 ? folderMetadataDecorationPolicy.recursiveFolders : z8, (i & 256) != 0 ? folderMetadataDecorationPolicy.recursivePlaylists : z9, (i & 512) != 0 ? folderMetadataDecorationPolicy.rows : z10, (i & 1024) != 0 ? folderMetadataDecorationPolicy.groupLabel : z11);
    }

    @JsonProperty("addTime")
    public final boolean addTime() {
        return this.addTime;
    }

    public final boolean component1() {
        return this.rowId;
    }

    public final boolean component10() {
        return this.rows;
    }

    public final boolean component11() {
        return this.groupLabel;
    }

    public final boolean component2() {
        return this.addTime;
    }

    public final boolean component3() {
        return this.id;
    }

    public final boolean component4() {
        return this.link;
    }

    public final boolean component5() {
        return this.name;
    }

    public final boolean component6() {
        return this.folders;
    }

    public final boolean component7() {
        return this.playlists;
    }

    public final boolean component8() {
        return this.recursiveFolders;
    }

    public final boolean component9() {
        return this.recursivePlaylists;
    }

    public final FolderMetadataDecorationPolicy copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return new FolderMetadataDecorationPolicy(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
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
        if (!(obj instanceof FolderMetadataDecorationPolicy)) {
            return false;
        }
        FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = (FolderMetadataDecorationPolicy) obj;
        return this.rowId == folderMetadataDecorationPolicy.rowId && this.addTime == folderMetadataDecorationPolicy.addTime && this.id == folderMetadataDecorationPolicy.id && this.link == folderMetadataDecorationPolicy.link && this.name == folderMetadataDecorationPolicy.name && this.folders == folderMetadataDecorationPolicy.folders && this.playlists == folderMetadataDecorationPolicy.playlists && this.recursiveFolders == folderMetadataDecorationPolicy.recursiveFolders && this.recursivePlaylists == folderMetadataDecorationPolicy.recursivePlaylists && this.rows == folderMetadataDecorationPolicy.rows && this.groupLabel == folderMetadataDecorationPolicy.groupLabel;
    }

    @JsonProperty("folders")
    public final boolean folders() {
        return this.folders;
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
        boolean z3 = this.id;
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
        boolean z6 = this.folders;
        if (z6) {
            z6 = true;
        }
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        boolean z7 = this.playlists;
        if (z7) {
            z7 = true;
        }
        int i26 = z7 ? 1 : 0;
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        boolean z8 = this.recursiveFolders;
        if (z8) {
            z8 = true;
        }
        int i30 = z8 ? 1 : 0;
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = (i29 + i30) * 31;
        boolean z9 = this.recursivePlaylists;
        if (z9) {
            z9 = true;
        }
        int i34 = z9 ? 1 : 0;
        int i35 = z9 ? 1 : 0;
        int i36 = z9 ? 1 : 0;
        int i37 = (i33 + i34) * 31;
        boolean z10 = this.rows;
        if (z10) {
            z10 = true;
        }
        int i38 = z10 ? 1 : 0;
        int i39 = z10 ? 1 : 0;
        int i40 = z10 ? 1 : 0;
        int i41 = (i37 + i38) * 31;
        boolean z11 = this.groupLabel;
        if (!z11) {
            i = z11 ? 1 : 0;
        }
        return i41 + i;
    }

    @JsonProperty("id")
    public final boolean id() {
        return this.id;
    }

    @JsonProperty("link")
    public final boolean link() {
        return this.link;
    }

    @JsonProperty("name")
    public final boolean name() {
        return this.name;
    }

    @JsonProperty("playlists")
    public final boolean playlists() {
        return this.playlists;
    }

    @JsonProperty("recursiveFolders")
    public final boolean recursiveFolders() {
        return this.recursiveFolders;
    }

    @JsonProperty("recursivePlaylists")
    public final boolean recursivePlaylists() {
        return this.recursivePlaylists;
    }

    @JsonProperty("rowId")
    public final boolean rowId() {
        return this.rowId;
    }

    @JsonProperty("rows")
    public final boolean rows() {
        return this.rows;
    }

    public final a toBuilder() {
        boolean z = this.id;
        boolean z2 = this.link;
        boolean z3 = this.name;
        return new a(z, z2, this.rows, z3, this.rowId, this.folders, this.addTime, this.playlists, this.groupLabel, this.recursiveFolders, this.recursivePlaylists);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FolderMetadataDecorationPolicy(rowId=");
        V0.append(this.rowId);
        V0.append(", addTime=");
        V0.append(this.addTime);
        V0.append(", id=");
        V0.append(this.id);
        V0.append(", link=");
        V0.append(this.link);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", folders=");
        V0.append(this.folders);
        V0.append(", playlists=");
        V0.append(this.playlists);
        V0.append(", recursiveFolders=");
        V0.append(this.recursiveFolders);
        V0.append(", recursivePlaylists=");
        V0.append(this.recursivePlaylists);
        V0.append(", rows=");
        V0.append(this.rows);
        V0.append(", groupLabel=");
        return je.P0(V0, this.groupLabel, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.rowId ? 1 : 0);
        parcel.writeInt(this.addTime ? 1 : 0);
        parcel.writeInt(this.id ? 1 : 0);
        parcel.writeInt(this.link ? 1 : 0);
        parcel.writeInt(this.name ? 1 : 0);
        parcel.writeInt(this.folders ? 1 : 0);
        parcel.writeInt(this.playlists ? 1 : 0);
        parcel.writeInt(this.recursiveFolders ? 1 : 0);
        parcel.writeInt(this.recursivePlaylists ? 1 : 0);
        parcel.writeInt(this.rows ? 1 : 0);
        parcel.writeInt(this.groupLabel ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FolderMetadataDecorationPolicy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, f fVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) == 0 ? z11 : false);
    }
}
