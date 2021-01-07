package defpackage;

import android.app.Application;
import com.spotify.base.android.prngfixes.PRNGFixes;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.uber.rxdogtag.RxDogTag;

/* renamed from: ov9  reason: default package */
public final class ov9 {
    private boolean a;
    private final Application b;
    private final lv9 c;
    private final jv9 d;
    private final a e;
    private final dv9 f;
    private final gv9 g;

    /* renamed from: ov9$a */
    public interface a {
        boolean a();

        boolean b();

        boolean c();

        boolean d();
    }

    /* renamed from: ov9$b */
    public interface b {
        boolean a();
    }

    ov9(Application application, a aVar, dv9 dv9, lv9 lv9, jv9 jv9, gv9 gv9) {
        this.b = application;
        this.e = aVar;
        this.f = dv9;
        this.c = lv9;
        this.d = jv9;
        this.g = gv9;
    }

    public synchronized void a() {
        if (!this.a) {
            this.f.getClass();
            new fv9().execute(new Void[0]);
            if (!ig0.b()) {
                try {
                    PRNGFixes.b();
                } catch (Exception unused) {
                }
            }
            this.c.a();
            if (this.e.d()) {
                DebugFlag debugFlag = DebugFlag.ACCOUNTS_STAGING;
            }
            this.g.a();
            this.d.b(this.b);
            RxDogTag.install();
            io.reactivex.plugins.a.m(new nv9());
            this.a = true;
        }
    }
}
