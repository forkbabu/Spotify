package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.f;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.l;
import java.util.List;
import java.util.Map;

public class FacePileDetailDialogActivity extends ss2 implements mfd, l, c.a {
    public static final /* synthetic */ int L = 0;
    e G;
    m H;
    ke6 I;
    String J;
    private k K;

    @Override // com.spotify.music.features.playlistentity.homemix.facepiledetail.l
    public void c0(Map<String, HomeMixUser> map, List<f> list) {
        this.K.d(map, list);
    }

    @Override // com.spotify.music.features.playlistentity.homemix.facepiledetail.l
    public void dismiss() {
        finish();
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.HOMEMIX_FACEPILEDETAIL;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.G0.b(this.J);
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        if (bundle != null) {
            str2 = bundle.getString("KEY_TRACK_URI");
            str = bundle.getString("KEY_PLAYLIST_URI");
        } else {
            str2 = getIntent().getStringExtra("KEY_TRACK_URI");
            str = getIntent().getStringExtra("KEY_PLAYLIST_URI");
        }
        if (MoreObjects.isNullOrEmpty(str2) || MoreObjects.isNullOrEmpty(str)) {
            finish();
            return;
        }
        k b = this.H.b(this.G.b(str, str2, this, this.I), LayoutInflater.from(this));
        this.K = b;
        setContentView(b.a());
    }

    @Override // com.spotify.music.features.playlistentity.homemix.facepiledetail.l
    public void q(l lVar) {
        this.K.c(lVar);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOMEMIX_FACEPILEDETAIL, null);
    }
}
