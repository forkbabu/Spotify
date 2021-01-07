package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import com.spotify.music.libs.mediabrowserservice.j2;
import com.spotify.music.libs.mediabrowserservice.r1;
import io.reactivex.functions.g;
import io.reactivex.internal.functions.Functions;
import java.util.List;

/* renamed from: m04  reason: default package */
class m04 extends r1 {
    private final j2 q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m04(java.lang.String r18, java.lang.String r19, android.content.Context r20, com.spotify.mobile.android.service.media.v1 r21, com.spotify.mobile.android.service.media.t2 r22, com.spotify.music.libs.mediabrowserservice.a2 r23, com.spotify.music.libs.mediasession.i0 r24, java.util.Set<java.lang.Long> r25, com.spotify.music.libs.mediabrowserservice.j2 r26, com.spotify.music.libs.mediabrowserservice.d3 r27, defpackage.yda r28, defpackage.pea r29, boolean r30) {
        /*
            r17 = this;
            com.spotify.music.libs.mediabrowserservice.RootHintsParams$a r0 = com.spotify.music.libs.mediabrowserservice.RootHintsParams.b()
            java.lang.String r1 = "automotive"
            r0.b(r1)
            r1 = 0
            r0.c(r1)
            r1 = 1
            r0.a(r1)
            com.spotify.music.libs.mediabrowserservice.RootHintsParams r11 = r0.build()
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            r1 = r26
            r0.q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m04.<init>(java.lang.String, java.lang.String, android.content.Context, com.spotify.mobile.android.service.media.v1, com.spotify.mobile.android.service.media.t2, com.spotify.music.libs.mediabrowserservice.a2, com.spotify.music.libs.mediasession.i0, java.util.Set, com.spotify.music.libs.mediabrowserservice.j2, com.spotify.music.libs.mediabrowserservice.d3, yda, pea, boolean):void");
    }

    @Override // com.spotify.music.libs.mediabrowserservice.r1, com.spotify.music.libs.mediabrowserservice.n2
    public void f(String str, Bundle bundle, g<List<MediaBrowserCompat.MediaItem>> gVar) {
        this.b.b(this.q.b(str, 0).M(Functions.f(), new j04(gVar)).subscribe(gVar, new i04(gVar)));
    }
}
