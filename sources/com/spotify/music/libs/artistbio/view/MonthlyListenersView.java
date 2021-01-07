package com.spotify.music.libs.artistbio.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.C0707R;
import java.text.NumberFormat;
import java.util.Locale;

public class MonthlyListenersView extends RelativeLayout {
    private static final String[] f = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
    private TextView a;
    private TextView b;
    private View c;

    public MonthlyListenersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i, int i2) {
        String str;
        if (i2 > 0) {
            if (!"en".equals(SpotifyLocale.e())) {
                str = String.valueOf(i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i2));
                int length = sb.length();
                switch (i2 % 100) {
                    case 11:
                    case 12:
                    case 13:
                        sb.append("th");
                        break;
                    default:
                        sb.append(f[i2 % 10]);
                        break;
                }
                SpannableString spannableString = new SpannableString(sb.toString());
                spannableString.setSpan(new RelativeSizeSpan(0.5f), length, sb.length(), 0);
                str = spannableString;
            }
            this.b.setText(str);
            this.c.setVisibility(0);
        }
        if (i > 0) {
            this.a.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) i));
            setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(C0707R.id.rankText);
        this.a = (TextView) findViewById(C0707R.id.monthly_listeners);
        this.c = findViewById(C0707R.id.rank);
    }

    public void setSmallMonthlyListenersCountTextAppearance(boolean z) {
        if (z) {
            c.n(this.a, R.style.TextAppearance_Encore_Cello);
        } else {
            c.n(this.a, R.style.TextAppearance_Encore_Brio);
        }
    }

    public MonthlyListenersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
    }
}
