package com.spotify.music.homecomponents.dialogs.showmore;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final TextView f;
    private final SpotifyIconView n;
    private final RecyclerView o;
    private final TextView p;
    private final ColorDrawable q;
    private final String r;
    private final r s;
    private final SpotifyIconDrawable t;
    private final Activity u;

    static final class a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ cmf a;

        b(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    public e(Activity activity, Picasso picasso) {
        h.e(activity, "activity");
        h.e(picasso, "picasso");
        this.u = activity;
        View inflate = LayoutInflater.from(activity).inflate(C0707R.layout.home_show_more_dialog, (ViewGroup) null);
        h.d(inflate, "LayoutInflater.from(acti…e_show_more_dialog, null)");
        this.a = inflate;
        View G = q4.G(inflate, C0707R.id.show_more_header_image);
        h.d(G, "ViewCompat.requireViewBy…d.show_more_header_image)");
        this.b = (ImageView) G;
        View G2 = q4.G(inflate, C0707R.id.show_more_header_title);
        h.d(G2, "ViewCompat.requireViewBy…d.show_more_header_title)");
        this.c = (TextView) G2;
        View G3 = q4.G(inflate, C0707R.id.show_more_header_subtitle);
        h.d(G3, "ViewCompat.requireViewBy…how_more_header_subtitle)");
        this.f = (TextView) G3;
        View G4 = q4.G(inflate, C0707R.id.show_more_header_accessory);
        h.d(G4, "ViewCompat.requireViewBy…ow_more_header_accessory)");
        SpotifyIconView spotifyIconView = (SpotifyIconView) G4;
        this.n = spotifyIconView;
        View G5 = q4.G(inflate, C0707R.id.show_more_content_recycler);
        h.d(G5, "ViewCompat.requireViewBy…ow_more_content_recycler)");
        this.o = (RecyclerView) G5;
        View G6 = q4.G(inflate, C0707R.id.show_more_footer_action);
        h.d(G6, "ViewCompat.requireViewBy….show_more_footer_action)");
        TextView textView = (TextView) G6;
        this.p = textView;
        androidx.core.content.a.b(activity, C0707R.color.home_title_text_default);
        androidx.core.content.a.b(activity, C0707R.color.home_green_highlight);
        this.q = new ColorDrawable(androidx.core.content.a.b(activity, R.color.gray_15));
        String string = activity.getString(C0707R.string.home_show_more_footer_default_text);
        h.d(string, "activity.getString(R.str…more_footer_default_text)");
        this.r = string;
        this.s = new r(new c0(picasso), activity);
        this.t = new SpotifyIconDrawable(activity, SpotifyIconV2.CHEVRON_UP, (float) nud.g(10.0f, activity.getResources()));
        dvd.a(textView).a();
        dvd.a(spotifyIconView).a();
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void K0(Uri uri) {
        h.e(uri, "imageUri");
        z c2 = this.s.c(uri);
        c2.t(this.q);
        c2.g(this.q);
        c2.m(this.b);
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void R0(String str) {
        h.e(str, "text");
        TextView textView = this.p;
        if (kotlin.text.e.n(str)) {
            str = this.r;
        }
        textView.setText(str);
        this.t.m(0, 0, 0, 0);
        this.p.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.t, (Drawable) null);
        this.p.setCompoundDrawablePadding(nud.g(8.0f, this.u.getResources()));
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void R1() {
        this.c.setText("");
        this.c.setVisibility(8);
        this.f.setText("");
        this.f.setVisibility(8);
        this.b.setImageDrawable(this.q);
        this.n.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void U(cmf<f> cmf) {
        h.e(cmf, "onClick");
        this.n.setVisibility(0);
        this.n.setOnClickListener(new a(cmf));
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void W0(List<String> list) {
        h.e(list, "items");
        this.o.getAdapter();
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void a2(cmf<f> cmf) {
        h.e(cmf, "onClick");
        this.p.setOnClickListener(new b(cmf));
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void setSubtitle(String str) {
        h.e(str, ContextTrack.Metadata.KEY_SUBTITLE);
        this.f.setVisibility(0);
        this.f.setText(str);
    }

    @Override // com.spotify.music.homecomponents.dialogs.showmore.d
    public void setTitle(String str) {
        h.e(str, "title");
        this.c.setVisibility(0);
        this.c.setText(str);
    }
}
