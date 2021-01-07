package com.spotify.mobile.android.storytelling.common;

import com.spotify.mobile.android.storytelling.common.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class d {
    private int a;
    private final nmf<Integer, g> b;

    public d(nmf<Integer, g> nmf) {
        h.e(nmf, "storyStateProvider");
        this.b = nmf;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final String b() {
        g invoke = this.b.invoke(Integer.valueOf(this.a));
        if (invoke instanceof g.a) {
            return ((g.a) invoke).a().a();
        }
        if (invoke instanceof g.b) {
            StringBuilder V0 = je.V0("Can't share without a loaded story. Story index ");
            V0.append(this.a);
            throw new IllegalStateException(V0.toString().toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<cmf<com.spotify.mobile.android.share.menu.preview.api.d>> c() {
        g invoke = this.b.invoke(Integer.valueOf(this.a));
        if (invoke instanceof g.a) {
            return ((g.a) invoke).a().b();
        }
        if (invoke instanceof g.b) {
            StringBuilder V0 = je.V0("Can't share without a loaded story. Story index ");
            V0.append(this.a);
            throw new IllegalStateException(V0.toString().toString());
        }
        throw new NoWhenBranchMatchedException();
    }
}
