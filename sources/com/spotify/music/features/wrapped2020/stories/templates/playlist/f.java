package com.spotify.music.features.wrapped2020.stories.templates.playlist;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class f {
    private final View a;
    private final WrappedGradientView b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final Button f;

    public f(View view, WrappedGradientView wrappedGradientView, ImageView imageView, TextView textView, TextView textView2, Button button) {
        h.e(view, "background");
        h.e(wrappedGradientView, "gradient");
        h.e(imageView, "imagePlaylist");
        h.e(textView, "textViewHeader");
        h.e(textView2, "textViewBody");
        h.e(button, "buttonAddPlaylist");
        this.a = view;
        this.b = wrappedGradientView;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
        this.f = button;
    }

    public final View a() {
        return this.a;
    }

    public final Button b() {
        return this.f;
    }

    public final WrappedGradientView c() {
        return this.b;
    }

    public final ImageView d() {
        return this.c;
    }

    public final TextView e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && h.a(this.b, fVar.b) && h.a(this.c, fVar.c) && h.a(this.d, fVar.d) && h.a(this.e, fVar.e) && h.a(this.f, fVar.f);
    }

    public final TextView f() {
        return this.d;
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
        Button button = this.f;
        if (button != null) {
            i = button.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Views(background=");
        V0.append(this.a);
        V0.append(", gradient=");
        V0.append(this.b);
        V0.append(", imagePlaylist=");
        V0.append(this.c);
        V0.append(", textViewHeader=");
        V0.append(this.d);
        V0.append(", textViewBody=");
        V0.append(this.e);
        V0.append(", buttonAddPlaylist=");
        V0.append(this.f);
        V0.append(")");
        return V0.toString();
    }
}
