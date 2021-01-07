package defpackage;

import android.app.Activity;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.share.v2.view.b;
import defpackage.h2d;
import defpackage.n2d;
import defpackage.r2d;
import defpackage.v2d;
import io.reactivex.functions.l;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: z2d  reason: default package */
public final class z2d {
    private final r2d.a a;
    private final q2d b;
    private final v2d.a c;
    private final n2d.a d;

    /* renamed from: z2d$a */
    static final class a<T, R> implements l<h2d.b, i2d> {
        final /* synthetic */ z2d a;

        a(z2d z2d) {
            this.a = z2d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i2d apply(h2d.b bVar) {
            h2d.b bVar2 = bVar;
            h.e(bVar2, "effect");
            return this.a.b.b(bVar2);
        }
    }

    public z2d(r2d.a aVar, q2d q2d, v2d.a aVar2, n2d.a aVar3) {
        h.e(aVar, "sharePreviewHandlerFactory");
        h.e(q2d, "shareDestinationsHandler");
        h.e(aVar2, "performShareEffectHandlerFactory");
        h.e(aVar3, "buildVideoPlayerHandlerFactory");
        this.a = aVar;
        this.b = q2d;
        this.c = aVar2;
        this.d = aVar3;
    }

    public final w<h2d, i2d> b(Activity activity, b bVar, qzc qzc) {
        h.e(activity, "activity");
        h.e(bVar, "viewInteractor");
        m f = i.f();
        f.h(h2d.c.class, this.a.a(qzc));
        f.h(h2d.d.class, this.c.a(activity, qzc));
        f.h(h2d.a.class, this.d.a(bVar));
        f.f(h2d.b.class, new a(this));
        return f.i();
    }
}
