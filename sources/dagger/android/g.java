package dagger.android;

import android.app.Service;

public abstract class g extends Service {
    @Override // android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
    }
}
