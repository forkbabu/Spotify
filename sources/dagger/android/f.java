package dagger.android;

import android.app.IntentService;

public abstract class f extends IntentService {
    public f(String str) {
        super(str);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        a.b(this);
        super.onCreate();
    }
}
