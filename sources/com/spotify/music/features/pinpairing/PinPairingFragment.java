package com.spotify.music.features.pinpairing;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.fragment.app.c;
import com.spotify.music.libs.web.WebViewFragment;
import io.reactivex.disposables.a;
import io.reactivex.y;
import java.net.HttpCookie;

public class PinPairingFragment extends WebViewFragment {
    public static final /* synthetic */ int B0 = 0;
    private final a A0 = new a();
    i w0;
    y x0;
    CookieManager y0;
    private String z0;

    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        this.A0.b(this.w0.a().B(this.x0).p(new c(this)).subscribe(new a(this), b.a));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void c5(String str) {
        c B2;
        if (str.contains("#close") && (B2 = B2()) != null) {
            B2.finish();
        }
    }

    public void k5(HttpCookie httpCookie) {
        String str = this.z0;
        if (Z4() != null) {
            g5(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        B4(true);
        f5(false);
        String string = k4().getString("pairing-url");
        if (TextUtils.isEmpty(string)) {
            this.z0 = "about:blank";
        } else {
            this.z0 = string;
        }
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public void y3() {
        this.A0.dispose();
        super.y3();
    }
}
