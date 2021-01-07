package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler Q;
    private final View.OnClickListener R = new a();
    private final Context a;
    final p b;
    private final Window c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;

    public static class RecycleListView extends ListView {
        private final int a;
        private final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.u);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }

        public void a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.a, getPaddingRight(), z2 ? getPaddingBottom() : this.b);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.o && (message4 = alertController.q) != null) {
                message = Message.obtain(message4);
            } else if (view != alertController.s || (message3 = alertController.u) == null) {
                message = (view != alertController.w || (message2 = alertController.y) == null) ? null : Message.obtain(message2);
            } else {
                message = Message.obtain(message3);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.Q.obtainMessage(1, alertController2.b).sendToTarget();
        }
    }

    public static class b {
        public final Context a;
        public final LayoutInflater b;
        public Drawable c;
        public CharSequence d;
        public View e;
        public CharSequence f;
        public CharSequence g;
        public DialogInterface.OnClickListener h;
        public CharSequence i;
        public DialogInterface.OnClickListener j;
        public CharSequence k;
        public DialogInterface.OnClickListener l;
        public boolean m;
        public DialogInterface.OnKeyListener n;
        public ListAdapter o;
        public DialogInterface.OnClickListener p;
        public View q;
        public boolean r;
        public int s = -1;

        public b(Context context) {
            this.a = context;
            this.m = true;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    private static final class c extends Handler {
        private WeakReference<DialogInterface> a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.Adapter, android.widget.BaseAdapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.a = context;
        this.b = pVar;
        this.c = window;
        this.Q = new c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, h0.f, C0707R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        pVar.c(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void d(View view, View view2, View view3) {
        int i2 = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i2 = 0;
            }
            view3.setVisibility(i2);
        }
    }

    private ViewGroup e(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void c() {
        int i2;
        boolean z2;
        View view;
        ListAdapter listAdapter;
        View view2;
        View view3;
        View findViewById;
        if (this.K == 0) {
            i2 = this.J;
        } else {
            i2 = this.J;
        }
        this.b.setContentView(i2);
        View findViewById2 = this.c.findViewById(C0707R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(C0707R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(C0707R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(C0707R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C0707R.id.customPanel);
        View view4 = this.h;
        int i3 = 0;
        if (view4 == null) {
            view4 = this.i != 0 ? LayoutInflater.from(this.a).inflate(this.i, viewGroup, false) : null;
        }
        boolean z3 = view4 != null;
        if (!z3 || !a(view4)) {
            this.c.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) this.c.findViewById(C0707R.id.custom);
            frameLayout.addView(view4, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.j, this.k, this.l, this.m);
            }
            if (this.g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(C0707R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(C0707R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(C0707R.id.buttonPanel);
        ViewGroup e2 = e(findViewById6, findViewById3);
        ViewGroup e3 = e(findViewById7, findViewById4);
        ViewGroup e4 = e(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) this.c.findViewById(C0707R.id.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) e3.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.A.removeView(this.F);
                if (this.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    e3.setVisibility(8);
                }
            }
        }
        Button button = (Button) e4.findViewById(16908313);
        this.o = button;
        button.setOnClickListener(this.R);
        if (!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i4 = this.d;
                drawable.setBounds(0, 0, i4, i4);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            z2 = true;
        } else {
            this.o.setVisibility(8);
            z2 = false;
        }
        Button button2 = (Button) e4.findViewById(16908314);
        this.s = button2;
        button2.setOnClickListener(this.R);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i5 = this.d;
                drawable2.setBounds(0, 0, i5, i5);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            z2 |= true;
        } else {
            this.s.setVisibility(8);
        }
        Button button3 = (Button) e4.findViewById(16908315);
        this.w = button3;
        button3.setOnClickListener(this.R);
        if (!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable3 = this.z;
            if (drawable3 != null) {
                int i6 = this.d;
                drawable3.setBounds(0, 0, i6, i6);
                view = null;
                this.w.setCompoundDrawables(this.z, null, null, null);
            } else {
                view = null;
            }
            this.w.setVisibility(0);
            z2 |= true;
        } else {
            this.w.setVisibility(8);
            view = null;
        }
        Context context = this.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0707R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                b(this.o);
            } else if (z2) {
                b(this.s);
            } else if (z2) {
                b(this.w);
            }
        }
        if (!(z2)) {
            e4.setVisibility(8);
        }
        if (this.G != null) {
            e2.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.c.findViewById(C0707R.id.title_template).setVisibility(8);
        } else {
            this.D = (ImageView) this.c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(this.e)) || !this.P) {
                this.c.findViewById(C0707R.id.title_template).setVisibility(8);
                this.D.setVisibility(8);
                e2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) this.c.findViewById(C0707R.id.alertTitle);
                this.E = textView2;
                textView2.setText(this.e);
                int i7 = this.B;
                if (i7 != 0) {
                    this.D.setImageResource(i7);
                } else {
                    Drawable drawable4 = this.C;
                    if (drawable4 != null) {
                        this.D.setImageDrawable(drawable4);
                    } else {
                        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                        this.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z4 = viewGroup.getVisibility() != 8;
        boolean z5 = (e2 == null || e2.getVisibility() == 8) ? false : true;
        boolean z6 = e4.getVisibility() != 8;
        if (!z6 && (findViewById = e3.findViewById(C0707R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z5) {
            NestedScrollView nestedScrollView2 = this.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (this.f == null && this.g == null) {
                view3 = view;
            } else {
                view3 = e2.findViewById(C0707R.id.titleDividerNoCustom);
            }
            if (view3 != null) {
                view3.setVisibility(0);
            }
        } else {
            View findViewById9 = e3.findViewById(C0707R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = this.g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z5, z6);
        }
        if (!z4) {
            View view5 = this.g;
            if (view5 == null) {
                view5 = this.A;
            }
            if (view5 != null) {
                if (z6) {
                    i3 = 2;
                }
                int i8 = z5 ? 1 : 0;
                char c2 = z5 ? 1 : 0;
                char c3 = z5 ? 1 : 0;
                int i9 = i8 | i3;
                View findViewById10 = this.c.findViewById(C0707R.id.scrollIndicatorUp);
                View findViewById11 = this.c.findViewById(C0707R.id.scrollIndicatorDown);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    int i11 = q4.g;
                    if (i10 >= 23) {
                        view5.setScrollIndicators(i9, 3);
                    }
                    if (findViewById10 != null) {
                        e3.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        e3.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i9 & 1) == 0) {
                        e3.removeView(findViewById10);
                        findViewById10 = view;
                    }
                    if (findViewById11 == null || (i9 & 2) != 0) {
                        view2 = findViewById11;
                    } else {
                        e3.removeView(findViewById11);
                        view2 = view;
                    }
                    if (!(findViewById10 == null && view2 == null)) {
                        if (this.f != null) {
                            this.A.setOnScrollChangeListener(new a(this, findViewById10, view2));
                            this.A.post(new b(this, findViewById10, view2));
                        } else {
                            ListView listView2 = this.g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new c(this, findViewById10, view2));
                                this.g.post(new d(this, findViewById10, view2));
                            } else {
                                if (findViewById10 != null) {
                                    e3.removeView(findViewById10);
                                }
                                if (view2 != null) {
                                    e3.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = this.g;
        if (listView3 != null && (listAdapter = this.H) != null) {
            listView3.setAdapter(listAdapter);
            int i12 = this.I;
            if (i12 > -1) {
                listView3.setItemChecked(i12, true);
                listView3.setSelection(i12);
            }
        }
    }

    public void f(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.Q.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.x = charSequence;
            this.y = obtainMessage;
            this.z = null;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = obtainMessage;
            this.v = null;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = obtainMessage;
            this.r = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void g(View view) {
        this.G = view;
    }

    public void h(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void i(CharSequence charSequence) {
        this.f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void j(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void k(View view) {
        this.h = view;
        this.i = 0;
        this.n = false;
    }
}
