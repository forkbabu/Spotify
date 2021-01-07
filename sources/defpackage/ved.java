package defpackage;

import android.content.Context;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.navigation.t;
import com.spotify.music.sociallistening.participantlist.impl.j;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import defpackage.hed;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: ved  reason: default package */
public final class ved {

    /* access modifiers changed from: private */
    /* renamed from: ved$a */
    public static class a {
        public f0 a;

        a(ted ted) {
        }
    }

    public static w<hed, ied> a(Context context, f4d f4d, t tVar, j jVar, afd afd, y yVar, jzc jzc, Picasso picasso) {
        m f = i.f();
        f.e(hed.c.class, new ped(tVar), yVar);
        f.e(hed.e.class, new qed(context, afd, jzc), yVar);
        f.e(hed.b.class, new red(jVar), yVar);
        f.d(hed.d.class, new ned(f4d));
        f.h(hed.a.class, new oed(yVar, context, picasso, new a(null)));
        return f.i();
    }
}
