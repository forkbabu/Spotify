package com.spotify.music.libs.ageverification;

import android.os.Bundle;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.slate.container.view.SlateView;

public class AgeVerificationDialogActivity extends ss2 implements l, c.a, mfd {
    public static final /* synthetic */ int H = 0;
    j G;

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.AGE_VERIFICATION;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.a0;
    }

    @Override // com.spotify.music.libs.ageverification.l
    public void h() {
        setResult(103);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null || getIntent().getExtras().getString("EXTRA_ENTITY_URI") == null) {
            finish();
            return;
        }
        String string = getIntent().getExtras().getString("EXTRA_ENTITY_URI");
        string.getClass();
        String string2 = getIntent().getExtras().getString("EXTRA_COVER_ART_URI");
        SlateView slateView = new SlateView(this);
        setContentView(slateView);
        bz9 bz9 = new bz9(slateView);
        j jVar = this.G;
        ((ty9) jVar).h(bz9, this, string, string2, getResources().getColor(R.color.gray_30));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ty9) this.G).d();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.AGE_VERIFICATION, ViewUris.a0.toString());
    }

    @Override // com.spotify.music.libs.ageverification.l
    public void w() {
        setResult(101);
        finish();
    }
}
