package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.base.java.logging.Logger;

/* access modifiers changed from: package-private */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    g a;
    protected int b;

    public ViewOffsetBehavior() {
    }

    protected static CoordinatorLayout.Behavior<?> b(View view) {
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(V v) {
        if (this.a == null) {
            this.a = new g(v);
        }
        this.a.b();
        int i = this.b;
        if (i != 0) {
            this.a.c(i);
            this.b = 0;
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(CoordinatorLayout coordinatorLayout) {
        return ((GlueHeaderLayout) coordinatorLayout).D();
    }

    public boolean d(int i) {
        g gVar = this.a;
        if (gVar != null) {
            return gVar.c(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        String str;
        try {
            coordinatorLayout.q(v, i);
            a(v);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            Resources resources = v.getContext().getResources();
            String str2 = "no_id";
            if (v.getId() == -1) {
                str = str2;
            } else {
                str = resources.getResourceEntryName(v.getId());
            }
            if (coordinatorLayout.getId() != -1) {
                str2 = resources.getResourceEntryName(coordinatorLayout.getId());
            }
            Logger.n("child id is %1$s and parent id is %2$s", str, str2);
            throw e;
        }
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
