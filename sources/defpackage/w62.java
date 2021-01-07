package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.protobuf.u;
import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.tracking.h;
import com.spotify.mobile.android.video.tracking.o;
import com.spotify.mobile.android.video.tracking.p;
import com.spotify.music.json.g;
import com.squareup.picasso.Picasso;
import defpackage.r62;
import defpackage.t62;
import java.util.List;
import okhttp3.y;

/* renamed from: w62  reason: default package */
public final class w62 implements t62 {
    private final Context a;
    private final y b;
    private final q72 c;
    private final cqe d;
    private final gl0<u> e;
    private final com.spotify.mobile.android.util.connectivity.y f;
    private final y62 g;
    private wlf<gl0<u>> h;

    /* access modifiers changed from: private */
    /* renamed from: w62$b */
    public final class b implements s62 {
        b(a aVar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w62$c */
    public final class c implements r62 {
        private final p62 a;
        private wlf<o> b;

        c(p62 p62, a aVar) {
            this.a = p62;
            this.b = ljf.a(new p(w62.this.h));
        }

        @Override // defpackage.r62
        public s a() {
            List<c72> a2 = w62.this.g.a(this.a);
            yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
            g0.a a3 = g0.a();
            a3.b(true);
            g0 a4 = a3.a();
            s sVar = new s(w62.this.a, w62.this.b, w62.this.c, w62.this.d, new Handler(Looper.getMainLooper()), new h(w62.this.e, w62.this.d, w62.this.f), this.b.get());
            sVar.e(a2);
            sVar.f(a4);
            return sVar;
        }
    }

    /* renamed from: w62$d */
    private static final class d implements t62.a {
        d(a aVar) {
        }

        @Override // defpackage.t62.a
        public t62 a(Context context, gl0<u> gl0, cqe cqe, Picasso picasso, q72 q72, y yVar, g gVar, y62 y62, v vVar, com.spotify.mobile.android.util.connectivity.y yVar2) {
            context.getClass();
            gl0.getClass();
            cqe.getClass();
            picasso.getClass();
            q72.getClass();
            yVar.getClass();
            gVar.getClass();
            y62.getClass();
            vVar.getClass();
            yVar2.getClass();
            return new w62(context, gl0, cqe, picasso, q72, yVar, gVar, y62, vVar, yVar2, null);
        }
    }

    w62(Context context, gl0 gl0, cqe cqe, Picasso picasso, q72 q72, y yVar, g gVar, y62 y62, v vVar, com.spotify.mobile.android.util.connectivity.y yVar2, a aVar) {
        this.a = context;
        this.b = yVar;
        this.c = q72;
        this.d = cqe;
        this.e = gl0;
        this.f = yVar2;
        this.g = y62;
        this.h = gjf.a(gl0);
    }

    public static t62.a j() {
        return new d(null);
    }

    @Override // defpackage.u62
    public r62.a a() {
        return new n62(new b(null));
    }
}
