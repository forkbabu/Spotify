package defpackage;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.activity.c;
import com.spotify.music.homething.settings.view.HomethingSettingsFragment;
import com.spotify.music.homething.settings.view.e;
import defpackage.bt9;
import io.reactivex.y;
import java.util.Collections;
import java.util.List;

/* renamed from: pt9  reason: default package */
public class pt9 implements bt9.a {
    private final at9 a;
    private final y b;
    private final ps9 c;
    private final cqe d;
    private final io.reactivex.disposables.a e = new io.reactivex.disposables.a();
    private final c f;
    private bt9 g;
    private us9 h;

    /* renamed from: pt9$a */
    class a implements e.a {
        a() {
        }

        @Override // com.spotify.music.homething.settings.view.e.a
        public void a() {
            io.reactivex.disposables.a aVar = pt9.this.e;
            io.reactivex.a A = pt9.this.a.b(pt9.this.h.d()).A(pt9.this.b);
            c cVar = pt9.this.f;
            cVar.getClass();
            aVar.b(A.subscribe(new ot9(cVar), new gt9(this)));
        }

        @Override // com.spotify.music.homething.settings.view.e.a
        public void b() {
        }
    }

    pt9(at9 at9, y yVar, ps9 ps9, cqe cqe, c cVar) {
        this.a = at9;
        this.b = yVar;
        this.c = ps9;
        this.d = cqe;
        this.f = cVar;
    }

    public static void k(pt9 pt9, List list) {
        pt9.getClass();
        if (!list.isEmpty()) {
            ((HomethingSettingsFragment) pt9.g).N4(list);
        } else {
            ((HomethingSettingsFragment) pt9.g).Q4();
        }
    }

    public static void l(pt9 pt9, List list) {
        ((HomethingSettingsFragment) pt9.g).O4(list);
        ((HomethingSettingsFragment) pt9.g).T4(pt9.h.d());
    }

    public static void n(pt9 pt9, Throwable th) {
        pt9.getClass();
        Logger.e(th, "Failed to get settings", new Object[0]);
        ((HomethingSettingsFragment) pt9.g).P4();
    }

    private void o(us9 us9) {
        this.e.b(this.a.c(us9.d()).B(this.b).subscribe(new jt9(this), new mt9(this)));
    }

    private void p() {
        this.e.b(this.c.a("homething").B(this.b).A(ht9.a).subscribe(new it9(this), new mt9(this)));
    }

    @Override // defpackage.bt9.a
    public void a(bt9 bt9) {
        this.g = bt9;
        p();
    }

    @Override // defpackage.bt9.a
    public void b(us9 us9) {
        us9 us92 = this.h;
        if (us92 == null || !TextUtils.equals(us92.b(), us9.b())) {
            String k = us9.k();
            boolean z = false;
            if (k != null) {
                String[] split = k.split("\\.");
                if (split.length == 3) {
                    try {
                        if (je.V(Integer.parseInt(split[1]), Constants.ONE_SECOND, Integer.parseInt(split[0]) * 1000000, Integer.parseInt(split[2])) >= 9087) {
                            z = true;
                        }
                    } catch (NumberFormatException e2) {
                        Logger.e(e2, "Failed to read major.minor.patch version from Home Thing device", new Object[0]);
                    }
                }
            }
            if (z) {
                ((HomethingSettingsFragment) this.g).R4();
            } else {
                ((HomethingSettingsFragment) this.g).L4();
            }
            ((HomethingSettingsFragment) this.g).M4();
            ((HomethingSettingsFragment) this.g).K4();
            this.h = us9;
            o(us9);
        }
    }

    @Override // defpackage.bt9.a
    public void c(ft9 ft9, String str) {
        this.e.b(this.a.a(this.h.d(), Collections.singletonList(ft9.a(str, Long.valueOf(this.d.d())))).subscribe(new kt9(this), nt9.a));
    }

    @Override // defpackage.bt9.a
    public void d() {
        ((HomethingSettingsFragment) this.g).S4(new a());
    }

    public /* synthetic */ void m(Integer num) {
        if (num.intValue() > 0) {
            p();
            us9 us9 = this.h;
            if (us9 != null) {
                o(us9);
            }
        }
    }
}
