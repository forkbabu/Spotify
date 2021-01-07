package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.music.C0707R;
import com.spotify.music.features.go.socket.SocketIo;
import com.spotify.remoteconfig.x6;
import io.reactivex.l;
import io.reactivex.p;
import io.reactivex.q;
import io.reactivex.y;
import java.util.Locale;

/* renamed from: td5  reason: default package */
public class td5 implements q<SocketIo, SocketIo> {
    private final Context a;
    private final y b;
    private final x6 c;
    private final yk8 d;

    public td5(Context context, y yVar, yk8 yk8, x6 x6Var) {
        this.a = context;
        this.b = yVar;
        this.d = yk8;
        this.c = x6Var;
    }

    @Override // io.reactivex.q
    public p<SocketIo> a(l<SocketIo> lVar) {
        if (!this.c.c()) {
            return lVar;
        }
        return lVar.g(new od5(this));
    }

    public p b(SocketIo socketIo) {
        yk8 yk8 = this.d;
        Context context = this.a;
        Uri uri = bf5.a;
        return yk8.a(context.getString(C0707R.string.go_tts_connected), Locale.US).B().f(l.k(socketIo)).q(this.b);
    }
}
