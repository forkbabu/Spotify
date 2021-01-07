package com.spotify.music.libs.thestage;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.libs.thestage.config.c;
import com.spotify.music.libs.web.WebViewFragment;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import dagger.android.support.a;
import io.reactivex.disposables.b;
import java.util.Locale;

public class TheStageFragment extends WebViewFragment {
    public static final /* synthetic */ int A0 = 0;
    h w0;
    g x0;
    private b y0;
    private Uri z0;

    public static void k5(TheStageFragment theStageFragment, Uri uri) {
        if (theStageFragment.Z4() != null) {
            theStageFragment.g5(uri.toString());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        SpotifyIconView spotifyIconView = (SpotifyIconView) view.findViewById(C0707R.id.btn_close);
        spotifyIconView.setOnClickListener(new b((TheStageActivity) j4()));
        spotifyIconView.setIcon(SpotifyIconV2.X);
        this.x0.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public int Y4() {
        return C0707R.layout.fragment_the_stage;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public boolean a5(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = this.z0.getHost();
        if (host != null) {
            return this.w0.a(j4(), host, uri);
        }
        throw new IllegalStateException("The URI supplied to The Stage has no host.");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void b5() {
        this.y0 = this.w0.c(this.z0, new a(this)).subscribe();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void c5(String str) {
        this.x0.d(Uri.parse(str).buildUpon().clearQuery().build().toString());
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void d5(int i, String str, String str2) {
        this.x0.b(String.format(Locale.ENGLISH, "Web Error: %d %s when loading %s", Integer.valueOf(i), str, str2));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.web.WebViewFragment
    public void e5(SslError sslError) {
        g gVar = this.x0;
        StringBuilder V0 = je.V0("SSL Error: ");
        V0.append(sslError.toString());
        gVar.b(V0.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
        Bundle D2 = D2();
        if (D2 != null) {
            c cVar = (c) D2.getParcelable("the_stage_view_config");
            if (cVar != null) {
                this.z0 = cVar.b().g();
                return;
            }
            throw new IllegalStateException("TheStageViewConfig is missing");
        }
        throw new IllegalStateException("TheStageFragment has no arguments");
    }

    @Override // com.spotify.music.libs.web.WebViewFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.y0.dispose();
        this.x0.a();
    }
}
