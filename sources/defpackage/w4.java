package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: w4  reason: default package */
public final class w4 implements Iterator<View>, Object {
    private int a;
    final /* synthetic */ ViewGroup b;

    w4(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a < this.b.getChildCount();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.b;
        int i = this.a;
        this.a = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public void remove() {
        ViewGroup viewGroup = this.b;
        int i = this.a - 1;
        this.a = i;
        viewGroup.removeViewAt(i);
    }
}
