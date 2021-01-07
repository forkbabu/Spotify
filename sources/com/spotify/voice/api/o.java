package com.spotify.voice.api;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.m;
import io.reactivex.g;

public class o implements n {
    private static final ImmutableSet<String> b = ImmutableSet.of("/v2/android/", "/v3/android/");
    private static final ImmutableSet<String> c = ImmutableSet.of("401", "403");
    private final g<m> a;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if ("/v2/android-car-view/".equals(r1.d()) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if ("/v2/voice-ad/".equals(r1.d()) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (com.spotify.voice.api.o.b.contains(r1.d()) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r11.a = r16.p(new com.spotify.voice.api.b(r15, r14, r12, r17, r18)).w(new com.spotify.voice.api.c(r18, r12, r13, r14, r15, r19));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2 == 4) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if ("/v1/superbird/".equals(r1.d()) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    o(defpackage.sse r12, io.reactivex.g<com.spotify.voice.api.model.m> r13, defpackage.mte r14, com.spotify.voice.api.model.l r15, io.reactivex.z<java.lang.Boolean> r16, com.spotify.mobile.android.util.connectivity.y r17, defpackage.sg0<defpackage.ng0, java.lang.Boolean> r18, com.spotify.http.wg.WebgateTokenProvider r19) {
        /*
            r11 = this;
            r11.<init>()
            com.spotify.voice.api.qualifiers.VoiceConsumer r0 = r15.b()
            com.spotify.voice.api.model.j r1 = r15.a()
            int r2 = r0.ordinal()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0038
            if (r2 == r3) goto L_0x002b
            r5 = 3
            if (r2 == r5) goto L_0x001e
            r5 = 4
            if (r2 != r5) goto L_0x0079
            goto L_0x0045
        L_0x001e:
            java.lang.String r2 = r1.d()
            java.lang.String r5 = "/v1/superbird/"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x0051
        L_0x002b:
            java.lang.String r2 = r1.d()
            java.lang.String r5 = "/v2/android-car-view/"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x0051
        L_0x0038:
            java.lang.String r2 = r1.d()
            java.lang.String r5 = "/v2/voice-ad/"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x0051
        L_0x0045:
            com.google.common.collect.ImmutableSet<java.lang.String> r2 = com.spotify.voice.api.o.b
            java.lang.String r5 = r1.d()
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x0079
        L_0x0051:
            com.spotify.voice.api.b r0 = new com.spotify.voice.api.b
            r5 = r0
            r6 = r15
            r7 = r14
            r8 = r12
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10)
            r1 = r16
            io.reactivex.z r0 = r1.p(r0)
            com.spotify.voice.api.c r8 = new com.spotify.voice.api.c
            r1 = r8
            r2 = r18
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.reactivex.g r0 = r0.w(r8)
            r2 = r11
            r2.a = r0
            return
        L_0x0079:
            r2 = r11
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6 = 0
            r3[r6] = r0
            r3[r4] = r1
            java.lang.String r0 = "Wrong endpoint for consumer %s and backend %s, check with #quepasa & #rollsvoice"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.voice.api.o.<init>(sse, io.reactivex.g, mte, com.spotify.voice.api.model.l, io.reactivex.z, com.spotify.mobile.android.util.connectivity.y, sg0, com.spotify.http.wg.WebgateTokenProvider):void");
    }

    static /* synthetic */ boolean b(WebgateTokenProvider webgateTokenProvider, Throwable th) {
        if (!(th instanceof VoiceSessionException)) {
            return false;
        }
        VoiceSessionException voiceSessionException = (VoiceSessionException) th;
        if (voiceSessionException.a() == ErrorDomain.CONNECTION && c.contains(voiceSessionException.b().b())) {
            return !MoreObjects.isNullOrEmpty(webgateTokenProvider.b(8000, true));
        }
        return false;
    }

    @Override // com.spotify.voice.api.n
    public g<m> a() {
        return this.a;
    }
}
