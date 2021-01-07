package com.spotify.music.features.partneraccountlinking.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.c;
import androidx.fragment.app.x;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.music.C0707R;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingLogger;
import com.spotify.music.features.partneraccountlinking.dialog.u;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;

public class PartnerAccountLinkingSlateFragment extends LifecycleListenableFragment implements u.a {
    public static final /* synthetic */ int l0 = 0;
    PartnerAccountLinkingLogger h0;
    u i0;
    private SlateView j0;
    private TextView k0;

    class a extends CardInteractionHandler.c {
        a() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
            PartnerAccountLinkingSlateFragment.this.L4();
            PartnerAccountLinkingSlateFragment.this.h0.b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void L4() {
        c B2 = B2();
        if (B2 != null) {
            x i = B2.v0().i();
            i.p(this);
            i.i();
        }
    }

    public /* synthetic */ void M4(View view) {
        L4();
        this.h0.a();
    }

    public /* synthetic */ View N4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = (TextView) layoutInflater.inflate(C0707R.layout.slate_account_linking_footer_view, viewGroup, false);
        this.k0 = textView;
        textView.setOnClickListener(new j(this));
        return this.k0;
    }

    public void O4() {
        L4();
        this.h0.c();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        SlateView slateView = this.j0;
        slateView.getClass();
        slateView.setFooter(new h(this));
        SlateView slateView2 = this.j0;
        slateView2.getClass();
        slateView2.setHeader(i.a);
        SlateView slateView3 = this.j0;
        slateView3.getClass();
        slateView3.d(this.i0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        TextView textView = this.k0;
        textView.getClass();
        textView.setVisibility(8);
        if (i2 == -1) {
            this.i0.e();
        } else {
            this.i0.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar = new a();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.slate_account_linking_container, viewGroup, false);
        SlateView slateView = (SlateView) viewGroup2.findViewById(C0707R.id.slate_view);
        this.j0 = slateView;
        slateView.setInteractionListener(aVar);
        return viewGroup2;
    }
}
