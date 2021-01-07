package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.paste.widgets.internal.a;
import com.spotify.paste.widgets.internal.b;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: cs8  reason: default package */
public final class cs8 implements ds8 {
    private final ns8 a;
    private final View b;
    private final TextView c;
    private final TextView f;
    private final TextView n;
    private final ImageView o;
    private final ViewGroup p;
    private final a q;

    public cs8(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        ns8 b2 = ns8.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        h.d(b2, "TopicEpisodeRowBinding.i…      parent, false\n    )");
        this.a = b2;
        ConstraintLayout a2 = b2.a();
        h.d(a2, "binding.root");
        this.b = a2;
        TextView textView = b2.f;
        h.d(textView, "binding.title");
        this.c = textView;
        TextView textView2 = b2.e;
        h.d(textView2, "binding.subtitle");
        this.f = textView2;
        TextView textView3 = b2.d;
        h.d(textView3, "binding.metadata");
        this.n = textView3;
        ImageView imageView = b2.c;
        h.d(imageView, "binding.imageView");
        this.o = imageView;
        FrameLayout frameLayout = b2.b;
        h.d(frameLayout, "binding.accessory");
        this.p = frameLayout;
        this.q = new a(frameLayout);
        bvd c2 = dvd.c(a2);
        c2.f(imageView);
        c2.g(textView, textView2, textView3);
        c2.a();
    }

    private final void b(View view, CharSequence charSequence) {
        int i = 0;
        if (charSequence.length() == 0) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // defpackage.p90
    public View W1() {
        return this.q.d();
    }

    @Override // defpackage.ds8
    public void c0(boolean z) {
        TextLabelUtil.b(this.f.getContext(), this.f, z);
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        h.e(charSequence, "metadata");
        this.n.setText(charSequence);
        b(this.n, charSequence);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.o;
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.f;
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.c;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    @Override // defpackage.ds8
    public void r0(String str) {
        SpotifyIconV2 orNull = n71.a(str).orNull();
        z0(orNull != null ? z42.k(this.b.getContext(), orNull) : null);
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        View view = this.b;
        if (view instanceof b) {
            ((b) view).setActive(z);
        }
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        this.b.setEnabled(!z);
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        h.e(charSequence, ContextTrack.Metadata.KEY_SUBTITLE);
        this.f.setText(charSequence);
        b(this.f, charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        h.e(charSequence, "title");
        this.c.setText(charSequence);
        b(this.c, charSequence);
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.q.f(view);
        this.q.g();
    }
}
