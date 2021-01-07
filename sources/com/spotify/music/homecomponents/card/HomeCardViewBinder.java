package com.spotify.music.homecomponents.card;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface HomeCardViewBinder extends g90 {

    public enum CardSize {
        SMALL(0.3f, 144),
        MEDIUM(0.4f, 200),
        LARGE(0.5f, 256);
        
        public final int mMaxWidth;
        public final float mPercentage;

        private CardSize(float f2, int i) {
            this.mPercentage = f2;
            this.mMaxWidth = i;
        }
    }

    public enum CardTextLines {
        ONE_LINE(1),
        TWO_LINES(2);
        
        public final int value;

        private CardTextLines(int i) {
            this.value = i;
        }
    }

    void D(Drawable drawable, Drawable drawable2, String str);

    void P(CharSequence charSequence);

    void Q1();

    void a(Uri uri, Drawable drawable, String str);

    void a1();

    void f1(CharSequence charSequence);

    void n1(CardSize cardSize);

    void setContentDescription(CharSequence charSequence);

    void setSubtitle(CharSequence charSequence);

    void setTitle(CharSequence charSequence);

    void v1(CardTextLines cardTextLines);
}
