package defpackage;

import com.spotify.music.features.go.connection.ConnectionState;
import com.spotify.music.features.go.connection.a;
import com.spotify.music.features.go.socket.SocketIo;
import io.reactivex.functions.g;

/* renamed from: id5  reason: default package */
public final /* synthetic */ class id5 implements g {
    public final /* synthetic */ md5 a;
    public final /* synthetic */ a b;

    public /* synthetic */ id5(md5 md5, a aVar) {
        this.a = md5;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        md5 md5 = this.a;
        a aVar = this.b;
        SocketIo socketIo = (SocketIo) obj;
        md5.getClass();
        aVar.f(ConnectionState.CONNECTED);
        md5.f.onNext(aVar);
    }
}
