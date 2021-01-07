package com.spotify.libs.instrumentation.performance;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.spotify.libs.instrumentation.performance.l;
import com.spotify.messages.ViewLoadSequence;
import com.spotify.mobile.android.util.connectivity.r;
import com.spotify.performancesdk.timekeeper.m;
import java.util.LinkedHashMap;
import java.util.UUID;

public class ViewLoadingTracker {
    private final String a;
    private final String b;
    private final View c;
    private final Handler d;
    private final int e;
    String f;
    private String g;
    private final r h;
    private final m i;
    private final Context j;
    private volatile State k;
    private final LinkedHashMap<String, Long> l = new LinkedHashMap<>();
    private final LinkedHashMap<String, String> m;
    private final l n;
    private boolean o;

    public enum DataSource {
        CACHE("cache"),
        REMOTE("remote"),
        UNKNOWN("unknown");
        
        private final String mSource;

        private DataSource(String str) {
            this.mSource = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mSource;
        }
    }

    public enum MetadataKey {
        DATASOURCE("data-source"),
        REASON("reason"),
        RESTORED_SEQUENCE_ID("restored_sequence_id"),
        IMAGES_ABOVE_THE_FOLD("images-above-the-fold"),
        IMAGES_HAD_TIMEOUT("images-had-timeout"),
        ACTUAL_USABLE_STATE("actual_usable_state");
        
        private final String mKey;

        private MetadataKey(String str) {
            this.mKey = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mKey;
        }
    }

    public enum Reason {
        LOAD(TrackLoadSettingsAtom.TYPE),
        RELOAD("reload"),
        UNKNOWN("unknown");
        
        private final String mReason;

        private Reason(String str) {
            this.mReason = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mReason;
        }
    }

    public enum State {
        INITIALIZED,
        STARTED,
        DATA_LOADED,
        LAYOUT_STARTED,
        LAYOUT_COMPLETED,
        CANCELLED,
        FAILED
    }

    public enum Step {
        STARTED("started"),
        RESTORED("restored"),
        DATA_LOADED("data_loaded"),
        CANCELLED("cancelled"),
        FINISHED("finished"),
        FAILED("failed"),
        IMAGE_LOADING_STARTED("image_loading_started"),
        IMAGE_LOADING_FINISHED("image_loading_finished");
        
        private final String mStrValue;

        private Step(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements l.b {
        a() {
        }

        public void a(int i, int i2) {
            ViewLoadingTracker.b(ViewLoadingTracker.this, MetadataKey.IMAGES_ABOVE_THE_FOLD, String.valueOf(i));
            if (i2 > 0) {
                ViewLoadingTracker.b(ViewLoadingTracker.this, MetadataKey.IMAGES_HAD_TIMEOUT, String.valueOf(i2));
            }
            ViewLoadingTracker.this.s(Step.IMAGE_LOADING_FINISHED);
            if (ViewLoadingTracker.this.m.containsKey(MetadataKey.ACTUAL_USABLE_STATE.toString())) {
                ViewLoadingTracker.this.u(Step.FINISHED);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewLoadingTracker.d(ViewLoadingTracker.this, this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnLayoutChangeListener {
        final /* synthetic */ View a;

        c(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a.removeOnLayoutChangeListener(this);
            Choreographer.getInstance().postFrameCallback(new e(this));
        }
    }

    public ViewLoadingTracker(View view, r rVar, m mVar, String str, Bundle bundle, Handler handler, Context context) {
        State state = State.LAYOUT_COMPLETED;
        State state2 = State.INITIALIZED;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        this.m = linkedHashMap;
        this.c = view;
        this.h = rVar;
        this.i = mVar;
        this.d = handler;
        this.j = context;
        this.b = str;
        this.a = UUID.randomUUID().toString();
        this.e = qf.c(context);
        this.n = new l(context, new a());
        if (bundle != null) {
            this.o = true;
            this.f = bundle.getString("ViewLoadingTracker.PAGE_ID");
            MetadataKey metadataKey = MetadataKey.RESTORED_SEQUENCE_ID;
            linkedHashMap.put(metadataKey.toString(), bundle.getString("ViewLoadingTracker.SEQUENCE_ID"));
            s(Step.RESTORED);
            String string = bundle.getString("ViewLoadingTracker.STATE");
            if (string == null) {
                this.k = state;
                return;
            }
            try {
                int ordinal = State.valueOf(string).ordinal();
                if (ordinal == 0) {
                    this.k = state2;
                } else if (ordinal == 1) {
                    this.k = state2;
                    w();
                } else if (ordinal == 2) {
                    this.k = State.STARTED;
                    g();
                } else if (ordinal != 3) {
                    this.k = state;
                } else {
                    this.k = State.DATA_LOADED;
                    p();
                }
            } catch (IllegalArgumentException unused) {
                this.k = state;
            }
        } else {
            this.k = state2;
        }
    }

    static void b(ViewLoadingTracker viewLoadingTracker, MetadataKey metadataKey, String str) {
        viewLoadingTracker.m.put(metadataKey.toString(), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r1 = r4.getChildAt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ((r1 instanceof android.view.ViewGroup) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r0 = r4.getChildCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0 < 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void d(com.spotify.libs.instrumentation.performance.ViewLoadingTracker r3, android.view.View r4) {
        /*
            r3.getClass()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0042
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x0009:
            int r0 = r4.getChildCount()
        L_0x000d:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001a
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x000d
            goto L_0x002f
        L_0x001a:
            int r0 = r4.getChildCount()
        L_0x001e:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x002e
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x001e
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0009
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 != 0) goto L_0x0035
            r3.q()
            goto L_0x0045
        L_0x0035:
            android.view.ViewTreeObserver r4 = r1.getViewTreeObserver()
            com.spotify.libs.instrumentation.performance.s r0 = new com.spotify.libs.instrumentation.performance.s
            r0.<init>(r3, r1)
            r4.addOnGlobalLayoutListener(r0)
            goto L_0x0045
        L_0x0042:
            r3.q()
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.instrumentation.performance.ViewLoadingTracker.d(com.spotify.libs.instrumentation.performance.ViewLoadingTracker, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public void q() {
        Choreographer.getInstance().postFrameCallback(new f(this));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s(Step step) {
        this.l.put(step.toString(), Long.valueOf(this.i.a()));
    }

    private void v(Step step) {
        String connectionType = r.a(this.j).toString();
        ViewLoadSequence.b x = ViewLoadSequence.x();
        x.r(this.a);
        x.u(this.b);
        x.t(step.toString());
        x.s(connectionType);
        x.n(this.l);
        x.m(this.m);
        x.o(this.e);
        String str = this.f;
        if (str != null) {
            x.q(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            x.p(str2);
        }
        this.h.d((ViewLoadSequence) x.build());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public synchronized void n(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new b(view));
        view.addOnLayoutChangeListener(new c(view));
    }

    public synchronized void f() {
        State state = State.CANCELLED;
        synchronized (this) {
            if (this.k != State.STARTED) {
                if (this.k != State.DATA_LOADED) {
                    if (this.k == State.LAYOUT_STARTED) {
                        this.n.h();
                        this.k = state;
                        u(Step.FINISHED);
                    }
                }
            }
            this.n.h();
            this.k = state;
            Step step = Step.CANCELLED;
            s(step);
            u(step);
        }
    }

    public synchronized void g() {
        DataSource dataSource = DataSource.UNKNOWN;
        synchronized (this) {
            i(dataSource, this.c);
        }
    }

    public synchronized void h(DataSource dataSource) {
        i(dataSource, this.c);
    }

    public synchronized void i(DataSource dataSource, View view) {
        if (this.k == State.STARTED) {
            Step step = Step.DATA_LOADED;
            s(step);
            if (dataSource != DataSource.UNKNOWN) {
                MetadataKey metadataKey = MetadataKey.DATASOURCE;
                this.m.put(metadataKey.toString(), dataSource.toString());
            }
            if (view == null) {
                u(step);
                this.k = State.LAYOUT_COMPLETED;
            } else {
                this.k = State.DATA_LOADED;
                if (this.d.getLooper() == Looper.myLooper()) {
                    n(view);
                } else {
                    this.d.post(new g(this, view));
                }
            }
        }
    }

    public synchronized void j() {
        if (this.k == State.STARTED) {
            this.n.h();
            this.k = State.FAILED;
            Step step = Step.FAILED;
            s(step);
            u(step);
        }
    }

    public boolean k() {
        return this.k == State.LAYOUT_COMPLETED || this.k == State.CANCELLED || this.k == State.FAILED;
    }

    public boolean l() {
        return this.k == State.DATA_LOADED;
    }

    public boolean m() {
        return this.k == State.STARTED;
    }

    public void o(long j2) {
        synchronized (this) {
            if (this.k == State.LAYOUT_STARTED) {
                this.k = State.LAYOUT_COMPLETED;
                this.n.h();
                if (!this.n.f()) {
                    u(Step.FINISHED);
                } else {
                    MetadataKey metadataKey = MetadataKey.ACTUAL_USABLE_STATE;
                    this.m.put(metadataKey.toString(), String.valueOf(this.i.a()));
                }
            }
        }
    }

    public synchronized void p() {
        if (this.k == State.DATA_LOADED) {
            this.k = State.LAYOUT_STARTED;
            Step step = Step.FINISHED;
            s(step);
            if (!this.o) {
                v(step);
            }
        }
    }

    public synchronized void r(String str) {
        this.f = str;
    }

    public synchronized void t(Bundle bundle) {
        State state = State.CANCELLED;
        synchronized (this) {
            bundle.putString("ViewLoadingTracker.PAGE_ID", this.f);
            bundle.putString("ViewLoadingTracker.SEQUENCE_ID", this.a);
            bundle.putString("ViewLoadingTracker.STATE", this.k.toString());
            if (!(this.k == State.INITIALIZED || this.k == State.STARTED)) {
                if (this.k != State.DATA_LOADED) {
                    if (this.k == State.LAYOUT_STARTED) {
                        this.k = state;
                        u(Step.FINISHED);
                    }
                }
            }
            this.k = state;
            Step step = Step.CANCELLED;
            s(step);
            u(step);
        }
    }

    /* access modifiers changed from: protected */
    public void u(Step step) {
        String connectionType = r.a(this.j).toString();
        ViewLoadSequence.b x = ViewLoadSequence.x();
        x.r(this.a);
        x.u(this.b);
        x.t(step.toString());
        x.s(connectionType);
        x.n(this.l);
        x.m(this.m);
        x.o(this.e);
        String str = this.f;
        if (str != null) {
            x.q(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            x.p(str2);
        }
        this.h.e((ViewLoadSequence) x.build());
    }

    public synchronized void w() {
        x(Reason.UNKNOWN);
    }

    public synchronized void x(Reason reason) {
        if (this.k == State.INITIALIZED) {
            this.k = State.STARTED;
            s(Step.STARTED);
            if (reason != Reason.UNKNOWN) {
                MetadataKey metadataKey = MetadataKey.REASON;
                this.m.put(metadataKey.toString(), reason.toString());
            }
            this.g = r.a(this.j).toString();
            this.n.g();
        }
    }
}
