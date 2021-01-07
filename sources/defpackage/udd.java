package defpackage;

import android.content.Context;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.navigation.t;
import com.spotify.music.sociallistening.participantlist.impl.j;
import com.squareup.picasso.Picasso;
import defpackage.jed;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: udd  reason: default package */
public class udd {
    private final f4d a;
    private final t b;
    private final afd c;
    private final j d;
    private final y e;
    private final y f;
    private final y g;
    private final Context h;
    private final jzc i;
    private final cfd j;
    private final Picasso k;

    public udd(f4d f4d, t tVar, j jVar, afd afd, y yVar, y yVar2, y yVar3, Context context, jzc jzc, cfd cfd, Picasso picasso) {
        this.a = f4d;
        this.b = tVar;
        this.d = jVar;
        this.c = afd;
        this.e = yVar;
        this.f = yVar2;
        this.g = yVar3;
        this.h = context;
        this.i = jzc;
        this.j = cfd;
        this.k = picasso;
    }

    public MobiusLoop.g<jed, ied> a(s<edd> sVar) {
        MobiusLoop.f h2 = i.c(tdd.a, ved.a(this.h, this.a, this.b, this.d, this.c, this.e, this.i, this.k)).b(new ndd(this)).d(new odd(this)).h(i.a(this.c.b(), sVar.j0(wed.a)));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        jed.a aVar = jed.a;
        aVar.f(this.j.f());
        aVar.b(this.j.d());
        return z.b(h2, aVar.a(), u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.f);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.g);
    }
}
