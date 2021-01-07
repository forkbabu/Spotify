package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.text.i;
import com.google.android.exoplayer2.text.j;
import java.util.ArrayList;

public class x implements s0 {
    private final Context a;
    private n<s> b;
    private int c;
    private long d;
    private f e;

    public x(Context context) {
        this.a = context;
        this.c = 0;
        this.d = 5000;
        this.e = f.a;
    }

    @Override // com.google.android.exoplayer2.s0
    public p0[] a(Handler handler, com.google.android.exoplayer2.video.s sVar, m mVar, i iVar, zm zmVar, n<s> nVar) {
        n<s> nVar2 = nVar == null ? this.b : nVar;
        ArrayList<p0> arrayList = new ArrayList<>();
        d(this.a, this.c, this.e, nVar2, false, false, handler, sVar, this.d, arrayList);
        b(this.a, this.c, this.e, nVar2, false, false, new AudioProcessor[0], handler, mVar, arrayList);
        arrayList.add(new j(iVar, handler.getLooper()));
        arrayList.add(new an(zmVar, handler.getLooper()));
        arrayList.add(new mq());
        c(this.a, handler, this.c, arrayList);
        return (p0[]) arrayList.toArray(new p0[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097 A[ExcHandler: Exception (r0v5 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x006f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r16, int r17, com.google.android.exoplayer2.mediacodec.f r18, com.google.android.exoplayer2.drm.n<com.google.android.exoplayer2.drm.s> r19, boolean r20, boolean r21, com.google.android.exoplayer2.audio.AudioProcessor[] r22, android.os.Handler r23, com.google.android.exoplayer2.audio.m r24, java.util.ArrayList<com.google.android.exoplayer2.p0> r25) {
        /*
            r15 = this;
            r0 = r17
            r1 = r22
            r11 = r25
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r12 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            java.lang.Class<com.google.android.exoplayer2.audio.m> r13 = com.google.android.exoplayer2.audio.m.class
            com.google.android.exoplayer2.audio.u r14 = new com.google.android.exoplayer2.audio.u
            com.google.android.exoplayer2.audio.DefaultAudioSink r10 = new com.google.android.exoplayer2.audio.DefaultAudioSink
            com.google.android.exoplayer2.audio.j r2 = com.google.android.exoplayer2.audio.j.a(r16)
            r10.<init>(r2, r1)
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r23
            r9 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.add(r14)
            if (r0 != 0) goto L_0x002d
            return
        L_0x002d:
            int r2 = r25.size()
            r3 = 2
            if (r0 != r3) goto L_0x0036
            int r2 = r2 + -1
        L_0x0036:
            r0 = 0
            r4 = 3
            r5 = 1
            java.lang.String r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r7[r5] = r13     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r7[r3] = r12     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.reflect.Constructor r6 = r6.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r7[r0] = r23     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r7[r5] = r24     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r7[r3] = r1     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            com.google.android.exoplayer2.p0 r6 = (com.google.android.exoplayer2.p0) r6     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            int r7 = r2 + 1
            r11.add(r2, r6)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x0063 }
            goto L_0x006d
        L_0x0061:
            r2 = r7
            goto L_0x006c
        L_0x0063:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x006c:
            r7 = r2
        L_0x006d:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r6[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            r6[r5] = r13     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            r6[r3] = r12     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            r6[r0] = r23     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            r6[r5] = r24     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            r6[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            com.google.android.exoplayer2.p0 r2 = (com.google.android.exoplayer2.p0) r2     // Catch:{ ClassNotFoundException -> 0x00a0, Exception -> 0x0097 }
            int r6 = r7 + 1
            r11.add(r7, r2)     // Catch:{ ClassNotFoundException -> 0x0095, Exception -> 0x0097 }
            goto L_0x00a1
        L_0x0095:
            r7 = r6
            goto L_0x00a0
        L_0x0097:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a0:
            r6 = r7
        L_0x00a1:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            r7[r5] = r13     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            r7[r3] = r12     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            r4[r0] = r23     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            r4[r5] = r24     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            r4[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            java.lang.Object r0 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            com.google.android.exoplayer2.p0 r0 = (com.google.android.exoplayer2.p0) r0     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            r11.add(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00d0, Exception -> 0x00c7 }
            goto L_0x00d0
        L_0x00c7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.x.b(android.content.Context, int, com.google.android.exoplayer2.mediacodec.f, com.google.android.exoplayer2.drm.n, boolean, boolean, com.google.android.exoplayer2.audio.AudioProcessor[], android.os.Handler, com.google.android.exoplayer2.audio.m, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public void c(Context context, Handler handler, int i, ArrayList<p0> arrayList) {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0035] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.content.Context r16, int r17, com.google.android.exoplayer2.mediacodec.f r18, com.google.android.exoplayer2.drm.n<com.google.android.exoplayer2.drm.s> r19, boolean r20, boolean r21, android.os.Handler r22, com.google.android.exoplayer2.video.s r23, long r24, java.util.ArrayList<com.google.android.exoplayer2.p0> r26) {
        /*
            r15 = this;
            r0 = r17
            r12 = r26
            java.lang.Class<com.google.android.exoplayer2.video.s> r13 = com.google.android.exoplayer2.video.s.class
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer r14 = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer
            r11 = 50
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r24
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r12.add(r14)
            if (r0 != 0) goto L_0x0024
            return
        L_0x0024:
            int r1 = r26.size()
            r2 = 2
            if (r0 != r2) goto L_0x002d
            int r1 = r1 + -1
        L_0x002d:
            r0 = 50
            r3 = 3
            r4 = 0
            r5 = 4
            r6 = 1
            java.lang.String r7 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r8[r6] = r9     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            r8[r2] = r13     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.reflect.Constructor r7 = r7.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Long r9 = java.lang.Long.valueOf(r24)     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            r8[r4] = r9     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            r8[r6] = r22     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            r8[r2] = r23     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            java.lang.Object r7 = r7.newInstance(r8)     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            com.google.android.exoplayer2.p0 r7 = (com.google.android.exoplayer2.p0) r7     // Catch:{ ClassNotFoundException -> 0x0076, Exception -> 0x006d }
            int r8 = r1 + 1
            r12.add(r1, r7)     // Catch:{ ClassNotFoundException -> 0x006b, Exception -> 0x006d }
            goto L_0x0077
        L_0x006b:
            r1 = r8
            goto L_0x0076
        L_0x006d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0076:
            r8 = r1
        L_0x0077:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r7[r4] = r9     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Class<android.os.Handler> r9 = android.os.Handler.class
            r7[r6] = r9     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r7[r2] = r13     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r7[r3] = r9     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Long r7 = java.lang.Long.valueOf(r24)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r5[r4] = r7     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r5[r6] = r22     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r5[r2] = r23     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r5[r3] = r0     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            java.lang.Object r0 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            com.google.android.exoplayer2.p0 r0 = (com.google.android.exoplayer2.p0) r0     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            r12.add(r8, r0)     // Catch:{ ClassNotFoundException -> 0x00b6, Exception -> 0x00ad }
            goto L_0x00b6
        L_0x00ad:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.x.d(android.content.Context, int, com.google.android.exoplayer2.mediacodec.f, com.google.android.exoplayer2.drm.n, boolean, boolean, android.os.Handler, com.google.android.exoplayer2.video.s, long, java.util.ArrayList):void");
    }

    @Deprecated
    public x(Context context, int i) {
        this.a = context;
        this.c = i;
        this.d = 5000;
        this.b = null;
        this.e = f.a;
    }
}
