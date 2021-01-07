package com.spotify.encore.consumer.components.yourlibrary.api.artistcard;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ArtistCardLibrary extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultArtistCardLibraryConfiguration implements Configuration {
            public static final DefaultArtistCardLibraryConfiguration INSTANCE = new DefaultArtistCardLibraryConfiguration();

            private DefaultArtistCardLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(ArtistCardLibrary artistCardLibrary, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(artistCardLibrary, nmf);
        }
    }

    public enum Events {
        CardClicked,
        CardLongClicked
    }

    public static final class Model {
        private final Artwork.ImageData artwork;
        private final LibraryItemDescription.Model.Artist description;
        private final boolean isPinned;
        private final boolean isPlaying;
        private final String name;

        public Model(String str, LibraryItemDescription.Model.Artist artist, Artwork.ImageData imageData, boolean z, boolean z2) {
            h.e(str, "name");
            h.e(artist, "description");
            h.e(imageData, "artwork");
            this.name = str;
            this.description = artist;
            this.artwork = imageData;
            this.isPlaying = z;
            this.isPinned = z2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, LibraryItemDescription.Model.Artist artist, Artwork.ImageData imageData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.name;
            }
            if ((i & 2) != 0) {
                artist = model.description;
            }
            if ((i & 4) != 0) {
                imageData = model.artwork;
            }
            if ((i & 8) != 0) {
                z = model.isPlaying;
            }
            if ((i & 16) != 0) {
                z2 = model.isPinned;
            }
            return model.copy(str, artist, imageData, z, z2);
        }

        public final String component1() {
            return this.name;
        }

        public final LibraryItemDescription.Model.Artist component2() {
            return this.description;
        }

        public final Artwork.ImageData component3() {
            return this.artwork;
        }

        public final boolean component4() {
            return this.isPlaying;
        }

        public final boolean component5() {
            return this.isPinned;
        }

        public final Model copy(String str, LibraryItemDescription.Model.Artist artist, Artwork.ImageData imageData, boolean z, boolean z2) {
            h.e(str, "name");
            h.e(artist, "description");
            h.e(imageData, "artwork");
            return new Model(str, artist, imageData, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.name, model.name) && h.a(this.description, model.description) && h.a(this.artwork, model.artwork) && this.isPlaying == model.isPlaying && this.isPinned == model.isPinned;
        }

        public final Artwork.ImageData getArtwork() {
            return this.artwork;
        }

        public final LibraryItemDescription.Model.Artist getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            LibraryItemDescription.Model.Artist artist = this.description;
            int hashCode2 = (hashCode + (artist != null ? artist.hashCode() : 0)) * 31;
            Artwork.ImageData imageData = this.artwork;
            if (imageData != null) {
                i = imageData.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.isPlaying;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isPinned;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            return i7 + i3;
        }

        public final boolean isPinned() {
            return this.isPinned;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(name=");
            V0.append(this.name);
            V0.append(", description=");
            V0.append(this.description);
            V0.append(", artwork=");
            V0.append(this.artwork);
            V0.append(", isPlaying=");
            V0.append(this.isPlaying);
            V0.append(", isPinned=");
            return je.P0(V0, this.isPinned, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, LibraryItemDescription.Model.Artist artist, Artwork.ImageData imageData, boolean z, boolean z2, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? new LibraryItemDescription.Model.Artist(true) : artist, (i & 4) != 0 ? new Artwork.ImageData(null) : imageData, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }
}
