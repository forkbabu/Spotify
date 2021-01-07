package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.e;
import io.reactivex.s;

/* renamed from: xk7  reason: default package */
public class xk7 implements fl7 {
    private final String a;
    private final vo7 b;
    private final Context c;
    private final il7 d;

    public xk7(String str, vo7 vo7, Context context, il7 il7) {
        this.a = str;
        this.b = vo7;
        this.c = context;
        this.d = il7;
    }

    @Override // defpackage.fl7
    public s<e> a(e eVar) {
        s sVar;
        if (eVar.c() == LoadingState.LOADED) {
            sVar = s.i0(eVar);
        } else {
            s<R> j0 = this.b.c(this.a).P().Q(wk7.a).j0(jk7.a);
            il7 il7 = this.d;
            il7.getClass();
            sVar = s.b1(j0.j0(new qk7(il7)));
        }
        il7 il72 = this.d;
        il72.getClass();
        return s.b1(sVar.J0(new sk7(il72)));
    }

    @Override // defpackage.fl7
    public String title() {
        return this.c.getResources().getString(C0707R.string.profile_list_followers_title);
    }
}
