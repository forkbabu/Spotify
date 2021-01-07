package com.spotify.encore.consumer.elements.coverart;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.Element;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.coverart.AutoValue_CoverArt_Model;

@Deprecated
public interface CoverArt extends Element<Model, Void> {
    public static final ImageData NO_IMAGE = ImageData.create(null);

    public static abstract class ImageData {
        public static ImageData create(String str) {
            return create(str, R.id.cover_art_tag);
        }

        public abstract int tag();

        public abstract String uri();

        public static ImageData create(String str, int i) {
            return new AutoValue_CoverArt_ImageData(str, i);
        }
    }

    public static abstract class Model {

        public interface Builder {
            Model build();

            Builder data(ImageData imageData);

            Builder placeholder(SpotifyIconV2 spotifyIconV2);
        }

        public static Builder builder(SpotifyIconV2 spotifyIconV2) {
            return new AutoValue_CoverArt_Model.Builder().placeholder(spotifyIconV2);
        }

        public abstract ImageData data();

        public abstract SpotifyIconV2 placeholder();
    }
}
