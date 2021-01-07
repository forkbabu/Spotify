package com.spotify.nlu.slimo.proto;

import com.google.protobuf.o;

public enum SlimoProto$ParsedQuery$Intent implements o.c {
    WTF(0),
    PLAY(1),
    UNSUPPORTED(31),
    NO_INTENT(32),
    SEARCH(2),
    SHOW(3),
    RESUME(4),
    STOP(5),
    NEXT(6),
    PREVIOUS(7),
    MORE_LIKE_THIS(8),
    RECOMMEND_SOMETHING(9),
    SHUFFLE_ON(10),
    SHUFFLE_OFF(11),
    REPEAT_ON(12),
    REPEAT_OFF(13),
    REPEAT_ONE(14),
    VOLUME_UP(15),
    VOLUME_DOWN(16),
    VOLUME_ABSOLUTE(17),
    THUMBS_UP(18),
    THUMBS_DOWN(19),
    SLEEP_TIMER_SET(20),
    SLEEP_TIMER_CANCEL(21),
    SET_ALARM(22),
    ADD_TO_PLAYLIST(23),
    ADD_TO_COLLECTION(24),
    ADD_TO_QUEUE(25),
    HELP(26),
    WHATS_PLAYING(27),
    GENERAL_MUSIC_INFO(28),
    FOLLOW(29),
    SHARE(30),
    CHAT(33),
    NAVIGATE(34),
    PLAY_AGAIN(35),
    BAN(36),
    MORE_OF(37),
    PULL_CONTEXT(38),
    START_ICEBREAKER(39),
    START_STEERING(40),
    MUTE_MIC(41),
    PLAY_PRESET(42),
    SAVE_TO_PRESET(43),
    PLAY_DIFFERENT(44),
    SHOW_DIFFERENT(45),
    PLAY_SIMILAR(46),
    SHOW_SIMILAR(47),
    UNDO(48),
    DISCOVER(49),
    WHO_AM_I(50),
    SHOW_SOMETHING(51),
    SEEK_FORWARDS(52),
    SEEK_BACKWARDS(53),
    SHOW_QUEUE(54),
    LIST_MY_DEVICES(55),
    EXPLICIT_FILTER_ON(56),
    EXPLICIT_FILTER_OFF(57),
    SWITCH_ACCOUNT(58),
    SET_DEFAULT_DEVICE(59),
    TRANSFER_PLAYBACK(60),
    UNRECOGNIZED(-1);
    
    private final int value;

    private SlimoProto$ParsedQuery$Intent(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
