package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.features.yourlibrary.musicpages.e1;

/* renamed from: pb9  reason: default package */
public class pb9 implements ob9 {
    private final Context a;
    private final i b;
    private final SpSharedPreferences.b<Object, String> c;

    public pb9(Context context, i iVar, e1 e1Var) {
        this.a = context;
        this.b = iVar;
        String str = e1Var.h() ? "subjective_filter_tags" : "objective_filter_tags";
        SpSharedPreferences.b<Object, String> b2 = SpSharedPreferences.b.b(str);
        this.c = b2 == null ? SpSharedPreferences.b.e(str) : b2;
    }

    @Override // defpackage.ob9
    public void a(String str, String str2) {
        SpSharedPreferences.a<Object> b2 = this.b.b(this.a, str).b();
        b2.f(this.c, str2);
        b2.i();
    }

    @Override // defpackage.ob9
    public String getValue(String str) {
        String m = this.b.b(this.a, str).m(this.c, "");
        m.getClass();
        return m;
    }
}
