package defpackage;

import com.spotify.music.C0707R;
import com.spotify.music.connection.OfflineState;
import com.spotify.music.spotlets.offline.util.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.List;

/* renamed from: op4  reason: default package */
public class op4 {
    private final qo4 a;
    private final c b;
    private final y c;
    private b d;
    private b e;
    private boolean f;
    private boolean g = true;
    private int h;
    private a i;

    /* renamed from: op4$a */
    public interface a {
    }

    public op4(qo4 qo4, c cVar, y yVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.d = emptyDisposable;
        this.e = emptyDisposable;
        this.a = qo4;
        this.b = cVar;
        this.c = yVar;
    }

    private synchronized void a() {
        this.h = 0;
        if (this.f) {
            this.h = C0707R.string.connect_picker_no_internet;
        } else if (!this.g) {
            this.h = C0707R.string.connect_picker_no_device;
        }
        a aVar = this.i;
        if (aVar != null) {
            fp4.e(((to4) aVar).a);
        }
    }

    public int b() {
        return this.h;
    }

    public /* synthetic */ void c(OfflineState offlineState) {
        this.f = offlineState.offline();
        a();
    }

    public /* synthetic */ void d(List list) {
        this.g = !list.isEmpty();
        if (list.size() == 1) {
            this.g = !((com.spotify.libs.connect.model.a) list.get(0)).isSelf();
        }
        a();
    }

    public void e(a aVar) {
        this.i = aVar;
    }

    public void f() {
        this.d = this.b.a().subscribe(new jp4(this));
        this.e = this.a.d().o0(this.c).subscribe(new ip4(this));
    }

    public void g() {
        this.d.dispose();
        this.e.dispose();
    }
}
