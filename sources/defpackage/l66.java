package defpackage;

import com.google.common.collect.FluentIterable;
import com.spotify.playlist.models.k;
import io.reactivex.functions.l;

/* renamed from: l66  reason: default package */
public final /* synthetic */ class l66 implements l {
    public static final /* synthetic */ l66 a = new l66();

    private /* synthetic */ l66() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = d76.s;
        return FluentIterable.from(((k) obj).l()).transform(t66.a).toList();
    }
}
