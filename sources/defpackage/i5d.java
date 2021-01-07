package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.sociallistening.models.JoinType;
import com.spotify.music.sociallistening.models.Session;
import defpackage.qu0;
import defpackage.vad;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: i5d  reason: default package */
public final class i5d implements n4d {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private io.reactivex.disposables.b b;
    private qu0.a c;
    private final lad d;
    private final y e;
    private final vad f;
    private final f4d g;
    private final t7d h;
    private final Activity i;
    private final jad j;

    /* renamed from: i5d$a */
    public static final class a implements vad.a {
        final /* synthetic */ i5d a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(i5d i5d) {
            this.a = i5d;
        }

        @Override // defpackage.vad.a
        public void a(int i, Session session) {
            h.e(session, "session");
            String joinSessionToken = session.getJoinSessionToken();
            if (joinSessionToken != null) {
                this.a.j.a(i, joinSessionToken);
                this.a.i.startActivity(this.a.h.e(joinSessionToken, JoinType.f, true));
                return;
            }
            Logger.d("Join session token missing", new Object[0]);
        }
    }

    /* renamed from: i5d$b */
    static final class b implements qu0.a {
        public static final b a = new b();

        b() {
        }

        @Override // defpackage.qu0.a
        public final void a() {
        }
    }

    /* renamed from: i5d$c */
    static final class c<T> implements g<com.spotify.music.sociallistening.models.b> {
        final /* synthetic */ i5d a;

        c(i5d i5d) {
            this.a = i5d;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(com.spotify.music.sociallistening.models.b bVar) {
            com.spotify.music.sociallistening.models.b bVar2 = bVar;
            i5d i5d = this.a;
            h.d(bVar2, "it");
            i5d.l(i5d, bVar2);
        }
    }

    public i5d(lad lad, y yVar, vad vad, f4d f4d, t7d t7d, Activity activity, jad jad) {
        h.e(lad, "nearbyManager");
        h.e(yVar, "mainThread");
        h.e(vad, "nearbySessionsAdapter");
        h.e(f4d, "socialListening");
        h.e(t7d, "socialListeningActivityDialogs");
        h.e(activity, "activity");
        h.e(jad, "logger");
        this.d = lad;
        this.e = yVar;
        this.f = vad;
        this.g = f4d;
        this.h = t7d;
        this.i = activity;
        this.j = jad;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        h.d(emptyDisposable, "Disposables.disposed()");
        this.b = emptyDisposable;
        this.c = b.a;
    }

    public static final void l(i5d i5d, com.spotify.music.sociallistening.models.b bVar) {
        i5d.f.c0(!bVar.j());
        if (!bVar.g() && i5d.b.d()) {
            io.reactivex.disposables.b subscribe = i5d.d.a().o0(i5d.e).subscribe(new j5d(i5d));
            h.d(subscribe, "nearbyManager\n          …pdate()\n                }");
            i5d.b = subscribe;
            i5d.a.b(subscribe);
        } else if (bVar.g() && !i5d.b.d()) {
            i5d.b.dispose();
            i5d.c.a();
        }
    }

    @Override // defpackage.n4d
    public void a(qu0.a aVar) {
        h.e(aVar, "listener");
        this.c = aVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i2) {
        h.e(viewGroup, "parent");
        this.f.b0(new a(this));
        return this.f.Z(viewGroup);
    }

    @Override // defpackage.qu0
    public int c() {
        if (this.b.d()) {
            return 0;
        }
        return this.f.u();
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{102};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i2) {
        h.e(b0Var, "viewHolder");
        this.f.K((vad.b) b0Var, i2);
    }

    @Override // defpackage.qu0
    public long getItemId(int i2) {
        this.f.getClass();
        return -1;
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i2) {
        return 102;
    }

    @Override // defpackage.n4d
    public void start() {
        this.a.b(this.g.a().o0(this.e).subscribe(new c(this)));
    }

    @Override // defpackage.n4d
    public void stop() {
        this.a.f();
    }
}
