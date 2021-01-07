package com.spotify.music.slate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;
import com.spotify.music.slate.model.t;

public class SlateModalActivity extends ss2 {
    public static final /* synthetic */ int L = 0;
    private SlateView G;
    t H;
    a3d I;
    private View J;
    private View K;

    class a implements b3d {

        /* renamed from: com.spotify.music.slate.SlateModalActivity$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC0343a implements View.OnClickListener {
            View$OnClickListenerC0343a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SlateModalActivity slateModalActivity = SlateModalActivity.this;
                int i = SlateModalActivity.L;
                slateModalActivity.setResult(102);
                slateModalActivity.finish();
            }
        }

        a() {
        }

        @Override // defpackage.b3d
        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            SlateModalActivity.this.J = layoutInflater.inflate(C0707R.layout.slate_modal_dismiss, viewGroup, false);
            SlateModalActivity.this.H.c().a((TextView) SlateModalActivity.this.J.findViewById(C0707R.id.negative_action));
            SlateModalActivity.this.J.setOnClickListener(new View$OnClickListenerC0343a());
            return SlateModalActivity.this.J;
        }
    }

    class b implements b3d {
        b() {
        }

        @Override // defpackage.b3d
        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            SlateModalActivity.this.K = layoutInflater.inflate(C0707R.layout.slate_header_spotify_icon, viewGroup, false);
            return SlateModalActivity.this.K;
        }
    }

    class c extends CardInteractionHandler.c {
        c() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
            SlateModalActivity slateModalActivity = SlateModalActivity.this;
            int i = SlateModalActivity.L;
            slateModalActivity.setResult(103);
            slateModalActivity.finish();
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.c, com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void m() {
            SlateModalActivity.this.K.setVisibility(0);
            SlateModalActivity.this.J.setVisibility(0);
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.c, com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void s() {
            SlateModalActivity.this.K.setVisibility(8);
            SlateModalActivity.this.J.setVisibility(8);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(103);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SlateView slateView = new SlateView(this);
        this.G = slateView;
        setContentView(slateView);
        this.G.setFooter(new a());
        this.G.setHeader(new b());
        this.G.d(this.I);
        this.G.setInteractionListener(new c());
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(b.a);
    }
}
