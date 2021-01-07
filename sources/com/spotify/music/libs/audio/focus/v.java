package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.mobile.android.core.internal.AudioEffectsListener;
import java.util.ArrayList;
import java.util.List;

public class v implements t92 {
    private final AudioEffectsListener a;
    private int b;
    private final List<b> c = new ArrayList();
    public final AudioDriver.AudioDriverListener d = new a();

    class a implements AudioDriver.AudioDriverListener {
        a() {
        }

        @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioDriverListener
        public void onAudioTrackCreated(int i) {
            v.this.b = i;
        }

        @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioDriverListener
        public void onAudioTrackDestroyed(int i) {
            v.this.b = 0;
        }

        @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioDriverListener
        public void onPaused(boolean z, Integer num) {
            for (b bVar : v.this.c) {
                bVar.a(z);
            }
        }
    }

    public interface b {
        void a(boolean z);
    }

    public v(AudioEffectsListener audioEffectsListener) {
        this.a = audioEffectsListener;
    }

    @Override // defpackage.t92
    public void a(int i) {
        AudioDriver.stopDuckingAudioSession(this.b, i);
    }

    @Override // defpackage.t92
    public void b(int i, float f) {
        AudioDriver.startDuckingAudioSession(this.b, i, f);
    }

    public void e(b bVar) {
        this.c.add(bVar);
    }

    public void f() {
        AudioDriver.addListener(this.a);
        AudioDriver.addListener(this.d);
    }

    public int g() {
        return this.b;
    }

    public void h() {
        this.c.clear();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        AudioDriver.startDuckingAudioSession(this.b);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        AudioDriver.stopDuckingAudioSession(this.b);
    }
}
