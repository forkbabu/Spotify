package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.music.C0707R;
import defpackage.tn4;

/* renamed from: fq4  reason: default package */
public class fq4 extends RecyclerView.q {
    private final c a;
    private final LinearLayoutManager b;
    private View c;
    private RecyclerView.b0 d;
    private final int e;

    public fq4(int i, c cVar, LinearLayoutManager linearLayoutManager) {
        this.a = cVar;
        this.e = i;
        this.b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        boolean z = false;
        this.d = recyclerView.R(0);
        int Y1 = this.b.Y1();
        RecyclerView.b0 b0Var = this.d;
        float f = 1.0f;
        if (b0Var instanceof tn4.a) {
            if (Y1 == 0) {
                if (this.c == null) {
                    this.c = b0Var.a.findViewById(C0707R.id.devices_list_header_description);
                }
                View view = this.c;
                this.c = view;
                float height = ((float) this.c.getHeight()) + ((float) ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin) + ((float) ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin);
                float bottom = (float) (this.d.a.getBottom() - this.e);
                if (((float) Math.abs(this.d.a.getTop())) >= (((float) this.d.a.getMeasuredHeight()) - height) - ((float) this.e)) {
                    if (bottom > 0.0f) {
                        z = true;
                    }
                    if (z) {
                        f = 1.0f - (bottom / 100.0f);
                    }
                } else {
                    f = 0.0f;
                }
            }
        }
        this.a.o(f);
    }
}
