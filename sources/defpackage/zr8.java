package defpackage;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.ViewProvider;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: zr8  reason: default package */
public final class zr8 implements ViewProvider {
    public static final a r = new a(null);
    private final ms8 a;
    private final View b;
    private final TextView c;
    private final TextView f;
    private final TextView n;
    private final ImageView o;
    private final ImageView p;
    private final ipc q;

    /* renamed from: zr8$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    public zr8(ViewGroup viewGroup, ipc ipc) {
        h.e(viewGroup, "parent");
        h.e(ipc, "episodeCardDrawable");
        this.q = ipc;
        ms8 b2 = ms8.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        h.d(b2, "TopicEpisodeImageCardBin…      parent, false\n    )");
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
        TextView textView3 = b2.c;
        h.d(textView3, "binding.metadata");
        this.n = textView3;
        ImageView imageView = b2.d;
        h.d(imageView, "binding.podcastCoverArt");
        this.o = imageView;
        ImageView imageView2 = b2.b;
        h.d(imageView2, "binding.episodeCoverArt");
        this.p = imageView2;
        imageView2.setImageDrawable(ipc);
        bvd b3 = dvd.b(a2);
        b3.f(imageView2, imageView);
        b3.g(textView, textView2);
        b3.a();
    }

    private final void g(View view, String str) {
        if (str.length() == 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    public final ImageView M0() {
        return this.o;
    }

    public final void b(int i, int i2) {
        if (s2.b(i, -1) >= ((double) 2)) {
            this.q.b(i, i2, false);
        } else {
            this.q.c(i, i2, false);
        }
    }

    public final void c(Bitmap bitmap, boolean z) {
        h.e(bitmap, "bitmap");
        this.q.e(bitmap, z);
    }

    public final void d(String str) {
        h.e(str, "metadata");
        this.n.setText(str);
        g(this.n, str);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    public final void n(String str) {
        h.e(str, "description");
        this.q.f(str);
    }

    public final void reset() {
        this.q.a();
        this.p.setImageDrawable(this.q);
    }

    public final void setSubtitle(String str) {
        h.e(str, ContextTrack.Metadata.KEY_SUBTITLE);
        this.f.setText(str);
        g(this.f, str);
    }

    public final void setTitle(String str) {
        h.e(str, "title");
        this.c.setText(str);
        g(this.c, str);
    }
}
