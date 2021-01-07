package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mediasession.playbackactions.MediaAction;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.service.media.d3;
import com.spotify.mobile.android.spotlets.appprotocol.a4;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$Roles;
import com.spotify.music.builtinauth.model.FieldValidator;
import com.spotify.music.nowplaying.core.navcontext.EntityType;
import com.spotify.music.nowplaying.core.navcontext.f;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.j0;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class AppProtocol implements AppProtocolBase {
    public static final TrackData c = new TrackData(null, null, 0, "", 0, TrackData.TYPE_NO_TRACK, "", false, 0, false, false, false, false, false, false, false, false, false, null);

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Album implements JacksonModel {
        @JsonProperty("name")
        public String name;
        @JsonProperty("type")
        public String type = "album";
        @JsonProperty("uri")
        public String uri;

        public Album(String str, String str2) {
            this.name = str;
            this.uri = str2;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Alert implements JacksonModel {
        @JsonProperty("long_text")
        public String longText;
        @JsonProperty("short_text")
        public String shortText;
        @JsonProperty("code")
        public int statusCode;

        public Alert(int i, String str, String str2) {
            this.statusCode = i;
            this.shortText = str;
            this.longText = str2;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Artist implements JacksonModel {
        @JsonProperty("name")
        public String name;
        @JsonProperty("type")
        public String type = "artist";
        @JsonProperty("uri")
        public String uri;

        public Artist(String str, String str2) {
            this.name = str;
            this.uri = str2;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Capabilities implements JacksonModel {
        @JsonProperty("can_play_on_demand")
        public final boolean canPlayOnDemand;

        public Capabilities(@JsonProperty("can_play_on_demand") boolean z) {
            this.canPlayOnDemand = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Capabilities) && this.canPlayOnDemand == ((Capabilities) obj).canPlayOnDemand) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.canPlayOnDemand ? 1 : 0;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Challenge implements JacksonModel {
        @JsonProperty("authid")
        public String authid;
        @JsonProperty("authmethod")
        public String authmethod;
        @JsonProperty("authprovider")
        public String authprovider = "spotify";
        @JsonProperty("authrole")
        public String authrole = "app";
        @JsonProperty("nonce")
        public String nonce;
        @JsonProperty("session")
        public int session;
        @JsonProperty("timestamp")
        public String timestamp;

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ChallengeDetails implements JacksonModel {
        @JsonProperty("challenge")
        public String challenge;

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ChildrenPageRequest implements JacksonModel {
        @JsonProperty("limit")
        public Integer limit;
        @JsonProperty("offset")
        public int offset;
        @JsonProperty("parent_id")
        public String parentId;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CrossfadeState implements JacksonModel {
        @JsonProperty("duration")
        public int duration;
        @JsonProperty("isEnabled")
        public boolean isEnabled;

        public CrossfadeState(boolean z, int i) {
            this.isEnabled = z;
            this.duration = i;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Identifier implements JacksonModel {
        @JsonProperty("feature_identifier")
        public String featureIdentifier;
        @JsonProperty("id")
        public String id;

        public Identifier() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Identifier)) {
                return false;
            }
            Identifier identifier = (Identifier) obj;
            String str = this.id;
            if (str == null ? identifier.id == null : str.equals(identifier.id)) {
                String str2 = this.featureIdentifier;
                if (str2 != null) {
                    if (str2.equals(identifier.featureIdentifier)) {
                        return true;
                    }
                } else if (identifier.featureIdentifier == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.featureIdentifier;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public Identifier(String str, String str2) {
            this.id = str;
            this.featureIdentifier = str2;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Image implements JacksonModel {
        public static final int MAX_IMAGE_DIMENSION = 720;
        @JsonProperty("height")
        public int height;
        @JsonProperty("image_data")
        public byte[] imageData;
        @JsonProperty("width")
        public int width;

        public Image(byte[] bArr, int i, int i2) {
            this.imageData = bArr;
            this.width = i;
            this.height = i2;
        }

        public String toString() {
            return String.format(Locale.US, "{\"image\":<binary of size %d>,\"width\":%d,\"height\":%d}", Integer.valueOf(this.imageData.length), Integer.valueOf(this.width), Integer.valueOf(this.height));
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ImageIdentifier implements JacksonModel {
        @JsonProperty("height")
        public int height;
        @JsonProperty("id")
        public String id;
        @JsonProperty("image_type")
        public String imageType;
        @JsonProperty("width")
        public int width;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageIdentifier)) {
                return false;
            }
            ImageIdentifier imageIdentifier = (ImageIdentifier) obj;
            String str = this.id;
            if (str == null ? imageIdentifier.id != null : !str.equals(imageIdentifier.id)) {
                return false;
            }
            if (this.height != imageIdentifier.height || this.width != imageIdentifier.width) {
                return false;
            }
            String str2 = this.imageType;
            String str3 = imageIdentifier.imageType;
            return str2 == null ? str3 == null : str2.equals(str3);
        }

        public int hashCode() {
            String str = this.id;
            int i = 0;
            int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.height) * 31) + this.width) * 31;
            String str2 = this.imageType;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Index implements JacksonModel {
        @JsonProperty("index")
        public int index;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ListItem implements JacksonModel {
        @JsonProperty("available_offline")
        public boolean availableOffline;
        @JsonProperty("has_children")
        public boolean hasChildren;
        @JsonProperty("id")
        public String id;
        @JsonProperty("image_id")
        public String imageUri;
        @JsonProperty("metadata")
        public Metadata metadata;
        @JsonProperty("playable")
        public boolean playable;
        @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
        public String subtitle;
        @JsonProperty("title")
        public String title;
        @JsonProperty("uri")
        public String uri;

        public ListItem() {
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public ListItem(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, Metadata metadata2) {
            this.id = str;
            this.uri = str2;
            this.imageUri = str3;
            this.title = str4;
            this.subtitle = str5;
            this.playable = z;
            this.hasChildren = z2;
            this.availableOffline = z3;
            this.metadata = metadata2;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ListItems implements JacksonModel {
        @JsonProperty("items")
        public final ListItem[] items;
        @JsonProperty("limit")
        public int limit;
        @JsonProperty("offset")
        public int offset;
        @JsonProperty("total")
        public int total;

        public ListItems(int i, int i2, int i3, ListItem[] listItemArr) {
            this.limit = i;
            this.offset = i2;
            this.total = i3;
            this.items = listItemArr;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Message implements JacksonModel {
        @JsonProperty("message")
        public String message;

        public Message(String str) {
            this.message = str;
        }

        public static Message fromValidationException(FieldValidator.ValidationException validationException) {
            return new Message(validationException.getMessage());
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Metadata implements JacksonModel {
        @JsonProperty("duration_ms")
        public Long duration;
        @JsonProperty("is_explicit_content")
        public Boolean isExplicitContent;
        @JsonProperty("is_played")
        public Boolean isPlayed;
        @JsonProperty("time_left_ms")
        public Long timeLeft;

        public Metadata() {
        }

        public void setDuration(Long l) {
            this.duration = l;
        }

        public void setExplicitContent(Boolean bool) {
            this.isExplicitContent = bool;
        }

        public void setIsPlayed(Boolean bool) {
            this.isPlayed = bool;
        }

        public void setTimeLeft(Long l) {
            this.timeLeft = l;
        }

        public Metadata(Boolean bool) {
            this.isExplicitContent = bool;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PlaybackPosition implements JacksonModel {
        @JsonProperty("position_ms")
        public final long position;

        public PlaybackPosition(@JsonProperty("position_ms") long j) {
            this.position = j;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PlaybackSpeed implements JacksonModel {
        public static final int PAUSED_PLAYBACK_SPEED = 0;
        public static final int PLAYBACK_SPEED_100 = 100;
        public static final int PLAYBACK_SPEED_120 = 120;
        public static final int PLAYBACK_SPEED_150 = 150;
        public static final int PLAYBACK_SPEED_200 = 200;
        public static final int PLAYBACK_SPEED_300 = 300;
        public static final int PLAYBACK_SPEED_50 = 50;
        public static final int PLAYBACK_SPEED_80 = 80;
        public static final int PLAYING_PLAYBACK_SPEED = 1;
        @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
        public int playbackSpeed;

        public PlaybackSpeed() {
        }

        private static boolean isPaused(com.spotify.player.model.PlayerState playerState) {
            return playerState == null || playerState.isPaused() || !playerState.isPlaying();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PlaybackSpeed) && this.playbackSpeed == ((PlaybackSpeed) obj).playbackSpeed) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.playbackSpeed;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public PlaybackSpeed(int i) {
            this.playbackSpeed = i;
        }

        public PlaybackSpeed(com.spotify.player.model.PlayerState playerState) {
            this.playbackSpeed = !isPaused(playerState) ? 1 : 0;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PlayerState implements JacksonModel {
        private static final String ARTIST_NAME_KEY_FORMAT = "artist_name:%d";
        private static final String ARTIST_URI_KEY_FORMAT = "artist_uri:%d";
        private static final PlayerState EMPTY_PLAYER_STATE = new PlayerState(null, null, null, true, 0.0f, 0, PlayerOptions.DEFAULT, PlayerRestrictions.DEFAULT);
        @JsonProperty("context_title")
        public final String contextTitle;
        @JsonProperty("context_uri")
        public final String contextUri;
        @JsonProperty("is_paused")
        public final boolean isPaused;
        @JsonProperty("is_paused_bool")
        public final boolean isPausedBool;
        @JsonProperty("playback_options")
        public final PlayerOptions playbackOptions;
        @JsonProperty("playback_position")
        public final long playbackPosition;
        @JsonProperty("playback_restrictions")
        public final PlayerRestrictions playbackRestrictions;
        @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
        public final float playbackSpeed;
        @JsonProperty(TrackData.TYPE_TRACK)
        public final Track track;

        public PlayerState(@JsonProperty("context_uri") String str, @JsonProperty("context_title") String str2, @JsonProperty("track") Track track2, @JsonProperty("is_paused") boolean z, @JsonProperty("playback_speed") float f, @JsonProperty("playback_position") long j, @JsonProperty("playback_options") PlayerOptions playerOptions, @JsonProperty("playback_restrictions") PlayerRestrictions playerRestrictions) {
            this.contextUri = str;
            this.contextTitle = str2;
            this.track = track2;
            this.isPausedBool = z;
            this.isPaused = z;
            this.playbackSpeed = f;
            this.playbackPosition = j;
            this.playbackOptions = playerOptions == null ? PlayerOptions.DEFAULT : playerOptions;
            this.playbackRestrictions = playerRestrictions == null ? PlayerRestrictions.DEFAULT : playerRestrictions;
        }

        private static Track convertTrack(ContextTrack contextTrack, long j) {
            if (contextTrack == null) {
                return null;
            }
            return new Track(new Artist(contextTrack.metadata().get("artist_name"), contextTrack.metadata().get("artist_uri")), getArtists(contextTrack), new Album(contextTrack.metadata().get("album_title"), contextTrack.metadata().get("album_uri")), Boolean.parseBoolean(contextTrack.metadata().get("collection.in_collection")), j, contextTrack.metadata().get("title"), contextTrack.uri(), AppProtocol.a(contextTrack), getIsEpisode(contextTrack), kxd.i(contextTrack));
        }

        private static List<Artist> getArtists(ContextTrack contextTrack) {
            ArrayList arrayList = new ArrayList();
            String str = contextTrack.metadata().get("artist_name");
            String str2 = contextTrack.metadata().get("artist_uri");
            int i = 1;
            while (str != null && str2 != null) {
                arrayList.add(new Artist(str, str2));
                String format = String.format(Locale.getDefault(), ARTIST_NAME_KEY_FORMAT, Integer.valueOf(i));
                String format2 = String.format(Locale.getDefault(), ARTIST_URI_KEY_FORMAT, Integer.valueOf(i));
                str = contextTrack.metadata().get(format);
                str2 = contextTrack.metadata().get(format2);
                i++;
            }
            return arrayList;
        }

        private static boolean getIsEpisode(ContextTrack contextTrack) {
            return l0.z(contextTrack.uri()).q() == LinkType.SHOW_EPISODE;
        }

        public static PlayerState playerStateFrom(com.spotify.player.model.PlayerState playerState, cqe cqe) {
            if (playerState == null) {
                return EMPTY_PLAYER_STATE;
            }
            int i = 0;
            if (playerState.options().repeatingTrack()) {
                i = 1;
            } else if (playerState.options().repeatingContext()) {
                i = 2;
            }
            PlayerRestrictions create = PlayerRestrictions.create(playerState.restrictions().disallowSkippingNextReasons().isEmpty(), playerState.restrictions().disallowSkippingPrevReasons().isEmpty(), playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty(), playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty(), playerState.restrictions().disallowTogglingShuffleReasons().isEmpty(), playerState.restrictions().disallowSeekingReasons().isEmpty());
            return new PlayerState(a4.a(playerState.contextUri()), playerState.contextMetadata().get("context_description"), convertTrack(playerState.track().orNull(), playerState.duration().or((Optional<Long>) 0L).longValue()), playerState.isPaused(), playerState.playbackSpeed().or((Optional<Double>) Double.valueOf(0.0d)).floatValue(), playerState.position(cqe.d()).or((Optional<Long>) 0L).longValue(), PlayerOptions.create(playerState.options().shufflingContext(), i), create);
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Rating implements JacksonModel {
        public static final int NONE = 0;
        public static final int THUMB_DOWN = -1;
        public static final int THUMB_UP = 1;
        @JsonProperty("rating")
        public int rating;

        public Rating() {
        }

        private static int fromThumbState(ThumbState thumbState) {
            if (thumbState == null) {
                return 0;
            }
            int ordinal = thumbState.ordinal();
            if (ordinal != 1) {
                return ordinal != 2 ? 0 : -1;
            }
            return 1;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public Rating(int i) {
            this.rating = i;
        }

        public Rating(ThumbState thumbState) {
            this.rating = fromThumbState(thumbState);
        }

        public Rating(j0 j0Var) {
            this.rating = j0Var != null ? fromThumbState(j0Var.a()) : 0;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Repeat implements JacksonModel {
        public static final int ALL = 2;
        public static final int OFF = 0;
        public static final int ONE = 1;
        @JsonProperty("repeat")
        public int repeat;

        public Repeat() {
        }

        public static Repeat getNextRepeatMode(com.spotify.player.model.PlayerState playerState) {
            int intValue = playerStateToRepeat(playerState).intValue();
            if (intValue == 2) {
                return new Repeat(1);
            }
            if (intValue == 1) {
                return new Repeat(0);
            }
            return new Repeat(2);
        }

        private static Integer playerStateToRepeat(com.spotify.player.model.PlayerState playerState) {
            if (playerState != null) {
                if (playerState.options().repeatingTrack()) {
                    return 1;
                }
                if (playerState.options().repeatingContext()) {
                    return 2;
                }
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Repeat) && ((Repeat) obj).repeat == this.repeat) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.repeat;
        }

        public Repeat(com.spotify.player.model.PlayerState playerState) {
            this.repeat = playerStateToRepeat(playerState).intValue();
        }

        public Repeat(int i) {
            this.repeat = i;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RootListOptions implements JacksonModel {
        @JsonProperty("type")
        public final String type;

        public RootListOptions(@JsonProperty("type") String str) {
            this.type = str == null ? "default" : str;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Saved implements JacksonModel {
        @JsonProperty("can_save")
        public boolean canSave;
        @JsonProperty("id")
        public String id;
        @JsonProperty("saved")
        public boolean saved;
        @JsonProperty("uri")
        public String uri;

        public Saved() {
        }

        public Saved(boolean z) {
            this.saved = z;
        }

        public Saved(String str, boolean z) {
            this.uri = str;
            this.saved = z;
        }

        public Saved(String str, boolean z, boolean z2) {
            this.uri = str;
            this.saved = z;
            this.canSave = z2;
        }

        public Saved(com.spotify.player.model.PlayerState playerState) {
            if (playerState == null) {
                this.saved = false;
                return;
            }
            Optional<ContextTrack> track = playerState.track();
            if (!track.isPresent()) {
                this.saved = false;
                return;
            }
            ContextTrack contextTrack = track.get();
            this.uri = contextTrack.uri();
            this.saved = Boolean.parseBoolean(contextTrack.metadata().get("collection.in_collection"));
            this.canSave = Boolean.parseBoolean(contextTrack.metadata().get("collection.can_add"));
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SearchQuery implements JacksonModel {
        @JsonProperty("limit")
        public int limit;
        @JsonProperty("offset")
        public int offset;
        @JsonProperty("query")
        public String query;

        public SearchQuery(@JsonProperty("query") String str, @JsonProperty("limit") int i, @JsonProperty("offset") int i2) {
            this.query = str;
            this.limit = i;
            this.offset = i2;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Shuffle implements JacksonModel {
        @JsonProperty("shuffle")
        public boolean shuffle;

        public Shuffle() {
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public Shuffle(boolean z) {
            this.shuffle = z;
        }

        public Shuffle(com.spotify.player.model.PlayerState playerState) {
            this.shuffle = playerState != null && playerState.options().shufflingContext();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SkipPrevious implements JacksonModel {
        @JsonProperty("force_skip_previous")
        public boolean forceSkipPrevious;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Status implements JacksonModel {
        public static final Status OK = new Status(0, "", "");
        private static final int STATUS_CODE_NOT_LOGGED_IN = 1;
        private static final int STATUS_CODE_OK = 0;
        @JsonProperty("long_text")
        public String longText;
        @JsonProperty("short_text")
        public String shortText;
        @JsonProperty("code")
        public int statusCode;

        public Status(int i, String str, String str2) {
            this.statusCode = i;
            this.shortText = str;
            this.longText = str2;
        }

        public static Status createNotLoggedIn(android.content.Context context) {
            return new Status(1, context.getString(C0707R.string.applink_logged_out_warning_linescombo), String.format(Locale.getDefault(), "%s %s", context.getString(C0707R.string.applink_logged_out_warning_line1), context.getString(C0707R.string.applink_logged_out_warning_line2)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            if (this.statusCode != status.statusCode) {
                return false;
            }
            String str = this.shortText;
            if (str == null ? status.shortText != null : !str.equals(status.shortText)) {
                return false;
            }
            String str2 = this.longText;
            if (str2 != null) {
                if (str2.equals(status.longText)) {
                    return true;
                }
            } else if (status.longText == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.statusCode * 31;
            String str = this.shortText;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.longText;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TokenRequest implements JacksonModel {
        @JsonProperty("client_id")
        public final String clientId;
        @JsonProperty("redirect_uri")
        public final String redirectUri;
        @JsonProperty("scopes")
        public final String[] scopes;

        public TokenRequest(@JsonProperty("client_id") String str, @JsonProperty("scopes") String[] strArr, @JsonProperty("redirect_uri") String str2) {
            this.clientId = str;
            this.scopes = strArr;
            this.redirectUri = str2;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TokenResponse implements JacksonModel {
        public static final int CANCELED = 1;
        public static final int OK = 0;
        public static final int REJECTED = 2;
        @JsonProperty("reason")
        public String reason;
        @JsonProperty("status")
        public int status;
        @JsonProperty("token")
        public String token;

        public TokenResponse(@JsonProperty("status") int i, @JsonProperty("reason") String str, @JsonProperty("token") String str2) {
            this.status = i;
            this.reason = str;
            this.token = str2;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Track implements JacksonModel {
        @JsonProperty("album")
        public final Album album;
        @JsonProperty("artist")
        public final Artist artist;
        @JsonProperty("artists")
        public final List<Artist> artists;
        @JsonProperty("duration_ms")
        public final long duration;
        @JsonProperty("image_id")
        public final String imageUri;
        @JsonProperty("is_episode")
        public final boolean isEpisode;
        @JsonProperty("is_podcast")
        public final boolean isPodcast;
        @JsonProperty("name")
        public final String name;
        @JsonProperty("saved")
        public final boolean saved;
        @JsonProperty("uri")
        public final String uri;

        public Track(@JsonProperty("artist") Artist artist2, @JsonProperty("artists") List<Artist> list, @JsonProperty("album") Album album2, @JsonProperty("saved") boolean z, @JsonProperty("duration_ms") long j, @JsonProperty("name") String str, @JsonProperty("uri") String str2, @JsonProperty("image_id") String str3, @JsonProperty("is_episode") boolean z2, @JsonProperty("is_podcast") boolean z3) {
            this.artist = artist2;
            this.artists = list;
            this.album = album2;
            this.saved = z;
            this.duration = j;
            this.name = str;
            this.uri = str2;
            this.imageUri = str3;
            this.isEpisode = z2;
            this.isPodcast = z3;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Uri implements JacksonModel {
        @JsonProperty("feature_identifier")
        public String featureIdentifier;
        @JsonProperty("uri")
        public String uri;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uri)) {
                return false;
            }
            Uri uri2 = (Uri) obj;
            String str = this.uri;
            if (str == null ? uri2.uri == null : str.equals(uri2.uri)) {
                String str2 = this.featureIdentifier;
                if (str2 != null) {
                    if (str2.equals(uri2.featureIdentifier)) {
                        return true;
                    }
                } else if (uri2.featureIdentifier == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.uri;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UriWithNamedOptions implements JacksonModel {
        @JsonProperty("feature_identifier")
        public final String featureIdentifier;
        @JsonProperty("skipToIndex")
        public final int skipToIndex;
        @JsonProperty("skipToUid")
        public final String skipToUid;
        @JsonProperty("skipToURI")
        public final String skipToUri;
        @JsonProperty("uri")
        public final String uri;

        public UriWithNamedOptions(@JsonProperty("uri") String str, @JsonProperty("skipToURI") String str2, @JsonProperty("skipToIndex") int i, @JsonProperty("skipToUid") String str3, @JsonProperty("feature_identifier") String str4) {
            this.uri = str;
            this.skipToUri = str2;
            this.skipToIndex = i;
            this.skipToUid = str3;
            this.featureIdentifier = str4;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UriWithOptionExtras implements JacksonModel {
        @JsonProperty("feature_identifier")
        public final String featureIdentifier;
        @JsonProperty("options")
        public final String[] options;
        @JsonProperty("uri")
        public final String uri;

        public UriWithOptionExtras(@JsonProperty("uri") String str, @JsonProperty("options") String[] strArr, @JsonProperty("feature_identifier") String str2) {
            this.uri = str;
            this.options = strArr;
            this.featureIdentifier = str2;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Uris implements JacksonModel {
        @JsonProperty("uris")
        public String[] uris;

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class WelcomeDetails implements JacksonModel {
        @JsonProperty("app_version")
        public String appversion;
        @JsonProperty("authid")
        public String authid;
        @JsonProperty("authmethod")
        public String authmethod;
        @JsonProperty("authprovider")
        public String authprovider;
        @JsonProperty("authrole")
        public String authrole;
        @JsonProperty("date_time")
        public String dateTime;
        @JsonProperty("roles")
        public HelloDetailsAppProtocol$Roles roles;

        public WelcomeDetails(String str, String str2) {
            HelloDetailsAppProtocol$Roles helloDetailsAppProtocol$Roles = new HelloDetailsAppProtocol$Roles();
            this.roles = helloDetailsAppProtocol$Roles;
            helloDetailsAppProtocol$Roles.dealer = new AppProtocolBase.Empty();
            this.roles.broker = new AppProtocolBase.Empty();
            this.appversion = str;
            this.dateTime = str2;
        }
    }

    static String a(ContextTrack contextTrack) {
        if (contextTrack.metadata().containsKey("image_xlarge_url")) {
            return contextTrack.metadata().get("image_xlarge_url");
        }
        if (contextTrack.metadata().containsKey("image_large_url")) {
            return contextTrack.metadata().get("image_large_url");
        }
        return contextTrack.metadata().get("image_url");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TrackData implements JacksonModel {
        public static final String TYPE_NO_TRACK = "no_track";
        public static final String TYPE_TRACK = "track";
        @JsonProperty("album")
        public Album album;
        @JsonProperty("artist")
        public Artist artist;
        @JsonProperty("can_mute")
        public boolean canMute;
        @JsonProperty("can_pause")
        public boolean canPause;
        @JsonProperty("can_peek_next")
        public boolean canPeekNext;
        @JsonProperty("can_peek_prev")
        public boolean canPeekPrev;
        @JsonProperty("can_rate")
        public boolean canRate;
        @JsonProperty("can_resume")
        public boolean canResume;
        @JsonProperty("can_save")
        public boolean canSave;
        @JsonProperty("can_seek")
        public boolean canSeek;
        @JsonProperty("can_show_more_albums")
        public boolean canShowMoreAlbums;
        @JsonProperty("can_skip_next")
        public boolean canSkipNext;
        @JsonProperty("can_skip_prev")
        public boolean canSkipPrev;
        @JsonProperty("can_start_radio")
        public boolean canStartRadio;
        @JsonProperty("duration_ms")
        public int durationMs;
        @JsonProperty("image_id")
        public String imageUri;
        @JsonProperty("name")
        public String name;
        @JsonProperty("rated")
        public int rated;
        @JsonProperty("saved")
        public boolean saved;
        @JsonProperty("track_number")
        public int trackNumber;
        @JsonProperty("type")
        public String type;
        @JsonProperty("uri")
        public String uri;

        public TrackData(Album album2, Artist artist2, int i, String str, int i2, String str2, String str3, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str4) {
            this.album = album2;
            this.artist = artist2;
            this.durationMs = i;
            this.name = str;
            this.trackNumber = i2;
            this.type = str2;
            this.uri = str3;
            this.saved = z;
            this.rated = i3;
            this.canSave = z2;
            this.canRate = z3;
            this.canStartRadio = z4;
            this.canShowMoreAlbums = z5;
            this.canSkipNext = z6;
            this.canSkipPrev = z7;
            this.canPause = z8;
            this.canResume = z9;
            this.canSeek = z10;
            this.imageUri = str4;
        }

        public static TrackData trackDataFor(com.spotify.player.model.PlayerState playerState) {
            List<MediaAction> list;
            if (playerState == null) {
                list = Collections.emptyList();
            } else {
                list = new d3().a(playerState, 100);
            }
            return trackDataFor(playerState, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackData)) {
                return false;
            }
            TrackData trackData = (TrackData) obj;
            if (this.trackNumber != trackData.trackNumber || this.saved != trackData.saved || this.rated != trackData.rated || this.canSave != trackData.canSave || this.canRate != trackData.canRate || this.canStartRadio != trackData.canStartRadio || this.canShowMoreAlbums != trackData.canShowMoreAlbums || this.canSkipNext != trackData.canSkipNext || this.canSkipPrev != trackData.canSkipPrev || this.canPeekNext != trackData.canPeekNext || this.canPeekPrev != trackData.canPeekPrev || this.canPause != trackData.canPause || this.canResume != trackData.canResume || this.canSeek != trackData.canSeek || this.canMute != trackData.canMute) {
                return false;
            }
            String str = this.type;
            if (str == null ? trackData.type != null : !str.equals(trackData.type)) {
                return false;
            }
            String str2 = this.uri;
            if (str2 == null ? trackData.uri != null : !str2.equals(trackData.uri)) {
                return false;
            }
            String str3 = this.imageUri;
            if (str3 != null) {
                if (str3.equals(trackData.imageUri)) {
                    return true;
                }
            } else if (trackData.imageUri == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.trackNumber * 31;
            String str = this.type;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.uri;
            int hashCode2 = (((((((((((((((((((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.saved ? 1 : 0)) * 31) + this.rated) * 31) + (this.canSave ? 1 : 0)) * 31) + (this.canRate ? 1 : 0)) * 31) + (this.canStartRadio ? 1 : 0)) * 31) + (this.canShowMoreAlbums ? 1 : 0)) * 31) + (this.canSkipNext ? 1 : 0)) * 31) + (this.canSkipPrev ? 1 : 0)) * 31) + (this.canPeekNext ? 1 : 0)) * 31) + (this.canPeekPrev ? 1 : 0)) * 31) + (this.canPause ? 1 : 0)) * 31) + (this.canResume ? 1 : 0)) * 31) + (this.canSeek ? 1 : 0)) * 31) + (this.canMute ? 1 : 0)) * 31;
            String str3 = this.imageUri;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public static TrackData trackDataFor(com.spotify.player.model.PlayerState playerState, List<MediaAction> list) {
            int i;
            if (playerState == null) {
                return AppProtocol.c;
            }
            Optional<ContextTrack> track = playerState.track();
            if (!track.isPresent()) {
                return AppProtocol.c;
            }
            ContextTrack contextTrack = track.get();
            ImmutableMap<String, String> metadata = contextTrack.metadata();
            Album album2 = new Album(metadata.get("album_title"), metadata.get("album_uri"));
            Artist artist2 = new Artist(metadata.get("artist_name"), metadata.get("artist_uri"));
            String str = metadata.get("album_track_number");
            int intValue = playerState.duration().or((Optional<Long>) 0L).intValue();
            String str2 = metadata.get("title");
            if (str == null) {
                i = 0;
            } else {
                i = Integer.parseInt(str);
            }
            String uri2 = contextTrack.uri();
            MediaAction mediaAction = MediaAction.REMOVE_FROM_COLLECTION;
            boolean contains = list.contains(mediaAction);
            boolean z = list.contains(mediaAction) || list.contains(MediaAction.ADD_TO_COLLECTION);
            boolean contains2 = list.contains(MediaAction.START_RADIO);
            boolean contains3 = list.contains(MediaAction.SKIP_TO_NEXT);
            boolean contains4 = list.contains(MediaAction.SKIP_TO_PREVIOUS);
            MediaAction mediaAction2 = MediaAction.PLAY;
            return new TrackData(album2, artist2, intValue, str2, i, TYPE_TRACK, uri2, contains, 0, z, false, contains2, false, contains3, contains4, list.contains(mediaAction2) || list.contains(MediaAction.PAUSE), list.contains(mediaAction2) || list.contains(MediaAction.PAUSE), false, AppProtocol.a(contextTrack));
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class LogMessage implements JacksonModel {
        public static final String SEVERITY_ERROR = "error";
        public static final String SEVERITY_INFO = "info";
        public static final String SEVERITY_WARNING = "warning";
        @JsonProperty("message")
        public String message;
        @JsonProperty("severity")
        public String severity;
        @JsonProperty("title")
        public String title;

        public LogMessage(String str, String str2, String str3) {
            this.title = str;
            this.message = str2;
            this.severity = str3;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public LogMessage() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TrackElapsed implements JacksonModel {
        @JsonProperty("duration_ms")
        public int durationMs;
        @JsonProperty("elapsed_time")
        public int elapsedTime;
        @JsonProperty("percentage")
        public int percentage;

        public TrackElapsed(int i, int i2, int i3) {
            this.elapsedTime = i;
            this.durationMs = i2;
            this.percentage = i3;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public TrackElapsed(com.spotify.player.model.PlayerState playerState, cqe cqe) {
            int i = 0;
            if (playerState != null) {
                this.elapsedTime = playerState.position(cqe.d()).or((Optional<Long>) 0L).intValue();
                int intValue = playerState.duration().or((Optional<Long>) 0L).intValue();
                this.durationMs = intValue;
                this.percentage = intValue > 0 ? (this.elapsedTime * 100) / intValue : i;
                return;
            }
            this.percentage = 0;
            this.durationMs = 0;
            this.elapsedTime = 0;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionState implements JacksonModel {
        @JsonProperty("connection_type")
        public String connectionType;
        @JsonProperty("is_in_forced_offline_mode")
        public boolean isInForcedOfflineMode;
        @JsonProperty("is_logged_in")
        public boolean isLoggedIn;
        @JsonProperty("is_offline")
        public boolean isOffline;

        public SessionState(@JsonProperty("is_offline") boolean z, @JsonProperty("is_in_forced_offline_mode") boolean z2, @JsonProperty("is_logged_in") boolean z3, @JsonProperty("connection_type") String str) {
            this.isOffline = z;
            this.isInForcedOfflineMode = z2;
            this.isLoggedIn = z3;
            this.connectionType = str;
        }

        private static String getConnectionType(ConnectionType connectionType2) {
            switch (connectionType2.ordinal()) {
                case 1:
                    return "none";
                case 2:
                    return "gprs";
                case 3:
                    return "edge";
                case 4:
                    return "3g";
                case 5:
                    return "4g";
                case 6:
                    return "wlan";
                case 7:
                    return "ethernet";
                default:
                    return "unknown";
            }
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public SessionState(com.spotify.mobile.android.service.session.SessionState sessionState, ConnectionType connectionType2) {
            boolean z = true;
            boolean z2 = sessionState != null && !sessionState.connected();
            this.isOffline = z2;
            this.isInForcedOfflineMode = z2 && !sessionState.canConnect();
            this.isLoggedIn = (sessionState == null || !sessionState.loggedIn() || sessionState.loggingOut()) ? false : z;
            this.connectionType = getConnectionType(connectionType2);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Context implements JacksonModel {
        public static final Context EMPTY = new Context("", "", null, null, "no_context", null, null, null, null, null, null);
        @JsonProperty("can_repeat_context")
        public final Boolean canRepeatContext;
        @JsonProperty("can_repeat_track")
        public final Boolean canRepeatTrack;
        @JsonProperty("can_shuffle")
        public final Boolean canShuffle;
        @JsonProperty("id")
        public final String id;
        @JsonProperty("repeat_context")
        public final Boolean repeatContext;
        @JsonProperty("repeat_track")
        public final Boolean repeatTrack;
        @JsonProperty("shuffle")
        public final Boolean shuffle;
        @JsonProperty(ContextTrack.Metadata.KEY_SUBTITLE)
        public final String subtitle;
        @JsonProperty("title")
        public final String title;
        @JsonProperty("type")
        public final String type;
        @JsonProperty("uri")
        public final String uri;

        public Context(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            this.id = str;
            this.uri = str2;
            this.title = str3;
            this.subtitle = str4;
            this.type = str5;
            this.repeatTrack = bool;
            this.repeatContext = bool2;
            this.shuffle = bool3;
            this.canRepeatTrack = bool4;
            this.canRepeatContext = bool5;
            this.canShuffle = bool6;
        }

        private static String getTypeForPlayerState(com.spotify.player.model.PlayerState playerState) {
            return EntityType.d(playerState).name().toLowerCase(Locale.US);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return false;
            }
            Context context = (Context) obj;
            String str = this.id;
            if (str == null ? context.id != null : !str.equals(context.id)) {
                return false;
            }
            String str2 = this.uri;
            if (str2 == null ? context.uri != null : !str2.equals(context.uri)) {
                return false;
            }
            String str3 = this.title;
            if (str3 == null ? context.title != null : !str3.equals(context.title)) {
                return false;
            }
            String str4 = this.subtitle;
            if (str4 == null ? context.subtitle != null : !str4.equals(context.subtitle)) {
                return false;
            }
            Boolean bool = this.repeatTrack;
            if (bool == null ? context.repeatTrack != null : !bool.equals(context.repeatTrack)) {
                return false;
            }
            Boolean bool2 = this.repeatContext;
            if (bool2 == null ? context.repeatContext != null : !bool2.equals(context.repeatContext)) {
                return false;
            }
            Boolean bool3 = this.shuffle;
            if (bool3 == null ? context.shuffle != null : !bool3.equals(context.shuffle)) {
                return false;
            }
            Boolean bool4 = this.canRepeatTrack;
            if (bool4 == null ? context.canRepeatTrack != null : !bool4.equals(context.canRepeatTrack)) {
                return false;
            }
            Boolean bool5 = this.canRepeatContext;
            if (bool5 == null ? context.canRepeatContext != null : !bool5.equals(context.canRepeatContext)) {
                return false;
            }
            Boolean bool6 = this.canShuffle;
            if (bool6 != null) {
                if (bool6.equals(context.canShuffle)) {
                    return true;
                }
            } else if (context.canShuffle == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.uri;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.title;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.subtitle;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.repeatTrack;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.repeatContext;
            int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.shuffle;
            int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.canRepeatTrack;
            int hashCode8 = (hashCode7 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Boolean bool5 = this.canRepeatContext;
            int hashCode9 = (hashCode8 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.canShuffle;
            if (bool6 != null) {
                i = bool6.hashCode();
            }
            return hashCode9 + i;
        }

        public String toString() {
            TrackData trackData = AppProtocol.c;
            return getClass().getName();
        }

        public Context(f fVar, com.spotify.player.model.PlayerState playerState, android.content.Context context) {
            this(a4.a(playerState.contextUri()), a4.a(playerState.contextUri()), fVar.c(context.getResources()), fVar.d(context.getResources()), getTypeForPlayerState(playerState), Boolean.valueOf(playerState.options().repeatingTrack()), Boolean.valueOf(playerState.options().repeatingContext()), Boolean.valueOf(playerState.options().shufflingContext()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()));
        }
    }
}
