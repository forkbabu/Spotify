package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PlayerError implements JacksonModel {
    public static final String CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY = "playback_id";
    public static final String CONTEXT_PLAYER_ERROR_REASON_KEY = "reasons";
    public static final String CONTEXT_PLAYER_ERROR_TRACK_URI_KEY = "track_uri";
    public static final String ERROR_CATALOGUE_RESTRICTED = "video_catalogue_restricted";
    public static final String ERROR_COUNTRY_RESTRICTED = "video_country_restricted";
    public static final String ERROR_GEORESTRICTED = "video_georestricted";
    public static final String ERROR_IN_OFFLINE_MODE = "track_unavailable_offline";
    public static final String ERROR_MANIFEST_DELETED = "video_manifest_deleted";
    public static final String ERROR_PLAYBACK = "video_playback_error";
    public static final String ERROR_PLAYBACK_STUCK = "playback_stuck";
    public static final String ERROR_UNAVAILABLE = "video_unavailable";
    public static final String ERROR_UNSUPPORTED_CLIENT_VERSION = "video_unsupported_client_version";
    public static final String ERROR_UNSUPPORTED_PLATFORM_VERSION = "video_unsupported_platform_version";

    public static PlayerError create(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, str2);
        hashMap.put(CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY, str3);
        return new AutoValue_PlayerError(str, hashMap);
    }

    public static PlayerError fromVideoPlaybackError(BetamaxException betamaxException, d0 d0Var) {
        return fromVideoPlaybackError(betamaxException, d0Var.c().get("endvideo_track_uri"), d0Var.c().get("endvideo_playback_id"));
    }

    @JsonProperty("data")
    public abstract Map<String, String> data();

    @JsonProperty("type")
    public abstract String type();

    public static PlayerError fromVideoPlaybackError(BetamaxException betamaxException, String str, String str2) {
        String str3;
        switch (betamaxException.a().ordinal()) {
            case 1:
                str3 = ERROR_GEORESTRICTED;
                break;
            case 2:
                str3 = ERROR_UNSUPPORTED_PLATFORM_VERSION;
                break;
            case 3:
                str3 = ERROR_UNSUPPORTED_CLIENT_VERSION;
                break;
            case 4:
                str3 = ERROR_IN_OFFLINE_MODE;
                break;
            case 5:
                str3 = ERROR_MANIFEST_DELETED;
                break;
            case 6:
                str3 = ERROR_COUNTRY_RESTRICTED;
                break;
            case 7:
                str3 = ERROR_UNAVAILABLE;
                break;
            case 8:
                str3 = ERROR_CATALOGUE_RESTRICTED;
                break;
            case 9:
                str3 = ERROR_PLAYBACK_STUCK;
                break;
            default:
                str3 = ERROR_PLAYBACK;
                break;
        }
        return create(str3, str, str2);
    }
}
