package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;

public class f extends p implements DialogInterface {
    final AlertController c = new AlertController(getContext(), this, getWindow());

    public static class a {
        private final AlertController.b a;
        private final int b;

        public a(Context context) {
            this(context, f.e(context, 0));
        }

        public f a() {
            int i;
            f fVar = new f(this.a.a, this.b);
            AlertController.b bVar = this.a;
            AlertController alertController = fVar.c;
            View view = bVar.e;
            if (view != null) {
                alertController.g(view);
            } else {
                CharSequence charSequence = bVar.d;
                if (charSequence != null) {
                    alertController.j(charSequence);
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.h(drawable);
                }
            }
            CharSequence charSequence2 = bVar.f;
            if (charSequence2 != null) {
                alertController.i(charSequence2);
            }
            CharSequence charSequence3 = bVar.g;
            if (charSequence3 != null) {
                alertController.f(-1, charSequence3, bVar.h, null, null);
            }
            CharSequence charSequence4 = bVar.i;
            if (charSequence4 != null) {
                alertController.f(-2, charSequence4, bVar.j, null, null);
            }
            CharSequence charSequence5 = bVar.k;
            if (charSequence5 != null) {
                alertController.f(-3, charSequence5, bVar.l, null, null);
            }
            if (bVar.o != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.r) {
                    i = alertController.N;
                } else {
                    i = alertController.O;
                }
                ListAdapter listAdapter = bVar.o;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.a, i, 16908308, null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.s;
                if (bVar.p != null) {
                    recycleListView.setOnItemClickListener(new e(bVar, alertController));
                }
                if (bVar.r) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            View view2 = bVar.q;
            if (view2 != null) {
                alertController.k(view2);
            }
            fVar.setCancelable(this.a.m);
            if (this.a.m) {
                fVar.setCanceledOnTouchOutside(true);
            }
            this.a.getClass();
            fVar.setOnCancelListener(null);
            this.a.getClass();
            fVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.a.n;
            if (onKeyListener != null) {
                fVar.setOnKeyListener(onKeyListener);
            }
            return fVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.o = listAdapter;
            bVar.p = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.a.m = z;
            return this;
        }

        public a e(View view) {
            this.a.e = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.a.c = drawable;
            return this;
        }

        public a g(int i) {
            AlertController.b bVar = this.a;
            bVar.f = bVar.a.getText(i);
            return this;
        }

        public a h(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = bVar.a.getText(i);
            this.a.j = onClickListener;
            return this;
        }

        public a i(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.k = bVar.a.getText(i);
            this.a.l = onClickListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.a.n = onKeyListener;
            return this;
        }

        public a k(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = bVar.a.getText(i);
            this.a.h = onClickListener;
            return this;
        }

        public a l(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.o = listAdapter;
            bVar.p = onClickListener;
            bVar.s = i;
            bVar.r = true;
            return this;
        }

        public a m(int i) {
            AlertController.b bVar = this.a;
            bVar.d = bVar.a.getText(i);
            return this;
        }

        public a n(CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public a o(View view) {
            this.a.q = view;
            return this;
        }

        public a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, f.e(context, i)));
            this.b = i;
        }
    }

    protected f(Context context, int i) {
        super(context, e(context, i));
    }

    static int e(Context context, int i) {
        if (((i >>> 24) & BitmapRenderer.ALPHA_VISIBLE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0707R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.c.g;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.c();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.c.A;
        if (nestedScrollView != null && nestedScrollView.A(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.c.A;
        if (nestedScrollView != null && nestedScrollView.A(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.c.j(charSequence);
    }
}
