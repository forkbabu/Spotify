package com.spotify.libs.otp.ui;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.libs.otp.session.d;
import com.spotify.libs.otp.session.f;
import com.spotify.libs.otp.ui.l0;

public class k0 {
    private final d<? extends Parcelable> a;
    private final Runnable b;
    private final l0.b c;

    /* access modifiers changed from: package-private */
    public class a extends f {
        final /* synthetic */ c a;
        final /* synthetic */ b b;

        a(c cVar, b bVar) {
            this.a = cVar;
            this.b = bVar;
        }

        private void e() {
            k0.this.a.t(this);
            k0.this.b.run();
        }

        @Override // com.spotify.libs.otp.session.f, com.spotify.libs.otp.session.d.c
        public void a(Throwable th) {
            e();
            k0.this.c.y(th);
            b bVar = this.b;
            if (bVar != null) {
                ((rw5) bVar).a.H(th);
            }
        }

        @Override // com.spotify.libs.otp.session.d.c
        public void b() {
            e();
        }

        @Override // com.spotify.libs.otp.session.f, com.spotify.libs.otp.session.d.c
        public void d(d.a aVar) {
            e();
            k0.this.c.x(aVar);
            c cVar = this.a;
            if (cVar != null) {
                ((uw5) cVar).a.F(aVar);
            }
        }
    }

    public interface b {
    }

    public interface c {
    }

    public k0(d<? extends Parcelable> dVar, Runnable runnable, l0.b bVar) {
        dVar.getClass();
        this.a = dVar;
        this.b = runnable;
        bVar.getClass();
        this.c = bVar;
    }

    public void d(c cVar, Runnable runnable, b bVar, long j) {
        MoreObjects.checkState(this.a.h());
        if (this.a.g() < j) {
            this.b.run();
            this.c.o();
            ((xw5) runnable).a.G();
            return;
        }
        this.a.a(new a(cVar, bVar));
        this.a.w();
    }
}
