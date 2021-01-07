package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.video.endvideo.p;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: uv8  reason: default package */
public class uv8 implements p {
    private final w a;
    private Optional<String> b = Optional.absent();
    private b c = EmptyDisposable.INSTANCE;

    public uv8(w wVar) {
        this.a = wVar;
    }

    public static void a(uv8 uv8, Optional optional) {
        uv8.b = optional;
    }

    public void b() {
        b bVar = this.c;
        if (bVar != null && !bVar.d()) {
            this.c.dispose();
        }
        this.b = Optional.absent();
        this.c = this.a.c("streaming-rules").subscribe(new rv8(this));
    }

    public void c() {
        b bVar = this.c;
        if (bVar != null && !bVar.d()) {
            this.c.dispose();
        }
    }

    public Optional<String> d() {
        return this.b;
    }
}
