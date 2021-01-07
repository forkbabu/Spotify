package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: j5d  reason: default package */
final class j5d<T> implements g<ImmutableList<Session>> {
    final /* synthetic */ i5d a;

    j5d(i5d i5d) {
        this.a = i5d;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(ImmutableList<Session> immutableList) {
        ImmutableList<Session> immutableList2 = immutableList;
        vad i = i5d.i(this.a);
        h.d(immutableList2, "it");
        i.f0(immutableList2);
        i5d.j(this.a).a();
    }
}
