package defpackage;

import com.spotify.music.C0707R;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: zs4  reason: default package */
public class zs4 {
    private final wt4 a;
    private final y b;
    private b c;
    private b d;
    private boolean e;
    private boolean f = true;
    private int g;
    private a h;

    /* renamed from: zs4$a */
    public interface a {
    }

    public zs4(wt4 wt4, y yVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.c = emptyDisposable;
        this.d = emptyDisposable;
        this.a = wt4;
        this.b = yVar;
    }

    private synchronized void a() {
        this.g = 0;
        if (this.e) {
            this.g = C0707R.string.connect_picker_no_internet;
        } else if (!this.f) {
            this.g = C0707R.string.connect_picker_no_device;
        }
        a aVar = this.h;
        if (aVar != null) {
            ((qs4) aVar).a.b0();
        }
    }

    public int b() {
        return this.g;
    }

    public /* synthetic */ void c(Boolean bool) {
        this.e = !bool.booleanValue();
        a();
    }

    public /* synthetic */ void d(Boolean bool) {
        this.f = bool.booleanValue();
        a();
    }

    public void e(a aVar) {
        this.h = aVar;
    }

    public void f() {
        this.c = this.a.a().o0(this.b).subscribe(new ys4(this));
        this.d = this.a.b().o0(this.b).subscribe(new xs4(this));
    }

    public void g() {
        this.c.dispose();
        this.d.dispose();
    }
}
