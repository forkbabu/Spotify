package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.core.internal.AudioDriver;
import com.spotify.mobile.android.service.plugininterfaces.b;
import io.reactivex.s;
import io.reactivex.subjects.a;

public class w implements b {
    private final z a;
    private final v b;
    private final a<AudioDriverStatus> c = a.h1();

    w(v vVar, z zVar) {
        this.b = vVar;
        this.a = zVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.a.b();
        this.b.f();
        this.b.e(new h(this));
    }

    public s<AudioDriverStatus> b() {
        return this.c.E();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        AudioDriver.removeListener(this.b.d);
        this.b.h();
        this.a.c();
    }

    public /* synthetic */ void d(boolean z) {
        this.c.onNext(z ? AudioDriverStatus.DISABLED : AudioDriverStatus.ENABLED);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "AudioSessionManager";
    }
}
