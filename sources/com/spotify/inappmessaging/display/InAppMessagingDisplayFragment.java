package com.spotify.inappmessaging.display;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.Constants;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.InAppMessagingLogger;
import com.spotify.music.C0707R;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class InAppMessagingDisplayFragment extends Fragment {
    o g0;
    n h0;
    m i0;
    fp0 j0;
    gp0 k0;
    private WebView l0;
    private View m0;

    public static class a implements e {
        private final gp0 a;
        private final fp0 b;

        public a(gp0 gp0, fp0 fp0) {
            this.a = gp0;
            this.b = fp0;
        }

        @Override // com.spotify.inappmessaging.display.e
        public InAppMessagingDisplayFragment build() {
            fp0 fp0 = this.b;
            gp0 gp0 = this.a;
            InAppMessagingDisplayFragment inAppMessagingDisplayFragment = new InAppMessagingDisplayFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("message_extra", fp0);
            bundle.putParcelable("trigger_extra", gp0);
            inAppMessagingDisplayFragment.r4(bundle);
            return inAppMessagingDisplayFragment;
        }

        @Override // com.spotify.inappmessaging.display.e
        public FormatType getFormat() {
            return this.b.c();
        }
    }

    public InAppMessagingDisplayFragment() {
        new HashMap();
    }

    public void K4(Set<String> set) {
        this.g0.b(set);
    }

    public void L4(InAppMessagingLogger.DismissType dismissType) {
        this.g0.c(dismissType);
    }

    public String M4() {
        return this.j0.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putBoolean("has_logged_impression", this.g0.a);
    }

    public gp0 N4() {
        return this.k0;
    }

    public /* synthetic */ void O4(boolean z) {
        this.m0.setVisibility(z ? 0 : 8);
    }

    public void P4(boolean z) {
        new Handler(Looper.getMainLooper()).post(new c(this, z));
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            this.m0 = layoutInflater.inflate(C0707R.layout.iam_webview_fragment, viewGroup, false);
            if (bundle != null) {
                o oVar = this.g0;
                oVar.getClass();
                oVar.a = bundle.getBoolean("has_logged_impression", false);
            }
            this.l0 = (WebView) this.m0.findViewById(C0707R.id.iam_webview);
            this.i0.a((TouchBoundaryFrameLayout) this.m0);
            this.l0.setBackgroundColor(0);
            this.l0.getSettings().setTextZoom(100);
            this.l0.setHorizontalScrollBarEnabled(false);
            this.l0.setVerticalScrollBarEnabled(false);
            this.l0.setWebViewClient(new WebViewClient());
            this.l0.getSettings().setJavaScriptEnabled(true);
            this.l0.setAccessibilityDelegate(new View.AccessibilityDelegate());
            this.l0.addJavascriptInterface(this.i0, "Android");
            this.l0.loadData(Base64.encodeToString(this.j0.e().getBytes(Charset.forName(Constants.ENCODING)), 0), "text/html; charset=utf-8", "base64");
            return this.m0;
        } catch (Exception unused) {
            this.g0.b(Collections.singleton("WEBVIEW_INFLATION_ERROR"));
            this.h0.dismiss();
            return null;
        }
    }
}
