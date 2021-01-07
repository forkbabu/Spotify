package com.spotify.music.nowplaying.drivingmode.loggers;

import com.google.protobuf.ByteString;
import com.google.protobuf.u;
import com.spotify.messages.CarViewVoicePlaybackAction;
import com.spotify.music.loggers.InteractionLogger;

public class DrivingVoiceInteractionLoggerImpl implements d {
    private final InteractionLogger a;
    private final String b;
    private final gl0<u> c;

    /* access modifiers changed from: private */
    public enum SectionId {
        NPV_MIC_BUTTON("npv_mic_button"),
        HOME_FEED_MIC_BUTTON("home_feed_mic_button"),
        VOICE_VIEW_MIC_BUTTON("voice_view_mic_button"),
        VOICE_VIEW("voice_view"),
        VOICE_VIEW_BACK_BUTTON("voice_view_back_button"),
        VOICE_VIEW_X_BUTTON("voice_view_x_button");
        
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
        START_VOICE("start_voice"),
        CLOSE_VOICE("close_voice");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public DrivingVoiceInteractionLoggerImpl(InteractionLogger interactionLogger, String str, gl0<u> gl0) {
        this.a = interactionLogger;
        this.b = str;
        this.c = gl0;
    }

    private void h(SectionId sectionId, UserIntent userIntent) {
        this.a.c(null, null, this.b.concat(sectionId.toString()), 0, InteractionLogger.InteractionType.HIT, userIntent.toString());
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.d
    public void a() {
        h(SectionId.HOME_FEED_MIC_BUTTON, UserIntent.START_VOICE);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.d
    public void b() {
        h(SectionId.VOICE_VIEW_BACK_BUTTON, UserIntent.CLOSE_VOICE);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.d
    public void c(String str, String str2) {
        gl0<u> gl0 = this.c;
        CarViewVoicePlaybackAction.b l = CarViewVoicePlaybackAction.l();
        l.n(str);
        l.m(ByteString.h(z42.u(str2)));
        gl0.c(l.build());
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.d
    public void d() {
        this.a.c(null, null, this.b.concat(SectionId.VOICE_VIEW.toString()), 0, InteractionLogger.InteractionType.DRAG, UserIntent.CLOSE_VOICE.toString());
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.d
    public void e() {
        h(SectionId.VOICE_VIEW_MIC_BUTTON, UserIntent.START_VOICE);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.d
    public void f() {
        h(SectionId.NPV_MIC_BUTTON, UserIntent.START_VOICE);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.loggers.d
    public void g() {
        h(SectionId.VOICE_VIEW_X_BUTTON, UserIntent.CLOSE_VOICE);
    }
}
