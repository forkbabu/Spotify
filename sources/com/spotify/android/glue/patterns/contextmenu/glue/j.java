package com.spotify.android.glue.patterns.contextmenu.glue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.glue.patterns.contextmenu.model.c;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class j {
    private final Context a;
    private final ua0 b;
    private final xa0 c;
    private List<c> d = new ArrayList();

    public j(Context context, ua0 ua0) {
        a aVar = a.a;
        this.a = context;
        this.b = ua0;
        this.c = aVar;
    }

    public View a(int i, ViewGroup viewGroup) {
        c cVar = this.d.get(i);
        View inflate = LayoutInflater.from(this.a).inflate(C0707R.layout.context_menu_top_bar_item, viewGroup, false);
        ((TextView) inflate.findViewById(C0707R.id.top_bar_item_textview)).setText(cVar.c());
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) inflate.findViewById(C0707R.id.top_bar_item_imageview);
        appCompatImageButton.setImageDrawable(cVar.b());
        inflate.setEnabled(cVar.e());
        inflate.setOnClickListener(new b(this, cVar, appCompatImageButton));
        return inflate;
    }

    public int b() {
        return this.d.size();
    }

    public /* synthetic */ void c(c cVar, AppCompatImageButton appCompatImageButton, View view) {
        cVar.f();
        if (cVar.k()) {
            this.b.onDismiss();
        } else {
            cVar.d();
            appCompatImageButton.setImageDrawable(cVar.b());
        }
        nqe a2 = cVar.a();
        if (a2 != null) {
            this.c.a(a2);
        }
    }

    public void d(List<c> list) {
        this.d = list;
    }

    public j(Context context, ua0 ua0, xa0 xa0) {
        this.a = context;
        this.b = ua0;
        this.c = xa0;
    }
}
