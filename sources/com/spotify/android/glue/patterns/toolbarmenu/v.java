package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import com.google.common.collect.Collections2;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* access modifiers changed from: package-private */
public class v implements i0 {
    private static final Set<Integer> h;
    private final c a;
    private final a b;
    private final Window c;
    private boolean d;
    private boolean e;
    private final View.OnClickListener f;
    private ImageButton g;

    /* access modifiers changed from: private */
    public class a extends x0 {
        private final Window.Callback b;

        a(Window.Callback callback) {
            super(callback);
            this.b = callback;
        }

        @Override // defpackage.x0, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !v.this.d) {
                v.this.d = true;
            }
            return onPreparePanel;
        }
    }

    static {
        Integer[] numArr = {Integer.valueOf((int) C0707R.id.actionbar_item_profile), Integer.valueOf((int) C0707R.id.toolbar_up_button)};
        HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(2);
        Collections.addAll(newHashSetWithExpectedSize, numArr);
        h = newHashSetWithExpectedSize;
    }

    public v(c cVar, Window window, View.OnClickListener onClickListener) {
        a aVar;
        this.a = cVar;
        Window.Callback callback = window.getCallback();
        if (callback instanceof a) {
            aVar = (a) callback;
        } else {
            aVar = new a(callback);
        }
        this.b = aVar;
        this.c = window;
        window.setCallback(aVar);
        this.f = onClickListener;
        Context context = cVar.getView().getContext();
        this.g = new StateListAnimatorImageButton(context);
        this.g.setImageDrawable(new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size)));
        ImageButton imageButton = this.g;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        imageButton.setBackground(null);
        this.g.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.g.setOnClickListener(onClickListener);
        this.g.setContentDescription(context.getResources().getText(C0707R.string.content_description_toolbar_back_button));
    }

    private void d(Context context, g gVar) {
        ToolbarSide toolbarSide = ToolbarSide.END;
        ToolbarSide toolbarSide2 = ToolbarSide.START;
        z zVar = new z(context, gVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        i iVar = null;
        for (int i = 0; i < gVar.size(); i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible()) {
                i iVar2 = (i) item;
                if (!iVar2.n()) {
                    arrayList.add(iVar2);
                } else if (iVar2.getItemId() == C0707R.id.actionbar_item_shuffle_play) {
                    iVar = iVar2;
                } else {
                    arrayList2.add(iVar2);
                }
            }
        }
        this.a.G(toolbarSide);
        this.a.G(toolbarSide2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.a.K1((MenuItem) it.next());
            }
        }
        if (this.e) {
            this.a.H1(toolbarSide2, this.g, C0707R.id.toolbar_up_button);
        }
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MenuItem menuItem = (MenuItem) arrayList2.get(size);
            View actionView = menuItem.getActionView();
            ToolbarSide toolbarSide3 = h.contains(Integer.valueOf(menuItem.getItemId())) ? toolbarSide2 : toolbarSide;
            if (actionView != null) {
                this.a.H1(toolbarSide3, actionView, menuItem.getItemId());
            } else {
                boolean z = menuItem instanceof f3;
                this.a.H1(toolbarSide3, ((z ? ((f3) menuItem).a() : null) != null ? z ? ((f3) menuItem).a() : null : zVar).e(menuItem), menuItem.getItemId());
            }
        }
        if (iVar != null) {
            if (h.contains(Integer.valueOf(iVar.getItemId()))) {
                toolbarSide = toolbarSide2;
            }
            this.a.H1(toolbarSide, iVar.getActionView(), iVar.getItemId());
        }
    }

    public void c() {
        Context context = this.a.getView().getContext();
        g gVar = new g(context);
        gVar.R();
        try {
            gVar.clear();
            if (!this.b.onCreatePanelMenu(0, gVar) || !this.b.onPreparePanel(0, null, gVar)) {
                gVar.clear();
            }
        } finally {
            gVar.Q();
            d(context, gVar);
        }
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void f() {
        this.c.setCallback(this.b.b);
    }
}
