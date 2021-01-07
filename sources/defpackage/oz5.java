package defpackage;

import com.spotify.music.C0707R;
import com.spotify.player.model.PlayerState;

/* renamed from: oz5  reason: default package */
final class oz5 {
    static cy5 a(PlayerState playerState, qy5 qy5, boolean z) {
        if (playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
            return cy5.a(dy5.a(C0707R.drawable.icn_notification_new_next, C0707R.string.content_description_next_track), ((ry5) qy5).b(), z);
        }
        return cy5.a(dy5.a(C0707R.drawable.icn_notification_new_next_disabled, C0707R.string.content_description_next_track_disabled), null, z);
    }

    static cy5 b(PlayerState playerState, qy5 qy5, boolean z) {
        if (playerState.isPaused()) {
            return cy5.a(dy5.a(C0707R.drawable.icn_notification_new_play, C0707R.string.content_description_play_button), ((ry5) qy5).e(), z);
        }
        return cy5.a(dy5.a(C0707R.drawable.icn_notification_new_pause, C0707R.string.content_description_pause_button), ((ry5) qy5).c(), z);
    }

    static cy5 c(PlayerState playerState, qy5 qy5, boolean z) {
        if (playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty()) {
            return cy5.a(dy5.a(C0707R.drawable.icn_notification_new_prev, C0707R.string.content_description_previous_track), ((ry5) qy5).d(), z);
        }
        return cy5.a(dy5.a(C0707R.drawable.icn_notification_new_prev_disabled, C0707R.string.content_description_previous_track_disabled), null, z);
    }
}
