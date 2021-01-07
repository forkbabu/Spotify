package com.spotify.music.features.go.socket;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.go.socket.SocketIo;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class b implements u {
    public final /* synthetic */ SocketIo a;

    public /* synthetic */ b(SocketIo socketIo) {
        this.a = socketIo;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        SocketIo socketIo = this.a;
        socketIo.getClass();
        tVar.e(new a(socketIo));
        while (true) {
            try {
                Logger.g("Go: Start reading commands", new Object[0]);
                me5 b = socketIo.b();
                if (!tVar.d()) {
                    tVar.onNext(b);
                }
            } catch (SocketIo.CommandParseException | SocketIo.CommandReadException e) {
                Logger.e(e, "Go: Command error", new Object[0]);
            } catch (SocketIo.ConnectionException e2) {
                Logger.h(e2, "Go: Session IO error", new Object[0]);
                if (!tVar.d()) {
                    tVar.onError(e2);
                    return;
                }
                return;
            } catch (Exception e3) {
                Logger.e(e3, "Go: Unknown exception", new Object[0]);
                if (!tVar.d()) {
                    tVar.onError(e3);
                    return;
                }
                return;
            }
        }
    }
}
