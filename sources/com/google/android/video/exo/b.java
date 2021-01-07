package com.google.android.video.exo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.Surface;
import com.android.opengl.util.GlUtil;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.s;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.exo.AggregateException;
import com.spotify.mobile.android.video.exo.g;
import java.util.Set;

public class b extends MediaCodecVideoRenderer {
    private int A1;
    private int B1;
    private EGLSurface C1;
    private Surface D1;
    private volatile boolean E1;
    private volatile boolean F1;
    private final g G1;
    private float[] H1;
    private a r1;
    private SurfaceTexture s1;
    private int t1;
    private int u1;
    private GlUtil.a v1;
    private GlUtil.a w1;
    private GlUtil.b x1;
    private int y1;
    private Surface z1;

    /* access modifiers changed from: private */
    public static final class a {
        public EGLDisplay a;
        public EGLContext b;
        public EGLSurface c;

        a(a aVar) {
        }
    }

    private b(Context context, boolean z, long j, Handler handler, g gVar, int i) {
        super(context, f.a, j, z, handler, gVar, i);
        this.G1 = gVar;
    }

    public static b X0(Context context, boolean z, long j, Handler handler, s sVar, int i) {
        return new b(context, z, j, handler, new g(sVar, handler), i);
    }

    private void Y0() {
        EGLSurface eGLSurface = this.C1;
        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
            a aVar = this.r1;
            EGLDisplay eGLDisplay = aVar.a;
            EGLSurface eGLSurface2 = aVar.c;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, aVar.b);
            EGL14.eglDestroySurface(this.r1.a, this.C1);
            int eglGetError = EGL14.eglGetError();
            if (eglGetError != 12288) {
                Logger.d("Error detaching the surface: %d", Integer.valueOf(eglGetError));
            }
        }
    }

    public void Z0() {
        AggregateException aggregateException = new AggregateException();
        if (this.r1 != null) {
            try {
                Y0();
            } catch (Exception e) {
                aggregateException.a(e);
            }
            try {
                a aVar = this.r1;
                aVar.getClass();
                try {
                    GlUtil.g(aVar.a, aVar.b);
                } finally {
                    aVar.a = null;
                    aVar.b = null;
                    aVar.c = null;
                }
            } catch (Exception e2) {
                aggregateException.a(e2);
            }
            this.D1.release();
            this.s1.release();
        }
        if (!aggregateException.b()) {
            throw aggregateException;
        }
    }

    @Override // com.google.android.exoplayer2.video.MediaCodecVideoRenderer, com.google.android.exoplayer2.t, com.google.android.exoplayer2.n0.b
    public void l(int i, Object obj) {
        if (i == 1) {
            if (this.r1 == null) {
                a aVar = new a(null);
                this.r1 = aVar;
                try {
                    Set<String> set = GlUtil.b;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                        throw new IllegalStateException("no EGL display");
                    } else if (EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
                        aVar.a = eglGetDisplay;
                        a aVar2 = this.r1;
                        aVar2.b = GlUtil.e(aVar2.a);
                        a aVar3 = this.r1;
                        aVar3.c = GlUtil.f(aVar3.a);
                        a aVar4 = this.r1;
                        EGLDisplay eGLDisplay = aVar4.a;
                        EGLContext eGLContext = aVar4.b;
                        EGLSurface eGLSurface = aVar4.c;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                        GLES20.glViewport(0, 0, 1, 1);
                        GLES20.glScissor(0, 0, 1, 1);
                        int i2 = GlUtil.i(false);
                        this.u1 = i2;
                        this.v1 = new GlUtil.a(i2, "a_position");
                        this.w1 = new GlUtil.a(this.u1, "a_texcoord");
                        this.x1 = new GlUtil.b(this.u1, "tex_sampler_0");
                        this.y1 = GLES20.glGetUniformLocation(this.u1, "u_transform_mat");
                        this.v1.b(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f}, 4);
                        this.w1.b(new float[]{0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f}, 3);
                        this.t1 = GlUtil.h();
                        this.s1 = new SurfaceTexture(this.t1);
                        Surface surface = new Surface(this.s1);
                        this.D1 = surface;
                        super.l(1, surface);
                        float[] fArr = new float[16];
                        this.H1 = fArr;
                        Matrix.setIdentityM(fArr, 0);
                        this.F1 = false;
                        this.s1.setOnFrameAvailableListener(new a(this));
                    } else {
                        throw new IllegalStateException("error in eglInitialize");
                    }
                } catch (GlUtil.UnsupportedEglVersionException e) {
                    throw ExoPlaybackException.b(e, A(), null, 0);
                }
            }
            Y0();
            this.G1.c();
            this.z1 = (Surface) obj;
            this.C1 = EGL14.EGL_NO_SURFACE;
            return;
        }
        super.l(i, obj);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.p0
    public void s(long j, long j2) {
        Surface surface = this.z1;
        if (surface != null && surface.isValid() && this.F1) {
            if (this.C1 == EGL14.EGL_NO_SURFACE) {
                Logger.b("Building output EGL surface", new Object[0]);
                EGLSurface k = GlUtil.k(this.r1.a, this.z1);
                this.C1 = k;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(this.r1.a, k, 12375, iArr, 0);
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(this.r1.a, this.C1, 12374, iArr2, 0);
                this.A1 = iArr[0];
                this.B1 = iArr2[0];
                this.E1 = true;
            }
            a aVar = this.r1;
            EGLDisplay eGLDisplay = aVar.a;
            EGLContext eGLContext = aVar.b;
            EGLSurface eGLSurface = this.C1;
            int i = this.A1;
            int i2 = this.B1;
            Set<String> set = GlUtil.b;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glScissor(0, 0, i, i2);
            this.s1.updateTexImage();
            this.s1.getTransformMatrix(this.H1);
            if (this.E1) {
                GLES20.glUseProgram(this.u1);
                GLES20.glUniformMatrix4fv(this.y1, 1, false, this.H1, 0);
                this.x1.b(this.t1, 0);
                this.v1.a();
                this.w1.a();
                this.x1.a();
                GLES20.glDrawArrays(5, 0, 4);
                EGL14.eglSwapBuffers(this.r1.a, this.C1);
                this.E1 = false;
            }
            this.G1.b(this.z1);
        }
        super.s(j, j2);
    }
}
