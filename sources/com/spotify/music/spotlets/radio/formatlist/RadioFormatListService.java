package com.spotify.music.spotlets.radio.formatlist;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.util.o0;
import dagger.android.g;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class RadioFormatListService extends g {
    b a = EmptyDisposable.INSTANCE;
    i b;
    y c;
    o0 f;

    public static Intent e(Context context, String str) {
        return je.y(context, RadioFormatListService.class, ".seed_uri", str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.dispose();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !intent.hasExtra(".seed_uri")) {
            stopSelf();
            return 2;
        }
        this.a = this.b.a(intent.getExtras().getString(".seed_uri")).R0(15, TimeUnit.SECONDS).o0(this.c).subscribe(new a(this, getApplicationContext()), new b(this));
        return 2;
    }
}
