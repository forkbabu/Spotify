package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.common.base.Optional;
import io.reactivex.s;
import io.reactivex.t;

/* renamed from: w1e  reason: default package */
public class w1e {
    private Optional<Runnable> a = Optional.absent();

    w1e() {
    }

    /* access modifiers changed from: package-private */
    public s<u50> a(Context context) {
        if (!this.a.isPresent()) {
            return s.y(new p1e(this, context));
        }
        throw new RuntimeException("bind can only be called once!");
    }

    public void b(Context context, t tVar) {
        v1e v1e = new v1e(this, tVar);
        this.a = Optional.of(new q1e(this, context, tVar, v1e));
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_SERVICE");
        intent.setPackage("com.osp.app.signin");
        if (!applicationContext.bindService(intent, v1e, 1)) {
            tVar.f(new Exception("Couldn't bind service!"));
        }
    }

    public void c(Context context, t tVar, ServiceConnection serviceConnection) {
        if (!tVar.d()) {
            tVar.onComplete();
        }
        context.getApplicationContext().unbindService(serviceConnection);
        this.a = Optional.absent();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.a.isPresent()) {
            this.a.get().run();
        }
    }
}
