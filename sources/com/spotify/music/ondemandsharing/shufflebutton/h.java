package com.spotify.music.ondemandsharing.shufflebutton;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.n;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

public class h implements Object<View>, q, q {
    private final r a;
    private final c.a b;
    private c c;
    private String f;

    class a extends BroadcastReceiver {
        final /* synthetic */ View a;

        a(h hVar, View view) {
            this.a = view;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ShufflePlayHeaderView.a(new n(), this.a);
        }
    }

    class b implements View.OnAttachStateChangeListener {
        final /* synthetic */ BroadcastReceiver a;
        final /* synthetic */ Context b;

        b(BroadcastReceiver broadcastReceiver, Context context) {
            this.a = broadcastReceiver;
            this.b = context;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Context context = view.getContext();
            context.getClass();
            e6.b(context).c(this.a, new IntentFilter("on-demand-restricted"));
            h.this.a.a(h.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            e6.b(this.b).e(this.a);
        }
    }

    public h(r rVar, c.a aVar) {
        this.a = rVar;
        this.b = aVar;
    }

    @Override // com.spotify.music.ondemandsharing.shufflebutton.q
    public String a() {
        return this.f;
    }

    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        this.f = (String) s81.metadata().get("uri");
        t51.a(w51, view, s81);
    }

    public int d() {
        return C0707R.id.on_demand_sharing_round_button_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // com.spotify.music.ondemandsharing.shufflebutton.q
    public void f() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.b(false);
        }
    }

    @Override // com.spotify.music.ondemandsharing.shufflebutton.q
    public void g() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a(false);
        }
    }

    public View h(ViewGroup viewGroup, w51 w51) {
        Context context = viewGroup.getContext();
        c a2 = this.b.a(context);
        this.c = a2;
        a2.b(false);
        View view = this.c.getView();
        view.addOnAttachStateChangeListener(new b(new a(this, view), context));
        return view;
    }
}
