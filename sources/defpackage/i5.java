package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import defpackage.j5;

/* renamed from: i5  reason: default package */
public abstract class i5 extends BaseAdapter implements Filterable, j5.a {
    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context f;
    protected int n;
    protected a o;
    protected DataSetObserver p;
    protected j5 q;

    /* access modifiers changed from: private */
    /* renamed from: i5$a */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            i5 i5Var = i5.this;
            if (i5Var.b && (cursor = i5Var.c) != null && !cursor.isClosed()) {
                i5Var.a = i5Var.c.requery();
            }
        }
    }

    /* renamed from: i5$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            i5 i5Var = i5.this;
            i5Var.a = true;
            i5Var.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            i5 i5Var = i5.this;
            i5Var.a = false;
            i5Var.notifyDataSetInvalidated();
        }
    }

    public i5(Context context, Cursor cursor, boolean z) {
        boolean z2 = true;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.b = true;
        } else {
            this.b = false;
        }
        z2 = cursor == null ? false : z2;
        this.c = cursor;
        this.a = z2;
        this.f = context;
        this.n = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.o = new a();
            this.p = new b();
        } else {
            this.o = null;
            this.p = null;
        }
        if (z2) {
            a aVar = this.o;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.p;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // defpackage.j5.a
    public void a(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.o;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.p;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                a aVar2 = this.o;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.p;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.n = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.n = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    @Override // defpackage.j5.a
    public abstract CharSequence b(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    public Cursor e() {
        return this.c;
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            view = f(this.f, this.c, viewGroup);
        }
        d(view, this.f, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.q == null) {
            this.q = new j5(this);
        }
        return this.q;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.c.getLong(this.n);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = g(this.f, this.c, viewGroup);
            }
            d(view, this.f, this.c);
            return view;
        } else {
            throw new IllegalStateException(je.p0("couldn't move cursor to position ", i));
        }
    }
}
