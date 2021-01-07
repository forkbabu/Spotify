package com.spotify.music.features.partneraccountlinking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.sso.util.b;
import com.spotify.music.C0707R;
import dagger.android.support.DaggerFragment;

public class PartnerAccountLinkingFragment extends DaggerFragment implements l {
    k h0;
    b i0;
    sv5 j0;
    r k0;
    private boolean l0;

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        if (this.l0) {
            j4().finish();
        }
        super.P3();
    }

    @Override // com.spotify.music.features.partneraccountlinking.l
    public void U0(q qVar) {
        Uri uri;
        this.k0.getClass();
        int i = 0;
        Intent intent = null;
        if (qVar.b() != null) {
            this.k0.getClass();
            if (qVar.b() == null) {
                uri = Uri.EMPTY;
            } else {
                Uri.Builder buildUpon = Uri.parse(qVar.b()).buildUpon();
                if (qVar.c() != null) {
                    buildUpon.appendQueryParameter("state", qVar.c());
                }
                if (qVar.a() != null) {
                    buildUpon.appendQueryParameter("error_description", qVar.a().a());
                    buildUpon.appendQueryParameter("error_code", qVar.a().b().d());
                }
                uri = buildUpon.build();
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            if (intent2.resolveActivity(j4().getPackageManager()) != null) {
                G4(intent2, null);
                this.l0 = true;
                return;
            }
            Logger.d("Failed to redirect to %s", uri.toString());
            j4().finish();
            return;
        }
        c j4 = j4();
        this.k0.getClass();
        if (qVar.a() == null) {
            i = -1;
        }
        this.k0.getClass();
        if (qVar.a() != null) {
            intent = new Intent();
            intent.putExtra(AppProtocol.LogMessage.SEVERITY_ERROR, qVar.a().b().d());
            intent.putExtra("error_message", qVar.a().a());
        }
        j4.setResult(i, intent);
        j4().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        if (!this.j0.b(i, i2, intent)) {
            this.h0.b(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.h0.c(k4().getString("data", null));
        this.j0.c(new a(this));
    }

    @Override // com.spotify.music.features.partneraccountlinking.l
    public void w0(int i) {
        H4(this.i0.a(j4()), i, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.fragment_account_linking, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        this.h0.teardown();
        this.j0.a();
        super.x3();
    }
}
