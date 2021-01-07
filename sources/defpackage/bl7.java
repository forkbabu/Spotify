package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.model.e;
import io.reactivex.s;

/* renamed from: bl7  reason: default package */
public class bl7 implements fl7 {
    private final String a;
    private final vo7 b;
    private final Context c;
    private final il7 d;

    public bl7(String str, vo7 vo7, Context context, il7 il7) {
        this.a = str;
        this.b = vo7;
        this.c = context;
        this.d = il7;
    }

    @Override // defpackage.fl7
    public s<e> a(e eVar) {
        s<R> j0 = this.b.b(this.a).P().Q(wk7.a).j0(kk7.a);
        il7 il7 = this.d;
        il7.getClass();
        return j0.q(new pk7(il7));
    }

    @Override // defpackage.fl7
    public String title() {
        return this.c.getResources().getString(C0707R.string.profile_list_recently_played_artists_title);
    }
}
