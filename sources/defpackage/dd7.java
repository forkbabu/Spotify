package defpackage;

import android.text.TextUtils;
import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.w2;

/* renamed from: dd7  reason: default package */
public class dd7 implements a71 {
    public static final /* synthetic */ int n = 0;
    private final t a;
    private final ere b;
    private final p71 c;
    private final w2 f;

    public dd7(t tVar, p71 p71, ere ere, w2 w2Var) {
        this.a = tVar;
        this.c = p71;
        this.b = ere;
        this.f = w2Var;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        Integer intValue = o81.data().intValue("position");
        if (!TextUtils.isEmpty(string)) {
            this.c.a(string, n61.d(), "navigate-forward", null);
            nqe a2 = this.f.b(intValue, string).a(string);
            this.b.a(a2);
            this.a.b(string, a2.b());
        }
    }
}
