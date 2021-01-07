package com.spotify.libs.otp.session;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.otp.session.OtpExpirationHandler;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class d<T extends Parcelable> implements OtpExpirationHandler.a {
    private final Set<c> a = new HashSet();
    private final OtpExpirationHandler b = new OtpExpirationHandler(this);
    io.reactivex.disposables.b c;
    private final y d;
    private final b<T> e;
    private io.reactivex.disposables.b f;
    e<T> g;

    public static class a {
        public final String a;
        public final int b;
        public final int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }
    }

    public interface b<T> {
        z<a> S0();

        z<a> W(T t);

        io.reactivex.a w();
    }

    public interface c {
        void a(Throwable th);

        void b();

        void c(float f);

        void d(a aVar);
    }

    public d(y yVar, b<T> bVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.c = emptyDisposable;
        this.f = emptyDisposable;
        yVar.getClass();
        this.d = yVar;
        bVar.getClass();
        this.e = bVar;
    }

    public static void i(d dVar, Throwable th) {
        dVar.getClass();
        Logger.e(th, "OtpSession: request error", new Object[0]);
        MoreObjects.checkState(!dVar.h());
        Iterator it = new ArrayList(dVar.a).iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(th);
        }
    }

    private void k() {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }

    private void l(float f2) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(f2);
        }
    }

    private void v(T t, z<a> zVar) {
        t.getClass();
        MoreObjects.checkState(!h());
        this.c = zVar.B(this.d).subscribe(new b(this, t, SystemClock.uptimeMillis()), new c(this));
    }

    public void a(c cVar) {
        MoreObjects.checkState(!this.a.contains(cVar));
        this.a.add(cVar);
    }

    public void b() {
        this.f = this.e.w().subscribe(a.a);
    }

    public void c() {
        this.b.a();
        this.g = null;
        this.c.dispose();
    }

    public String d() {
        this.g.getClass();
        return this.g.e;
    }

    public int e() {
        this.g.getClass();
        return this.g.d;
    }

    public T f() {
        this.g.getClass();
        return this.g.a;
    }

    public long g() {
        this.g.getClass();
        return TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.g.b);
    }

    public boolean h() {
        return this.g != null;
    }

    public void j(Parcelable parcelable, long j, a aVar) {
        MoreObjects.checkState(!h());
        long millis = TimeUnit.SECONDS.toMillis((long) aVar.c) + j;
        if (SystemClock.uptimeMillis() < millis) {
            this.g = new e<>(parcelable, j, millis, aVar.b, aVar.a);
            Iterator it = new ArrayList(this.a).iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(aVar);
            }
            this.b.b(j, millis);
            return;
        }
        k();
    }

    public void m() {
        this.c.dispose();
        this.f.dispose();
    }

    public void n() {
        this.g = null;
        l(0.0f);
        k();
    }

    public void o() {
        this.b.a();
    }

    public void p(Bundle bundle) {
        Parcelable parcelable;
        e<T> eVar = null;
        if (!(bundle == null || (parcelable = bundle.getParcelable("handle")) == null)) {
            long j = bundle.getLong("request-uptime-millis");
            long j2 = bundle.getLong("expiration-uptime-millis");
            int i = bundle.getInt("code-length");
            String string = bundle.getString("canonical-phone-number");
            boolean z = false;
            MoreObjects.checkState(j > 0);
            MoreObjects.checkState(j2 >= j);
            if (i > 0) {
                z = true;
            }
            MoreObjects.checkState(z);
            string.getClass();
            eVar = new e<>(parcelable, j, j2, i, string);
        }
        this.g = eVar;
    }

    public void q() {
        if (this.g != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            e<T> eVar = this.g;
            long j = eVar.c;
            if (uptimeMillis < j) {
                this.b.b(eVar.b, j);
            } else {
                n();
            }
        }
    }

    public void r(Bundle bundle) {
        e<T> eVar = this.g;
        if (eVar != null) {
            eVar.getClass();
            if (bundle != null) {
                bundle.putParcelable("handle", eVar.a);
                bundle.putLong("request-uptime-millis", eVar.b);
                bundle.putLong("expiration-uptime-millis", eVar.c);
                bundle.putInt("code-length", eVar.d);
                bundle.putString("canonical-phone-number", eVar.e);
            }
        }
    }

    public void s(float f2) {
        l(f2);
    }

    public void t(c cVar) {
        MoreObjects.checkState(this.a.contains(cVar));
        this.a.remove(cVar);
    }

    public void u(T t) {
        v(t, this.e.W(t));
    }

    public void w() {
        this.g.getClass();
        this.g.getClass();
        T t = this.g.a;
        c();
        v(t, this.e.S0());
    }
}
