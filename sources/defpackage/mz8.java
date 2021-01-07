package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: mz8  reason: default package */
final class mz8 {
    private final View a;
    private final WrappedGradientView b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public mz8(View view, WrappedGradientView wrappedGradientView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        h.e(view, "background");
        h.e(wrappedGradientView, "gradient");
        h.e(imageView, "coverArt");
        h.e(textView, "coverArtText");
        h.e(textView2, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(textView3, "title");
        h.e(textView4, "description");
        this.a = view;
        this.b = wrappedGradientView;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
    }

    public final View a() {
        return this.a;
    }

    public final ImageView b() {
        return this.c;
    }

    public final TextView c() {
        return this.d;
    }

    public final TextView d() {
        return this.g;
    }

    public final WrappedGradientView e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz8)) {
            return false;
        }
        mz8 mz8 = (mz8) obj;
        return h.a(this.a, mz8.a) && h.a(this.b, mz8.b) && h.a(this.c, mz8.c) && h.a(this.d, mz8.d) && h.a(this.e, mz8.e) && h.a(this.f, mz8.f) && h.a(this.g, mz8.g);
    }

    public final TextView f() {
        return this.e;
    }

    public final TextView g() {
        return this.f;
    }

    public int hashCode() {
        View view = this.a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        WrappedGradientView wrappedGradientView = this.b;
        int hashCode2 = (hashCode + (wrappedGradientView != null ? wrappedGradientView.hashCode() : 0)) * 31;
        ImageView imageView = this.c;
        int hashCode3 = (hashCode2 + (imageView != null ? imageView.hashCode() : 0)) * 31;
        TextView textView = this.d;
        int hashCode4 = (hashCode3 + (textView != null ? textView.hashCode() : 0)) * 31;
        TextView textView2 = this.e;
        int hashCode5 = (hashCode4 + (textView2 != null ? textView2.hashCode() : 0)) * 31;
        TextView textView3 = this.f;
        int hashCode6 = (hashCode5 + (textView3 != null ? textView3.hashCode() : 0)) * 31;
        TextView textView4 = this.g;
        if (textView4 != null) {
            i = textView4.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Views(background=");
        V0.append(this.a);
        V0.append(", gradient=");
        V0.append(this.b);
        V0.append(", coverArt=");
        V0.append(this.c);
        V0.append(", coverArtText=");
        V0.append(this.d);
        V0.append(", subtitle=");
        V0.append(this.e);
        V0.append(", title=");
        V0.append(this.f);
        V0.append(", description=");
        V0.append(this.g);
        V0.append(")");
        return V0.toString();
    }
}
