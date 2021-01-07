package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.p;
import com.spotify.music.C0707R;
import defpackage.n6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a extends p {
    private final n6 c = n6.f(getContext());
    private final b f = new b();
    private TextView n;
    private m6 o = m6.c;
    private ArrayList<n6.f> p;
    private c q;
    private ListView r;
    private boolean s;
    private long t;
    private final Handler u = new HandlerC0038a();

    /* renamed from: androidx.mediarouter.app.a$a  reason: collision with other inner class name */
    class HandlerC0038a extends Handler {
        HandlerC0038a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                a.this.f((List) message.obj);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class b extends n6.a {
        b() {
        }

        @Override // defpackage.n6.a
        public void d(n6 n6Var, n6.f fVar) {
            a.this.d();
        }

        @Override // defpackage.n6.a
        public void e(n6 n6Var, n6.f fVar) {
            a.this.d();
        }

        @Override // defpackage.n6.a
        public void f(n6 n6Var, n6.f fVar) {
            a.this.d();
        }

        @Override // defpackage.n6.a
        public void g(n6 n6Var, n6.f fVar) {
            a.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public final class c extends ArrayAdapter<n6.f> implements AdapterView.OnItemClickListener {
        private final LayoutInflater a;
        private final Drawable b;
        private final Drawable c;
        private final Drawable f;
        private final Drawable n;

        public c(Context context, List<n6.f> list) {
            super(context, 0, list);
            this.a = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0707R.attr.mediaRouteDefaultIconDrawable, C0707R.attr.mediaRouteTvIconDrawable, C0707R.attr.mediaRouteSpeakerIconDrawable, C0707R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.b = obtainStyledAttributes.getDrawable(0);
            this.c = obtainStyledAttributes.getDrawable(1);
            this.f = obtainStyledAttributes.getDrawable(2);
            this.n = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
            if (r0 != null) goto L_0x00ba;
         */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            /*
                r6 = this;
                r0 = 0
                if (r8 != 0) goto L_0x000c
                android.view.LayoutInflater r8 = r6.a
                r1 = 2131624591(0x7f0e028f, float:1.8876366E38)
                android.view.View r8 = r8.inflate(r1, r9, r0)
            L_0x000c:
                java.lang.Object r7 = r6.getItem(r7)
                n6$f r7 = (defpackage.n6.f) r7
                r9 = 2131430494(0x7f0b0c5e, float:1.848269E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                r1 = 2131430492(0x7f0b0c5c, float:1.8482686E38)
                android.view.View r1 = r8.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r2 = r7.k()
                r9.setText(r2)
                java.lang.String r2 = r7.c()
                int r3 = r7.b()
                r4 = 2
                r5 = 1
                if (r3 == r4) goto L_0x0040
                int r3 = r7.b()
                if (r3 != r5) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                r3 = 0
                goto L_0x0041
            L_0x0040:
                r3 = 1
            L_0x0041:
                if (r3 == 0) goto L_0x0055
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L_0x0055
                r3 = 80
                r9.setGravity(r3)
                r1.setVisibility(r0)
                r1.setText(r2)
                goto L_0x0064
            L_0x0055:
                r0 = 16
                r9.setGravity(r0)
                r9 = 8
                r1.setVisibility(r9)
                java.lang.String r9 = ""
                r1.setText(r9)
            L_0x0064:
                boolean r9 = r7.v()
                r8.setEnabled(r9)
                r9 = 2131430493(0x7f0b0c5d, float:1.8482689E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                if (r9 == 0) goto L_0x00bd
                android.net.Uri r0 = r7.h()
                if (r0 == 0) goto L_0x00a0
                android.content.Context r1 = r6.getContext()     // Catch:{ IOException -> 0x0090 }
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ IOException -> 0x0090 }
                java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x0090 }
                r2 = 0
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch:{ IOException -> 0x0090 }
                if (r0 == 0) goto L_0x00a0
                goto L_0x00ba
            L_0x0090:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to load "
                r1.append(r2)
                r1.append(r0)
                r1.toString()
            L_0x00a0:
                int r0 = r7.d()
                if (r0 == r5) goto L_0x00b7
                if (r0 == r4) goto L_0x00b4
                boolean r7 = r7.w()
                if (r7 == 0) goto L_0x00b1
                android.graphics.drawable.Drawable r7 = r6.n
                goto L_0x00b9
            L_0x00b1:
                android.graphics.drawable.Drawable r7 = r6.b
                goto L_0x00b9
            L_0x00b4:
                android.graphics.drawable.Drawable r7 = r6.f
                goto L_0x00b9
            L_0x00b7:
                android.graphics.drawable.Drawable r7 = r6.c
            L_0x00b9:
                r0 = r7
            L_0x00ba:
                r9.setImageDrawable(r0)
            L_0x00bd:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return ((n6.f) getItem(i)).v();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            n6.f fVar = (n6.f) getItem(i);
            if (fVar.v()) {
                fVar.D();
                a.this.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Comparator<n6.f> {
        public static final d a = new d();

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(n6.f fVar, n6.f fVar2) {
            return fVar.k().compareToIgnoreCase(fVar2.k());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.m.b(r2, r0, r0)
            int r0 = androidx.mediarouter.app.m.c(r2)
            r1.<init>(r2, r0)
            m6 r2 = defpackage.m6.c
            r1.o = r2
            androidx.mediarouter.app.a$a r2 = new androidx.mediarouter.app.a$a
            r2.<init>()
            r1.u = r2
            android.content.Context r2 = r1.getContext()
            n6 r2 = defpackage.n6.f(r2)
            r1.c = r2
            androidx.mediarouter.app.a$b r2 = new androidx.mediarouter.app.a$b
            r2.<init>()
            r1.f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.<init>(android.content.Context):void");
    }

    public void d() {
        if (this.s) {
            ArrayList arrayList = new ArrayList(this.c.h());
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                boolean z = true;
                if (size <= 0) {
                    break;
                }
                n6.f fVar = (n6.f) arrayList.get(i);
                if (fVar.u() || !fVar.v() || !fVar.z(this.o)) {
                    z = false;
                }
                if (!z) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, d.a);
            if (SystemClock.uptimeMillis() - this.t >= 300) {
                this.t = SystemClock.uptimeMillis();
                this.p.clear();
                this.p.addAll(arrayList);
                this.q.notifyDataSetChanged();
                return;
            }
            this.u.removeMessages(1);
            Handler handler = this.u;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.t + 300);
        }
    }

    public void e(m6 m6Var) {
        if (m6Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.o.equals(m6Var)) {
            this.o = m6Var;
            if (this.s) {
                this.c.k(this.f);
                this.c.a(m6Var, this.f, 1);
            }
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(List<n6.f> list) {
        this.t = SystemClock.uptimeMillis();
        this.p.clear();
        this.p.addAll(list);
        this.q.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
        this.c.a(this.o, this.f, 1);
        d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.mr_chooser_dialog);
        this.p = new ArrayList<>();
        this.q = new c(getContext(), this.p);
        ListView listView = (ListView) findViewById(C0707R.id.mr_chooser_list);
        this.r = listView;
        listView.setAdapter((ListAdapter) this.q);
        this.r.setOnItemClickListener(this.q);
        this.r.setEmptyView(findViewById(16908292));
        this.n = (TextView) findViewById(C0707R.id.mr_chooser_title);
        getWindow().setLayout(g.a(getContext()), -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.s = false;
        this.c.k(this.f);
        this.u.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.n.setText(charSequence);
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setTitle(int i) {
        this.n.setText(i);
    }
}
