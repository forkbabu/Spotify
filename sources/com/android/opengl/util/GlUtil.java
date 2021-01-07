package com.android.opengl.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class GlUtil {
    private static final String a = String.format(Locale.US, "attribute vec4 %1$s;      \nattribute vec3 %2$s;      \nvarying vec2 v_texcoord;  \nvoid main() {             \n  gl_Position = %1$s;     \n  v_texcoord = %2$s.xy;   \n}                         \n", "a_position", "a_texcoord");
    public static final Set<String> b;
    private static final int[] c = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    public static final class UnsupportedEglVersionException extends Exception {
        private static final long serialVersionUID = 42;
    }

    public static final class a {
        private final int a;
        private Buffer b;
        private int c;

        public a(int i, String str) {
            this.a = GLES20.glGetAttribLocation(i, str);
        }

        public void a() {
            if (this.b != null) {
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(this.a, this.c, 5126, false, 0, this.b);
                GLES20.glEnableVertexAttribArray(this.a);
                GlUtil.b();
                return;
            }
            throw new IllegalStateException("call setBuffer before bind");
        }

        public void b(float[] fArr, int i) {
            Set<String> set = GlUtil.b;
            this.b = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
            this.c = i;
        }
    }

    public static final class b {
        private final int a;
        private int b;
        private int c;

        public b(int i, String str) {
            this.a = GLES20.glGetUniformLocation(i, str);
        }

        public void a() {
            if (this.b != 0) {
                GLES20.glActiveTexture(this.c + 33984);
                GLES20.glBindTexture(36197, this.b);
                GLES20.glUniform1i(this.a, this.c);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GlUtil.b();
                return;
            }
            throw new IllegalStateException("call setSamplerTexId before bind");
        }

        public void b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("shamu");
        hashSet.add("angler");
        hashSet.add("bullhead");
    }

    /* access modifiers changed from: private */
    public static void b() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder V0 = je.V0("gl error: ");
            V0.append(Integer.toHexString(glGetError));
            throw new RuntimeException(V0.toString());
        }
    }

    private static int c(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            throw new RuntimeException("could not compile shader " + i + ':' + glGetShaderInfoLog);
        }
        StringBuilder V0 = je.V0("could not create shader: ");
        V0.append(GLES20.glGetError());
        throw new RuntimeException(V0.toString());
    }

    private static String d(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(Constants.ENCODING)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append('\n');
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public static EGLContext e(EGLDisplay eGLDisplay) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, j(eGLDisplay), EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new UnsupportedEglVersionException();
    }

    public static EGLSurface f(EGLDisplay eGLDisplay) {
        return EGL14.eglCreatePbufferSurface(eGLDisplay, j(eGLDisplay), new int[]{12375, 1, 12374, 1, 12344}, 0);
    }

    public static void g(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    int eglGetError2 = EGL14.eglGetError();
                    if (eglGetError2 != 12288) {
                        throw new RuntimeException(je.p0("error destroying context: ", eglGetError2));
                    }
                }
                EGL14.eglTerminate(eGLDisplay);
                int eglGetError3 = EGL14.eglGetError();
                if (eglGetError3 != 12288) {
                    throw new RuntimeException(je.p0("error terminating display: ", eglGetError3));
                }
                return;
            }
            throw new RuntimeException(je.p0("error releasing context: ", eglGetError));
        }
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b();
        return iArr[0];
    }

    public static int i(boolean z) {
        String str;
        String m = z ? m("/sdcard/Android/data/com.spotify.music.debug/files/shader.vert", a) : a;
        if (z) {
            str = m("/sdcard/Android/data/com.spotify.music.debug/files/shader.frag", l());
        } else {
            str = l();
        }
        int c2 = c(35633, m);
        int c3 = c(35632, str);
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, c2);
            GLES20.glAttachShader(glCreateProgram, c3);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException(je.x0("could not link shader ", glGetProgramInfoLog));
        }
        throw new RuntimeException("could not create shader program");
    }

    private static EGLConfig j(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, c, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("eglChooseConfig failed");
    }

    public static EGLSurface k(EGLDisplay eGLDisplay, Object obj) {
        return EGL14.eglCreateWindowSurface(eGLDisplay, j(eGLDisplay), obj, new int[]{12344}, 0);
    }

    private static String l() {
        return (!b.contains(Build.DEVICE) || Build.VERSION.SDK_INT < 23) ? "#extension GL_OES_EGL_image_external : require                   \nprecision mediump float;                                         \nuniform samplerExternalOES tex_sampler_0;                        \nuniform mat4 u_transform_mat;                                    \nvarying vec2 v_texcoord;                                         \nvoid main() {                                                    \n  vec2 texCoord = (u_transform_mat * vec4(v_texcoord, 0, 1)).st; \n  gl_FragColor = texture2D(tex_sampler_0, texCoord);             \n}                                                                \n" : "#extension GL_OES_EGL_image_external : require                                                               \nprecision mediump float;                                                                                     \nuniform samplerExternalOES tex_sampler_0;                                                                    \nvarying vec2 v_texcoord;                                                                                     \nvoid main() {                                                                                                \n  mat4 transformMat = mat4(1.0, 0.0, 0.0, 0.0, 0.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0); \n  vec2 texCoord = (transformMat * vec4(v_texcoord, 0, 1)).st;                                                \n  gl_FragColor = texture2D(tex_sampler_0, texCoord);                                                         \n}                                                                                                            \n";
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[SYNTHETIC, Splitter:B:17:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0034 A[SYNTHETIC, Splitter:B:24:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "Exception during closing file."
            r1 = 0
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0031, all -> 0x0022 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0031, all -> 0x0022 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0031, all -> 0x0022 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0031, all -> 0x0022 }
            java.lang.String r5 = d(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r4.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r4, r0, r1)
        L_0x001c:
            return r5
        L_0x001d:
            r5 = move-exception
            r2 = r4
            goto L_0x0024
        L_0x0020:
            r2 = r4
            goto L_0x0032
        L_0x0022:
            r4 = move-exception
            r5 = r4
        L_0x0024:
            if (r2 == 0) goto L_0x0030
            r2.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0030
        L_0x002a:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r4, r0, r1)
        L_0x0030:
            throw r5
        L_0x0031:
        L_0x0032:
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r4 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.e(r4, r0, r1)
        L_0x003e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.opengl.util.GlUtil.m(java.lang.String, java.lang.String):java.lang.String");
    }
}
