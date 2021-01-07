package com.spotify.mediasession.playbackactions;

import com.spotify.music.C0707R;

public enum MediaAction {
    PLAY(0, C0707R.drawable.mediaservice_vector_play),
    PAUSE(1, C0707R.drawable.mediaservice_vector_pause),
    SKIP_TO_NEXT(2, C0707R.drawable.mediaservice_vector_skip_next),
    SKIP_TO_PREVIOUS(3, C0707R.drawable.mediaservice_vector_skip_previous),
    TURN_SHUFFLE_ON(4, C0707R.drawable.mediaservice_vector_shuffle),
    TURN_SHUFFLE_OFF(5, C0707R.drawable.mediaservice_vector_shuffle_active),
    START_RADIO(10, C0707R.drawable.mediaservice_vector_start_radio),
    ADD_TO_COLLECTION(11, C0707R.drawable.mediaservice_vector_like),
    REMOVE_FROM_COLLECTION(12, C0707R.drawable.mediaservice_vector_like_active),
    TURN_REPEAT_ALL_ON(13, C0707R.drawable.mediaservice_vector_repeat_off),
    TURN_REPEAT_ONE_ON(14, C0707R.drawable.mediaservice_vector_repeat_all),
    TURN_REPEAT_ONE_OFF(15, C0707R.drawable.mediaservice_vector_repeat_one),
    TURN_REPEAT_ALL_OFF(16, C0707R.drawable.mediaservice_vector_repeat_all),
    SKIP_TO_NEXT_DISABLED(17, C0707R.drawable.mediaservice_vector_skip_next),
    SKIP_TO_PREVIOUS_DISABLED(18, C0707R.drawable.mediaservice_vector_skip_previous),
    SEEK_15_SECONDS_FORWARD(19, C0707R.drawable.mediaservice_vector_seek_forward_15),
    SEEK_15_SECONDS_BACK(20, C0707R.drawable.mediaservice_vector_seek_back_15),
    STOP(21, 0),
    PLAY_FROM_URI(22, 0),
    PREPARE_FROM_URI(23, 0),
    PLAY_FROM_SEARCH(24, 0),
    NO_ACTION(25, 0),
    TOGGLE_REPEAT(26, C0707R.drawable.mediaservice_vector_repeat_off),
    TOGGLE_SHUFFLE(27, C0707R.drawable.mediaservice_vector_shuffle),
    PLAYBACK_SPEED_0_5(28, C0707R.drawable.mediaservice_vector_playback_speed_0_5),
    PLAYBACK_SPEED_0_8(29, C0707R.drawable.mediaservice_vector_playback_speed_0_8),
    PLAYBACK_SPEED_1_0(30, C0707R.drawable.mediaservice_vector_playback_speed_1_0),
    PLAYBACK_SPEED_1_2(31, C0707R.drawable.mediaservice_vector_playback_speed_1_2),
    PLAYBACK_SPEED_1_5(32, C0707R.drawable.mediaservice_vector_playback_speed_1_5),
    PLAYBACK_SPEED_2_0(33, C0707R.drawable.mediaservice_vector_playback_speed_2_0),
    PLAYBACK_SPEED_3_0(34, C0707R.drawable.mediaservice_vector_playback_speed_3_0),
    SEEK_TO(35, 0),
    SET_STANDARD_RATING(36, 0);
    
    private final int mIconRes;
    private final int mId;

    static {
        values();
    }

    private MediaAction(int i, int i2) {
        this.mId = i;
        this.mIconRes = i2;
    }

    public int d() {
        return this.mIconRes;
    }
}
