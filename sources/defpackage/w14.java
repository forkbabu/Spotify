package defpackage;

import com.spotify.libs.search.history.i;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import com.spotify.music.features.assistedcuration.search.m;

/* renamed from: w14  reason: default package */
public class w14 implements a71 {
    public static final /* synthetic */ int o = 0;
    private final m a;
    private final AssistedCurationSearchLogger b;
    private final i c;
    private final s6b f;
    private final c8b n;

    public w14(m mVar, AssistedCurationSearchLogger assistedCurationSearchLogger, i iVar, s6b s6b, c8b c8b) {
        mVar.getClass();
        this.a = mVar;
        assistedCurationSearchLogger.getClass();
        this.b = assistedCurationSearchLogger;
        iVar.getClass();
        this.c = iVar;
        s6b.getClass();
        this.f = s6b;
        c8b.getClass();
        this.n = c8b;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string == null) {
            Assertion.g("empty uri");
            return;
        }
        this.n.a();
        this.b.b(string);
        this.a.a(string);
        this.c.a(this.f.a(string, n61.d()));
    }
}
