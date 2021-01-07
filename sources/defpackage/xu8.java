package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.e;
import com.spotify.mobius.rx2.i;
import com.spotify.music.email.a;
import kotlin.jvm.internal.h;

/* renamed from: xu8  reason: default package */
public final class xu8 {
    public static final MobiusLoop.h<yu8, ev8, zu8> a(ov8 ov8, a aVar, lv8 lv8) {
        h.e(ov8, "remoteService");
        h.e(aVar, "rxEmail");
        h.e(lv8, "uiEventDelegate");
        MobiusLoop.f f = i.c(wu8.a, dv8.a(ov8, aVar)).b(vu8.b).d(vu8.c).h(i.a(lv8.a())).f(new e("UpdateEmail"));
        h.d(f, "loop<UpdateEmailDataMode…ogger.tag(\"UpdateEmail\"))");
        return f;
    }
}
