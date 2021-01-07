package defpackage;

import com.spotify.music.features.profile.entity.v;
import defpackage.fs7;
import io.reactivex.functions.g;

/* renamed from: ls7  reason: default package */
public final /* synthetic */ class ls7 implements g {
    public final /* synthetic */ v a;

    public /* synthetic */ ls7(v vVar) {
        this.a = vVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(((fs7.c) obj).b());
    }
}
