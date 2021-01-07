package com.spotify.encore.consumer.components.playlist.api.playlistheader;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.creator.Creator;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.encore.consumer.elements.playbutton.PlayState;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface PlaylistHeader extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultPlaylistHeaderConfiguration implements Configuration {
            public static final DefaultPlaylistHeaderConfiguration INSTANCE = new DefaultPlaylistHeaderConfiguration();

            private DefaultPlaylistHeaderConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(PlaylistHeader playlistHeader, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(playlistHeader, nmf);
        }
    }

    public enum Events {
        CreatorButtonClicked,
        DownloadButtonClicked,
        HeartButtonClicked,
        ContextMenuClicked,
        PlayButtonClicked,
        BackButtonClicked
    }

    public static final class Model {
        private final int artworkColor;
        private final String artworkUri;
        private final Creator.ImageData creatorImageData;
        private final String creatorName;
        private final String description;
        private final DownloadButton.Model downloadButtonModel;
        private final boolean isLiked;
        private final boolean isPlayable;
        private final String metadata;
        private final PlayState playState;
        private final String title;

        public Model(String str, String str2, String str3, Creator.ImageData imageData, String str4, String str5, int i, DownloadButton.Model model, PlayState playState2, boolean z, boolean z2) {
            h.e(str, "title");
            h.e(str2, "description");
            h.e(str3, "creatorName");
            h.e(imageData, "creatorImageData");
            h.e(str4, "metadata");
            h.e(model, "downloadButtonModel");
            h.e(playState2, "playState");
            this.title = str;
            this.description = str2;
            this.creatorName = str3;
            this.creatorImageData = imageData;
            this.metadata = str4;
            this.artworkUri = str5;
            this.artworkColor = i;
            this.downloadButtonModel = model;
            this.playState = playState2;
            this.isPlayable = z;
            this.isLiked = z2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, Creator.ImageData imageData, String str4, String str5, int i, DownloadButton.Model model2, PlayState playState2, boolean z, boolean z2, int i2, Object obj) {
            return model.copy((i2 & 1) != 0 ? model.title : str, (i2 & 2) != 0 ? model.description : str2, (i2 & 4) != 0 ? model.creatorName : str3, (i2 & 8) != 0 ? model.creatorImageData : imageData, (i2 & 16) != 0 ? model.metadata : str4, (i2 & 32) != 0 ? model.artworkUri : str5, (i2 & 64) != 0 ? model.artworkColor : i, (i2 & 128) != 0 ? model.downloadButtonModel : model2, (i2 & 256) != 0 ? model.playState : playState2, (i2 & 512) != 0 ? model.isPlayable : z, (i2 & 1024) != 0 ? model.isLiked : z2);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component10() {
            return this.isPlayable;
        }

        public final boolean component11() {
            return this.isLiked;
        }

        public final String component2() {
            return this.description;
        }

        public final String component3() {
            return this.creatorName;
        }

        public final Creator.ImageData component4() {
            return this.creatorImageData;
        }

        public final String component5() {
            return this.metadata;
        }

        public final String component6() {
            return this.artworkUri;
        }

        public final int component7() {
            return this.artworkColor;
        }

        public final DownloadButton.Model component8() {
            return this.downloadButtonModel;
        }

        public final PlayState component9() {
            return this.playState;
        }

        public final Model copy(String str, String str2, String str3, Creator.ImageData imageData, String str4, String str5, int i, DownloadButton.Model model, PlayState playState2, boolean z, boolean z2) {
            h.e(str, "title");
            h.e(str2, "description");
            h.e(str3, "creatorName");
            h.e(imageData, "creatorImageData");
            h.e(str4, "metadata");
            h.e(model, "downloadButtonModel");
            h.e(playState2, "playState");
            return new Model(str, str2, str3, imageData, str4, str5, i, model, playState2, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.description, model.description) && h.a(this.creatorName, model.creatorName) && h.a(this.creatorImageData, model.creatorImageData) && h.a(this.metadata, model.metadata) && h.a(this.artworkUri, model.artworkUri) && this.artworkColor == model.artworkColor && h.a(this.downloadButtonModel, model.downloadButtonModel) && h.a(this.playState, model.playState) && this.isPlayable == model.isPlayable && this.isLiked == model.isLiked;
        }

        public final int getArtworkColor() {
            return this.artworkColor;
        }

        public final String getArtworkUri() {
            return this.artworkUri;
        }

        public final Creator.ImageData getCreatorImageData() {
            return this.creatorImageData;
        }

        public final String getCreatorName() {
            return this.creatorName;
        }

        public final String getDescription() {
            return this.description;
        }

        public final DownloadButton.Model getDownloadButtonModel() {
            return this.downloadButtonModel;
        }

        public final String getMetadata() {
            return this.metadata;
        }

        public final PlayState getPlayState() {
            return this.playState;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.creatorName;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Creator.ImageData imageData = this.creatorImageData;
            int hashCode4 = (hashCode3 + (imageData != null ? imageData.hashCode() : 0)) * 31;
            String str4 = this.metadata;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.artworkUri;
            int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.artworkColor) * 31;
            DownloadButton.Model model = this.downloadButtonModel;
            int hashCode7 = (hashCode6 + (model != null ? model.hashCode() : 0)) * 31;
            PlayState playState2 = this.playState;
            if (playState2 != null) {
                i = playState2.hashCode();
            }
            int i2 = (hashCode7 + i) * 31;
            boolean z = this.isPlayable;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isLiked;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            return i7 + i3;
        }

        public final boolean isLiked() {
            return this.isLiked;
        }

        public final boolean isPlayable() {
            return this.isPlayable;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", description=");
            V0.append(this.description);
            V0.append(", creatorName=");
            V0.append(this.creatorName);
            V0.append(", creatorImageData=");
            V0.append(this.creatorImageData);
            V0.append(", metadata=");
            V0.append(this.metadata);
            V0.append(", artworkUri=");
            V0.append(this.artworkUri);
            V0.append(", artworkColor=");
            V0.append(this.artworkColor);
            V0.append(", downloadButtonModel=");
            V0.append(this.downloadButtonModel);
            V0.append(", playState=");
            V0.append(this.playState);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", isLiked=");
            return je.P0(V0, this.isLiked, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, String str3, Creator.ImageData imageData, String str4, String str5, int i, DownloadButton.Model model, PlayState playState2, boolean z, boolean z2, int i2, kotlin.jvm.internal.f fVar) {
            this(str, str2, str3, (i2 & 8) != 0 ? Creator.Companion.getNO_IMAGE() : imageData, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? new DownloadButton.Model(DownloadState.None.INSTANCE, null, 2, null) : model, (i2 & 256) != 0 ? PlayState.PLAY_WITH_SHUFFLE : playState2, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? false : z2);
        }
    }
}
