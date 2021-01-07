package com.spotify.music.features.settings.adapter;

import com.spotify.android.flags.c;
import java.util.EnumSet;

public enum Item {
    EMPLOYEE_PODCASTS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EMPLOYEE_PODCASTS_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.EMPLOYEE_PODCASTS;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    DATA_SAVER_MODE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.DATA_SAVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    EMAIL {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EMAIL_UPDATE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ACCOUNT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    OFFLINE_MODE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.OFFLINE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    CROSSFADE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CROSSFADE;
        }
    },
    GAPLESS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    AUTOMIX {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    PLAY_EXPLICIT_CONTENT {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.EXPLICIT_SETTINGS_LOCKED);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EXPLICIT_CONTENT_SETTING_VISIBLE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    UNAVAILABLE_TRACKS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    NORMALIZE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    LOUDNESS_ENVIRONMENT {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY_OR_NORMALIZATION_DISABLED);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.SPINNER;
        }
    },
    SILENCE_TRIMMER {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.SILENCE_TRIMMER_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    SEND_BROADCASTS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.BROADCAST;
        }
    },
    AUTOPLAY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    AB_STORYLINES {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    CANVAS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.DATA_SAVER_MODE);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    MUSIC_LITE_AUTO_OPEN {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.PLAYBACK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    DEVICE_PICKER {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SPOTIFY_CONNECT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    APPS_NAVIGATION {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE_ASSISTANTS_AND_APPS;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    VOICE_ASSISTANTS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_ASSISATANTS_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE_ASSISTANTS_AND_APPS;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    SAMSUNG_PERSONALIZATION {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SAMSUNG;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    LANGUAGE_PREFERENCE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.LANGUAGE_ONBOARDING_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.LANGUAGE_PREFERENCE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    LOCAL_DEVICE_SETTINGS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SPOTIFY_CONNECT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    CAR_MODE_AVAILABILITY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.CAR_MODE_AVAILABLE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.CAR;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.SPINNER;
        }
    },
    CAR_MODE_AUTO_ACTIVATION {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.CAR_MODE_AUTO_ACTIVATION_DISABLED);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.CAR_MODE_AUTO_ACTIVATION_AVAILABLE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.CAR;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    CAR_MODE_PREVENT_SCREEN_LOCK {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.CAR_MODE_PREVENT_SCREEN_LOCK_DISABLED);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.CAR_MODE_AVAILABLE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.CAR;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    PRIVATE_SESSION {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SOCIAL;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    LISTENING_ACTIVITY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY, DisableWhen.IN_PRIVATE_SESSION);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SOCIAL;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    RECENTLY_PLAYED_ARTISTS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SOCIAL;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    FACEBOOK {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.NOT_CONNECTED_TO_FACEBOOK;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SOCIAL;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.FACEBOOK;
        }
    },
    STREAM_NON_METERED_QUALITY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.DATA_SAVER_MODE, DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.STREAM_NON_METERED_QUALITY_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.MUSIC_QUALITY;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.SPINNER;
        }
    },
    STREAM_QUALITY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.DATA_SAVER_MODE, DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.MUSIC_QUALITY;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.SPINNER;
        }
    },
    DOWNLOAD_QUALITY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.OFFLINE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.MUSIC_QUALITY;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.SPINNER;
        }
    },
    DOWNLOAD_OVER_3G {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.OFFLINE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.MUSIC_QUALITY;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.CHECK_BOX;
        }
    },
    AUDIO_EFFECTS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.AUDIO_EFFECTS_CONTROL_AVAILABLE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.MUSIC_QUALITY;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.AUDIO_EFFECTS;
        }
    },
    STORAGE_BAR {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.ALWAYS);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.STORAGE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.STORAGE_BAR;
        }
    },
    DELETE_CACHE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.STORAGE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    NOTIFICATIONS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.NOTIFICATIONS;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NOTIFICATION;
        }
    },
    AD_BOOKMARK_PAGE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.AD_BOOKMARK_AD_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ADVERTISEMENTS;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    AD_PARTNER_PREFERENCES {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.AD_PARTNER_PREFERENCES_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ADVERTISEMENTS;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    VOICE_ADS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_ADS_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ADVERTISEMENTS;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    VERSION {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.ALWAYS);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    LICENSES {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    LICENSING_INFO {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.LICENSING_SCTA_INFO_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    SCTA_INFO {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.LICENSING_SCTA_INFO_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    TERMS_CONDITIONS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    PRIVACY_POLICY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    COOKIE_SETTINGS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.ONETRUST_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    VOICE_EULA {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_FEATURE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    VOICE_LANGUAGE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_FEATURE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.SPINNER;
        }
    },
    VOICE_MIC_PERMISSION {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_FEATURE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    VOICE_MIC_SETTINGS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_FEATURE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    VOICE_WAKE_WORD {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.RECORD_AUDIO_PERMISSION_DISABLED);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_FEATURE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    SPOTIFY_VOICE_SETTINGS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.VOICE_TTS_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.VOICE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.SPINNER;
        }
    },
    BUG_REPORTING {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.DEBUG_MENU_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    SUPPORT {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.ABOUT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    HOMETHING_ADD_DEVICE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.HOME_THING_FEATURE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SPOTIFY_CONNECT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    HOMETHING_SETTINGS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NO_HOMETHING_DEVICES);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.HOME_THING_FEATURE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SPOTIFY_CONNECT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    STORAGE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.DELETING_CACHE);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.SD_CARD_AVAILABLE;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.OTHER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.STORAGE;
        }
    },
    LOCAL_FILES_IMPORT {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.LOCAL_FILES_IMPORT_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.IMPORT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    LOCAL_FILES_LIBRARY {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.LOCAL_FILES_LIBRARY_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.IMPORT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    LOGOUT {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.OTHER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.TEXT;
        }
    },
    DEBUG_TOOLS {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.ANY_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.DEBUG_MENU_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.OTHER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.DEBUG;
        }
    },
    CONNECT_IN_BACKGROUND {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.NEVER);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.EVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.SPOTIFY_CONNECT;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    DOWNLOAD_PREFERRED_RESOURCE_TYPE {
        @Override // com.spotify.music.features.settings.adapter.Item
        public EnumSet<DisableWhen> d() {
            return EnumSet.of(DisableWhen.PLAYING_REMOTELY);
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public For g() {
            return For.REGISTERED_USER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ShowWhen h() {
            return ShowWhen.DOWNLOAD_PREFERRED_RESOURCE_TYPE_ENABLED;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public Group i(c cVar) {
            return Group.DATA_SAVER;
        }

        @Override // com.spotify.music.features.settings.adapter.Item
        public ViewType k() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    };

    public enum DisableWhen {
        NEVER,
        PLAYING_REMOTELY,
        DELETING_CACHE,
        ALWAYS,
        PLAYING_REMOTELY_OR_NORMALIZATION_DISABLED,
        DATA_SAVER_MODE,
        EXPLICIT_SETTINGS_LOCKED,
        NO_HOMETHING_DEVICES,
        RECORD_AUDIO_PERMISSION_DISABLED,
        CAR_MODE_AUTO_ACTIVATION_DISABLED,
        CAR_MODE_PREVENT_SCREEN_LOCK_DISABLED,
        IN_PRIVATE_SESSION
    }

    public enum For {
        REGISTERED_USER,
        ANONYMOUS_USER,
        ANY_USER
    }

    public enum ShowWhen {
        EVER,
        DEBUG_MENU_ENABLED,
        AUDIO_EFFECTS_CONTROL_AVAILABLE,
        OFFLINE_ENABLED,
        AD_BOOKMARK_AD_ENABLED,
        AD_PARTNER_PREFERENCES_ENABLED,
        VOICE_ADS_ENABLED,
        LOCAL_FILES_IMPORT_ENABLED,
        LOCAL_FILES_LIBRARY_ENABLED,
        SD_CARD_AVAILABLE,
        LICENSING_SCTA_INFO_ENABLED,
        VOICE_FEATURE_ENABLED,
        ACCOUNT_SUBSCRIPTION_ENABLED,
        EMAIL_UPDATE_ENABLED,
        NOT_CONNECTED_TO_FACEBOOK,
        LANGUAGE_ONBOARDING_ENABLED,
        VOICE_ASSISATANTS_ENABLED,
        CAR_MODE_AVAILABLE,
        CAR_MODE_AUTO_ACTIVATION_AVAILABLE,
        HOME_THING_FEATURE_ENABLED,
        EXPLICIT_CONTENT_SETTING_VISIBLE,
        ONETRUST_ENABLED,
        STREAM_NON_METERED_QUALITY_ENABLED,
        DOWNLOAD_PREFERRED_RESOURCE_TYPE_ENABLED,
        VOICE_TTS_ENABLED,
        EMPLOYEE_PODCASTS_ENABLED,
        SILENCE_TRIMMER_ENABLED
    }

    Item(AnonymousClass1 r3) {
    }

    public abstract EnumSet<DisableWhen> d();

    public abstract For g();

    public abstract ShowWhen h();

    public abstract Group i(c cVar);

    public abstract ViewType k();
}
