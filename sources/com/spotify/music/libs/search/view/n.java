package com.spotify.music.libs.search.view;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.common.base.MoreObjects;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;

public class n extends i {
    private static final nqa j = new d();
    private final ToolbarSearchFieldView g;
    private final nqa h;
    private final boolean i;

    class a implements ToolbarSearchFieldView.g {
        a() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.g
        public void a() {
            n.this.h.l();
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.g
        public void n() {
            if (!n.this.f()) {
                n.this.m();
            }
            n.this.c();
            n.this.r();
        }
    }

    class b implements ToolbarSearchFieldView.f {
        b() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.f
        public void a() {
            n.this.h.m();
        }
    }

    class c implements ToolbarSearchFieldView.e {
        c() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void a() {
            n.this.m();
            n.this.g.getSearchPlaceHolder().setPressed(false);
            Animator e = ((zud) n.this.g.getSearchPlaceHolder()).getStateListAnimatorCompat().e();
            if (e != null) {
                e.cancel();
            }
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void b() {
            l.c cVar = n.this.c;
            if (!(cVar != null && cVar.B1())) {
                n.this.b();
                n.this.c();
            }
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void c() {
            n.this.b();
        }
    }

    static class d implements nqa {
        d() {
        }

        @Override // defpackage.nqa
        public void l() {
        }

        @Override // defpackage.nqa
        public void m() {
        }
    }

    public n(Activity activity, ToolbarSearchFieldView toolbarSearchFieldView, boolean z) {
        this(activity, toolbarSearchFieldView, z, j);
    }

    public Parcelable A() {
        return new e(h(), f());
    }

    public void B(int i2) {
        this.g.getSearchPlaceHolder().setText(i2);
    }

    @Override // com.spotify.music.libs.search.view.i
    public void b() {
        if (TextUtils.isEmpty(this.g.getQueryEditText().getText())) {
            this.g.p().f();
        }
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
        return this.g.getQueryEditText();
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public float i() {
        return this.g.getAlpha();
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
        EditText d2 = d();
        d2.requestFocus();
        bd0.j(d2, (long) i2);
        this.g.p().c();
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public void m() {
        super.m();
        this.g.p().c();
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public void n(boolean z) {
        boolean d2 = this.g.p().d();
        this.g.p().e(true);
        if (z) {
            this.g.p().c();
        } else {
            this.g.p().f();
        }
        this.g.p().e(d2);
    }

    @Override // com.spotify.music.libs.search.view.l
    public void o() {
    }

    @Override // com.spotify.music.libs.search.view.i, com.spotify.music.libs.search.view.l
    public void p(float f) {
        this.g.setAlpha(f);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.search.view.i
    public void s(boolean z) {
        if (z) {
            this.g.p().b();
        } else if (TextUtils.isEmpty(this.g.getQueryEditText().getText())) {
            this.g.p().g();
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
        } else if (!this.i) {
        } else {
            if (this.g.getCurrentDrawableState() == ToolbarSearchFieldView.DrawableState.SCANNABLES && !isNullOrEmpty) {
                this.g.s();
            } else if (this.g.getCurrentDrawableState() == ToolbarSearchFieldView.DrawableState.CLEAR && isNullOrEmpty) {
                this.g.r();
            }
        }
    }

    public View x() {
        return this.g;
    }

    public View y() {
        return this.g;
    }

    public void z(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            boolean d2 = this.g.p().d();
            this.g.p().e(true);
            if (!MoreObjects.isNullOrEmpty(eVar.a)) {
                j(eVar.a);
            }
            if (eVar.b) {
                m();
            } else {
                b();
            }
            this.g.p().e(d2);
        }
    }

    public n(Activity activity, ToolbarSearchFieldView toolbarSearchFieldView, boolean z, nqa nqa) {
        toolbarSearchFieldView.getClass();
        this.g = toolbarSearchFieldView;
        this.h = nqa;
        this.i = z;
        toolbarSearchFieldView.getLayoutParams().width = -1;
        toolbarSearchFieldView.getLayoutParams().height = com.spotify.android.paste.app.d.c(activity);
        Drawable a2 = com.spotify.android.paste.app.d.a(activity);
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        toolbarSearchFieldView.setBackground(a2);
        toolbarSearchFieldView.setToolbarSearchFieldRightButtonListener(new a());
        toolbarSearchFieldView.setToolbarSearchFieldCameraCallback(new b());
        toolbarSearchFieldView.setToolbarSearchFieldCallbacks(new c());
        if (z) {
            toolbarSearchFieldView.q();
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public final String a;
        public final boolean b;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (a) null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }

        e(Parcel parcel, a aVar) {
            this.a = parcel.readString();
            this.b = parcel.readInt() != 0;
        }
    }
}
