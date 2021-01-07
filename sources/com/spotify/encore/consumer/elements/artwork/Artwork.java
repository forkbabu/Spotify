package com.spotify.encore.consumer.elements.artwork;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.Element;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.artwork.Placeholder;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Artwork extends Element<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(Artwork artwork, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(artwork, nmf);
        }
    }

    public enum Events {
        ArtworkFetchComplete,
        ArtworkColorExtractionComplete,
        ArtworkFetchError
    }

    public static final class ImageData {
        private final int tag;
        private final String uri;

        public ImageData(String str, int i) {
            this.uri = str;
            this.tag = i;
        }

        public static /* synthetic */ ImageData copy$default(ImageData imageData, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = imageData.uri;
            }
            if ((i2 & 2) != 0) {
                i = imageData.tag;
            }
            return imageData.copy(str, i);
        }

        public final String component1() {
            return this.uri;
        }

        public final int component2() {
            return this.tag;
        }

        public final ImageData copy(String str, int i) {
            return new ImageData(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageData)) {
                return false;
            }
            ImageData imageData = (ImageData) obj;
            return h.a(this.uri, imageData.uri) && this.tag == imageData.tag;
        }

        public final int getTag() {
            return this.tag;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            String str = this.uri;
            return ((str != null ? str.hashCode() : 0) * 31) + this.tag;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ImageData(uri=");
            V0.append(this.uri);
            V0.append(", tag=");
            return je.B0(V0, this.tag, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ImageData(String str, int i, int i2, kotlin.jvm.internal.f fVar) {
            this(str, (i2 & 2) != 0 ? R.id.cover_art_tag : i);
        }

        public ImageData(String str) {
            this(str, R.id.cover_art_tag);
        }
    }

    public static abstract class Model {
        private final ImageData imageData;
        private final Placeholder placeholder;
        private final boolean shouldExtractColor;

        public static final class Album extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Album(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Album(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.ALBUM), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class Artist extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Artist(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Artist(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.ARTIST), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class ArtistCollection extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ArtistCollection(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ArtistCollection(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.ARTIST), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class ArtistSearch extends Model {
            public static final ArtistSearch INSTANCE = new ArtistSearch();

            private ArtistSearch() {
                super(new ImageData(null), new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.SEARCH), false, 4, null);
            }
        }

        public static final class Collection extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Collection(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Collection(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.COLLECTION), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class Episode extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Episode(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Episode(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.PODCASTS), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class Playlist extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Playlist(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Playlist(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.PLAYLIST), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class PlaylistFolder extends Model {
            public static final PlaylistFolder INSTANCE = new PlaylistFolder();

            private PlaylistFolder() {
                super(new ImageData(null), new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.PLAYLIST_FOLDER), false, 4, null);
            }
        }

        public static final class Radio extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Radio(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Radio(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.RADIO), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class Search extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Search(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Search(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.SEARCH), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class Show extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Show(ImageData imageData, boolean z, int i, kotlin.jvm.internal.f fVar) {
                this(imageData, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Show(ImageData imageData, boolean z) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.SHOWS), z, null);
                h.e(imageData, "image");
            }
        }

        public static final class Track extends Model {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Track(ImageData imageData) {
                super(imageData, new Placeholder.SpotifyIconPlaceholder(SpotifyIconV2.TRACK), false, 4, null);
                h.e(imageData, "image");
            }
        }

        public static final class User extends Model {
            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ User(ImageData imageData, String str, int i, boolean z, int i2, kotlin.jvm.internal.f fVar) {
                this(imageData, str, i, (i2 & 8) != 0 ? false : z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public User(ImageData imageData, String str, int i, boolean z) {
                super(imageData, new Placeholder.UserPlaceholder(str, i), z, null);
                h.e(imageData, "image");
                h.e(str, "userInitials");
            }
        }

        private Model(ImageData imageData2, Placeholder placeholder2, boolean z) {
            this.imageData = imageData2;
            this.placeholder = placeholder2;
            this.shouldExtractColor = z;
        }

        public final ImageData getImageData() {
            return this.imageData;
        }

        public final Placeholder getPlaceholder$libs_encore_consumer_elements() {
            return this.placeholder;
        }

        public final boolean getShouldExtractColor() {
            return this.shouldExtractColor;
        }

        public /* synthetic */ Model(ImageData imageData2, Placeholder placeholder2, boolean z, kotlin.jvm.internal.f fVar) {
            this(imageData2, placeholder2, z);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Model(ImageData imageData2, Placeholder placeholder2, boolean z, int i, kotlin.jvm.internal.f fVar) {
            this(imageData2, placeholder2, (i & 4) != 0 ? false : z);
        }
    }
}
