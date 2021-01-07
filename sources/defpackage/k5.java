package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k5  reason: default package */
public abstract class k5 extends i5 {
    private int r;
    private int s;
    private LayoutInflater t;

    @Deprecated
    public k5(Context context, int i, Cursor cursor, boolean z) {
        super(context, null, z);
        this.s = i;
        this.r = i;
        this.t = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // defpackage.i5
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.t.inflate(this.s, viewGroup, false);
    }

    @Override // defpackage.i5
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.t.inflate(this.r, viewGroup, false);
    }
}
