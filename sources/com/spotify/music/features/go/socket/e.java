package com.spotify.music.features.go.socket;

import com.spotify.music.features.go.connection.a;
import com.spotify.music.features.go.socket.SocketIo;
import io.reactivex.l;
import io.reactivex.y;
import java.io.InputStream;

public class e {
    private final SocketIo.b a;
    private final y b;
    private final td5 c;

    public e(SocketIo.b bVar, y yVar, td5 td5) {
        this.a = bVar;
        this.b = yVar;
        this.c = td5;
    }

    public l<SocketIo> a(a aVar) {
        l<InputStream> d = aVar.a().d();
        SocketIo.b bVar = this.a;
        bVar.getClass();
        return d.l(new c(bVar)).b(this.c).q(this.b);
    }
}
