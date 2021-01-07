package com.spotify.mobile.android.video.cosmos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VideoPlayerAdvanceReason implements JacksonModel {
    @JsonProperty("reason")
    public Reason reason;
    @JsonProperty("unplayable_reason")
    public UnplayableReason unplayableReason;

    public enum Reason implements JacksonModel {
        FINISHED("finished"),
        UNPLAYABLE("unplayable");
        
        private static final Map<String, UnplayableReason> sReasonStringMap = new HashMap();
        final String mReasonString;

        static {
            Iterator it = EnumSet.allOf(UnplayableReason.class).iterator();
            while (it.hasNext()) {
                UnplayableReason unplayableReason = (UnplayableReason) it.next();
                sReasonStringMap.put(unplayableReason.getReasonString(), unplayableReason);
            }
        }

        private Reason(String str) {
            this.mReasonString = str;
        }

        public static UnplayableReason getByReasonString(String str) {
            return sReasonStringMap.get(str);
        }

        @JsonValue
        public String getReasonString() {
            return this.mReasonString;
        }
    }

    public enum UnplayableReason implements JacksonModel {
        NOT_AVAILABLE("not_available"),
        NOT_AVAILABLE_OFFLINE("not_available_offline"),
        NOT_AVAILABLE_IN_CURRENT_REGION("not_available_in_current_region"),
        NOT_AVAILABLE_IN_NON_PREMIUM("not_available_in_non_premium"),
        NOT_AVAILABLE_BY_ARTIST_BAN("not_available_by_artist_ban"),
        LOCAL_FILE_NOT_FOUND("local_file_not_found"),
        LOCAL_FILE_BAD_FORMAT("local_file_bad_format"),
        LOCAL_FILE_DRM_PROTECTED("local_file_drm_protected"),
        USER_STREAMING_DISALLOWED("user_streaming_disallowed"),
        USER_CAPPING_REACHED("user_capping_reached"),
        APP_IN_BACKGROUND("background"),
        DRIVER_DISTRACTED("driver_distracted"),
        MISSING_MANIFEST_ID("missing_manifest_id");
        
        private static final Map<String, UnplayableReason> sReasonStringMap = new HashMap();
        final String mReasonString;

        static {
            Iterator it = EnumSet.allOf(UnplayableReason.class).iterator();
            while (it.hasNext()) {
                UnplayableReason unplayableReason = (UnplayableReason) it.next();
                sReasonStringMap.put(unplayableReason.getReasonString(), unplayableReason);
            }
        }

        private UnplayableReason(String str) {
            this.mReasonString = str;
        }

        public static UnplayableReason getByReasonString(String str) {
            return sReasonStringMap.get(str);
        }

        @JsonValue
        public String getReasonString() {
            return this.mReasonString;
        }
    }

    public VideoPlayerAdvanceReason(Reason reason2, UnplayableReason unplayableReason2) {
        this.reason = reason2;
        this.unplayableReason = unplayableReason2;
    }
}
