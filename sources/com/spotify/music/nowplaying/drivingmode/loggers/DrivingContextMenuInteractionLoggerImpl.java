package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.loggers.InteractionLogger;

public class DrivingContextMenuInteractionLoggerImpl implements a {
    private final InteractionLogger a;
    private final wlf<LegacyPlayerState> b;

    /* access modifiers changed from: private */
    public enum SectionId {
        CANCEL_BUTTON("cancel_button"),
        DISABLE_BUTTON("disable_button"),
        BACK_BUTTON("back_button");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    /* access modifiers changed from: private */
    public enum UserIntent {
        CANCEL("cancel_context_menu"),
        DISABLE_DRIVING_MODE("disable_driving_mode");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public DrivingContextMenuInteractionLoggerImpl(InteractionLogger interactionLogger, wlf<LegacyPlayerState> wlf, String str) {
        this.a = interactionLogger;
        this.b = wlf;
    }

    private void d(SectionId sectionId, UserIntent userIntent) {
        String str;
        InteractionLogger interactionLogger = this.a;
        LegacyPlayerState legacyPlayerState = this.b.get();
        if (legacyPlayerState == null) {
            str = null;
        } else {
            str = legacyPlayerState.playbackId();
        }
        interactionLogger.c(str, null, "driving_mode_".concat(sectionId.toString()), -1, InteractionLogger.InteractionType.HIT, userIntent.toString());
    }

    public void a() {
        d(SectionId.DISABLE_BUTTON, UserIntent.DISABLE_DRIVING_MODE);
    }

    public void b() {
        d(SectionId.BACK_BUTTON, UserIntent.CANCEL);
    }

    public void c() {
        d(SectionId.CANCEL_BUTTON, UserIntent.CANCEL);
    }
}
