package com.spotify.voice.api.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class VoiceInteractionResponse implements JacksonModel, Parcelable {

    @JsonTypeInfo(defaultImpl = DefaultAction.class, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", use = JsonTypeInfo.Id.NAME, visible = true)
    @JsonSubTypes({@JsonSubTypes.Type(name = "SHUFFLE_ON", value = ShuffleOn.class), @JsonSubTypes.Type(name = "PLAY", value = Play.class), @JsonSubTypes.Type(name = "EARCON", value = Earcon.class), @JsonSubTypes.Type(name = "DISPLAY_UI", value = Display.class), @JsonSubTypes.Type(name = "WAIT", value = Wait.class), @JsonSubTypes.Type(name = "NAVIGATE", value = Navigate.class), @JsonSubTypes.Type(name = "SPEAK_TTS", value = SpeakTts.class), @JsonSubTypes.Type(name = "PLAY_PREVIEW", value = Preview.class), @JsonSubTypes.Type(name = "LISTEN_FOR_RESPONSE", value = Listen.class), @JsonSubTypes.Type(name = "GENERIC", value = Generic.class)})
    public interface Action extends JacksonModel, Parcelable {
        ClientAction action();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class ClientActions implements JacksonModel, Parcelable {
        @JsonCreator
        public static ClientActions create(@JsonProperty("interactionId") String str, @JsonProperty("voiceModuleRedirectUri") String str2, @JsonProperty("actions") List<Action> list) {
            return new AutoValue_VoiceInteractionResponse_ClientActions(str, str2, list);
        }

        @JsonProperty("actions")
        public abstract List<Action> actions();

        @JsonProperty("interactionId")
        public abstract String interactionId();

        @JsonProperty("voiceModuleRedirectUri")
        public abstract String voiceModuleRedirectUri();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class DefaultAction implements Action {
        @JsonCreator
        public static DefaultAction create(@JsonProperty("action") ClientAction clientAction) {
            return new AutoValue_VoiceInteractionResponse_DefaultAction(clientAction);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Display implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class DisplayData implements JacksonModel, Parcelable {

            public enum DisplayError {
                UNKNOWN,
                NO_RESULTS_FOUND,
                RESTRICTION;

                @JsonCreator
                public static DisplayError forValue(String str) {
                    try {
                        return valueOf(str);
                    } catch (IllegalArgumentException unused) {
                        return UNKNOWN;
                    }
                }
            }

            @JsonCreator
            public static DisplayData create(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2, @JsonProperty("results") List<Result> list, @JsonProperty("error") DisplayError displayError) {
                return new AutoValue_VoiceInteractionResponse_Display_DisplayData(str, str2, list, displayError);
            }

            /* access modifiers changed from: package-private */
            @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
            public abstract DisplayError error();

            /* access modifiers changed from: package-private */
            @JsonProperty("results")
            public abstract List<Result> results();

            /* access modifiers changed from: package-private */
            @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
            public abstract String subtitle();

            /* access modifiers changed from: package-private */
            @JsonProperty("title")
            public abstract String title();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Result implements JacksonModel, Parcelable {
            @JsonCreator
            public static Result create(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2, @JsonProperty("imageUrl") String str3, @JsonProperty("uri") String str4, @JsonProperty("navigationUri") String str5, @JsonProperty("isExplicit") boolean z, @JsonProperty("isPlaying") boolean z2) {
                return new AutoValue_VoiceInteractionResponse_Display_Result(str, str2, str3, str4, str5, z, z2);
            }

            @JsonProperty("isExplicit")
            public abstract boolean explicit();

            @JsonProperty("imageUrl")
            public abstract String image();

            @JsonProperty("navigationUri")
            public abstract String navigation();

            @JsonProperty("isPlaying")
            public abstract boolean playing();

            @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
            public abstract String subtitle();

            @JsonProperty("title")
            public abstract String title();

            @JsonProperty("uri")
            public abstract String uri();
        }

        @JsonCreator
        public static Display create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("ui") DisplayData displayData) {
            return new AutoValue_VoiceInteractionResponse_Display(clientAction, displayData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        /* access modifiers changed from: package-private */
        @JsonProperty("ui")
        public abstract DisplayData data();

        public DisplayData.DisplayError error() {
            if (data() == null || data().error() == null) {
                return null;
            }
            return data().error();
        }

        @JsonIgnore
        public List<Result> getResults() {
            DisplayData data = data();
            if (data == null || data.results() == null) {
                return Collections.emptyList();
            }
            return data.results();
        }

        public String getSubtitle() {
            return data() != null ? MoreObjects.nullToEmpty(data().subtitle()) : "";
        }

        public String getTitle() {
            return data() != null ? MoreObjects.nullToEmpty(data().title()) : "";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Earcon implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class EarconData implements JacksonModel, Parcelable {
            @JsonCreator
            public static EarconData create(@JsonProperty("earcon") EarconValue earconValue) {
                return new AutoValue_VoiceInteractionResponse_Earcon_EarconData(earconValue);
            }

            /* access modifiers changed from: package-private */
            @JsonProperty("earcon")
            public abstract EarconValue earcon();
        }

        public enum EarconValue {
            UNKNOWN,
            SUCCESS,
            FAILURE,
            CONFIRMATION;

            @JsonCreator
            public static EarconValue forValue(String str) {
                try {
                    return valueOf(str);
                } catch (IllegalArgumentException e) {
                    Logger.o(e, "Unknown Earcon %s", str);
                    return UNKNOWN;
                }
            }
        }

        @JsonCreator
        public static Earcon create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("earconData") EarconData earconData) {
            return new AutoValue_VoiceInteractionResponse_Earcon(clientAction, earconData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        /* access modifiers changed from: package-private */
        @JsonProperty("earconData")
        public abstract EarconData earconData();

        public EarconValue getEarconValue() {
            return earconData().earcon();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Generic implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class GenericData implements JacksonModel, Parcelable {
            @JsonCreator
            public static GenericData create(@JsonProperty("actionType") String str, @JsonProperty("data") Map<String, String> map) {
                return new AutoValue_VoiceInteractionResponse_Generic_GenericData(str, map);
            }

            /* access modifiers changed from: package-private */
            @JsonProperty("actionType")
            public abstract String actionType();

            /* access modifiers changed from: package-private */
            @JsonProperty("data")
            public abstract Map<String, String> data();
        }

        @JsonCreator
        public static Generic create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("genericData") GenericData genericData) {
            return new AutoValue_VoiceInteractionResponse_Generic(clientAction, genericData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        /* access modifiers changed from: package-private */
        @JsonProperty("genericData")
        public abstract GenericData genericData();

        public String getActionType() {
            return genericData().actionType();
        }

        public Map<String, String> getData() {
            return genericData().data();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Listen implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class ListenData implements JacksonModel, Parcelable {
            @JsonCreator
            public static ListenData create(@JsonProperty("listenDuration") a aVar) {
                return new AutoValue_VoiceInteractionResponse_Listen_ListenData(aVar);
            }

            /* access modifiers changed from: package-private */
            @JsonProperty("listenDuration")
            public abstract a duration();
        }

        @JsonCreator
        public static Listen create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("listenData") ListenData listenData) {
            return new AutoValue_VoiceInteractionResponse_Listen(clientAction, listenData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        /* access modifiers changed from: package-private */
        @JsonProperty("listenData")
        public abstract ListenData listenData();

        public int seconds() {
            if (listenData() == null) {
                return 0;
            }
            return listenData().duration().seconds();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Navigate implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class NavigationData implements JacksonModel, Parcelable {

            public enum Target {
                UNKNOWN,
                NOW_PLAYING_VIEW
            }

            @JsonCreator
            public static NavigationData create(@JsonProperty("uri") String str, @JsonProperty("target") Target target) {
                return new AutoValue_VoiceInteractionResponse_Navigate_NavigationData(str, target);
            }

            /* access modifiers changed from: package-private */
            @JsonProperty("target")
            public abstract Target target();

            /* access modifiers changed from: package-private */
            @JsonProperty("uri")
            public abstract String uri();
        }

        @JsonCreator
        public static Navigate create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("navigationTarget") NavigationData navigationData) {
            return new AutoValue_VoiceInteractionResponse_Navigate(clientAction, navigationData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        public NavigationData.Target getTarget() {
            NavigationData.Target target = NavigationData.Target.UNKNOWN;
            return (navigationTarget() == null || navigationTarget().target() == null) ? target : navigationTarget().target();
        }

        public String getUri() {
            return navigationTarget() == null ? "" : MoreObjects.nullToEmpty(navigationTarget().uri());
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("navigationTarget")
        public abstract NavigationData navigationTarget();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Play implements Action {
        @JsonCreator
        public static Play create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("playContext") b bVar) {
            return new AutoValue_VoiceInteractionResponse_Play(clientAction, bVar);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        public String getUri() {
            return playContext().uri();
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("playContext")
        public abstract b playContext();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Preview implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class AudioFile implements JacksonModel, Parcelable {
            @JsonCreator
            public static AudioFile create(@JsonProperty("fileId") String str, @JsonProperty("format") String str2) {
                return new AutoValue_VoiceInteractionResponse_Preview_AudioFile(str, str2);
            }

            @JsonProperty("fileId")
            public abstract String fileId();

            @JsonProperty("format")
            public abstract String format();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class PreviewData implements JacksonModel, Parcelable {
            @JsonCreator
            public static PreviewData create(@JsonProperty("audioFiles") List<AudioFile> list, @JsonProperty("playDuration") a aVar) {
                return new AutoValue_VoiceInteractionResponse_Preview_PreviewData(list, aVar);
            }

            /* access modifiers changed from: package-private */
            @JsonProperty("audioFiles")
            public abstract List<AudioFile> audioFiles();

            /* access modifiers changed from: package-private */
            @JsonProperty("playDuration")
            public abstract a playDuration();
        }

        @JsonCreator
        public static Preview create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("preview") PreviewData previewData) {
            return new AutoValue_VoiceInteractionResponse_Preview(clientAction, previewData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        public List<AudioFile> getAudioFiles() {
            return preview().audioFiles();
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("preview")
        public abstract PreviewData preview();

        public int seconds() {
            return preview().playDuration().seconds();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class ShuffleOn implements Action {
        @JsonCreator
        public static ShuffleOn create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("playContext") b bVar) {
            return new AutoValue_VoiceInteractionResponse_ShuffleOn(clientAction, bVar);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        public String getUri() {
            if (playContext() != null) {
                return playContext().uri();
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("playContext")
        public abstract b playContext();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class SpeakTts implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class TtsData implements JacksonModel, Parcelable {
            @JsonCreator
            public static TtsData create(@JsonProperty("url") String str) {
                return new AutoValue_VoiceInteractionResponse_SpeakTts_TtsData(str, 0);
            }

            public static TtsData createLocal(int i) {
                return new AutoValue_VoiceInteractionResponse_SpeakTts_TtsData(null, i);
            }

            /* access modifiers changed from: package-private */
            public abstract int resId();

            /* access modifiers changed from: package-private */
            @JsonProperty("url")
            public abstract String url();
        }

        @JsonCreator
        public static SpeakTts create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("tts") TtsData ttsData) {
            return new AutoValue_VoiceInteractionResponse_SpeakTts(clientAction, ttsData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        @JsonIgnore
        public int localResId() {
            return ttsData().resId();
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("tts")
        public abstract TtsData ttsData();

        public String url() {
            return MoreObjects.nullToEmpty(ttsData().url());
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Wait implements Action {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class WaitData implements JacksonModel, Parcelable {
            @JsonCreator
            public static WaitData create(@JsonProperty("waitDuration") a aVar, @JsonProperty("hintPhrases") List<String> list) {
                return new AutoValue_VoiceInteractionResponse_Wait_WaitData(aVar, list);
            }

            /* access modifiers changed from: package-private */
            @JsonProperty("waitDuration")
            public abstract a duration();

            /* access modifiers changed from: package-private */
            @JsonProperty("hintPhrases")
            public abstract List<String> hintPhrases();
        }

        @JsonCreator
        public static Wait create(@JsonProperty("action") ClientAction clientAction, @JsonProperty("waitData") WaitData waitData) {
            return new AutoValue_VoiceInteractionResponse_Wait(clientAction, waitData);
        }

        @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Action
        @JsonProperty("action")
        public abstract ClientAction action();

        public List<String> getHintPhrases() {
            return waitData().hintPhrases();
        }

        public int seconds() {
            return waitData().duration().seconds();
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("waitData")
        public abstract WaitData waitData();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class a implements Parcelable {
        @JsonCreator
        public static a create(@JsonProperty("seconds") int i) {
            return new g(i);
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("seconds")
        public abstract int seconds();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class b implements Parcelable {
        @JsonCreator
        public static b create(@JsonProperty("uri") String str) {
            return new h(str);
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("uri")
        public abstract String uri();
    }

    @JsonCreator
    public static VoiceInteractionResponse create(@JsonProperty("interactionResponse") ClientActions clientActions) {
        return new AutoValue_VoiceInteractionResponse(clientActions);
    }

    @JsonProperty("interactionResponse")
    public abstract ClientActions interactionResponse();
}
