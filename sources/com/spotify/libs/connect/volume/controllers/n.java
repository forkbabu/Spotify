package com.spotify.libs.connect.volume.controllers;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public class n extends ContentObserver {
    private final AudioManager a;
    private final ContentResolver b;
    private final PublishSubject<Float> c = PublishSubject.h1();
    private final ConnectVolumeControlInstrumentation d;
    private float e;

    public n(Context context, ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation) {
        super(new Handler());
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = context.getContentResolver();
        this.d = connectVolumeControlInstrumentation;
    }

    public Float a() {
        return Float.valueOf(((float) this.a.getStreamVolume(3)) / ((float) this.a.getStreamMaxVolume(3)));
    }

    public s<Float> b() {
        return this.c;
    }

    public int c() {
        return this.a.getStreamMaxVolume(3);
    }

    public void d() {
        this.b.registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.b.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float floatValue = a().floatValue();
        this.d.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.c, floatValue, Float.valueOf(this.e));
        this.e = floatValue;
        this.c.onNext(Float.valueOf(floatValue));
    }
}
