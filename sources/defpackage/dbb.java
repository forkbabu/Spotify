package defpackage;

import com.spotify.music.libs.voice.e;
import java.util.concurrent.Callable;

/* renamed from: dbb  reason: default package */
public final /* synthetic */ class dbb implements Callable {
    public final /* synthetic */ e a;

    public /* synthetic */ dbb(e eVar) {
        this.a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.a.m());
    }
}
