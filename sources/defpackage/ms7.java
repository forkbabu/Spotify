package defpackage;

import com.spotify.music.features.profile.entity.v;
import defpackage.fs7;
import io.reactivex.functions.g;

/* renamed from: ms7  reason: default package */
public final /* synthetic */ class ms7 implements g {
    public final /* synthetic */ v a;

    public /* synthetic */ ms7(v vVar) {
        this.a = vVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(((fs7.e) obj).b());
    }
}
