package defpackage;

import com.spotify.music.features.go.connection.ConnectionState;
import io.reactivex.functions.a;

/* renamed from: jd5  reason: default package */
public final /* synthetic */ class jd5 implements a {
    public final /* synthetic */ md5 a;
    public final /* synthetic */ com.spotify.music.features.go.connection.a b;

    public /* synthetic */ jd5(md5 md5, com.spotify.music.features.go.connection.a aVar) {
        this.a = md5;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        md5 md5 = this.a;
        com.spotify.music.features.go.connection.a aVar = this.b;
        md5.getClass();
        aVar.f(ConnectionState.DISCONNECTED);
        md5.f.onNext(aVar);
    }
}
