package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: c4  reason: default package */
public final class c4 {
    private final a a;

    /* access modifiers changed from: package-private */
    /* renamed from: c4$a */
    public interface a {
        void a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        boolean b(MotionEvent motionEvent);
    }

    /* renamed from: c4$b */
    static class b implements a {
        private static final int v = ViewConfiguration.getLongPressTimeout();
        private static final int w = ViewConfiguration.getTapTimeout();
        private static final int x = ViewConfiguration.getDoubleTapTimeout();
        private int a;
        private int b;
        private int c;
        private int d;
        private final Handler e;
        final GestureDetector.OnGestureListener f;
        GestureDetector.OnDoubleTapListener g;
        boolean h;
        boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        MotionEvent m;
        private MotionEvent n;
        private boolean o;
        private float p;
        private float q;
        private float r;
        private float s;
        private boolean t;
        private VelocityTracker u;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.e = new a(handler);
            } else {
                this.e = new a();
            }
            this.f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                this.g = (GestureDetector.OnDoubleTapListener) onGestureListener;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (onGestureListener != null) {
                this.t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.a = scaledTouchSlop * scaledTouchSlop;
                this.b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        @Override // defpackage.c4.a
        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.g = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:106:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0279  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0290  */
        @Override // defpackage.c4.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(android.view.MotionEvent r14) {
            /*
            // Method dump skipped, instructions count: 704
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.c4.b.b(android.view.MotionEvent):boolean");
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.e.removeMessages(3);
            this.i = false;
            this.j = true;
            this.f.onLongPress(this.m);
        }

        /* renamed from: c4$b$a */
        private class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    b bVar = b.this;
                    bVar.f.onShowPress(bVar.m);
                } else if (i == 2) {
                    b.this.c();
                } else if (i == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.m);
                    } else {
                        bVar2.i = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* renamed from: c4$c */
    static class c implements a {
        private final GestureDetector a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // defpackage.c4.a
        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // defpackage.c4.a
        public boolean b(MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
    }

    public c4(Context context, GestureDetector.OnGestureListener onGestureListener) {
        if (Build.VERSION.SDK_INT > 17) {
            this.a = new c(context, onGestureListener, null);
        } else {
            this.a = new b(context, onGestureListener, null);
        }
    }

    public boolean a(MotionEvent motionEvent) {
        return this.a.b(motionEvent);
    }

    public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a.a(onDoubleTapListener);
    }
}
