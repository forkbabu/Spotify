package com.spotify.music.homecomponents.singleitem.card;

import android.net.Uri;
import com.spotify.music.C0707R;
import kotlin.f;

public interface HomeSingleFocusCardViewBinder extends g90 {

    public enum Size {
        STANDARD(C0707R.dimen.single_focus_card_standard_size),
        TALL(C0707R.dimen.single_focus_card_tall_size);
        
        private final int dimenRes;

        private Size(int i) {
            this.dimenRes = i;
        }

        public final int d() {
            return this.dimenRes;
        }
    }

    void C1(nmf<? super Boolean, f> nmf);

    void C2(boolean z);

    void L1(CharSequence charSequence);

    void N1();

    void O0(nmf<? super Boolean, f> nmf);

    void f0(Size size);

    void h();

    void o2(int i);

    void reset();

    void setSubtitle(CharSequence charSequence);

    void setTitle(CharSequence charSequence);

    void u1(boolean z);

    void w1(Uri uri, String str);

    void x2(cmf<f> cmf);

    void y2(boolean z);
}
