package defpackage;

import com.spotify.music.sociallistening.models.JoinType;
import defpackage.h6d;
import io.reactivex.functions.g;

/* renamed from: u6d  reason: default package */
public final /* synthetic */ class u6d implements g {
    public final /* synthetic */ f4d a;

    public /* synthetic */ u6d(f4d f4d) {
        this.a = f4d;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        f4d f4d = this.a;
        ((h6d.a) obj).getClass();
        f4d.l(null, false, JoinType.c);
    }
}
