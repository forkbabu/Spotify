package com.spotify.music.sociallistening.dialogs.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;
import kotlin.jvm.internal.h;

public final class SocialListeningEducationActivity extends ss2 implements a3d {
    public static final /* synthetic */ int H = 0;
    private String G;

    static final class a implements View.OnClickListener {
        final /* synthetic */ SocialListeningEducationActivity a;

        a(SocialListeningEducationActivity socialListeningEducationActivity) {
            this.a = socialListeningEducationActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SocialListeningEducationActivity socialListeningEducationActivity = this.a;
            int i = SocialListeningEducationActivity.H;
            socialListeningEducationActivity.finish();
        }
    }

    static final class b implements b3d {
        public static final b a = new b();

        b() {
        }

        @Override // defpackage.b3d
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.slate_header_spotify_icon, viewGroup, false);
        }
    }

    public static final class c implements CardInteractionHandler.b {
        final /* synthetic */ SocialListeningEducationActivity a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(SocialListeningEducationActivity socialListeningEducationActivity) {
            this.a = socialListeningEducationActivity;
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
            SocialListeningEducationActivity socialListeningEducationActivity = this.a;
            int i = SocialListeningEducationActivity.H;
            socialListeningEducationActivity.finish();
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void b() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void c(double d, float f, CardInteractionHandler.SwipeDirection swipeDirection) {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void m() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void s() {
        }
    }

    @Override // defpackage.a3d
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parent");
        View inflate = layoutInflater.inflate(C0707R.layout.education_dialog, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.title);
        h.d(textView, "titleTextView");
        String str = this.G;
        if (str != null) {
            textView.setText(str);
            ((Button) inflate.findViewById(C0707R.id.confirm_button)).setOnClickListener(new a(this));
            h.d(inflate, "slateContent");
            return inflate;
        }
        h.k("title");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.G = stringExtra;
        SlateView slateView = new SlateView(this);
        setContentView(slateView);
        slateView.d(this);
        slateView.setHeader(b.a);
        slateView.setInteractionListener(new c(this));
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 b2 = ij9.b(PageIdentifiers.SOCIAL_LISTENING_EDUCATION, null);
        h.d(b2, "PageViewObservable.creat…CIAL_LISTENING_EDUCATION)");
        return b2;
    }
}
