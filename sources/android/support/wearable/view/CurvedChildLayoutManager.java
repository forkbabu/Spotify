package android.support.wearable.view;

import android.support.wearable.view.WearableRecyclerView;
import android.view.View;

@Deprecated
public class CurvedChildLayoutManager extends WearableRecyclerView.ChildLayoutManager {
    private WearableRecyclerView Q;
    private int R;
    private int S;

    @Override // android.support.wearable.view.WearableRecyclerView.ChildLayoutManager
    public void z2(View view, WearableRecyclerView wearableRecyclerView) {
        if (this.Q != wearableRecyclerView) {
            this.Q = wearableRecyclerView;
            this.R = wearableRecyclerView.getWidth();
            this.S = this.Q.getHeight();
        }
    }
}
