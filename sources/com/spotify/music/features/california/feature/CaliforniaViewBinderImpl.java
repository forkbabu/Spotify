package com.spotify.music.features.california.feature;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.d;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class CaliforniaViewBinderImpl implements i {
    private final d a = kotlin.a.b(new CaliforniaViewBinderImpl$placeholder$2(this));
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private cmf<f> h;
    private final Button i;
    private final Picasso j;

    static final class a implements View.OnClickListener {
        final /* synthetic */ CaliforniaViewBinderImpl a;

        a(CaliforniaViewBinderImpl californiaViewBinderImpl) {
            this.a = californiaViewBinderImpl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cmf<f> d = this.a.d();
            if (d != null) {
                d.invoke();
            }
        }
    }

    public CaliforniaViewBinderImpl(Picasso picasso, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(picasso, "picasso");
        h.e(layoutInflater, "inflater");
        this.j = picasso;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_california, viewGroup, false);
        h.d(inflate, "inflater.inflate(R.layou…alifornia, parent, false)");
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(C0707R.id.userName);
        this.d = (TextView) inflate.findViewById(C0707R.id.employeeLabel);
        this.e = (TextView) inflate.findViewById(C0707R.id.trackName);
        this.f = (TextView) inflate.findViewById(C0707R.id.trackArtist);
        this.g = (ImageView) inflate.findViewById(C0707R.id.trackArt);
        Button button = (Button) inflate.findViewById(C0707R.id.playButton);
        button.setOnClickListener(new a(this));
        this.i = button;
    }

    @Override // com.spotify.music.features.california.feature.i
    public void a(String str, boolean z) {
        h.e(str, "userName");
        TextView textView = this.c;
        h.d(textView, "userNameView");
        int i2 = 0;
        textView.setText(this.b.getResources().getString(C0707R.string.label_welcome_user, str));
        TextView textView2 = this.d;
        h.d(textView2, "employeeLabel");
        if (!z) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
    }

    @Override // com.spotify.music.features.california.feature.i
    public void b(cmf<f> cmf) {
        this.h = cmf;
    }

    @Override // com.spotify.music.features.california.feature.i
    public void c(String str, String str2, String str3, m mVar) {
        h.e(str, "trackName");
        h.e(str2, "artistName");
        h.e(str3, "imageUri");
        h.e(mVar, "playerCurrentState");
        TextView textView = this.e;
        h.d(textView, "trackNameView");
        textView.setText(str);
        TextView textView2 = this.f;
        h.d(textView2, "trackArtistView");
        textView2.setText(str2);
        Picasso picasso = this.j;
        if (e.n(str3)) {
            str3 = "empty_uri";
        }
        z m = picasso.m(str3);
        m.t((Drawable) this.a.getValue());
        m.g((Drawable) this.a.getValue());
        m.n(this.g, null);
        Button button = this.i;
        h.d(button, "playButton");
        button.setEnabled(mVar.b());
        Button button2 = this.i;
        h.d(button2, "playButton");
        button2.setText(this.b.getResources().getString((!mVar.b() || mVar.a()) ? C0707R.string.label_play : C0707R.string.label_pause));
    }

    public cmf<f> d() {
        return this.h;
    }

    public final View e() {
        return this.b;
    }
}
