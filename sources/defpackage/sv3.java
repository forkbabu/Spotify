package defpackage;

import androidx.fragment.app.Fragment;
import com.google.common.collect.Collections2;
import com.spotify.music.features.ads.model.Targetings;
import io.reactivex.disposables.b;
import io.reactivex.s;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: sv3  reason: default package */
public class sv3 {
    private final Fragment a;
    private final w52 b;
    private final qv3 c;
    private b d;

    public sv3(Fragment fragment, w52 w52, qv3 qv3) {
        this.a = fragment;
        this.b = w52;
        this.c = qv3;
    }

    public void a() {
        b bVar = this.d;
        if (bVar != null && bVar.d()) {
            this.d.dispose();
        }
        this.d = null;
    }

    public void b(boolean z) {
        this.c.c(z);
        b bVar = this.d;
        if (bVar != null && bVar.d()) {
            this.d.dispose();
        }
        s<Targetings> d2 = this.c.d(this.a.F2());
        ju3 ju3 = new ju3();
        d2.subscribe(ju3);
        this.d = ju3;
    }

    public boolean c() {
        return this.b.f(this.a.F2(), "android.permission.RECORD_AUDIO");
    }

    public boolean d() {
        return c() && this.c.a();
    }

    public void e() {
        w52 w52 = this.b;
        Fragment fragment = this.a;
        HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(1);
        Collections.addAll(newHashSetWithExpectedSize, "android.permission.RECORD_AUDIO");
        w52.d(1, fragment, newHashSetWithExpectedSize);
    }

    public boolean f() {
        return this.b.e(this.a.B2(), "android.permission.RECORD_AUDIO");
    }
}
