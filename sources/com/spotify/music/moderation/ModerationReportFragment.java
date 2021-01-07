package com.spotify.music.moderation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.music.libs.web.WebViewFragment;
import com.spotify.music.libs.web.d;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import dagger.android.support.a;
import io.reactivex.disposables.b;
import java.util.HashMap;

public class ModerationReportFragment extends WebViewFragment implements e {
    public static final /* synthetic */ int A0 = 0;
    private b w0;
    i x0;
    d y0;
    ckb z0;

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        this.y0.a(this);
        ((SpotifyIconView) view.findViewById(C0707R.id.moderation_close_button)).setOnClickListener(new c(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public int Y4() {
        return C0707R.layout.fragment_moderation;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean a5(Uri uri) {
        if ("app-report.spotify.com".equals(uri.getHost()) || F2() == null) {
            return false;
        }
        F2().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean b() {
        return this.y0.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        Bundle D2 = D2();
        if (D2 != null) {
            yjb yjb = (yjb) D2.getParcelable("moderation_view_config");
            if (yjb != null) {
                this.w0 = this.z0.a().subscribe(new a(this, yjb), new b(yjb));
                return;
            }
            throw new IllegalStateException("ViewConfig is missing");
        }
        throw new IllegalStateException("ModerationReportFragment has no arguments");
    }

    public void k5(yjb yjb, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", str);
        String a = this.x0.a(yjb);
        if (Z4() != null) {
            h5(a, hashMap);
        }
    }

    public boolean l5() {
        return d.b(Z4()).a();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        B4(true);
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.w0.dispose();
    }
}
