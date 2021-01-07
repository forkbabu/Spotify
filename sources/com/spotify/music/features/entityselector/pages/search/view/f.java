package com.spotify.music.features.entityselector.pages.search.view;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import com.google.common.base.MoreObjects;
import com.spotify.music.libs.search.view.BackKeyEditText;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.i;
import kotlin.jvm.internal.h;

public final class f extends i {
    private final ToolbarSearchFieldView g;
    private final cmf<kotlin.f> h;
    private final nmf<String, kotlin.f> i;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: nmf<? super java.lang.String, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(ToolbarSearchFieldView toolbarSearchFieldView, cmf<kotlin.f> cmf, nmf<? super String, kotlin.f> nmf) {
        h.e(toolbarSearchFieldView, "searchFieldView");
        h.e(cmf, "stopPreview");
        h.e(nmf, "onQueryChanged");
        this.g = toolbarSearchFieldView;
        this.h = cmf;
        this.i = nmf;
        toolbarSearchFieldView.setToolbarSearchFieldRightButtonListener(new e(this));
        toolbarSearchFieldView.setToolbarSearchFieldCallbacks(new d(this));
        a();
        Button searchPlaceHolder = toolbarSearchFieldView.getSearchPlaceHolder();
        h.d(searchPlaceHolder, "searchFieldView.searchPlaceHolder");
        searchPlaceHolder.setVisibility(8);
    }

    @Override // com.spotify.music.libs.search.view.i
    public void b() {
        BackKeyEditText queryEditText = this.g.getQueryEditText();
        h.d(queryEditText, "searchFieldView.queryEditText");
        if (TextUtils.isEmpty(queryEditText.getText())) {
            this.g.p().f();
        }
        this.h.invoke();
        super.b();
    }

    @Override // com.spotify.music.libs.search.view.i
    public void c() {
        if (f()) {
            super.c();
        } else {
            this.g.p().f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.search.view.i
    public EditText d() {
        BackKeyEditText queryEditText = this.g.getQueryEditText();
        h.d(queryEditText, "searchFieldView.queryEditText");
        return queryEditText;
    }

    @Override // com.spotify.music.libs.search.view.l
    public void j(String str) {
        if (!MoreObjects.isNullOrEmpty(str)) {
            this.g.p().c();
        } else if (!f()) {
            this.g.p().f();
        }
        k(str, true);
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public void l(int i2) {
        super.l(i2);
        this.g.p().c();
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public void m() {
        super.m();
        this.g.p().c();
    }

    @Override // com.spotify.music.libs.search.view.l
    public void o() {
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.search.view.i
    public void s(boolean z) {
        if (z) {
            this.g.p().b();
        } else {
            BackKeyEditText queryEditText = this.g.getQueryEditText();
            h.d(queryEditText, "searchFieldView.queryEditText");
            if (TextUtils.isEmpty(queryEditText.getText())) {
                this.g.p().g();
            }
        }
        super.s(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.search.view.i
    public void t(String str) {
        super.t(str);
        boolean isNullOrEmpty = MoreObjects.isNullOrEmpty(str);
        if (!this.g.k()) {
            this.g.setRightButtonVisible(!isNullOrEmpty);
        }
        if (str != null) {
            this.i.invoke(str);
        }
    }
}
