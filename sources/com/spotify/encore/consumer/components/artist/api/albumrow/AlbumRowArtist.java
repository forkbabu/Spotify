package com.spotify.encore.consumer.components.artist.api.albumrow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface AlbumRowArtist extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultAlbumRowArtistConfiguration implements Configuration {
            public static final DefaultAlbumRowArtistConfiguration INSTANCE = new DefaultAlbumRowArtistConfiguration();

            private DefaultAlbumRowArtistConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(AlbumRowArtist albumRowArtist, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(albumRowArtist, nmf);
        }
    }

    public enum Events {
        RowClicked
    }

    public static final class Model {
        private final Artwork.ImageData artwork;
        private final String description;
        private final String name;

        public Model(String str, String str2, Artwork.ImageData imageData) {
            h.e(str, "name");
            h.e(imageData, "artwork");
            this.name = str;
            this.description = str2;
            this.artwork = imageData;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, Artwork.ImageData imageData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.name;
            }
            if ((i & 2) != 0) {
                str2 = model.description;
            }
            if ((i & 4) != 0) {
                imageData = model.artwork;
            }
            return model.copy(str, str2, imageData);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.description;
        }

        public final Artwork.ImageData component3() {
            return this.artwork;
        }

        public final Model copy(String str, String str2, Artwork.ImageData imageData) {
            h.e(str, "name");
            h.e(imageData, "artwork");
            return new Model(str, str2, imageData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.name, model.name) && h.a(this.description, model.description) && h.a(this.artwork, model.artwork);
        }

        public final Artwork.ImageData getArtwork() {
            return this.artwork;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Artwork.ImageData imageData = this.artwork;
            if (imageData != null) {
                i = imageData.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(name=");
            V0.append(this.name);
            V0.append(", description=");
            V0.append(this.description);
            V0.append(", artwork=");
            V0.append(this.artwork);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, Artwork.ImageData imageData, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new Artwork.ImageData(null) : imageData);
        }
    }
}
