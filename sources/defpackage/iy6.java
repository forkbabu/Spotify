package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.q;

/* renamed from: iy6  reason: default package */
public class iy6 implements hy6 {
    private final q a = new q();
    private final i8c b;
    private final i c;
    private final m8c d;
    private String e;
    private Optional<ane> f;

    /* renamed from: iy6$a */
    class a implements f8c {
        final /* synthetic */ v a;
        final /* synthetic */ String b;

        a(v vVar, String str) {
            this.a = vVar;
            this.b = str;
        }

        @Override // defpackage.f8c
        public void a(boolean z) {
            iy6.c(iy6.this, z);
        }

        @Override // defpackage.f8c
        public void b(boolean z) {
            io.reactivex.a aVar;
            if (z) {
                aVar = this.a.c(this.b);
            } else {
                aVar = this.a.d(this.b);
            }
            iy6.this.a.a(aVar.subscribe(xx6.a, yx6.a));
        }
    }

    /* renamed from: iy6$b */
    class b implements e8c {
        final /* synthetic */ j a;

        b(iy6 iy6, j jVar) {
            this.a = jVar;
        }

        @Override // defpackage.e8c
        public com.spotify.playlist.models.offline.a a() {
            return this.a.k();
        }

        @Override // defpackage.e8c
        public boolean b() {
            return !this.a.w() && !this.a.t();
        }
    }

    public iy6(String str, v vVar, i iVar, m8c m8c) {
        this.c = iVar;
        this.d = m8c;
        this.b = new h8c(zx6.a, new a(vVar, str));
    }

    static void c(iy6 iy6, boolean z) {
        iy6.a.a(iy6.c.c(iy6.e, iy6.f, z).subscribe(by6.a, ay6.a));
    }

    @Override // defpackage.hy6
    public void a(boolean z) {
        ((h8c) this.b).b(z);
    }

    @Override // defpackage.hy6
    public void b(h76 h76) {
        j l = h76.l();
        this.e = l.getUri();
        this.f = Optional.fromNullable(h76.f().a());
        ((h8c) this.b).c(new b(this, l));
    }

    @Override // defpackage.hy6
    public void start() {
        this.a.c();
        this.d.d(this.b);
        this.d.c();
    }

    @Override // defpackage.hy6
    public void stop() {
        this.a.c();
        this.d.b(this.b);
        this.d.a();
    }
}
