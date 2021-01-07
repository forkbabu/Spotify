package defpackage;

import defpackage.k91;

/* renamed from: ux3  reason: default package */
public final /* synthetic */ class ux3 implements k91.a {
    public final /* synthetic */ u3 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ux3(u3 u3Var, boolean z) {
        this.a = u3Var;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [byte[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.k91.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.s81 a(defpackage.s81 r8) {
        /*
            r7 = this;
            u3 r0 = r7.a
            boolean r1 = r7.b
            F r2 = r0.a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0010
            S r2 = r0.b
            if (r2 == 0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            q81 r5 = r8.componentId()
            java.lang.String r5 = r5.id()
            boolean r5 = defpackage.zy3.a(r5)
            if (r5 == 0) goto L_0x00de
            if (r2 == 0) goto L_0x00de
            p81 r2 = r8.metadata()
            java.lang.String r5 = "uri"
            java.lang.String r2 = r2.string(r5)
            S r5 = r0.b
            com.spotify.music.features.album.offline.model.OfflineState r5 = (com.spotify.music.features.album.offline.model.OfflineState) r5
            java.util.List r5 = r5.getTracks()
            F r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0040
            com.spotify.playlist.models.offline.a$a r0 = com.spotify.playlist.models.offline.a.C0377a.a
            goto L_0x0083
        L_0x0040:
            java.util.Iterator r0 = r5.iterator()
        L_0x0044:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r0.next()
            com.spotify.music.features.album.offline.model.Track r5 = (com.spotify.music.features.album.offline.model.Track) r5
            java.lang.String r6 = r5.getLink()
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0044
            com.spotify.playlist.models.offline.a r0 = r5.getOfflineState()
            r0.getClass()
            boolean r2 = r0 instanceof com.spotify.playlist.models.offline.a.b
            if (r2 == 0) goto L_0x006b
            com.spotify.playlist.models.offline.a$b r0 = new com.spotify.playlist.models.offline.a$b
            r0.<init>(r3)
            goto L_0x0083
        L_0x006b:
            boolean r2 = r0 instanceof com.spotify.playlist.models.offline.a.h
            if (r2 == 0) goto L_0x0083
            com.spotify.playlist.models.offline.a$h r0 = (com.spotify.playlist.models.offline.a.h) r0
            com.spotify.playlist.models.offline.WaitingReason r0 = r0.d()
            java.lang.String r2 = "waitingReason"
            kotlin.jvm.internal.h.e(r0, r2)
            com.spotify.playlist.models.offline.a$h r2 = new com.spotify.playlist.models.offline.a$h
            r2.<init>(r0, r3)
            r0 = r2
            goto L_0x0083
        L_0x0081:
            com.spotify.playlist.models.offline.a$f r0 = com.spotify.playlist.models.offline.a.f.a
        L_0x0083:
            s81$a r2 = r8.toBuilder()
            java.lang.String r3 = "offlineState"
            kotlin.jvm.internal.h.e(r0, r3)
            com.spotify.playlist.models.offline.c r3 = new com.spotify.playlist.models.offline.c
            r3.<init>()
            android.os.Parcel r5 = android.os.Parcel.obtain()
            java.lang.String r6 = "Parcel.obtain()"
            kotlin.jvm.internal.h.d(r5, r6)
            r3.b(r0, r5)
            byte[] r3 = r5.marshall()
            r5.recycle()
            java.lang.String r5 = "bytes"
            kotlin.jvm.internal.h.d(r3, r5)
            java.lang.String r5 = "availability"
            s81$a r2 = r2.d(r5, r3)
            q81 r8 = r8.componentId()
            java.lang.String r8 = r8.id()
            java.lang.String r3 = "consumerMobile:albumTrackRow"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L_0x00c7
            java.lang.String r8 = "row:trackWithDownloadProgress"
            java.lang.String r3 = "row"
            s81$a r2 = r2.o(r8, r3)
        L_0x00c7:
            if (r1 == 0) goto L_0x00da
            boolean r8 = r0 instanceof com.spotify.playlist.models.offline.a.C0377a
            if (r8 != 0) goto L_0x00da
            p81 r8 = com.spotify.mobile.android.hubframework.defaults.components.glue.k.a(r4)
            s81$a r8 = r2.c(r8)
            s81 r8 = r8.l()
            goto L_0x00de
        L_0x00da:
            s81 r8 = r2.l()
        L_0x00de:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux3.a(s81):s81");
    }
}
