package androidx.core.app;

import android.os.Build;

public abstract class s extends f {
    @Override // androidx.core.app.f, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new t(this);
        }
    }
}
