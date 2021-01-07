package com.spotify.encore.consumer.components.yourlibrary.api.elements;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface LibraryItemDescription extends Element {

    public static final class DefaultImpls {
        public static void onEvent(LibraryItemDescription libraryItemDescription, nmf<?, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(libraryItemDescription, nmf);
        }
    }

    public static abstract class Model {

        public static final class Album extends Model {
            private final String artist;
            private final boolean includeType;

            public Album(String str, boolean z) {
                super(null);
                this.artist = str;
                this.includeType = z;
            }

            public static /* synthetic */ Album copy$default(Album album, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = album.artist;
                }
                if ((i & 2) != 0) {
                    z = album.includeType;
                }
                return album.copy(str, z);
            }

            public final String component1() {
                return this.artist;
            }

            public final boolean component2() {
                return this.includeType;
            }

            public final Album copy(String str, boolean z) {
                return new Album(str, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Album)) {
                    return false;
                }
                Album album = (Album) obj;
                return h.a(this.artist, album.artist) && this.includeType == album.includeType;
            }

            public final String getArtist() {
                return this.artist;
            }

            public final boolean getIncludeType() {
                return this.includeType;
            }

            public int hashCode() {
                String str = this.artist;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.includeType;
                if (z) {
                    z = true;
                }
                int i = z ? 1 : 0;
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                return hashCode + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Album(artist=");
                V0.append(this.artist);
                V0.append(", includeType=");
                return je.P0(V0, this.includeType, ")");
            }
        }

        public static final class Artist extends Model {
            private final boolean includeType;

            public Artist(boolean z) {
                super(null);
                this.includeType = z;
            }

            public static /* synthetic */ Artist copy$default(Artist artist, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = artist.includeType;
                }
                return artist.copy(z);
            }

            public final boolean component1() {
                return this.includeType;
            }

            public final Artist copy(boolean z) {
                return new Artist(z);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Artist) && this.includeType == ((Artist) obj).includeType;
                }
                return true;
            }

            public final boolean getIncludeType() {
                return this.includeType;
            }

            public int hashCode() {
                boolean z = this.includeType;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                return je.P0(je.V0("Artist(includeType="), this.includeType, ")");
            }
        }

        public static final class Folder extends Model {
            private final int numberOfFolders;
            private final int numberOfPlaylists;

            public Folder(int i, int i2) {
                super(null);
                this.numberOfPlaylists = i;
                this.numberOfFolders = i2;
            }

            public static /* synthetic */ Folder copy$default(Folder folder, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = folder.numberOfPlaylists;
                }
                if ((i3 & 2) != 0) {
                    i2 = folder.numberOfFolders;
                }
                return folder.copy(i, i2);
            }

            public final int component1() {
                return this.numberOfPlaylists;
            }

            public final int component2() {
                return this.numberOfFolders;
            }

            public final Folder copy(int i, int i2) {
                return new Folder(i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Folder)) {
                    return false;
                }
                Folder folder = (Folder) obj;
                return this.numberOfPlaylists == folder.numberOfPlaylists && this.numberOfFolders == folder.numberOfFolders;
            }

            public final int getNumberOfFolders() {
                return this.numberOfFolders;
            }

            public final int getNumberOfPlaylists() {
                return this.numberOfPlaylists;
            }

            public int hashCode() {
                return (this.numberOfPlaylists * 31) + this.numberOfFolders;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Folder(numberOfPlaylists=");
                V0.append(this.numberOfPlaylists);
                V0.append(", numberOfFolders=");
                return je.B0(V0, this.numberOfFolders, ")");
            }
        }

        public static final class LikedSongs extends Model {
            private final boolean includeType;
            private final int numberOfSongs;

            public LikedSongs(int i, boolean z) {
                super(null);
                this.numberOfSongs = i;
                this.includeType = z;
            }

            public static /* synthetic */ LikedSongs copy$default(LikedSongs likedSongs, int i, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = likedSongs.numberOfSongs;
                }
                if ((i2 & 2) != 0) {
                    z = likedSongs.includeType;
                }
                return likedSongs.copy(i, z);
            }

            public final int component1() {
                return this.numberOfSongs;
            }

            public final boolean component2() {
                return this.includeType;
            }

            public final LikedSongs copy(int i, boolean z) {
                return new LikedSongs(i, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LikedSongs)) {
                    return false;
                }
                LikedSongs likedSongs = (LikedSongs) obj;
                return this.numberOfSongs == likedSongs.numberOfSongs && this.includeType == likedSongs.includeType;
            }

            public final boolean getIncludeType() {
                return this.includeType;
            }

            public final int getNumberOfSongs() {
                return this.numberOfSongs;
            }

            public int hashCode() {
                int i = this.numberOfSongs * 31;
                boolean z = this.includeType;
                if (z) {
                    z = true;
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                return i + i2;
            }

            public String toString() {
                StringBuilder V0 = je.V0("LikedSongs(numberOfSongs=");
                V0.append(this.numberOfSongs);
                V0.append(", includeType=");
                return je.P0(V0, this.includeType, ")");
            }
        }

        public static final class Playlist extends Model {
            private final String creator;
            private final boolean includeType;

            public Playlist(String str, boolean z) {
                super(null);
                this.creator = str;
                this.includeType = z;
            }

            public static /* synthetic */ Playlist copy$default(Playlist playlist, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = playlist.creator;
                }
                if ((i & 2) != 0) {
                    z = playlist.includeType;
                }
                return playlist.copy(str, z);
            }

            public final String component1() {
                return this.creator;
            }

            public final boolean component2() {
                return this.includeType;
            }

            public final Playlist copy(String str, boolean z) {
                return new Playlist(str, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Playlist)) {
                    return false;
                }
                Playlist playlist = (Playlist) obj;
                return h.a(this.creator, playlist.creator) && this.includeType == playlist.includeType;
            }

            public final String getCreator() {
                return this.creator;
            }

            public final boolean getIncludeType() {
                return this.includeType;
            }

            public int hashCode() {
                String str = this.creator;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.includeType;
                if (z) {
                    z = true;
                }
                int i = z ? 1 : 0;
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                return hashCode + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Playlist(creator=");
                V0.append(this.creator);
                V0.append(", includeType=");
                return je.P0(V0, this.includeType, ")");
            }
        }

        public static final class Show extends Model {
            private final String creator;
            private final boolean includeType;
            private final UpdateDate updateDate;

            public Show(String str, UpdateDate updateDate2, boolean z) {
                super(null);
                this.creator = str;
                this.updateDate = updateDate2;
                this.includeType = z;
            }

            public static /* synthetic */ Show copy$default(Show show, String str, UpdateDate updateDate2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = show.creator;
                }
                if ((i & 2) != 0) {
                    updateDate2 = show.updateDate;
                }
                if ((i & 4) != 0) {
                    z = show.includeType;
                }
                return show.copy(str, updateDate2, z);
            }

            public final String component1() {
                return this.creator;
            }

            public final UpdateDate component2() {
                return this.updateDate;
            }

            public final boolean component3() {
                return this.includeType;
            }

            public final Show copy(String str, UpdateDate updateDate2, boolean z) {
                return new Show(str, updateDate2, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Show)) {
                    return false;
                }
                Show show = (Show) obj;
                return h.a(this.creator, show.creator) && h.a(this.updateDate, show.updateDate) && this.includeType == show.includeType;
            }

            public final String getCreator() {
                return this.creator;
            }

            public final boolean getIncludeType() {
                return this.includeType;
            }

            public final UpdateDate getUpdateDate() {
                return this.updateDate;
            }

            public int hashCode() {
                String str = this.creator;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                UpdateDate updateDate2 = this.updateDate;
                if (updateDate2 != null) {
                    i = updateDate2.hashCode();
                }
                int i2 = (hashCode + i) * 31;
                boolean z = this.includeType;
                if (z) {
                    z = true;
                }
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                return i2 + i3;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Show(creator=");
                V0.append(this.creator);
                V0.append(", updateDate=");
                V0.append(this.updateDate);
                V0.append(", includeType=");
                return je.P0(V0, this.includeType, ")");
            }
        }

        public static final class YourEpisodes extends Model {
            private final boolean includeType;
            private final int numberOfEpisodes;

            public YourEpisodes(int i, boolean z) {
                super(null);
                this.numberOfEpisodes = i;
                this.includeType = z;
            }

            public static /* synthetic */ YourEpisodes copy$default(YourEpisodes yourEpisodes, int i, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = yourEpisodes.numberOfEpisodes;
                }
                if ((i2 & 2) != 0) {
                    z = yourEpisodes.includeType;
                }
                return yourEpisodes.copy(i, z);
            }

            public final int component1() {
                return this.numberOfEpisodes;
            }

            public final boolean component2() {
                return this.includeType;
            }

            public final YourEpisodes copy(int i, boolean z) {
                return new YourEpisodes(i, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof YourEpisodes)) {
                    return false;
                }
                YourEpisodes yourEpisodes = (YourEpisodes) obj;
                return this.numberOfEpisodes == yourEpisodes.numberOfEpisodes && this.includeType == yourEpisodes.includeType;
            }

            public final boolean getIncludeType() {
                return this.includeType;
            }

            public final int getNumberOfEpisodes() {
                return this.numberOfEpisodes;
            }

            public int hashCode() {
                int i = this.numberOfEpisodes * 31;
                boolean z = this.includeType;
                if (z) {
                    z = true;
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                return i + i2;
            }

            public String toString() {
                StringBuilder V0 = je.V0("YourEpisodes(numberOfEpisodes=");
                V0.append(this.numberOfEpisodes);
                V0.append(", includeType=");
                return je.P0(V0, this.includeType, ")");
            }
        }

        private Model() {
        }

        public /* synthetic */ Model(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class UpdateDate {
        private final int daysAgo;
        private final long timestampMillis;

        public UpdateDate(long j, int i) {
            this.timestampMillis = j;
            this.daysAgo = i;
        }

        public static /* synthetic */ UpdateDate copy$default(UpdateDate updateDate, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = updateDate.timestampMillis;
            }
            if ((i2 & 2) != 0) {
                i = updateDate.daysAgo;
            }
            return updateDate.copy(j, i);
        }

        public final long component1() {
            return this.timestampMillis;
        }

        public final int component2() {
            return this.daysAgo;
        }

        public final UpdateDate copy(long j, int i) {
            return new UpdateDate(j, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateDate)) {
                return false;
            }
            UpdateDate updateDate = (UpdateDate) obj;
            return this.timestampMillis == updateDate.timestampMillis && this.daysAgo == updateDate.daysAgo;
        }

        public final int getDaysAgo() {
            return this.daysAgo;
        }

        public final long getTimestampMillis() {
            return this.timestampMillis;
        }

        public int hashCode() {
            return (e.a(this.timestampMillis) * 31) + this.daysAgo;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateDate(timestampMillis=");
            V0.append(this.timestampMillis);
            V0.append(", daysAgo=");
            return je.B0(V0, this.daysAgo, ")");
        }
    }
}
