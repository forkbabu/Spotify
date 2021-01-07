package com.spotify.music.features.profile.editprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.n0;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import defpackage.lm7;
import defpackage.mn7;
import kotlin.jvm.internal.h;

public class EditProfileActivity extends ss2 {
    public static final /* synthetic */ int L = 0;
    zac G;
    on7 H;
    hn7 I;
    private nn7 J;
    private t0<mn7> K;

    class a extends b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            EditProfileActivity.this.I.accept(lm7.i.a);
        }
    }

    public /* synthetic */ s0 U0(mn7 mn7) {
        nn7 b = this.H.b(this, mn7);
        this.J = b;
        return b;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            Logger.d("Edit profile: Unknown activity request code", new Object[0]);
        } else if (i2 == -1) {
            if (intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                hn7 hn7 = this.I;
                String uri = data.toString();
                h.e(uri, "imageUri");
                hn7.accept(new lm7.m(uri));
            }
        } else if (i2 == 100) {
            this.I.accept(lm7.l.a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("user-name");
        String stringExtra2 = intent.getStringExtra("display-name");
        String stringExtra3 = intent.getStringExtra("image-url");
        boolean booleanExtra = intent.getBooleanExtra("has-spotify-image", false);
        int intExtra = intent.getIntExtra("color", 0);
        mn7.a a2 = mn7.a();
        a2.f(stringExtra);
        a2.c(stringExtra2);
        a2.e(stringExtra3);
        a2.d(booleanExtra);
        a2.b(intExtra);
        this.K = this.G.a(n0.c(a2.a()));
        PageLoaderView.a b = this.G.b(ViewUris.M, u0());
        b.e(new h(this));
        PageLoaderView a3 = b.a(this);
        a3.j0(this, this.K);
        setContentView(a3);
        S0().a(new a(true));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.K.stop();
    }

    @Override // androidx.fragment.app.c, android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            z = true;
        }
        if (i == 0) {
            this.I.accept(new lm7.r(z));
        } else if (i == 1) {
            this.I.accept(new lm7.d(z));
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.K.start();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PROFILE_EDIT, null);
    }
}
