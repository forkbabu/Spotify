package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;

/* renamed from: sb4  reason: default package */
public abstract class sb4 extends c {
    private final tb4 c;

    public sb4(int i, tb4 tb4) {
        super(i);
        this.c = tb4;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c, androidx.recyclerview.widget.RecyclerView.n
    public void b(View view) {
        super.b(view);
        if (view instanceof RecyclerView) {
            m((RecyclerView) view);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c, androidx.recyclerview.widget.RecyclerView.n
    public void d(View view) {
        super.d(view);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= recyclerView.getItemDecorationCount()) {
                    break;
                } else if (equals(recyclerView.f0(i))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                g(recyclerView);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        this.c.getClass();
        o(i, i61.f0(b0Var).d());
    }

    /* access modifiers changed from: package-private */
    public abstract void o(int i, s81 s81);
}
