package com.spotify.music.util.filterheader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.C0707R;
import java.util.List;

public class c {
    private final Context a;
    private final b b;
    private final v42 c;
    private d d;
    private a e;
    private final PopupWindow f;
    private final ListView g;
    private final AdapterView.OnItemClickListener h;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Assertion.j("position is outside adapter length", i < c.this.c.getCount());
            int i2 = c.this.c.i(i);
            if (i2 != Integer.MIN_VALUE) {
                int f = c.this.c.f(i, i2);
                if (i2 == 0) {
                    ((b) c.this.e.getItem(f)).e();
                    c.this.f.dismiss();
                    c.this.e.notifyDataSetChanged();
                } else if (i2 != 1) {
                    Assertion.p("ID " + j + "is unknown.");
                } else {
                    SortOption sortOption = (SortOption) c.this.d.getItem(f);
                    if (c.this.d.b() != f) {
                        sortOption.h(false, true);
                    } else if (sortOption.g()) {
                        sortOption.h(!sortOption.f(), true);
                    }
                    if (c.this.b != null) {
                        c.this.b.a(sortOption);
                    }
                    c.this.f.dismiss();
                    c.this.d.c(f);
                }
            }
        }
    }

    public interface b {
        void a(SortOption sortOption);
    }

    public c(Context context, LayoutInflater layoutInflater, b bVar) {
        a aVar = new a();
        this.h = aVar;
        this.a = context;
        this.b = bVar;
        View inflate = layoutInflater.inflate(C0707R.layout.list_popup, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, context.getResources().getDimensionPixelSize(C0707R.dimen.filter_list_popup_width), -2);
        this.f = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable(context.getResources(), (Bitmap) null));
        ListView listView = (ListView) inflate.findViewById(16908298);
        this.g = listView;
        listView.setOnItemClickListener(aVar);
        listView.setDivider(null);
        v42 v42 = new v42(context);
        this.c = v42;
        v42.n(new u42());
    }

    public void f() {
        if (this.f.isShowing()) {
            this.f.dismiss();
        }
    }

    public void g(SortOption sortOption) {
        this.d.d(sortOption);
    }

    public void h(List<b> list) {
        if (list == null) {
            Assertion.p("We need a non-null filterOptions list");
        }
        if (!list.isEmpty()) {
            a aVar = new a(this.a, list);
            this.e = aVar;
            this.c.b(aVar, C0707R.string.filter_header_filter, 0);
            this.c.o(0);
            this.g.setAdapter((ListAdapter) this.c);
        }
    }

    public void i(List<SortOption> list, SortOption sortOption) {
        if (list == null) {
            Assertion.p("We need a non-null sortOptions list");
        }
        Assertion.b("sortOptions must contain at least one item each.", list.isEmpty());
        int indexOf = list.indexOf(sortOption);
        list.get(indexOf).h(sortOption.f(), false);
        d dVar = new d(this.a, list, indexOf);
        this.d = dVar;
        this.c.b(dVar, C0707R.string.filter_header_sort, 1);
        this.c.o(1);
        this.g.setAdapter((ListAdapter) this.c);
    }

    public void j(View view) {
        this.f.showAsDropDown(view);
    }
}
