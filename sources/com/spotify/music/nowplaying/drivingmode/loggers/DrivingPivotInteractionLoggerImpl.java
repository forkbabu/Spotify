package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.loggers.InteractionLogger;

public class DrivingPivotInteractionLoggerImpl implements c {
    private final InteractionLogger a;
    private final wlf<LegacyPlayerState> b;
    private final String c;

    /* access modifiers changed from: private */
    public enum SectionId {
        OPEN_PIVOT_TOUCH_AREA("open_pivot_touch_area"),
        CLOSE_PIVOT_TOUCH_AREA("close_pivot_touch_area"),
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
        OPEN_PIVOT("open_pivot"),
        CLOSE_PIVOT("close_pivot"),
        SCROLL_ITEMS("scroll_pivot_items");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public DrivingPivotInteractionLoggerImpl(InteractionLogger interactionLogger, wlf<LegacyPlayerState> wlf, String str) {
        this.a = interactionLogger;
        this.b = wlf;
        this.c = str;
    }

    private void g(SectionId sectionId, UserIntent userIntent, int i, InteractionLogger.InteractionType interactionType) {
        String str;
        InteractionLogger interactionLogger = this.a;
        LegacyPlayerState legacyPlayerState = this.b.get();
        if (legacyPlayerState == null) {
            str = null;
        } else {
            str = legacyPlayerState.playbackId();
        }
        interactionLogger.c(str, null, this.c.concat(sectionId.toString()), i, interactionType, userIntent.toString());
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.c
    public void a() {
        g(SectionId.OPEN_PIVOT_TOUCH_AREA, UserIntent.OPEN_PIVOT, -1, InteractionLogger.InteractionType.DRAG);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.c
    public void b(String str, String str2, int i, boolean z) {
        InteractionLogger.InteractionType interactionType;
        String str3;
        if (z) {
            interactionType = InteractionLogger.InteractionType.SCROLL;
        } else {
            interactionType = InteractionLogger.InteractionType.TAP;
        }
        UserIntent userIntent = UserIntent.SCROLL_ITEMS;
        InteractionLogger interactionLogger = this.a;
        LegacyPlayerState legacyPlayerState = this.b.get();
        if (legacyPlayerState == null) {
            str3 = null;
        } else {
            str3 = legacyPlayerState.playbackId();
        }
        interactionLogger.c(str3, str, str2, i, interactionType, userIntent.toString());
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.c
    public void c() {
        g(SectionId.OPEN_PIVOT_TOUCH_AREA, UserIntent.OPEN_PIVOT, -1, InteractionLogger.InteractionType.HIT);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.c
    public void d() {
        g(SectionId.CLOSE_PIVOT_TOUCH_AREA, UserIntent.CLOSE_PIVOT, -1, InteractionLogger.InteractionType.DRAG);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.c
    public void e() {
        g(SectionId.BACK_BUTTON, UserIntent.CLOSE_PIVOT, -1, InteractionLogger.InteractionType.HIT);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.c
    public void f() {
        g(SectionId.CLOSE_PIVOT_TOUCH_AREA, UserIntent.CLOSE_PIVOT, -1, InteractionLogger.InteractionType.HIT);
    }
}
