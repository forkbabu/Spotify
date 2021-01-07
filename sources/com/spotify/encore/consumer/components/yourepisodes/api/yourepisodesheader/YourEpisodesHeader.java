package com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.encore.consumer.elements.playbutton.PlayState;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface YourEpisodesHeader extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultYourEpisodesHeaderConfiguration implements Configuration {
            public static final DefaultYourEpisodesHeaderConfiguration INSTANCE = new DefaultYourEpisodesHeaderConfiguration();

            private DefaultYourEpisodesHeaderConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(YourEpisodesHeader yourEpisodesHeader, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(yourEpisodesHeader, nmf);
        }
    }

    public enum Events {
        BackButtonClicked,
        PlayButtonClicked,
        DownloadButtonClicked
    }

    public static final class Model {
        private final int backgroundColor;
        private final DownloadButton.Model downloadButtonModel;
        private final PlayState playState;
        private final String subtitle;
        private final String title;

        public Model(String str, int i, PlayState playState2, String str2, DownloadButton.Model model) {
            h.e(str, "title");
            h.e(playState2, "playState");
            h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
            h.e(model, "downloadButtonModel");
            this.title = str;
            this.backgroundColor = i;
            this.playState = playState2;
            this.subtitle = str2;
            this.downloadButtonModel = model;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, int i, PlayState playState2, String str2, DownloadButton.Model model2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = model.title;
            }
            if ((i2 & 2) != 0) {
                i = model.backgroundColor;
            }
            if ((i2 & 4) != 0) {
                playState2 = model.playState;
            }
            if ((i2 & 8) != 0) {
                str2 = model.subtitle;
            }
            if ((i2 & 16) != 0) {
                model2 = model.downloadButtonModel;
            }
            return model.copy(str, i, playState2, str2, model2);
        }

        public final String component1() {
            return this.title;
        }

        public final int component2() {
            return this.backgroundColor;
        }

        public final PlayState component3() {
            return this.playState;
        }

        public final String component4() {
            return this.subtitle;
        }

        public final DownloadButton.Model component5() {
            return this.downloadButtonModel;
        }

        public final Model copy(String str, int i, PlayState playState2, String str2, DownloadButton.Model model) {
            h.e(str, "title");
            h.e(playState2, "playState");
            h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
            h.e(model, "downloadButtonModel");
            return new Model(str, i, playState2, str2, model);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && this.backgroundColor == model.backgroundColor && h.a(this.playState, model.playState) && h.a(this.subtitle, model.subtitle) && h.a(this.downloadButtonModel, model.downloadButtonModel);
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final DownloadButton.Model getDownloadButtonModel() {
            return this.downloadButtonModel;
        }

        public final PlayState getPlayState() {
            return this.playState;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.backgroundColor) * 31;
            PlayState playState2 = this.playState;
            int hashCode2 = (hashCode + (playState2 != null ? playState2.hashCode() : 0)) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            DownloadButton.Model model = this.downloadButtonModel;
            if (model != null) {
                i = model.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", backgroundColor=");
            V0.append(this.backgroundColor);
            V0.append(", playState=");
            V0.append(this.playState);
            V0.append(", subtitle=");
            V0.append(this.subtitle);
            V0.append(", downloadButtonModel=");
            V0.append(this.downloadButtonModel);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, int i, PlayState playState2, String str2, DownloadButton.Model model, int i2, kotlin.jvm.internal.f fVar) {
            this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? PlayState.PLAY_WITH_SHUFFLE : playState2, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? new DownloadButton.Model(DownloadState.None.INSTANCE, null, 2, null) : model);
        }
    }
}
