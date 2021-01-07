package com.spotify.music.features.checkout.web;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.features.checkout.web.l;
import com.spotify.music.libs.web.WebViewFragment;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import dagger.android.support.a;
import defpackage.nl4;
import defpackage.ql4;
import defpackage.tl4;
import io.reactivex.disposables.b;
import io.reactivex.y;

public class PremiumSignupFragment extends WebViewFragment implements l.a, ql4.a, tl4.a, nl4.a {
    public static final /* synthetic */ int D0 = 0;
    y A0;
    jl4 B0;
    hl4 C0;
    private Uri w0;
    private b x0;
    private SpotifyIconView y0;
    private l z0;

    public static void l5(PremiumSignupFragment premiumSignupFragment, String str) {
        if (premiumSignupFragment.Z4() != null) {
            premiumSignupFragment.g5(str);
        } else {
            Assertion.g("Attempted to render url while view was detached.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        SpotifyIconView spotifyIconView = (SpotifyIconView) view.findViewById(C0707R.id.btn_close);
        this.y0 = spotifyIconView;
        spotifyIconView.setOnClickListener(new d(this));
        this.y0.setIcon(SpotifyIconV2.X);
        TextView textView = (TextView) view.findViewById(C0707R.id.premium_signup_title);
        String g = k5().g();
        if (g == null) {
            g = R2().getString(C0707R.string.premium_signup_title);
        }
        textView.setText(g);
        if (bundle != null) {
            this.z0.c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public int Y4() {
        return C0707R.layout.fragment_premium_signup;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean a5(Uri uri) {
        return this.B0.a(uri);
    }

    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean b() {
        return this.z0.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        this.x0 = this.C0.a(this.w0).o0(this.A0).N0(1).j0(e.a).subscribe(new b(this), c.a);
    }

    @Override // defpackage.ql4.a
    public void f2(Intent intent) {
        G4(intent, null);
    }

    public i k5() {
        Bundle D2 = D2();
        if (D2 != null) {
            i iVar = (i) D2.getParcelable("premium_signup_configuration");
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("PremiumSignupFragment is not configured");
        }
        throw new IllegalStateException("PremiumSignupFragment has no arguments");
    }

    public /* synthetic */ void m5(View view) {
        this.z0.b();
    }

    public boolean n5() {
        return g.b(Z4()).a();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        Uri uri;
        a.a(this);
        super.p3(context);
        i k5 = k5();
        if (k5.e()) {
            uri = new h().a(k5.h());
        } else {
            uri = k5.h();
        }
        this.w0 = uri;
        this.z0 = new l(this, new k());
    }

    @Override // defpackage.tl4.a
    public void s0(Intent intent) {
        G4(intent, null);
        Z4().stopLoading();
        c B2 = B2();
        if (B2 != null) {
            B2.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        B4(true);
    }

    @Override // defpackage.nl4.a
    public void x0(String str) {
        Intent intent = new Intent();
        intent.putExtra("reason", str);
        c B2 = B2();
        if (B2 != null) {
            B2.setResult(-1, intent);
            B2.finish();
        }
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public void y3() {
        b bVar = this.x0;
        if (bVar != null) {
            bVar.dispose();
        }
        super.y3();
    }
}
