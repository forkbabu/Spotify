package com.spotify.music.features.carepackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.share.menu.preview.api.e;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.preview.v;
import com.spotify.playlist.endpoints.i;
import io.reactivex.a;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class CarePackageInjector {
    private final SpSharedPreferences<Object> a;
    private final i b;
    private final e c;
    private final v d;
    private final y e;
    private final qy4 f;
    private final String g;
    private final si4 h;
    private final nmf<String, a> i;
    private final SnackbarManager j;
    private final vh4 k;
    private final ui4 l;

    public CarePackageInjector(SpSharedPreferences<Object> spSharedPreferences, i iVar, e eVar, v vVar, y yVar, qy4 qy4, String str, si4 si4, nmf<String, a> nmf, SnackbarManager snackbarManager, vh4 vh4, ui4 ui4) {
        h.e(spSharedPreferences, "sharedPreferences");
        h.e(iVar, "playlistOperation");
        h.e(eVar, "sharePreviewMenu");
        h.e(vVar, "previewPlayer");
        h.e(yVar, "computationScheduler");
        h.e(qy4, "entitySelector");
        h.e(str, "listName");
        h.e(si4, "userSelectionEventHandler");
        h.e(nmf, "addPlaylistToLibraryAction");
        h.e(snackbarManager, "snackbarManager");
        h.e(vh4, "undoEvents");
        h.e(ui4, "audioPlusLogger");
        this.a = spSharedPreferences;
        this.b = iVar;
        this.c = eVar;
        this.d = vVar;
        this.e = yVar;
        this.f = qy4;
        this.g = str;
        this.h = si4;
        this.i = nmf;
        this.j = snackbarManager;
        this.k = vh4;
        this.l = ui4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.spotify.music.features.carepackage.j] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.spotify.music.features.carepackage.k] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.dh4, defpackage.bh4> b(defpackage.dh4 r12, io.reactivex.s<com.spotify.playlist.models.k> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r12, r0)
            java.lang.String r0 = "playlistEntityObservable"
            kotlin.jvm.internal.h.e(r13, r0)
            com.spotify.music.features.carepackage.CarePackageInjector$createLoopFactory$1 r0 = com.spotify.music.features.carepackage.CarePackageInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x0014
            com.spotify.music.features.carepackage.k r1 = new com.spotify.music.features.carepackage.k
            r1.<init>(r0)
            r0 = r1
        L_0x0014:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r11.a
            com.spotify.mobile.android.share.menu.preview.api.e r2 = r11.c
            com.spotify.playlist.endpoints.i r3 = r11.b
            com.spotify.music.preview.v r4 = r11.d
            qy4 r5 = r11.f
            java.lang.String r6 = r11.g
            nmf<java.lang.String, io.reactivex.a> r7 = r11.i
            com.spotify.encore.mobile.snackbar.SnackbarManager r8 = r11.j
            com.spotify.music.features.carepackage.CarePackageInjector$createLoopFactory$2 r9 = new com.spotify.music.features.carepackage.CarePackageInjector$createLoopFactory$2
            vh4 r10 = r11.k
            r9.<init>(r10)
            ui4 r10 = r11.l
            io.reactivex.w r1 = defpackage.ei4.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.spotify.music.preview.v r1 = r11.d
            io.reactivex.s r1 = r1.g()
            java.lang.String r2 = "previewPlayer.observePreviewPlayerState()"
            kotlin.jvm.internal.h.d(r1, r2)
            si4 r2 = r11.h
            io.reactivex.s r2 = r2.b()
            vh4 r3 = r11.k
            io.reactivex.s r3 = r3.b()
            com.spotify.mobius.q r13 = defpackage.ki4.a(r13, r1, r2, r3)
            com.spotify.mobius.MobiusLoop$f r13 = r0.h(r13)
            com.spotify.music.features.carepackage.a r0 = new com.spotify.music.features.carepackage.a
            r1 = 0
            r0.<init>(r1, r11)
            com.spotify.mobius.MobiusLoop$f r13 = r13.b(r0)
            com.spotify.music.features.carepackage.a r0 = new com.spotify.music.features.carepackage.a
            r1 = 1
            r0.<init>(r1, r11)
            com.spotify.mobius.MobiusLoop$f r13 = r13.d(r0)
            com.spotify.mobius.android.e r0 = new com.spotify.mobius.android.e
            java.lang.String r1 = "CarePackage"
            r0.<init>(r1)
            com.spotify.mobius.MobiusLoop$f r13 = r13.f(r0)
            java.lang.String r0 = "RxMobius.loop<CarePackag…ogger.tag(\"CarePackage\"))"
            kotlin.jvm.internal.h.d(r13, r0)
            com.spotify.music.features.carepackage.CarePackageInjector$createController$1 r0 = com.spotify.music.features.carepackage.CarePackageInjector$createController$1.a
            if (r0 == 0) goto L_0x0084
            com.spotify.music.features.carepackage.j r1 = new com.spotify.music.features.carepackage.j
            r1.<init>(r0)
            r0 = r1
        L_0x0084:
            com.spotify.mobius.t r0 = (com.spotify.mobius.t) r0
            u92 r1 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r12 = com.spotify.mobius.z.a(r13, r12, r0, r1)
            java.lang.String r13 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.carepackage.CarePackageInjector.b(dh4, io.reactivex.s):com.spotify.mobius.MobiusLoop$g");
    }
}
