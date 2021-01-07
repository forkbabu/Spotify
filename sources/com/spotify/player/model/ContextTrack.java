package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.AutoValue_ContextTrack;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class ContextTrack {
    private static List<String> delimiters = Arrays.asList("spotify:meta:delimiter", "spotify:delimiter");

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return ContextTrack.builder("");
        }

        public abstract ContextTrack build();

        @JsonProperty("metadata")
        public abstract Builder metadata(Map<String, String> map);

        @JsonProperty(Metadata.KEY_PROVIDER)
        public abstract Builder provider(String str);

        @JsonProperty("uid")
        public abstract Builder uid(String str);

        @JsonProperty("uri")
        public abstract Builder uri(String str);
    }

    public static final class MediaType {
        public static final String AUDIO = "audio";
        public static final String MIXED = "mixed";
        public static final String VIDEO = "video";
    }

    public static final class Metadata {
        public static final String KEY_ACTIONS_ADVANCING_PAST_TRACK = "actions.advancing_past_track";
        public static final String KEY_ACTIONS_ADVANCING_TO_TRACK = "actions.advancing_to_track";
        public static final String KEY_ACTIONS_REPEATING_TRACK = "actions.repeating_track";
        public static final String KEY_ACTIONS_REVERSING_PAST_TRACK = "actions.reversing_past_track";
        public static final String KEY_ACTIONS_REVERSING_TO_TRACK = "actions.reversing_to_track";
        public static final String KEY_ACTIONS_SKIPPING_NEXT_PAST_TRACK = "actions.skipping_next_past_track";
        public static final String KEY_ACTIONS_SKIPPING_PREV_PAST_TRACK = "actions.skipping_prev_past_track";
        public static final String KEY_ADDED_AT = "added_at";
        public static final String KEY_ADDED_BY_NAME = "added_by_name";
        public static final String KEY_ADDED_BY_USERNAME = "added_by_username";
        public static final String KEY_ADVERTISER = "advertiser";
        public static final String KEY_AD_ID = "ad_id";
        public static final String KEY_AD_TYPE = "ad_type";
        public static final String KEY_ALBUM_ARTIST_NAME = "album_artist_name";
        public static final String KEY_ALBUM_DISC_COUNT = "album_disc_count";
        public static final String KEY_ALBUM_DISC_NUMBER = "album_disc_number";
        public static final String KEY_ALBUM_TITLE = "album_title";
        public static final String KEY_ALBUM_TRACK_COUNT = "album_track_count";
        public static final String KEY_ALBUM_TRACK_NUMBER = "album_track_number";
        public static final String KEY_ALBUM_URI = "album_uri";
        public static final String KEY_ARTIST_NAME = "artist_name";
        public static final String KEY_ARTIST_URI = "artist_uri";
        public static final String KEY_AUTOPLAY_IS_AUTOPLAY = "autoplay.is_autoplay";
        public static final String KEY_AVAILABILITY_RESTRICTIONS = "availability_restrictions";
        public static final String KEY_AVAILABLE_FILE_FORMATS = "available_file_formats";
        public static final String KEY_CLICK_URL = "click_url";
        public static final String KEY_COLLECTION_CAN_ADD = "collection.can_add";
        public static final String KEY_COLLECTION_CAN_BAN = "collection.can_ban";
        public static final String KEY_COLLECTION_IN_COLLECTION = "collection.in_collection";
        public static final String KEY_COLLECTION_IS_ARTIST_BANNED = "collection.artist.is_banned";
        public static final String KEY_COLLECTION_IS_BANNED = "collection.is_banned";
        public static final String KEY_CONTEXT_URI = "context_uri";
        public static final String KEY_DURATION = "duration";
        public static final String KEY_ENTITY_URI = "entity_uri";
        public static final String KEY_EXTERNALLY_INJECTED = "mft.externally_injected";
        public static final String KEY_HAS_LYRICS = "has_lyrics";
        public static final String KEY_HIDDEN = "hidden";
        public static final String KEY_IMAGE_LARGE_URL = "image_large_url";
        public static final String KEY_IMAGE_SMALL_URL = "image_small_url";
        public static final String KEY_IMAGE_URL = "image_url";
        public static final String KEY_IMAGE_XLARGE_URL = "image_xlarge_url";
        public static final String KEY_INTERACTION_ID = "interaction_id";
        public static final String KEY_IS_19_PLUS = "is_19_plus";
        public static final String KEY_IS_ADVERTISEMENT = "is_advertisement";
        public static final String KEY_IS_AD_SKIPPABLE = "ad.is_skippable";
        public static final String KEY_IS_BACKGROUNDABLE = "is_backgroundable";
        public static final String KEY_IS_DATA_SAVER_TRACK = "is_data_saver_track";
        public static final String KEY_IS_EXPLICIT = "is_explicit";
        public static final String KEY_IS_INTERRUPTION = "mod.is_interruption";
        public static final String KEY_IS_LOCAL = "is_local";
        public static final String KEY_IS_PODCAST_ADVERTISEMENT = "is_podcast_advertisement";
        public static final String KEY_IS_PODCAST_ADVERTISEMENT_IN_VIDEO = "is_podcast_advertisement_in_video";
        public static final String KEY_IS_PREMIUM_ONLY = "is_premium_only";
        public static final String KEY_IS_QUEUED = "is_queued";
        public static final String KEY_ITERATION = "iteration";
        public static final String KEY_KEEP_SKIP_DIRECTION = "keep_skip_direction";
        public static final String KEY_LOCAL_FILE_PATH = "local_file_path";
        public static final String KEY_LOCAL_FILE_SIZE = "local_file_size";
        public static final String KEY_MARKED_FOR_DOWNLOAD = "marked_for_download";
        public static final String KEY_MEDIA_EXTERNAL_URL = "media.external_url";
        public static final String KEY_MEDIA_LIVE = "media.live";
        public static final String KEY_MEDIA_MANIFEST_ID = "media.manifest_id";
        public static final String KEY_MEDIA_START_POSITION = "media.start_position";
        public static final String KEY_MEDIA_STOP_POSITION = "media.stop_position";
        public static final String KEY_MEDIA_TYPE = "media.type";
        public static final String KEY_ORIGINAL_INDEX = "original_index";
        public static final String KEY_PAGE_INSTANCE_ID = "page_instance_id";
        public static final String KEY_PARENT_EPISODE_URI = "parent_episode.uri";
        public static final String KEY_PLAYBACK_SPEED = "playback_speed";
        public static final String KEY_POPULARITY = "popularity";
        public static final String KEY_PROMOTION_TYPE = "promotion_type";
        public static final String KEY_PROVIDER = "provider";
        public static final String KEY_REPEATING_TRACK_COUNT = "repeating_track.count";
        public static final String KEY_REPEATING_TRACK_MAX = "repeating_track.max";
        public static final String KEY_REPEATING_TRACK_MIN = "repeating_track.min";
        public static final String KEY_SEGMENT_INDEX = "segment.index";
        public static final String KEY_SEGMENT_URI = "segment.uri";
        public static final String KEY_SHUFFLE_AVERAGE_POSITION = "shuffle.average_position";
        public static final String KEY_SUBTITLE = "subtitle";
        public static final String KEY_TITLE = "title";
        public static final String KEY_TRACK_PLAYER = "track_player";
    }

    public static final class TrackAction {
        public static final String PAUSE = "pause";
        public static final String RESUME = "resume";
        public static final String STOP = "stop";
    }

    public static final class TrackPlayer {
        public static final String AUDIO = "audio";
        public static final String VIDEO = "video";
    }

    public static Builder builder(String str) {
        return new AutoValue_ContextTrack.Builder().uri(str).uid("").metadata(Collections.emptyMap()).provider("");
    }

    public static ContextTrack create(String str) {
        return builder(str).build();
    }

    @JsonIgnore
    public boolean isDelimiter() {
        return delimiters.contains(uri());
    }

    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonProperty(Metadata.KEY_PROVIDER)
    public abstract String provider();

    public abstract Builder toBuilder();

    @JsonProperty("uid")
    public abstract String uid();

    @JsonProperty("uri")
    public abstract String uri();
}
