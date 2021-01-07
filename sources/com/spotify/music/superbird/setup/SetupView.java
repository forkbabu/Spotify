package com.spotify.music.superbird.setup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SetupView extends ConstraintLayout {
    private cmf<f> a;
    private cmf<f> b;

    static final class a implements View.OnClickListener {
        final /* synthetic */ SetupView a;

        a(TypedArray typedArray, SetupView setupView) {
            this.a = setupView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.getOnButtonClick().invoke();
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ SetupView a;

        b(SetupView setupView) {
            this.a = setupView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.getOnCloseClick().invoke();
        }
    }

    public SetupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        h.e(view, "child");
        if (view.getId() == C0707R.id.view_setup) {
            super.addView(view, i, layoutParams);
        } else {
            ((ViewGroup) findViewById(C0707R.id.content)).addView(view, layoutParams);
        }
    }

    public final cmf<f> getOnButtonClick() {
        return this.a;
    }

    public final cmf<f> getOnCloseClick() {
        return this.b;
    }

    public final void setButtonEnabled(boolean z) {
        View findViewById = findViewById(C0707R.id.button);
        h.d(findViewById, "findViewById<TextView>(R.id.button)");
        ((TextView) findViewById).setEnabled(z);
    }

    public final void setButtonVisible(boolean z) {
        View findViewById = findViewById(C0707R.id.button);
        h.d(findViewById, "findViewById<TextView>(R.id.button)");
        ((TextView) findViewById).setVisibility(z ? 0 : 8);
    }

    public final void setOnButtonClick(cmf<f> cmf) {
        h.e(cmf, "<set-?>");
        this.a = cmf;
    }

    public final void setOnCloseClick(cmf<f> cmf) {
        h.e(cmf, "<set-?>");
        this.b = cmf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.a = SetupView$onButtonClick$1.a;
        this.b = SetupView$onCloseClick$1.a;
        ViewGroup.inflate(context, C0707R.layout.view_setup, this);
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.a, 0, 0);
        try {
            View findViewById = findViewById(C0707R.id.title);
            h.d(findViewById, "findViewById<TextView>(R.id.title)");
            ((TextView) findViewById).setText(obtainStyledAttributes.getString(6));
            View findViewById2 = findViewById(C0707R.id.description);
            h.d(findViewById2, "findViewById<TextView>(R.id.description)");
            ((TextView) findViewById2).setText(obtainStyledAttributes.getString(3));
            TextView textView = (TextView) findViewById(C0707R.id.footer);
            textView.setText(obtainStyledAttributes.getString(4));
            textView.setVisibility(obtainStyledAttributes.getBoolean(5, false) ? 0 : 8);
            Button button = (Button) findViewById(C0707R.id.button);
            button.setText(obtainStyledAttributes.getString(1));
            button.setEnabled(obtainStyledAttributes.getBoolean(0, true));
            if (!obtainStyledAttributes.getBoolean(2, true)) {
                i2 = 8;
            }
            button.setVisibility(i2);
            button.setOnClickListener(new a(obtainStyledAttributes, this));
            ((ImageButton) findViewById(C0707R.id.button_close)).setOnClickListener(new b(this));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
