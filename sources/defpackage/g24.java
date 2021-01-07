package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import com.spotify.music.features.assistedcuration.search.m;

/* renamed from: g24  reason: default package */
public class g24 implements a71 {
    private final m a;
    private final AssistedCurationSearchLogger b;
    private final c8b c;

    public g24(m mVar, AssistedCurationSearchLogger assistedCurationSearchLogger, c8b c8b) {
        mVar.getClass();
        this.a = mVar;
        assistedCurationSearchLogger.getClass();
        this.b = assistedCurationSearchLogger;
        c8b.getClass();
        this.c = c8b;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string == null) {
            Assertion.g("empty uri");
            return;
        }
        this.c.a();
        String title = n61.d().text().title();
        if (title != null) {
            this.a.c(string, title);
            this.b.d(string, o81.data().intValue("position", -1));
        }
    }
}
