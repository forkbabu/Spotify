package com.spotify.mobile.android.audioplayer.domain;

import android.media.AudioManager;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class a {
    private final io.reactivex.subjects.a<AudioFocusUpdate> a;
    private final AudioManager.OnAudioFocusChangeListener b = new C0171a(this);
    private final AudioManager c;

    /* renamed from: com.spotify.mobile.android.audioplayer.domain.a$a  reason: collision with other inner class name */
    static final class C0171a implements AudioManager.OnAudioFocusChangeListener {
        final /* synthetic */ a a;

        C0171a(a aVar) {
            this.a = aVar;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            AudioFocusUpdate audioFocusUpdate = AudioFocusUpdate.AUDIO_FOCUS_NOT_GRANTED;
            if (i == -3) {
                a.b(this.a, audioFocusUpdate);
            } else if (i == -2) {
                a.b(this.a, audioFocusUpdate);
            } else if (i == -1) {
                a.b(this.a, audioFocusUpdate);
            } else if (i == 1) {
                a.b(this.a, AudioFocusUpdate.AUDIO_FOCUS_GRANTED);
            }
        }
    }

    public a(AudioManager audioManager) {
        h.e(audioManager, "audioManager");
        this.c = audioManager;
        io.reactivex.subjects.a<AudioFocusUpdate> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create<AudioFocusUpdate>()");
        this.a = h1;
    }

    public static final void b(a aVar, AudioFocusUpdate audioFocusUpdate) {
        aVar.a.onNext(audioFocusUpdate);
    }

    public final void a() {
        if (this.a.j1() == AudioFocusUpdate.AUDIO_FOCUS_GRANTED) {
            this.c.abandonAudioFocus(this.b);
            this.a.onNext(AudioFocusUpdate.AUDIO_FOCUS_NOT_GRANTED);
        }
    }

    public final s<AudioFocusUpdate> c() {
        s<AudioFocusUpdate> E = this.a.E();
        h.d(E, "audioFocusUpdateSubject.distinctUntilChanged()");
        return E;
    }

    public final void d() {
        AudioFocusUpdate j1 = this.a.j1();
        AudioFocusUpdate audioFocusUpdate = AudioFocusUpdate.AUDIO_FOCUS_GRANTED;
        if (j1 != audioFocusUpdate && this.c.requestAudioFocus(this.b, 3, 1) == 1) {
            this.a.onNext(audioFocusUpdate);
        }
    }
}
