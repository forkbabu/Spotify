package com.google.android.exoplayer2.video;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.o;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class n implements GLSurfaceView.Renderer, m {
    private static final float[] j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
    private static final float[] k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    private static final float[] l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
    private static final String[] m = {"y_tex", "u_tex", "v_tex"};
    private static final FloatBuffer n = o.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    private final int[] a = new int[3];
    private final AtomicReference<VideoDecoderOutputBuffer> b = new AtomicReference<>();
    private FloatBuffer[] c = new FloatBuffer[3];
    private int d;
    private int[] e = new int[3];
    private int f;
    private int[] g = new int[3];
    private int[] h = new int[3];
    private VideoDecoderOutputBuffer i;

    public n(GLSurfaceView gLSurfaceView) {
        for (int i2 = 0; i2 < 3; i2++) {
            int[] iArr = this.g;
            this.h[i2] = -1;
            iArr[i2] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        VideoDecoderOutputBuffer andSet = this.b.getAndSet(null);
        if (!(andSet == null && this.i == null)) {
            if (andSet != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.i;
                if (videoDecoderOutputBuffer != null) {
                    videoDecoderOutputBuffer.release();
                }
                this.i = andSet;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.i;
            float[] fArr = k;
            int i2 = videoDecoderOutputBuffer2.colorspace;
            if (i2 == 1) {
                fArr = j;
            } else if (i2 == 3) {
                fArr = l;
            }
            GLES20.glUniformMatrix3fv(this.f, 1, false, fArr, 0);
            int i3 = 0;
            while (i3 < 3) {
                int i4 = i3 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.a[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, videoDecoderOutputBuffer2.yuvStrides[i3], i4, 0, 6409, 5121, videoDecoderOutputBuffer2.yuvPlanes[i3]);
                i3++;
            }
            int[] iArr = new int[3];
            iArr[0] = videoDecoderOutputBuffer2.width;
            int i5 = (iArr[0] + 1) / 2;
            iArr[2] = i5;
            iArr[1] = i5;
            for (int i6 = 0; i6 < 3; i6++) {
                if (this.g[i6] != iArr[i6] || this.h[i6] != videoDecoderOutputBuffer2.yuvStrides[i6]) {
                    g.m(videoDecoderOutputBuffer2.yuvStrides[i6] != 0);
                    float f2 = ((float) iArr[i6]) / ((float) videoDecoderOutputBuffer2.yuvStrides[i6]);
                    this.c[i6] = o.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f2, 0.0f, f2, 1.0f});
                    GLES20.glVertexAttribPointer(this.e[i6], 2, 5126, false, 0, (Buffer) this.c[i6]);
                    this.g[i6] = iArr[i6];
                    this.h[i6] = videoDecoderOutputBuffer2.yuvStrides[i6];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            o.c();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int d2 = o.d("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.d = d2;
        GLES20.glUseProgram(d2);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.d, "in_pos");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) n);
        this.e[0] = GLES20.glGetAttribLocation(this.d, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.e[0]);
        this.e[1] = GLES20.glGetAttribLocation(this.d, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.e[1]);
        this.e[2] = GLES20.glGetAttribLocation(this.d, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.e[2]);
        o.c();
        this.f = GLES20.glGetUniformLocation(this.d, "mColorConversion");
        o.c();
        GLES20.glGenTextures(3, this.a, 0);
        for (int i2 = 0; i2 < 3; i2++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.d, m[i2]), i2);
            GLES20.glActiveTexture(33984 + i2);
            GLES20.glBindTexture(3553, this.a[i2]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        o.c();
        o.c();
    }
}
