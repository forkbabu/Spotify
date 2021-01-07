package defpackage;

import com.spotify.mobile.android.core.internal.AudioRouteChangeDispatcher;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

/* renamed from: eea  reason: default package */
public final class eea implements dea, AudioRouteChangeDispatcher.OnAudioRouteChangeListener {
    private final PublishSubject<gea> a;
    private final AudioRouteChangeDispatcher b;

    public eea(AudioRouteChangeDispatcher audioRouteChangeDispatcher) {
        h.e(audioRouteChangeDispatcher, "audioRouteChangeDispatcher");
        this.b = audioRouteChangeDispatcher;
        PublishSubject<gea> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<AudioRouteInfo>()");
        this.a = h1;
    }

    @Override // defpackage.dea
    public s<gea> c() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.core.internal.AudioRouteChangeDispatcher.OnAudioRouteChangeListener
    public void onAudioRouteChanged(String str, int i, String str2) {
        h.e(str, "name");
        this.a.onNext(new gea(str, i, str2, null, 8));
    }

    @Override // defpackage.dea
    public void start() {
        this.b.start(this);
    }

    @Override // defpackage.dea
    public void stop() {
        this.b.stop();
    }
}
