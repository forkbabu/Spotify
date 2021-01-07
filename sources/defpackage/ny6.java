package defpackage;

import com.spotify.playlist.models.j;
import java.util.concurrent.Callable;

/* renamed from: ny6  reason: default package */
public final /* synthetic */ class ny6 implements Callable {
    public final /* synthetic */ py6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j c;

    public /* synthetic */ ny6(py6 py6, boolean z, j jVar) {
        this.a = py6;
        this.b = z;
        this.c = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.b, this.c);
    }
}
