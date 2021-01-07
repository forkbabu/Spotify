package com.spotify.music.ondemandsharing.shufflebutton;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

public class m implements Object<Button>, q, q {
    private final r a;
    private Button b;
    private String c;

    public m(r rVar) {
        this.a = rVar;
    }

    @Override // com.spotify.music.ondemandsharing.shufflebutton.q
    public String a() {
        return this.c;
    }

    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        g91.a((Button) view, s81, aVar, iArr);
    }

    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        this.c = (String) s81.metadata().get("uri");
        t51.a(w51, (Button) view, s81);
    }

    public int d() {
        return C0707R.id.on_demand_sharing_shuffle_button_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // com.spotify.music.ondemandsharing.shufflebutton.q
    public void f() {
        this.b.setText(C0707R.string.header_play);
    }

    @Override // com.spotify.music.ondemandsharing.shufflebutton.q
    public void g() {
        this.b.setText(C0707R.string.header_pause);
    }

    public View h(ViewGroup viewGroup, w51 w51) {
        Button button;
        Context context = viewGroup.getContext();
        Context context2 = viewGroup.getContext();
        context2.getClass();
        if (x.f(context2)) {
            button = l70.h(context2, "", SpotifyIconV2.PLAY, null);
        } else {
            button = c.g().a(context2);
            button.setText(C0707R.string.header_play);
        }
        this.b = button;
        this.b.addOnAttachStateChangeListener(new l(this, new k(this), context));
        return this.b;
    }
}
