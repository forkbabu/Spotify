package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: ho2  reason: default package */
public final /* synthetic */ class ho2 implements m4 {
    public final /* synthetic */ View a;

    public /* synthetic */ ho2(View view) {
        this.a = view;
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        View view2 = this.a;
        View findViewById = view.findViewById(C0707R.id.background_color_view);
        int g = b5Var.g();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        if (marginLayoutParams.bottomMargin != g) {
            marginLayoutParams.bottomMargin = g;
            findViewById.setLayoutParams(marginLayoutParams);
        }
        int max = Math.max(view2.getContext().getResources().getDimensionPixelSize(C0707R.dimen.car_now_playing_mode_player_buttons_min_margin), b5Var.g());
        View findViewById2 = view.findViewById(C0707R.id.second_row_button_space);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        if (marginLayoutParams2.bottomMargin != max) {
            marginLayoutParams2.bottomMargin = max;
            findViewById2.setLayoutParams(marginLayoutParams2);
        }
        return b5Var;
    }
}
