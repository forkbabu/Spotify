package com.spotify.music.libs.search.view;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.libs.search.view.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class i implements l {
    public static final /* synthetic */ int f = 0;
    private final CopyOnWriteArraySet<l.b> b = new CopyOnWriteArraySet<>();
    protected l.c c;
    final TextView.OnEditorActionListener d = new b(this);
    private l62 e;

    public void a() {
        EditText d2 = d();
        d2.setOnEditorActionListener(this.d);
        d2.setOnFocusChangeListener(new c(this));
        h hVar = new h(this);
        this.e = hVar;
        d2.addTextChangedListener(hVar);
    }

    public void b() {
        EditText d2 = d();
        d2.clearFocus();
        bd0.g(d2);
    }

    public void c() {
        d().getText().clear();
    }

    /* access modifiers changed from: protected */
    public abstract EditText d();

    public boolean e(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (!((i == 3) || (i == 0 && keyEvent != null && keyEvent.getAction() == 0))) {
            return false;
        }
        if (this.b.isEmpty()) {
            z = false;
        } else {
            String h = h();
            Iterator<l.b> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().f(h);
            }
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.libs.search.view.l
    public boolean f() {
        return d().hasFocus();
    }

    @Override // com.spotify.music.libs.search.view.l
    public void g(l.b bVar) {
        CopyOnWriteArraySet<l.b> copyOnWriteArraySet = this.b;
        bVar.getClass();
        copyOnWriteArraySet.add(bVar);
    }

    @Override // com.spotify.music.libs.search.view.l
    public String h() {
        Editable text = d().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.spotify.music.libs.search.view.l
    public float i() {
        return 1.0f;
    }

    @Override // com.spotify.music.libs.search.view.l
    public void k(String str, boolean z) {
        EditText d2 = d();
        if (!z) {
            d2.removeTextChangedListener(this.e);
        }
        d2.setText(str);
        d2.setSelection(d2.length());
        if (!z) {
            d2.addTextChangedListener(this.e);
        }
    }

    @Override // com.spotify.music.libs.search.view.l
    public void l(int i) {
        EditText d2 = d();
        d2.requestFocus();
        bd0.j(d2, (long) i);
    }

    @Override // com.spotify.music.libs.search.view.l
    public void m() {
        EditText d2 = d();
        d2.requestFocus();
        ((InputMethodManager) d2.getContext().getSystemService("input_method")).showSoftInput(d2, 1);
    }

    @Override // com.spotify.music.libs.search.view.l
    public void n(boolean z) {
    }

    @Override // com.spotify.music.libs.search.view.l
    public void p(float f2) {
    }

    @Override // com.spotify.music.libs.search.view.l
    public void q(l.b bVar) {
        CopyOnWriteArraySet<l.b> copyOnWriteArraySet = this.b;
        bVar.getClass();
        copyOnWriteArraySet.remove(bVar);
    }

    /* access modifiers changed from: protected */
    public void r() {
        Iterator<l.b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().n();
        }
    }

    /* access modifiers changed from: protected */
    public void s(boolean z) {
        Iterator<l.b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().L(z);
        }
    }

    /* access modifiers changed from: protected */
    public void t(String str) {
        Iterator<l.b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().r(str);
        }
    }

    public void u(l.c cVar) {
        this.c = (l.c) MoreObjects.firstNonNull(cVar, a.a);
    }
}
