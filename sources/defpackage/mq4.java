package defpackage;

import android.app.Activity;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.volume.controllers.l;

/* renamed from: mq4  reason: default package */
public class mq4 implements ts2 {
    private final ConnectManager a;
    private final cs0 b;
    private final l c;
    private final Activity d;

    public mq4(ConnectManager connectManager, cs0 cs0, l lVar, Activity activity) {
        this.a = connectManager;
        this.b = cs0;
        this.c = lVar;
        this.d = activity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    @Override // defpackage.ts2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r10, android.view.KeyEvent r11) {
        /*
            r9 = this;
            com.spotify.libs.connect.ConnectManager r10 = r9.a
            cs0 r0 = r9.b
            com.spotify.libs.connect.volume.controllers.l r1 = r9.c
            android.app.Activity r2 = r9.d
            java.lang.Class<kca> r3 = defpackage.kca.class
            monitor-enter(r3)
            int r4 = r2.getVolumeControlStream()     // Catch:{ all -> 0x0079 }
            com.spotify.libs.connect.model.GaiaDevice r5 = r10.o()     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x0019
            boolean r6 = com.spotify.libs.connect.model.Tech.isCast(r5)     // Catch:{ all -> 0x0079 }
        L_0x0019:
            r6 = 3
            if (r4 == r6) goto L_0x001f
            r2.setVolumeControlStream(r6)     // Catch:{ all -> 0x0079 }
        L_0x001f:
            r4 = 1
            r6 = 0
            if (r5 == 0) goto L_0x002b
            boolean r7 = r5.isSelf()     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            int r8 = r11.getAction()     // Catch:{ all -> 0x0079 }
            if (r8 != 0) goto L_0x0077
            int r11 = r11.getKeyCode()     // Catch:{ all -> 0x0079 }
            r8 = 24
            if (r11 == r8) goto L_0x0044
            r8 = 25
            if (r11 == r8) goto L_0x0040
            r11 = 0
            goto L_0x0048
        L_0x0040:
            r1.c()     // Catch:{ all -> 0x0079 }
            goto L_0x0047
        L_0x0044:
            r1.e()     // Catch:{ all -> 0x0079 }
        L_0x0047:
            r11 = 1
        L_0x0048:
            if (r11 == 0) goto L_0x0076
            if (r7 != 0) goto L_0x0076
            boolean r10 = r10.e()     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x005a
            boolean r10 = r0.i()     // Catch:{ all -> 0x0079 }
            if (r10 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x0076
            float r10 = r1.f()     // Catch:{ all -> 0x0079 }
            int r0 = com.spotify.music.libs.connect.volume.dialog.VolumeWidgetActivity.S     // Catch:{ all -> 0x0079 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.Class<com.spotify.music.libs.connect.volume.dialog.VolumeWidgetActivity> r1 = com.spotify.music.libs.connect.volume.dialog.VolumeWidgetActivity.class
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "active_device"
            r0.putExtra(r1, r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "volume_level"
            r0.putExtra(r1, r10)     // Catch:{ all -> 0x0079 }
            r2.startActivity(r0)     // Catch:{ all -> 0x0079 }
        L_0x0076:
            r6 = r11
        L_0x0077:
            monitor-exit(r3)
            return r6
        L_0x0079:
            r10 = move-exception
            monitor-exit(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq4.onKeyDown(int, android.view.KeyEvent):boolean");
    }
}
