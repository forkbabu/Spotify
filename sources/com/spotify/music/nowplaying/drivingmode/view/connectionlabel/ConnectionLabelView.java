package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public final class ConnectionLabelView extends AppCompatTextView implements g {
    public static final /* synthetic */ int c = 0;
    private final Handler a = new Handler();
    private final Runnable b = new a(this);

    public ConnectionLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c.n(this, C0707R.style.res_2132083356_textappearance_driving_connectionlabel);
    }

    private void j() {
        this.a.removeCallbacks(this.b);
        q4.a(this).b();
        x4 a2 = q4.a(this);
        a2.d(300);
        a2.e(ta0.c);
        a2.a(1.0f);
        a2.j();
    }

    public void k(String str, boolean z) {
        Drawable d = fvb.d(getContext());
        d.setAlpha(179);
        setTextColor(a.b(getContext(), R.color.white_70));
        setCompoundDrawablesWithIntrinsicBounds(d, (Drawable) null, (Drawable) null, (Drawable) null);
        setText(str);
        j();
        if (z) {
            this.a.postDelayed(this.b, 5000);
        }
    }

    public void l() {
        Drawable d = fvb.d(getContext());
        setTextColor(a.b(getContext(), R.color.white));
        String string = getResources().getString(C0707R.string.driving_label_disconnected);
        setCompoundDrawablesWithIntrinsicBounds(d, (Drawable) null, (Drawable) null, (Drawable) null);
        setText(string);
        j();
    }

    public ConnectionLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c.n(this, C0707R.style.res_2132083356_textappearance_driving_connectionlabel);
    }
}
