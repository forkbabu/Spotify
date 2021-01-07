package com.spotify.music.slate.container.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.percentlayout.widget.PercentRelativeLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.slate.c;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;

public class SlateView extends PercentRelativeLayout implements CardInteractionHandler.b {
    public static final b t = new a();
    private CardView b;
    private FrameLayout c;
    private FrameLayout f;
    private View n;
    private CardInteractionHandler o;
    private CardInteractionHandler.b p;
    private a q;
    private b r = t;
    private DisplayMode s = DisplayMode.CARD;

    public enum DisplayMode {
        CARD,
        FULL_SCREEN
    }

    static class a implements b {
        a() {
        }
    }

    public interface b {
    }

    public SlateView(Context context) {
        super(context);
        e(null);
    }

    private void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, c.a, 0, 0);
            try {
                this.s = obtainStyledAttributes.getBoolean(0, false) ? DisplayMode.FULL_SCREEN : DisplayMode.CARD;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        LayoutInflater.from(getContext()).inflate(C0707R.layout.slate_view, this);
        setBackgroundColor(Color.parseColor("#70121314"));
        this.b = (CardView) findViewById(C0707R.id.slate_content_container);
        this.c = (FrameLayout) findViewById(C0707R.id.slate_header_container);
        this.f = (FrameLayout) findViewById(C0707R.id.slate_footer_container);
        this.n = findViewById(C0707R.id.slate_content_view_container);
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
        CardInteractionHandler.b bVar = this.p;
        if (bVar != null) {
            bVar.a(swipeDirection);
        }
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void b() {
        CardInteractionHandler.b bVar = this.p;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void c(double d, float f2, CardInteractionHandler.SwipeDirection swipeDirection) {
        CardInteractionHandler.b bVar = this.p;
        if (bVar != null) {
            bVar.c(d, f2, swipeDirection);
        }
    }

    public void d(a3d a3d) {
        this.b.removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        CardView cardView = this.b;
        cardView.addView(a3d.M(from, cardView));
        CardInteractionHandler cardInteractionHandler = new CardInteractionHandler(this.n, this);
        this.o = cardInteractionHandler;
        this.b.setOnTouchListener(cardInteractionHandler);
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void m() {
        CardInteractionHandler.b bVar = this.p;
        if (bVar != null) {
            bVar.m();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.percentlayout.widget.PercentRelativeLayout, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        a aVar = this.q;
        boolean z = true;
        if (aVar == null) {
            Logger.b("No dimensions calculated yet", new Object[0]);
        } else if (aVar.d == size && aVar.c == size2) {
            z = false;
        } else {
            Logger.b("SlateView Dimensions Changed. Changed from %dhx%dw to %dhx%dw", Integer.valueOf(aVar.c), Integer.valueOf(this.q.d), Integer.valueOf(size2), Integer.valueOf(size));
        }
        if (z) {
            Resources resources = getResources();
            float integer = ((float) resources.getInteger(C0707R.integer.card_aspect_ratio)) / 100.0f;
            a aVar2 = new a();
            int min = (int) Math.min(((float) size2) * (((float) resources.getInteger(C0707R.integer.card_height_percentage)) / 100.0f), ((float) size) / integer);
            aVar2.a = min;
            aVar2.b = (int) (((float) min) * integer);
            aVar2.c = size2;
            aVar2.d = size;
            this.q = aVar2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
            if (this.s == DisplayMode.FULL_SCREEN) {
                a aVar3 = this.q;
                layoutParams.height = aVar3.c;
                layoutParams.width = aVar3.d;
                this.b.setRadius(0.0f);
            } else {
                a aVar4 = this.q;
                layoutParams.height = aVar4.a;
                layoutParams.width = aVar4.b;
                this.b.setRadius(20.0f);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
    public void s() {
        CardInteractionHandler.b bVar = this.p;
        if (bVar != null) {
            bVar.s();
        }
    }

    public void setDismissalPolicy(b bVar) {
        this.r = bVar;
        DisplayMode displayMode = this.s;
        CardInteractionHandler cardInteractionHandler = this.o;
        ((a) bVar).getClass();
        cardInteractionHandler.c(displayMode == DisplayMode.CARD);
    }

    public void setFooter(b3d b3d) {
        this.f.removeAllViews();
        this.f.addView(b3d.a(LayoutInflater.from(getContext()), this.f));
    }

    public void setHeader(b3d b3d) {
        this.c.removeAllViews();
        this.c.addView(b3d.a(LayoutInflater.from(getContext()), this.c));
    }

    public void setInteractionListener(CardInteractionHandler.b bVar) {
        this.p = bVar;
    }

    public SlateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet);
    }

    public SlateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(attributeSet);
    }
}
