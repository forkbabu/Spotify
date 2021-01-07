package com.spotify.music.features.wrapped2020.stories.templates.storyofyoursong;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class StatisticView extends ConstraintLayout {
    private final TextView a;
    private final TextView b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatisticView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.statistic_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.title);
        h.d(G, "requireViewById(this, R.id.title)");
        this.a = (TextView) G;
        View G2 = q4.G(this, C0707R.id.subtitle);
        h.d(G2, "requireViewById(this, R.id.subtitle)");
        this.b = (TextView) G2;
    }

    public final void setUpView(a aVar) {
        h.e(aVar, "statistic");
        setEnabled(false);
        yy8.a(this.a, aVar.b());
        yy8.a(this.b, aVar.a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatisticView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.statistic_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.title);
        h.d(G, "requireViewById(this, R.id.title)");
        this.a = (TextView) G;
        View G2 = q4.G(this, C0707R.id.subtitle);
        h.d(G2, "requireViewById(this, R.id.subtitle)");
        this.b = (TextView) G2;
    }
}
