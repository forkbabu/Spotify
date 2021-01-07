package com.spotify.music.features.playlistentity.empty;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import io.reactivex.a;
import java.util.List;

/* access modifiers changed from: package-private */
public final class n implements m, l {
    private static final int o = n.class.hashCode();
    private final i a;
    private final Context b;
    private final Picasso c;
    private twd f;
    private EmptyPlaylistView n;

    public n(Context context, Picasso picasso, j jVar) {
        this.a = jVar.b();
        this.b = context;
        this.c = picasso;
    }

    private void w(TextView textView, Button button) {
        textView.setText(this.b.getString(C0707R.string.playlist_add_songs_description));
        button.setText(this.b.getString(C0707R.string.playlist_add_songs_button));
        button.setOnClickListener(new c(this));
    }

    @Override // com.spotify.music.features.playlistentity.empty.l
    public List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        this.f = twd;
        gb0 a2 = e90.c().a(this.b, viewGroup);
        a2.b2(true);
        a2.getTitleView().setSingleLine(false);
        a2.getTitleView().setEllipsize(null);
        w(a2.getTitleView(), a2.i());
        twd twd2 = this.f;
        v02 v02 = new v02(a2.getView(), false);
        int i = o;
        twd2.Z(v02, i);
        this.f.i0(i);
        EmptyPlaylistView emptyPlaylistView = new EmptyPlaylistView(this.b);
        this.n = emptyPlaylistView;
        emptyPlaylistView.setVisibility(8);
        return ImmutableList.of(this.n);
    }

    public /* synthetic */ void b(View view) {
        this.a.e();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.a.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public a g() {
        return this.a.b();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.a.a(this);
    }

    public /* synthetic */ void i(View view) {
        this.a.f();
    }

    public void j(String str, String str2) {
        this.n.f(str);
        if (str2 != null) {
            this.n.e(this.b.getString(C0707R.string.playlist_subtitle, str2));
        }
    }

    public void k(boolean z) {
        if (z) {
            w(this.n.b(), this.n.a());
            return;
        }
        TextView b2 = this.n.b();
        Button a2 = this.n.a();
        b2.setText(this.b.getString(C0707R.string.playlist_empty_view_others_playlist_description));
        a2.setText(this.b.getString(C0707R.string.playlist_empty_view_others_playlist_button));
        a2.setOnClickListener(new d(this));
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.h(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.i();
    }

    public void u(String str) {
        ImageView c2 = this.n.c();
        c2.getClass();
        z l = this.c.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        l.t(c2.getDrawable());
        l.v(C0707R.dimen.playlist_header_image_size, C0707R.dimen.playlist_header_image_size).a().g(yc0.f(this.b)).m(c2);
    }

    public void y(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
    }

    public void z(boolean z) {
        if (z) {
            this.f.l0(o);
        } else {
            this.f.i0(o);
        }
    }
}
