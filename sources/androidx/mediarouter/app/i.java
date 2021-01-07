package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import defpackage.n6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class i extends p {
    final n6 c;
    private final c f;
    Context n;
    private m6 o = m6.c;
    List<n6.f> p;
    private ImageButton q;
    private d r;
    private RecyclerView s;
    private boolean t;
    private long u;
    private long v;
    private final Handler w = new a();

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                i.this.g((List) message.obj);
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public final class c extends n6.a {
        c() {
        }

        @Override // defpackage.n6.a
        public void d(n6 n6Var, n6.f fVar) {
            i.this.d();
        }

        @Override // defpackage.n6.a
        public void e(n6 n6Var, n6.f fVar) {
            i.this.d();
        }

        @Override // defpackage.n6.a
        public void f(n6 n6Var, n6.f fVar) {
            i.this.d();
        }

        @Override // defpackage.n6.a
        public void g(n6 n6Var, n6.f fVar) {
            i.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public final class d extends RecyclerView.e<RecyclerView.b0> {
        private final ArrayList<b> c = new ArrayList<>();
        private final LayoutInflater f;
        private final Drawable n;
        private final Drawable o;
        private final Drawable p;
        private final Drawable q;

        private class a extends RecyclerView.b0 {
            TextView C;

            a(d dVar, View view) {
                super(view);
                this.C = (TextView) view.findViewById(C0707R.id.mr_picker_header_name);
            }
        }

        /* access modifiers changed from: private */
        public class b {
            private final Object a;
            private final int b;

            b(d dVar, Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else if (obj instanceof n6.f) {
                    this.b = 2;
                } else {
                    this.b = 0;
                }
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        /* access modifiers changed from: private */
        public class c extends RecyclerView.b0 {
            final View C;
            final ImageView D;
            final ProgressBar E;
            final TextView F;

            c(View view) {
                super(view);
                this.C = view;
                this.D = (ImageView) view.findViewById(C0707R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C0707R.id.mr_picker_route_progress_bar);
                this.E = progressBar;
                this.F = (TextView) view.findViewById(C0707R.id.mr_picker_route_name);
                m.t(i.this.n, progressBar);
            }
        }

        d() {
            this.f = LayoutInflater.from(i.this.n);
            this.n = m.g(i.this.n);
            this.o = m.q(i.this.n);
            this.p = m.m(i.this.n);
            this.q = m.n(i.this.n);
            Y();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void K(RecyclerView.b0 b0Var, int i) {
            int b2 = this.c.get(i).b();
            b bVar = this.c.get(i);
            if (b2 == 1) {
                a aVar = (a) b0Var;
                aVar.getClass();
                aVar.C.setText(bVar.a().toString());
            } else if (b2 == 2) {
                c cVar = (c) b0Var;
                cVar.getClass();
                n6.f fVar = (n6.f) bVar.a();
                cVar.C.setVisibility(0);
                cVar.E.setVisibility(4);
                cVar.C.setOnClickListener(new j(cVar, fVar));
                cVar.F.setText(fVar.k());
                cVar.D.setImageDrawable(d.this.X(fVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new a(this, this.f.inflate(C0707R.layout.mr_picker_header_item, viewGroup, false));
            }
            if (i != 2) {
                return null;
            }
            return new c(this.f.inflate(C0707R.layout.mr_picker_route_item, viewGroup, false));
        }

        /* access modifiers changed from: package-private */
        public Drawable X(n6.f fVar) {
            Uri h = fVar.h();
            if (h != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(i.this.n.getContentResolver().openInputStream(h), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    String str = "Failed to load " + h;
                }
            }
            int d = fVar.d();
            if (d == 1) {
                return this.o;
            }
            if (d == 2) {
                return this.p;
            }
            if (fVar.w()) {
                return this.q;
            }
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public void Y() {
            this.c.clear();
            this.c.add(new b(this, i.this.n.getString(C0707R.string.mr_chooser_title)));
            for (n6.f fVar : i.this.p) {
                this.c.add(new b(this, fVar));
            }
            z();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int u() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int w(int i) {
            return this.c.get(i).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Comparator<n6.f> {
        public static final e a = new e();

        e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(n6.f fVar, n6.f fVar2) {
            return fVar.k().compareToIgnoreCase(fVar2.k());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r3 = androidx.mediarouter.app.m.b(r3, r0, r0)
            int r0 = androidx.mediarouter.app.m.c(r3)
            r2.<init>(r3, r0)
            m6 r3 = defpackage.m6.c
            r2.o = r3
            androidx.mediarouter.app.i$a r3 = new androidx.mediarouter.app.i$a
            r3.<init>()
            r2.w = r3
            android.content.Context r3 = r2.getContext()
            n6 r0 = defpackage.n6.f(r3)
            r2.c = r0
            androidx.mediarouter.app.i$c r0 = new androidx.mediarouter.app.i$c
            r0.<init>()
            r2.f = r0
            r2.n = r3
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131492914(0x7f0c0032, float:1.8609293E38)
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.u = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.i.<init>(android.content.Context):void");
    }

    public void d() {
        if (this.t) {
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
            Collections.sort(arrayList, e.a);
            if (SystemClock.uptimeMillis() - this.v >= this.u) {
                this.v = SystemClock.uptimeMillis();
                this.p.clear();
                this.p.addAll(arrayList);
                this.r.Y();
                return;
            }
            this.w.removeMessages(1);
            Handler handler = this.w;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.v + this.u);
        }
    }

    public void e(m6 m6Var) {
        if (m6Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.o.equals(m6Var)) {
            this.o = m6Var;
            if (this.t) {
                this.c.k(this.f);
                this.c.a(m6Var, this.f, 1);
            }
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        getWindow().setLayout(g.b(this.n), !this.n.getResources().getBoolean(C0707R.bool.is_tablet) ? -1 : -2);
    }

    /* access modifiers changed from: package-private */
    public void g(List<n6.f> list) {
        this.v = SystemClock.uptimeMillis();
        this.p.clear();
        this.p.addAll(list);
        this.r.Y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = true;
        this.c.a(this.o, this.f, 1);
        d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.mr_picker_dialog);
        m.s(this.n, this);
        this.p = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(C0707R.id.mr_picker_close_button);
        this.q = imageButton;
        imageButton.setOnClickListener(new b());
        this.r = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(C0707R.id.mr_picker_list);
        this.s = recyclerView;
        recyclerView.setAdapter(this.r);
        this.s.setLayoutManager(new LinearLayoutManager(this.n));
        f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t = false;
        this.c.k(this.f);
        this.w.removeMessages(1);
    }
}
