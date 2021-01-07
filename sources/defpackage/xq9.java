package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: xq9  reason: default package */
public final class xq9 implements g90 {
    private final LinearLayout a;

    public xq9(Context context, ViewGroup viewGroup) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_single_item_container, viewGroup, false);
        if (inflate != null) {
            this.a = (LinearLayout) inflate;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public void b(View view) {
        h.e(view, "view");
        this.a.addView(view);
    }

    public final LinearLayout c() {
        return this.a;
    }

    public void d() {
        this.a.setVisibility(8);
    }

    public void g() {
        this.a.removeAllViews();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    public void o2(int i) {
        LinearLayout linearLayout = this.a;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = i;
        linearLayout.setLayoutParams(layoutParams);
    }

    public void w() {
        this.a.setVisibility(0);
    }
}
