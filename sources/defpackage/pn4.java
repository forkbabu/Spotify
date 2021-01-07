package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;

/* renamed from: pn4  reason: default package */
public class pn4 implements qu0 {
    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        ia0 a = e90.e().a(context, viewGroup);
        TextView titleView = a.getTitleView();
        float dimension = resources.getDimension(C0707R.dimen.device_picker_header_title_size);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.connect_education_card_header_padding);
        titleView.setTextSize(0, dimension);
        titleView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        return h90.h0(a);
    }

    @Override // defpackage.qu0
    public int c() {
        return 1;
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{61};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i) {
        View view = b0Var.a;
        int i2 = e90.i;
        ((ia0) l70.o(view, ia0.class)).setTitle(b0Var.a.getResources().getString(C0707R.string.connect_education_header));
    }

    @Override // defpackage.qu0
    public long getItemId(int i) {
        return 61;
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i) {
        return 61;
    }
}
