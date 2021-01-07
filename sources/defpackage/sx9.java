package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.v;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: sx9  reason: default package */
public class sx9 {
    private final v a;
    private final fx9 b;
    private final yn1 c;
    private String d;
    private String e;
    private final yw9 f;
    private boolean g;
    private b h = EmptyDisposable.INSTANCE;
    private a i;

    /* access modifiers changed from: package-private */
    /* renamed from: sx9$a */
    public interface a {
    }

    public sx9(v vVar, fx9 fx9, yn1 yn1, yw9 yw9, boolean z) {
        this.a = vVar;
        this.b = fx9;
        this.c = yn1;
        this.f = yw9;
        this.g = z;
    }

    public String a() {
        String str;
        if (this.g && (str = this.d) != null) {
            return str;
        }
        try {
            String str2 = this.e;
            return str2 == null ? this.a.c() : str2;
        } catch (Exception e2) {
            StringBuilder V0 = je.V0("Error getting installation ID, ");
            V0.append(e2.getMessage());
            return V0.toString();
        }
    }

    public /* synthetic */ void b(String str) {
        Logger.g("Partner ID \"%s\" retrieved for Crashlytics", str);
        this.e = str;
        a aVar = this.i;
        if (aVar != null) {
            ((nx9) aVar).b();
        }
    }

    public void c(a aVar) {
        if (this.i != null) {
            Assertion.g("Overwriting listener");
        }
        this.i = aVar;
        if (this.e != null) {
            ((nx9) aVar).b();
        }
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        this.d = str;
        if (str != null && this.f.a()) {
            this.b.a(str, new nw9(this));
        }
    }

    public void e() {
        this.h.dispose();
        this.h = this.c.a().C(ow9.a).O(pw9.a).s().subscribe(new kw9(this));
    }

    public void f() {
        this.h.dispose();
    }
}
