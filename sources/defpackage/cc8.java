package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cc8  reason: default package */
public abstract class cc8 extends c {
    private static final Set<String> f;
    private final dc8 c;

    static {
        HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(1);
        Collections.addAll(newHashSetWithExpectedSize, "search:EmptyState");
        f = newHashSetWithExpectedSize;
    }

    public cc8(int i, dc8 dc8) {
        super(i);
        this.c = dc8;
    }

    private void p(int i, s81 s81) {
        o(i, s81);
        if (f.contains(s81.componentId().id())) {
            for (int i2 = 0; i2 < s81.children().size(); i2++) {
                p(i2, (s81) s81.children().get(0));
            }
        }
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
        p(i, i61.f0(b0Var).d());
    }

    /* access modifiers changed from: package-private */
    public abstract void o(int i, s81 s81);
}
