package com.spotify.glue.dialogs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* access modifiers changed from: package-private */
public class i implements e {
    private TextView a;
    private TextView b;
    private ImageView c;
    private String d;
    private String e;
    private SpotifyIconV2 f;

    i() {
    }

    private void d() {
        if (this.c != null) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.c.getContext(), this.f, (float) nud.g((float) 120, this.c.getResources()));
            spotifyIconDrawable.r(-16777216);
            spotifyIconDrawable.l();
            this.c.setImageDrawable(spotifyIconDrawable);
        }
    }

    @Override // com.spotify.glue.dialogs.e
    public void a() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.glue_dialog_content_connect_style, viewGroup, true);
        this.a = (TextView) inflate.findViewById(C0707R.id.target);
        this.b = (TextView) inflate.findViewById(C0707R.id.title);
        this.c = (ImageView) inflate.findViewById(C0707R.id.icon);
        if (!inflate.isInEditMode()) {
            if (this.c != null) {
                TextView[] textViewArr = {this.a};
                vc0.i(textViewArr);
                vc0.h(textViewArr);
            } else {
                vc0.h(this.a);
            }
            vc0.i(this.b);
            vc0.g(inflate);
        }
        this.a.setText(this.d);
        this.b.setText(this.e);
        d();
    }

    @Override // com.spotify.glue.dialogs.e
    public int c() {
        return (int) Math.ceil((double) Math.abs(this.b.getPaint().getFontMetrics().descent));
    }

    public void e(SpotifyIconV2 spotifyIconV2) {
        this.f = spotifyIconV2;
        d();
    }

    public void f(String str) {
        this.d = str;
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void g(String str) {
        this.e = str;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
