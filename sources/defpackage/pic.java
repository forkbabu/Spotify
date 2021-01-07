package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.h;

/* renamed from: pic  reason: default package */
public final class pic implements oic {
    private final Context a;

    /* renamed from: pic$a */
    static final class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ int b;
        final /* synthetic */ View c;

        a(View view, int i, View view2) {
            this.a = view;
            this.b = i;
            this.c = view2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rect rect = new Rect();
            this.a.getHitRect(rect);
            int i = rect.top;
            int i2 = this.b;
            rect.top = i - i2;
            rect.bottom += i2;
            this.c.setTouchDelegate(new TouchDelegate(rect, this.a));
        }
    }

    public pic(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    @Override // defpackage.oic
    public void a(View view, int i) {
        h.e(view, "view");
        ViewParent parent = view.getParent();
        if (parent != null) {
            View view2 = (View) parent;
            view2.post(new a(view, (int) this.a.getResources().getDimension(i), view2));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }
}
