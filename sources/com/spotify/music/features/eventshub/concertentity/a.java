package com.spotify.music.features.eventshub.concertentity;

import android.net.Uri;
import com.spotify.music.C0707R;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ ConcertEntityFragment a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ String f;
    public final /* synthetic */ String n;

    public /* synthetic */ a(ConcertEntityFragment concertEntityFragment, String str, Uri uri, String str2, String str3) {
        this.a = concertEntityFragment;
        this.b = str;
        this.c = uri;
        this.f = str2;
        this.n = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcertEntityFragment concertEntityFragment = this.a;
        String str = this.b;
        Uri uri = this.c;
        String str2 = this.f;
        String str3 = this.n;
        new g(concertEntityFragment.D0, kfd.t0.getName(), str, concertEntityFragment.L0, concertEntityFragment.M0, concertEntityFragment.F0).a();
        concertEntityFragment.A0.c(pzc.b(uri, str2, str3, str).build(), rzc.a, C0707R.string.integration_id_context_menu);
    }
}
