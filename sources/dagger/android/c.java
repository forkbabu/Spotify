package dagger.android;

import android.app.Application;

public abstract class c extends Application implements h {
    volatile DispatchingAndroidInjector<Object> a;

    private void c() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    ((o03) b()).a(this);
                    if (this.a == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    @Override // dagger.android.h
    public b<Object> C() {
        c();
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract b<? extends c> b();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        c();
    }
}
