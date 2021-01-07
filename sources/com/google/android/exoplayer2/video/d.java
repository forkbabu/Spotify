package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.s;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ s.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ d(s.a aVar, String str, long j, long j2) {
        this.a = aVar;
        this.b = str;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c, this.f);
    }
}
