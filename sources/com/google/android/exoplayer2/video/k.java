package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;

public final class k extends Surface {
    private static int c;
    private static boolean f;
    private final b a;
    private boolean b;

    private static class b extends HandlerThread implements Handler.Callback {
        private EGLSurfaceTexture a;
        private Handler b;
        private Error c;
        private RuntimeException f;
        private k n;

        public b() {
            super("dummySurface");
        }

        private void b(int i) {
            this.a.getClass();
            this.a.b(i);
            this.n = new k(this, this.a.a(), i != 0, null);
        }

        public k a(int i) {
            boolean z;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.b = handler;
            this.a = new EGLSurfaceTexture(handler);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, i, 0).sendToTarget();
                while (this.n == null && this.f == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f;
            if (runtimeException == null) {
                Error error = this.c;
                if (error == null) {
                    k kVar = this.n;
                    kVar.getClass();
                    return kVar;
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            this.b.getClass();
            this.b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.f = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                        this.c = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    this.a.getClass();
                    this.a.c();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    k(b bVar, SurfaceTexture surfaceTexture, boolean z, a aVar) {
        super(surfaceTexture);
        this.a = bVar;
    }

    private static int a(Context context) {
        String eglQueryString;
        int i = f0.a;
        if (i < 26 && ("samsung".equals(f0.c) || "XT1650".equals(f0.d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (k.class) {
            z = true;
            if (!f) {
                c = f0.a < 24 ? 0 : a(context);
                f = true;
            }
            if (c == 0) {
                z = false;
            }
        }
        return z;
    }

    public static k c(Context context, boolean z) {
        if (f0.a >= 17) {
            int i = 0;
            g.m(!z || b(context));
            b bVar = new b();
            if (z) {
                i = c;
            }
            return bVar.a(i);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.a) {
            if (!this.b) {
                this.a.c();
                this.b = true;
            }
        }
    }
}
