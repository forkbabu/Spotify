package com.spotify.music.sushi.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.sushi.badge.a;
import com.spotify.player.model.BitrateLevel;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SushiBadgeView extends RelativeLayout implements a {
    private final TextView a;

    static final class a implements View.OnClickListener {
        final /* synthetic */ nmf a;

        a(nmf nmf) {
            this.a = nmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke(f.a);
        }
    }

    public SushiBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int a(BadgeSize badgeSize) {
        if (badgeSize.ordinal() != 0) {
            Context context = getContext();
            h.d(context, "context");
            return context.getResources().getDimensionPixelSize(C0707R.dimen.sushi_badge_horizontal_padding_large);
        }
        Context context2 = getContext();
        h.d(context2, "context");
        return context2.getResources().getDimensionPixelSize(C0707R.dimen.sushi_badge_horizontal_padding);
    }

    /* renamed from: b */
    public void render(a.C0351a aVar) {
        h.e(aVar, "model");
        setVisibility(aVar.b() ? 0 : 8);
        setActivated(aVar.a());
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super f, f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new a(nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SushiBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        int[] iArr = com.spotify.music.sushi.a.a;
        h.d(iArr, "R.styleable.SushiBadgeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        BadgeSize badgeSize = BadgeSize.a;
        int i2 = obtainStyledAttributes.getInt(0, -1);
        BadgeSize badgeSize2 = i2 != -1 ? BadgeSize.values()[i2] : badgeSize;
        obtainStyledAttributes.recycle();
        if (badgeSize2 != null) {
            RelativeLayout.inflate(context, badgeSize2 == badgeSize ? C0707R.layout.sushi_badge : C0707R.layout.sushi_badge_large, this);
            dvd.a(this).a();
            setBackground(androidx.core.content.a.d(context, C0707R.drawable.sushi_rounded_bg));
            int a2 = a(badgeSize2);
            Context context2 = getContext();
            h.d(context2, "context");
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(C0707R.dimen.sushi_badge_vertical_padding);
            int a3 = a(badgeSize2);
            Context context3 = getContext();
            h.d(context3, "context");
            setPadding(a2, dimensionPixelSize, a3, context3.getResources().getDimensionPixelSize(C0707R.dimen.sushi_badge_vertical_padding));
            View G = q4.G(this, C0707R.id.badge_title);
            h.d(G, "requireViewById(this, R.id.badge_title)");
            TextView textView = (TextView) G;
            this.a = textView;
            h.d(q4.G(this, C0707R.id.dot_indicator), "requireViewById(this, R.id.dot_indicator)");
            textView.setText(com.spotify.music.superbird.setup.a.a(BitrateLevel.NORMALIZED));
            return;
        }
        h.k("badgeSize");
        throw null;
    }
}
