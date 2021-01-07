package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class FolderRequestPolicy implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public static final b Companion = new b(null);
    private final FolderMetadataDecorationPolicy folder;
    private final PlaylistMetadataDecorationPolicy playlist;
    private final RootlistRequestDecorationPolicy request;

    public static final class a {
        private FolderMetadataDecorationPolicy a;
        private RootlistRequestDecorationPolicy b;
        private PlaylistMetadataDecorationPolicy c;

        public a() {
            this(null, null, null, 7);
        }

        public a(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy) {
            h.e(folderMetadataDecorationPolicy, "folder");
            h.e(rootlistRequestDecorationPolicy, "request");
            h.e(playlistMetadataDecorationPolicy, "playlist");
            this.a = folderMetadataDecorationPolicy;
            this.b = rootlistRequestDecorationPolicy;
            this.c = playlistMetadataDecorationPolicy;
        }

        public final FolderRequestPolicy a() {
            return new FolderRequestPolicy(this.a, this.b, this.c);
        }

        public final a b(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy) {
            h.e(folderMetadataDecorationPolicy, "folder");
            this.a = folderMetadataDecorationPolicy;
            return this;
        }

        public final a c(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy) {
            h.e(playlistMetadataDecorationPolicy, "playlist");
            this.c = playlistMetadataDecorationPolicy;
            return this;
        }

        public final a d(RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy) {
            h.e(rootlistRequestDecorationPolicy, "request");
            this.b = rootlistRequestDecorationPolicy;
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c);
        }

        public int hashCode() {
            FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = this.a;
            int i = 0;
            int hashCode = (folderMetadataDecorationPolicy != null ? folderMetadataDecorationPolicy.hashCode() : 0) * 31;
            RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.b;
            int hashCode2 = (hashCode + (rootlistRequestDecorationPolicy != null ? rootlistRequestDecorationPolicy.hashCode() : 0)) * 31;
            PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy = this.c;
            if (playlistMetadataDecorationPolicy != null) {
                i = playlistMetadataDecorationPolicy.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(folder=");
            V0.append(this.a);
            V0.append(", request=");
            V0.append(this.b);
            V0.append(", playlist=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, int i) {
            this((i & 1) != 0 ? new FolderMetadataDecorationPolicy(false, false, false, false, false, false, false, false, false, false, false, 2047, null) : null, (i & 2) != 0 ? new RootlistRequestDecorationPolicy(false, false, false, 7, null) : null, (i & 4) != 0 ? new PlaylistMetadataDecorationPolicy(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, 1073741823, null) : null);
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
            return new FolderRequestPolicy((FolderMetadataDecorationPolicy) FolderMetadataDecorationPolicy.CREATOR.createFromParcel(parcel), (RootlistRequestDecorationPolicy) RootlistRequestDecorationPolicy.CREATOR.createFromParcel(parcel), (PlaylistMetadataDecorationPolicy) PlaylistMetadataDecorationPolicy.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FolderRequestPolicy[i];
        }
    }

    public FolderRequestPolicy() {
        this(null, null, null, 7, null);
    }

    public FolderRequestPolicy(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy) {
        h.e(folderMetadataDecorationPolicy, "folder");
        h.e(rootlistRequestDecorationPolicy, "request");
        h.e(playlistMetadataDecorationPolicy, "playlist");
        this.folder = folderMetadataDecorationPolicy;
        this.request = rootlistRequestDecorationPolicy;
        this.playlist = playlistMetadataDecorationPolicy;
    }

    public static final a builder() {
        Companion.getClass();
        return new a(null, null, null, 7);
    }

    public static /* synthetic */ FolderRequestPolicy copy$default(FolderRequestPolicy folderRequestPolicy, FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            folderMetadataDecorationPolicy = folderRequestPolicy.folder;
        }
        if ((i & 2) != 0) {
            rootlistRequestDecorationPolicy = folderRequestPolicy.request;
        }
        if ((i & 4) != 0) {
            playlistMetadataDecorationPolicy = folderRequestPolicy.playlist;
        }
        return folderRequestPolicy.copy(folderMetadataDecorationPolicy, rootlistRequestDecorationPolicy, playlistMetadataDecorationPolicy);
    }

    public final FolderMetadataDecorationPolicy component1() {
        return this.folder;
    }

    public final RootlistRequestDecorationPolicy component2() {
        return this.request;
    }

    public final PlaylistMetadataDecorationPolicy component3() {
        return this.playlist;
    }

    public final FolderRequestPolicy copy(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy) {
        h.e(folderMetadataDecorationPolicy, "folder");
        h.e(rootlistRequestDecorationPolicy, "request");
        h.e(playlistMetadataDecorationPolicy, "playlist");
        return new FolderRequestPolicy(folderMetadataDecorationPolicy, rootlistRequestDecorationPolicy, playlistMetadataDecorationPolicy);
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
        if (!(obj instanceof FolderRequestPolicy)) {
            return false;
        }
        FolderRequestPolicy folderRequestPolicy = (FolderRequestPolicy) obj;
        return h.a(this.folder, folderRequestPolicy.folder) && h.a(this.request, folderRequestPolicy.request) && h.a(this.playlist, folderRequestPolicy.playlist);
    }

    @JsonProperty("folder")
    public final FolderMetadataDecorationPolicy folder() {
        return this.folder;
    }

    @Override // java.lang.Object
    public int hashCode() {
        FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = this.folder;
        int i = 0;
        int hashCode = (folderMetadataDecorationPolicy != null ? folderMetadataDecorationPolicy.hashCode() : 0) * 31;
        RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy = this.request;
        int hashCode2 = (hashCode + (rootlistRequestDecorationPolicy != null ? rootlistRequestDecorationPolicy.hashCode() : 0)) * 31;
        PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy = this.playlist;
        if (playlistMetadataDecorationPolicy != null) {
            i = playlistMetadataDecorationPolicy.hashCode();
        }
        return hashCode2 + i;
    }

    @JsonProperty("playlist")
    public final PlaylistMetadataDecorationPolicy playlist() {
        return this.playlist;
    }

    @JsonProperty("request")
    public final RootlistRequestDecorationPolicy request() {
        return this.request;
    }

    public final a toBuilder() {
        return new a(this.folder, this.request, this.playlist);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FolderRequestPolicy(folder=");
        V0.append(this.folder);
        V0.append(", request=");
        V0.append(this.request);
        V0.append(", playlist=");
        V0.append(this.playlist);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        this.folder.writeToParcel(parcel, 0);
        this.request.writeToParcel(parcel, 0);
        this.playlist.writeToParcel(parcel, 0);
    }

    public /* synthetic */ FolderRequestPolicy(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, int i, f fVar) {
        PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy2;
        FolderRequestPolicy folderRequestPolicy;
        FolderMetadataDecorationPolicy folderMetadataDecorationPolicy2 = (i & 1) != 0 ? new FolderMetadataDecorationPolicy(false, false, false, false, false, false, false, false, false, false, false, 2047, null) : folderMetadataDecorationPolicy;
        RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy2 = (i & 2) != 0 ? new RootlistRequestDecorationPolicy(false, false, false, 7, null) : rootlistRequestDecorationPolicy;
        if ((i & 4) != 0) {
            playlistMetadataDecorationPolicy2 = new PlaylistMetadataDecorationPolicy(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, 1073741823, null);
            folderRequestPolicy = this;
        } else {
            folderRequestPolicy = this;
            playlistMetadataDecorationPolicy2 = playlistMetadataDecorationPolicy;
        }
        new FolderRequestPolicy(folderMetadataDecorationPolicy2, rootlistRequestDecorationPolicy2, playlistMetadataDecorationPolicy2);
    }
}
