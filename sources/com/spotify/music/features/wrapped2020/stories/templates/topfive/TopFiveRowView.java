package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class TopFiveRowView extends ConstraintLayout {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    private final TextView f;
    private final WrappedGradientView n;
    private final WrappedGradientView o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopFiveRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.top_five_row, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.image);
        h.d(G, "requireViewById(this, R.id.image)");
        this.a = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.title);
        h.d(G2, "requireViewById(this, R.id.title)");
        this.b = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.subtitle);
        h.d(G3, "requireViewById(this, R.id.subtitle)");
        this.c = (TextView) G3;
        View G4 = q4.G(this, C0707R.id.position);
        h.d(G4, "requireViewById(this, R.id.position)");
        this.f = (TextView) G4;
        View G5 = q4.G(this, C0707R.id.rectangle_gradient);
        h.d(G5, "requireViewById(this, R.id.rectangle_gradient)");
        this.n = (WrappedGradientView) G5;
        View G6 = q4.G(this, C0707R.id.circle_gradient);
        h.d(G6, "requireViewById(this, R.id.circle_gradient)");
        this.o = (WrappedGradientView) G6;
    }

    public final void C(c cVar, boolean z) {
        h.e(cVar, "topFive");
        this.f.setText(cVar.c());
        this.f.setTextColor(cVar.b());
        boolean z2 = false;
        if (z) {
            this.o.setVisibility(0);
            this.o.a().start();
        } else {
            this.n.setVisibility(0);
            this.n.a().start();
        }
        this.a.setImageBitmap(cVar.a());
        this.b.setText(cVar.f());
        this.b.setTextColor(cVar.d());
        if (cVar.e().length() == 0) {
            z2 = true;
        }
        if (z2) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setText(cVar.e());
        this.c.setTextColor(cVar.b());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopFiveRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.top_five_row, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.image);
        h.d(G, "requireViewById(this, R.id.image)");
        this.a = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.title);
        h.d(G2, "requireViewById(this, R.id.title)");
        this.b = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.subtitle);
        h.d(G3, "requireViewById(this, R.id.subtitle)");
        this.c = (TextView) G3;
        View G4 = q4.G(this, C0707R.id.position);
        h.d(G4, "requireViewById(this, R.id.position)");
        this.f = (TextView) G4;
        View G5 = q4.G(this, C0707R.id.rectangle_gradient);
        h.d(G5, "requireViewById(this, R.id.rectangle_gradient)");
        this.n = (WrappedGradientView) G5;
        View G6 = q4.G(this, C0707R.id.circle_gradient);
        h.d(G6, "requireViewById(this, R.id.circle_gradient)");
        this.o = (WrappedGradientView) G6;
    }
}
