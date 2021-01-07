package com.spotify.encore.consumer.elements.creator;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.Element;
import com.spotify.encore.consumer.elements.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Creator extends Element<Model, f> {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ImageData NO_IMAGE = ImageData.Companion.create(null);

        private Companion() {
        }

        public final ImageData getNO_IMAGE() {
            return NO_IMAGE;
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(Creator creator, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(creator, nmf);
        }
    }

    public static final class ImageData {
        public static final Companion Companion = new Companion(null);
        private final int tag;
        private final String uri;

        public static final class Companion {
            private Companion() {
            }

            public final ImageData create(String str) {
                return create(str, R.id.creator_tag);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final ImageData create(String str, int i) {
                return new ImageData(str, i);
            }
        }

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
    }

    public static final class Model {
        private final ImageData authorImage;
        private final SpotifyIconV2 authorImagePlaceholder;
        private final List<String> authorNames;

        public Model() {
            this(null, null, null, 7, null);
        }

        public Model(ImageData imageData, List<String> list, SpotifyIconV2 spotifyIconV2) {
            h.e(imageData, "authorImage");
            h.e(list, "authorNames");
            h.e(spotifyIconV2, "authorImagePlaceholder");
            this.authorImage = imageData;
            this.authorNames = list;
            this.authorImagePlaceholder = spotifyIconV2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.encore.consumer.elements.creator.Creator$Model */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Model copy$default(Model model, ImageData imageData, List list, SpotifyIconV2 spotifyIconV2, int i, Object obj) {
            if ((i & 1) != 0) {
                imageData = model.authorImage;
            }
            if ((i & 2) != 0) {
                list = model.authorNames;
            }
            if ((i & 4) != 0) {
                spotifyIconV2 = model.authorImagePlaceholder;
            }
            return model.copy(imageData, list, spotifyIconV2);
        }

        public final ImageData component1() {
            return this.authorImage;
        }

        public final List<String> component2() {
            return this.authorNames;
        }

        public final SpotifyIconV2 component3() {
            return this.authorImagePlaceholder;
        }

        public final Model copy(ImageData imageData, List<String> list, SpotifyIconV2 spotifyIconV2) {
            h.e(imageData, "authorImage");
            h.e(list, "authorNames");
            h.e(spotifyIconV2, "authorImagePlaceholder");
            return new Model(imageData, list, spotifyIconV2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.authorImage, model.authorImage) && h.a(this.authorNames, model.authorNames) && h.a(this.authorImagePlaceholder, model.authorImagePlaceholder);
        }

        public final ImageData getAuthorImage() {
            return this.authorImage;
        }

        public final SpotifyIconV2 getAuthorImagePlaceholder() {
            return this.authorImagePlaceholder;
        }

        public final List<String> getAuthorNames() {
            return this.authorNames;
        }

        public int hashCode() {
            ImageData imageData = this.authorImage;
            int i = 0;
            int hashCode = (imageData != null ? imageData.hashCode() : 0) * 31;
            List<String> list = this.authorNames;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            SpotifyIconV2 spotifyIconV2 = this.authorImagePlaceholder;
            if (spotifyIconV2 != null) {
                i = spotifyIconV2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(authorImage=");
            V0.append(this.authorImage);
            V0.append(", authorNames=");
            V0.append(this.authorNames);
            V0.append(", authorImagePlaceholder=");
            V0.append(this.authorImagePlaceholder);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(ImageData imageData, List list, SpotifyIconV2 spotifyIconV2, int i, kotlin.jvm.internal.f fVar) {
            this((i & 1) != 0 ? Creator.Companion.getNO_IMAGE() : imageData, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? SpotifyIconV2.ARTIST : spotifyIconV2);
        }
    }
}
