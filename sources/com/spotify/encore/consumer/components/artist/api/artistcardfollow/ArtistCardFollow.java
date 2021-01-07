package com.spotify.encore.consumer.components.artist.api.artistcardfollow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ArtistCardFollow extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultArtistCardFollowConfiguration implements Configuration {
            public static final DefaultArtistCardFollowConfiguration INSTANCE = new DefaultArtistCardFollowConfiguration();

            private DefaultArtistCardFollowConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(ArtistCardFollow artistCardFollow, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(artistCardFollow, nmf);
        }
    }

    public enum Events {
        CardClicked,
        ButtonClicked
    }

    public enum FollowingStatus {
        NotFollowing,
        Following,
        Error
    }

    public static final class Model {
        private final String artistName;
        private final FollowingStatus followingStatus;
        private final Artwork.ImageData imageData;

        public Model(String str, Artwork.ImageData imageData2, FollowingStatus followingStatus2) {
            h.e(str, "artistName");
            h.e(imageData2, "imageData");
            h.e(followingStatus2, "followingStatus");
            this.artistName = str;
            this.imageData = imageData2;
            this.followingStatus = followingStatus2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, Artwork.ImageData imageData2, FollowingStatus followingStatus2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.artistName;
            }
            if ((i & 2) != 0) {
                imageData2 = model.imageData;
            }
            if ((i & 4) != 0) {
                followingStatus2 = model.followingStatus;
            }
            return model.copy(str, imageData2, followingStatus2);
        }

        public final String component1() {
            return this.artistName;
        }

        public final Artwork.ImageData component2() {
            return this.imageData;
        }

        public final FollowingStatus component3() {
            return this.followingStatus;
        }

        public final Model copy(String str, Artwork.ImageData imageData2, FollowingStatus followingStatus2) {
            h.e(str, "artistName");
            h.e(imageData2, "imageData");
            h.e(followingStatus2, "followingStatus");
            return new Model(str, imageData2, followingStatus2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.artistName, model.artistName) && h.a(this.imageData, model.imageData) && h.a(this.followingStatus, model.followingStatus);
        }

        public final String getArtistName() {
            return this.artistName;
        }

        public final FollowingStatus getFollowingStatus() {
            return this.followingStatus;
        }

        public final Artwork.ImageData getImageData() {
            return this.imageData;
        }

        public int hashCode() {
            String str = this.artistName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Artwork.ImageData imageData2 = this.imageData;
            int hashCode2 = (hashCode + (imageData2 != null ? imageData2.hashCode() : 0)) * 31;
            FollowingStatus followingStatus2 = this.followingStatus;
            if (followingStatus2 != null) {
                i = followingStatus2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(artistName=");
            V0.append(this.artistName);
            V0.append(", imageData=");
            V0.append(this.imageData);
            V0.append(", followingStatus=");
            V0.append(this.followingStatus);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, Artwork.ImageData imageData2, FollowingStatus followingStatus2, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? new Artwork.ImageData(null) : imageData2, (i & 4) != 0 ? FollowingStatus.NotFollowing : followingStatus2);
        }
    }
}
