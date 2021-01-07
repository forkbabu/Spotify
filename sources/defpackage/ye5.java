package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.spotify.music.features.go.socket.SocketIo;
import com.spotify.music.features.go.socket.b;
import com.spotify.remoteconfig.x6;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: ye5  reason: default package */
public class ye5 implements w<SocketIo, me5> {
    private final y a;
    private final y b;
    private final Context c;
    private final x6 d;
    private final se5 e;

    public ye5(Context context, y yVar, y yVar2, x6 x6Var, se5 se5) {
        this.c = context;
        this.a = yVar;
        this.b = yVar2;
        this.d = x6Var;
        this.e = se5;
    }

    public v a(SocketIo socketIo) {
        socketIo.getClass();
        s y = s.y(new b(socketIo));
        se5 se5 = this.e;
        se5.getClass();
        return y.Q(new re5(se5)).o0(this.a).N(new pe5(this)).q0(qe5.a).I0(this.b);
    }

    @Override // io.reactivex.w
    public v<me5> apply(s<SocketIo> sVar) {
        return sVar.W(new oe5(this), false, Integer.MAX_VALUE);
    }

    public /* synthetic */ void b(me5 me5) {
        if (this.d.d()) {
            me5.getClass();
            ne5 ne5 = (ne5) me5;
            Toast.makeText(this.c, String.format("Received Go command from %s (%s)", ne5.a(), ne5.d()), 0).show();
        }
    }
}
