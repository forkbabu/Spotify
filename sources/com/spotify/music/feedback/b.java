package com.spotify.music.feedback;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.formatlisttype.a;

public class b {
    private final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    public boolean a(PlayerState playerState) {
        FeedbackValue d = FeedbackValue.d(playerState.contextMetadata().get(PlayerTrack.Metadata.LIKE_FEEDBACK_AVAILABLE));
        FeedbackValue d2 = FeedbackValue.d(playerState.contextMetadata().get(PlayerTrack.Metadata.DISLIKE_FEEDBACK_AVAILABLE));
        FeedbackValue feedbackValue = FeedbackValue.ON;
        if (!(feedbackValue == d || feedbackValue == d2)) {
            if (!(this.a.a(playerState.contextMetadata().get("format_list_type")) == FormatListType.f)) {
                return false;
            }
        }
        return true;
    }
}
