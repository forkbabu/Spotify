package com.spotify.music.utterancesuggestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import defpackage.s51;
import java.util.EnumSet;

public final class h extends d.a<a> {

    public static final class a extends s51.c.a<View> {
        private final TextView b;
        private final ImageButton c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            kotlin.jvm.internal.h.e(view, "view");
            View findViewById = view.findViewById(C0707R.id.utterance);
            kotlin.jvm.internal.h.d(findViewById, "view.findViewById(R.id.utterance)");
            this.b = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0707R.id.closeButton);
            kotlin.jvm.internal.h.d(findViewById2, "view.findViewById(R.id.closeButton)");
            this.c = (ImageButton) findViewById2;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            kotlin.jvm.internal.h.e(s81, "data");
            kotlin.jvm.internal.h.e(w51, "config");
            kotlin.jvm.internal.h.e(bVar, "state");
            TextView textView = this.b;
            String title = s81.text().title();
            if (title == null) {
                title = "";
            }
            textView.setText(title);
            ImageButton imageButton = this.c;
            Context context = this.c.getContext();
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.X;
            Context context2 = this.c.getContext();
            kotlin.jvm.internal.h.d(context2, "closeButton.context");
            imageButton.setImageDrawable(new SpotifyIconDrawable(context, spotifyIconV2, context2.getResources().getDimension(R.dimen.spacer_24)));
        }
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        kotlin.jvm.internal.h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.utterance_suggestion_component, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "view");
        return new a(inflate);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        GlueLayoutTraits.Trait trait = GlueLayoutTraits.Trait.CARD;
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(trait, trait);
        kotlin.jvm.internal.h.d(of, "EnumSet.of(GlueLayoutTra…eLayoutTraits.Trait.CARD)");
        return of;
    }
}
