package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.playback.api.LocalPlaybackStatus;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: wv9  reason: default package */
public class wv9 implements d, b {
    private final uv9 a;
    private final s<LocalPlaybackStatus> b;
    private final y c;
    private io.reactivex.disposables.b f = EmptyDisposable.INSTANCE;

    public wv9(uv9 uv9, s<LocalPlaybackStatus> sVar, y yVar) {
        this.a = uv9;
        this.b = sVar;
        this.c = yVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.a.e();
    }

    public /* synthetic */ void b(LocalPlaybackStatus localPlaybackStatus) {
        if (localPlaybackStatus == LocalPlaybackStatus.PLAYING) {
            this.a.c();
        } else {
            this.a.d();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.f();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.f = this.b.o0(this.c).subscribe(new sv9(this));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AppFocusState";
    }
}
