package com.spotify.android.glue.patterns.contextmenu.model;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;

public abstract class b {

    public static class a extends b {
        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public nqe a() {
            return null;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public Optional<Drawable> b() {
            return Optional.absent();
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public int c() {
            return -1;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public CharSequence d() {
            return "";
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean e() {
            return false;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean f() {
            return false;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean g() {
            return true;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean h() {
            return false;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public void i() {
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b j(boolean z) {
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b k(boolean z) {
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b l(boolean z) {
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b m(boolean z) {
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b n(e eVar, d dVar) {
            return null;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b o(e eVar) {
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean p() {
            return false;
        }
    }

    public abstract nqe a();

    public abstract Optional<Drawable> b();

    public abstract int c();

    public abstract CharSequence d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract void i();

    public abstract b j(boolean z);

    public abstract b k(boolean z);

    public abstract b l(boolean z);

    public abstract b m(boolean z);

    public abstract b n(e eVar, d dVar);

    public abstract b o(e eVar);

    public abstract boolean p();

    /* renamed from: com.spotify.android.glue.patterns.contextmenu.model.b$b  reason: collision with other inner class name */
    public static class C0146b extends b {
        private final int a;
        private final Optional<Drawable> b;
        private final CharSequence c;
        private e d;
        private d e;
        private boolean f = true;
        private boolean g;
        private Object h;
        private boolean i = true;
        private boolean j;

        public C0146b(int i2, CharSequence charSequence, Drawable drawable) {
            this.a = i2;
            this.c = charSequence;
            this.b = Optional.of(drawable);
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public nqe a() {
            d dVar = this.e;
            if (dVar != null) {
                return dVar.a();
            }
            return null;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public Optional<Drawable> b() {
            return this.b;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public int c() {
            return this.a;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public CharSequence d() {
            return this.c;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0146b)) {
                return false;
            }
            C0146b bVar = (C0146b) obj;
            if (this.a != bVar.a || this.f != bVar.f) {
                return false;
            }
            CharSequence charSequence = this.c;
            if (charSequence == null ? bVar.c != null : !charSequence.equals(bVar.c)) {
                return false;
            }
            Object obj2 = this.h;
            Object obj3 = bVar.h;
            if (obj2 != null) {
                return obj2.equals(obj3);
            }
            if (obj3 == null) {
                return true;
            }
            return false;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean f() {
            return this.j;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean g() {
            return false;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean h() {
            return this.f;
        }

        public int hashCode() {
            int i2 = this.a * 31;
            CharSequence charSequence = this.c;
            int i3 = 0;
            int hashCode = (((i2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31;
            Object obj = this.h;
            if (obj != null) {
                i3 = obj.hashCode();
            }
            return hashCode + i3;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public void i() {
            e eVar = this.d;
            if (eVar != null) {
                eVar.a(this);
            }
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b j(boolean z) {
            this.g = z;
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b k(boolean z) {
            this.j = z;
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b l(boolean z) {
            this.i = z;
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b m(boolean z) {
            this.f = z;
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b n(e eVar, d dVar) {
            this.d = eVar;
            this.e = dVar;
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public b o(e eVar) {
            this.d = eVar;
            return this;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.b
        public boolean p() {
            return this.i;
        }

        public Object q() {
            return this.h;
        }

        public b r(Object obj) {
            this.h = obj;
            return this;
        }

        public C0146b(int i2, CharSequence charSequence) {
            this.a = i2;
            this.c = charSequence;
            this.b = Optional.absent();
        }
    }
}
