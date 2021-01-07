package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

public class h {
    private final TextPaint a = new TextPaint(1);
    private final mx b = new a();
    private float c;
    private boolean d = true;
    private WeakReference<b> e = new WeakReference<>(null);
    private kx f;

    class a extends mx {
        a() {
        }

        @Override // defpackage.mx
        public void a(int i) {
            h.this.d = true;
            b bVar = (b) h.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.mx
        public void b(Typeface typeface, boolean z) {
            if (!z) {
                h.this.d = true;
                b bVar = (b) h.this.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        @Override // com.google.android.material.internal.h.b
        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public kx c() {
        return this.f;
    }

    public TextPaint d() {
        return this.a;
    }

    public float e(String str) {
        float f2;
        if (!this.d) {
            return this.c;
        }
        if (str == null) {
            f2 = 0.0f;
        } else {
            f2 = this.a.measureText((CharSequence) str, 0, str.length());
        }
        this.c = f2;
        this.d = false;
        return f2;
    }

    public void f(kx kxVar, Context context) {
        if (this.f != kxVar) {
            this.f = kxVar;
            if (kxVar != null) {
                kxVar.h(context, this.a, this.b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                kxVar.g(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void g(boolean z) {
        this.d = z;
    }

    public void h(Context context) {
        this.f.g(context, this.a, this.b);
    }
}
