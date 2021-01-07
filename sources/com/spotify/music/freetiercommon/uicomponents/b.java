package com.spotify.music.freetiercommon.uicomponents;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

public class b {
    private final ViewGroup a;
    private List<View> b;
    private final Rect c = new Rect();
    private final int[] d = new int[2];
    private final int[] e = new int[2];

    public b(ViewGroup viewGroup) {
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
            List<View> list2 = this.b;
            View view2 = list2.get(list2.size() - 1);
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
            List<View> list3 = this.b;
            list3.getClass();
            if (list3.size() == 1) {
                this.c.left -= g;
            }
            this.c.right += g;
            view.setTouchDelegate(new TouchDelegate(this.c, view2));
        }
    }

    public void c(List<View> list) {
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
            view2.post(new a(this, view2));
        }
    }

    public void d() {
        List<View> list = this.b;
        int i = 8;
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
        this.a.setVisibility(i);
    }
}
