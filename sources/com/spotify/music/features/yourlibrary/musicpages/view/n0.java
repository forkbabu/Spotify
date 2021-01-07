package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.view.k1;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class n0 {
    private final Context a;
    private final float b;
    private final int c;

    /* access modifiers changed from: private */
    public static class a implements m0 {
        private final View a;
        private final TextView b;
        private final Button c;

        public a(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(C0707R.id.title);
            this.c = (Button) view.findViewById(C0707R.id.button);
        }

        @Override // com.spotify.encore.ViewProvider
        public View getView() {
            return this.a;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.m0
        public Button l() {
            return this.c;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.m0
        public TextView n2() {
            return this.b;
        }
    }

    /* access modifiers changed from: private */
    public class b implements k1 {
        private final View a;
        private final TextView b;
        private final TextView c;
        private final ImageButton f;

        public b(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(C0707R.id.title);
            this.c = (TextView) view.findViewById(C0707R.id.subtitle);
            this.f = (ImageButton) view.findViewById(C0707R.id.collapse_button);
            q4.J(view, true);
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.k1
        public void K(boolean z) {
            ImageButton imageButton = this.f;
            Context context = n0.this.a;
            SpotifyIconV2 spotifyIconV2 = z ? SpotifyIconV2.CHART_DOWN : SpotifyIconV2.CHART_UP;
            float f2 = n0.this.b;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) n0.this.c);
            spotifyIconDrawable.r(context.getResources().getColor(R.color.white_70));
            imageButton.setImageDrawable(new LayerDrawable(new Drawable[]{context.getResources().getDrawable(C0707R.drawable.section_header_collapse_button_bg), new e(spotifyIconDrawable, f2, 0)}));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.k1
        public void d0(k1.a aVar) {
            this.f.setOnClickListener(new d(aVar));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.k1
        public void e1(boolean z) {
            this.f.setVisibility(z ? 0 : 8);
        }

        @Override // com.spotify.encore.ViewProvider
        public View getView() {
            return this.a;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.k1
        public void setSubtitle(String str) {
            this.c.setText(str);
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.k1
        public void setTitle(String str) {
            this.b.setText(str);
        }
    }

    /* access modifiers changed from: private */
    public static class c implements l1 {
        private final View a;
        private final TextView b;
        private final TextView c;

        public c(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(C0707R.id.title);
            this.c = (TextView) view.findViewById(C0707R.id.action);
            q4.J(view, true);
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.l1
        public TextView getActionView() {
            return this.c;
        }

        @Override // com.spotify.encore.ViewProvider
        public View getView() {
            return this.a;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.view.l1
        public void setTitle(String str) {
            this.b.setText(str);
        }
    }

    public n0(Context context) {
        this.a = context;
        int g = nud.g(16.0f, context.getResources());
        this.c = g;
        this.b = ((float) g) / ((float) nud.g(24.0f, context.getResources()));
    }

    public m0 d(ViewGroup viewGroup) {
        a aVar = new a(LayoutInflater.from(this.a).inflate(C0707R.layout.your_library_music_row_info_with_action, viewGroup, false));
        aVar.getView().setTag(C0707R.id.glue_viewholder_tag, aVar);
        return aVar;
    }

    public k1 e(Context context, ViewGroup viewGroup) {
        b bVar = new b(LayoutInflater.from(context).inflate(C0707R.layout.your_library_music_pages_section_header_row, viewGroup, false));
        bVar.getView().setTag(C0707R.id.glue_viewholder_tag, bVar);
        return bVar;
    }

    public l1 f(Context context, ViewGroup viewGroup) {
        c cVar = new c(LayoutInflater.from(context).inflate(C0707R.layout.your_library_music_row_section_header_with_action, viewGroup, false));
        cVar.getView().setTag(C0707R.id.glue_viewholder_tag, cVar);
        return cVar;
    }
}
