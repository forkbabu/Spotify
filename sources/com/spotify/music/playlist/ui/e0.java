package com.spotify.music.playlist.ui;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

public class e0 {
    private final ViewGroup a;
    private List<View> b;
    private final Rect c = new Rect();
    private final int[] d = new int[2];
    private final int[] e = new int[2];

    public e0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public View a() {
        List<View> list = this.b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<View> list2 = this.b;
        return list2.get(list2.size() - 1);
    }

    public void b(View view) {
        List<View> list = this.b;
        if (list != null && !list.isEmpty()) {
            int g = nud.g(24.0f, this.a.getResources());
            View view2 = list.get(list.size() - 1);
            Rect rect = this.c;
            view2.getLocationInWindow(this.d);
            view.getLocationInWindow(this.e);
            int[] iArr = this.d;
            int i = iArr[0];
            int[] iArr2 = this.e;
            int i2 = i - iArr2[0];
            int i3 = iArr[1] - iArr2[1];
            rect.set(i2, i3, view2.getWidth() + i2, view2.getHeight() + i3);
            Rect rect2 = this.c;
            rect2.top = 0;
            rect2.bottom += g;
            if (list.size() == 1) {
                this.c.left -= g;
            }
            this.c.right += g;
            view.setTouchDelegate(new TouchDelegate(this.c, view2));
        }
    }

    public void c(View view) {
        d(ImmutableList.of(view));
    }

    public void d(List<View> list) {
        if (!rw.equal(this.b, list)) {
            if (this.b != null) {
                this.a.removeAllViews();
            }
            this.b = list;
            if (list == null || list.isEmpty()) {
                this.a.setVisibility(8);
                return;
            }
            for (View view : list) {
                this.a.addView(view);
                view.setDuplicateParentStateEnabled(false);
            }
            this.a.setVisibility(0);
            View view2 = (View) this.a.getParent();
            view2.post(new j(this, view2));
        }
    }

    public void e() {
        int i;
        List<View> list = this.b;
        if (list != null) {
            Iterator<View> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getVisibility() == 0) {
                        i = 0;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        i = 8;
        this.a.setVisibility(i);
    }
}
