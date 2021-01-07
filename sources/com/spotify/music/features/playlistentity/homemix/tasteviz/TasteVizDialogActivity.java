package com.spotify.music.features.playlistentity.homemix.tasteviz;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.h;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import java.util.List;
import java.util.Map;

public class TasteVizDialogActivity extends ss2 implements mfd, q, c.a {
    public static final /* synthetic */ int K = 0;
    o G;
    r H;
    String I;
    private p J;

    @Override // com.spotify.music.features.playlistentity.homemix.tasteviz.q
    public void T(HomeMixPlanType homeMixPlanType, String str, List<h> list, Map<String, HomeMixUser> map, int i) {
        this.J.e(homeMixPlanType, str, list, map, i);
    }

    @Override // com.spotify.music.features.playlistentity.homemix.tasteviz.q
    public void dismiss() {
        finish();
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.HOMEMIX_GENRESPAGE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.G0.b(this.I);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        if (bundle != null) {
            bool = Boolean.valueOf(bundle.getBoolean("KEY_IS_WELCOME_SCREEN"));
        } else {
            bool = Boolean.valueOf(getIntent().getBooleanExtra("KEY_IS_WELCOME_SCREEN", false));
        }
        if (MoreObjects.isNullOrEmpty(this.I)) {
            finish();
            return;
        }
        p b = this.H.b(this.G.b(bool, this), LayoutInflater.from(this));
        this.J = b;
        setContentView(b.a());
    }

    @Override // com.spotify.music.features.playlistentity.homemix.tasteviz.q
    public void q0(HomeMixPlanType homeMixPlanType) {
        startActivity(new Intent("android.intent.action.VIEW", homeMixPlanType.g(this)));
        finish();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOMEMIX_GENRESPAGE, null);
    }
}
