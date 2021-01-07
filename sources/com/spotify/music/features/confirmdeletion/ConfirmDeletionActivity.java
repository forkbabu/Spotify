package com.spotify.music.features.confirmdeletion;

import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.playlist.endpoints.v;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class ConfirmDeletionActivity extends ss2 {
    private final p G = new p();
    private String H;
    private String I;
    public v J;

    static final class a implements View.OnClickListener {
        final /* synthetic */ ConfirmDeletionActivity a;

        /* renamed from: com.spotify.music.features.confirmdeletion.ConfirmDeletionActivity$a$a  reason: collision with other inner class name */
        static final class C0217a implements io.reactivex.functions.a {
            final /* synthetic */ a a;

            C0217a(a aVar) {
                this.a = aVar;
            }

            @Override // io.reactivex.functions.a
            public final void run() {
                this.a.a.setResult(-1);
                this.a.a.finish();
            }
        }

        static final class b<T> implements g<Throwable> {
            final /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.g
            public void accept(Throwable th) {
                Throwable th2 = th;
                h.e(th2, "throwable");
                Logger.e(th2, "ConfirmDeletionActivity: failed to change follow state for playlist", new Object[0]);
                this.a.a.finish();
            }
        }

        a(ConfirmDeletionActivity confirmDeletionActivity) {
            this.a = confirmDeletionActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = this.a.G;
            ConfirmDeletionActivity confirmDeletionActivity = this.a;
            v vVar = confirmDeletionActivity.J;
            if (vVar != null) {
                pVar.b(vVar.d(ConfirmDeletionActivity.V0(confirmDeletionActivity)).subscribe(new C0217a(this), new b(this)));
            } else {
                h.k("rootlistOperation");
                throw null;
            }
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ ConfirmDeletionActivity a;

        b(ConfirmDeletionActivity confirmDeletionActivity) {
            this.a = confirmDeletionActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.setResult(0);
            this.a.finish();
        }
    }

    public static final /* synthetic */ String V0(ConfirmDeletionActivity confirmDeletionActivity) {
        String str = confirmDeletionActivity.I;
        if (str != null) {
            return str;
        }
        h.k("uri");
        throw null;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00bb: APUT  (r2v3 java.lang.Object[]), (0 ??[int, short, byte, char]), (r3v3 java.lang.Object) */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00db  */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            com.spotify.paste.widgets.DialogLayout r0 = new com.spotify.paste.widgets.DialogLayout
            r0.<init>(r9)
            r9.setContentView(r0)
            java.lang.String r1 = "We need the uri to the item to be deleted."
            java.lang.String r2 = "com.spotify.mobile.android.ui.activity.uri"
            java.lang.String r3 = "We need a non-null playlist or folder title"
            java.lang.String r4 = "com.spotify.mobile.android.ui.activity.name"
            java.lang.String r5 = ""
            r6 = 0
            r7 = 1
            if (r10 == 0) goto L_0x0041
            java.lang.ClassLoader r8 = r9.getClassLoader()
            r10.setClassLoader(r8)
            java.lang.String r4 = r10.getString(r4)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r5
            com.spotify.mobile.android.util.Assertion.f(r4, r3, r8)
            kotlin.jvm.internal.h.c(r4)
            r9.H = r4
            java.lang.String r10 = r10.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r5
            com.spotify.mobile.android.util.Assertion.c(r10, r1, r2)
            kotlin.jvm.internal.h.c(r10)
            r9.I = r10
            goto L_0x0069
        L_0x0041:
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r10 = r10.getStringExtra(r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r6] = r5
            com.spotify.mobile.android.util.Assertion.f(r10, r3, r4)
            kotlin.jvm.internal.h.c(r10)
            r9.H = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r10 = r10.getStringExtra(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r5
            com.spotify.mobile.android.util.Assertion.c(r10, r1, r2)
            kotlin.jvm.internal.h.c(r10)
            r9.I = r10
        L_0x0069:
            java.lang.String r10 = r9.I
            r1 = 0
            if (r10 == 0) goto L_0x00e1
            com.spotify.mobile.android.util.l0 r10 = com.spotify.mobile.android.util.l0.z(r10)
            r2 = -1
            java.lang.String r3 = "link"
            kotlin.jvm.internal.h.d(r10, r3)
            com.spotify.mobile.android.util.LinkType r3 = r10.q()
            if (r3 != 0) goto L_0x007f
            goto L_0x0093
        L_0x007f:
            int r3 = r3.ordinal()
            r4 = 64
            if (r3 == r4) goto L_0x00ac
            r4 = 185(0xb9, float:2.59E-43)
            if (r3 == r4) goto L_0x00a8
            r4 = 210(0xd2, float:2.94E-43)
            if (r3 == r4) goto L_0x00a8
            r4 = 272(0x110, float:3.81E-43)
            if (r3 == r4) goto L_0x00a8
        L_0x0093:
            java.lang.String r3 = "Trying to incorrectly delete link type :"
            java.lang.StringBuilder r3 = defpackage.je.V0(r3)
            com.spotify.mobile.android.util.LinkType r10 = r10.q()
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            com.spotify.mobile.android.util.Assertion.p(r10)
            goto L_0x00af
        L_0x00a8:
            r2 = 2132017660(0x7f1401fc, float:1.9673605E38)
            goto L_0x00af
        L_0x00ac:
            r2 = 2132017659(0x7f1401fb, float:1.9673603E38)
        L_0x00af:
            r0.setTitle(r2)
            r10 = 2132017656(0x7f1401f8, float:1.9673597E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = r9.H
            if (r3 == 0) goto L_0x00db
            r2[r6] = r3
            java.lang.String r10 = r9.getString(r10, r2)
            r0.setBody(r10)
            r10 = 2132017658(0x7f1401fa, float:1.96736E38)
            com.spotify.music.features.confirmdeletion.ConfirmDeletionActivity$a r1 = new com.spotify.music.features.confirmdeletion.ConfirmDeletionActivity$a
            r1.<init>(r9)
            r0.c(r10, r1)
            r10 = 2132017657(0x7f1401f9, float:1.9673599E38)
            com.spotify.music.features.confirmdeletion.ConfirmDeletionActivity$b r1 = new com.spotify.music.features.confirmdeletion.ConfirmDeletionActivity$b
            r1.<init>(r9)
            r0.a(r10, r1)
            return
        L_0x00db:
            java.lang.String r10 = "name"
            kotlin.jvm.internal.h.k(r10)
            throw r1
        L_0x00e1:
            java.lang.String r10 = "uri"
            kotlin.jvm.internal.h.k(r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.confirmdeletion.ConfirmDeletionActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        h.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        String str = this.H;
        if (str != null) {
            bundle.putString("com.spotify.mobile.android.ui.activity.name", str);
            String str2 = this.I;
            if (str2 != null) {
                bundle.putString("com.spotify.mobile.android.ui.activity.uri", str2);
            } else {
                h.k("uri");
                throw null;
            }
        } else {
            h.k("name");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.G.a();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.PLAYLIST_CONFIRMDELETE, null);
        h.d(b2, "PageViewObservable.creat…s.PLAYLIST_CONFIRMDELETE)");
        return b2;
    }
}
