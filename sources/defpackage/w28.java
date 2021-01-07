package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.common.base.MoreObjects;

/* renamed from: w28  reason: default package */
public class w28<T extends ListAdapter> extends BaseAdapter {
    private final Context a;
    private final T b;
    private final int c;

    /* renamed from: w28$a */
    private static class a extends View {
        public a(Context context) {
            super(context);
            setVisibility(4);
        }
    }

    /* renamed from: w28$b */
    public class b extends LinearLayout {
        public b(Context context) {
            super(context);
            setEnabled(false);
            setOnClickListener(null);
            setOrientation(0);
        }
    }

    public w28(Context context, T t, int i) {
        this.a = context;
        this.b = t;
        MoreObjects.checkArgument(i > 0, "What do you mean '%d' cells per row?! cellsPerRow must be greater than zero.");
        this.c = i;
    }

    static int b(w28 w28, int i, int i2) {
        return (w28.c * i) + i2;
    }

    public T e() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.c == 1) {
            return this.b.getCount();
        }
        double count = (double) this.b.getCount();
        double d = (double) this.c;
        Double.isNaN(count);
        Double.isNaN(d);
        return (int) Math.ceil(count / d);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.b.getItem((this.c * i) + 0);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return this.b.getItemId((this.c * i) + 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    @Override // android.widget.Adapter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            int r0 = r8.c
            r1 = 1
            if (r0 != r1) goto L_0x000c
            T extends android.widget.ListAdapter r0 = r8.b
            android.view.View r9 = r0.getView(r9, r10, r11)
            return r9
        L_0x000c:
            if (r10 != 0) goto L_0x0016
            w28$b r10 = new w28$b
            android.content.Context r11 = r8.a
            r10.<init>(r11)
            goto L_0x0018
        L_0x0016:
            w28$b r10 = (defpackage.w28.b) r10
        L_0x0018:
            r11 = 0
            r0 = 0
        L_0x001a:
            w28 r2 = defpackage.w28.this
            int r2 = a(r2)
            if (r0 >= r2) goto L_0x007e
            w28 r2 = defpackage.w28.this
            int r2 = b(r2, r9, r0)
            android.view.View r3 = r10.getChildAt(r0)
            w28 r4 = defpackage.w28.this
            android.widget.ListAdapter r4 = c(r4)
            int r4 = r4.getCount()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -1
            if (r2 >= r4) goto L_0x0061
            boolean r4 = r3 instanceof defpackage.w28.a
            if (r4 == 0) goto L_0x0045
            r10.removeView(r3)
            r3 = 0
        L_0x0043:
            r4 = 1
            goto L_0x0049
        L_0x0045:
            if (r3 != 0) goto L_0x0048
            goto L_0x0043
        L_0x0048:
            r4 = 0
        L_0x0049:
            w28 r7 = defpackage.w28.this
            android.widget.ListAdapter r7 = c(r7)
            android.view.View r2 = r7.getView(r2, r3, r10)
            if (r4 == 0) goto L_0x005d
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r6, r6, r5)
            r10.addView(r2, r0, r3)
        L_0x005d:
            r2.setVisibility(r11)
            goto L_0x007b
        L_0x0061:
            if (r3 == 0) goto L_0x0068
            r2 = 4
            r3.setVisibility(r2)
            goto L_0x007b
        L_0x0068:
            w28$a r2 = new w28$a
            w28 r3 = defpackage.w28.this
            android.content.Context r3 = d(r3)
            r2.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r6, r6, r5)
            r10.addView(r2, r0, r3)
        L_0x007b:
            int r0 = r0 + 1
            goto L_0x001a
        L_0x007e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.unregisterDataSetObserver(dataSetObserver);
    }
}
