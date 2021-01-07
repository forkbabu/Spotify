package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class d extends RecyclerView.b0 {
    private d(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static d h0(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(q4.f());
        frameLayout.setSaveEnabled(false);
        return new d(frameLayout);
    }
}
