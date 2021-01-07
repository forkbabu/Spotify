package com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ VoiceInputAnimationView a;
    public final /* synthetic */ float b;

    public /* synthetic */ a(VoiceInputAnimationView voiceInputAnimationView, float f) {
        this.a = voiceInputAnimationView;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
