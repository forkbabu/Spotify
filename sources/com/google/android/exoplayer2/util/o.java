package com.google.android.exoplayer2.util;

import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class o {
    private static void a(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            Log.e("GlUtil", GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        c();
    }

    public static void b(String str) {
        if (f0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void c() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder V0 = je.V0("glError ");
                V0.append(GLU.gluErrorString(glGetError));
                Log.e("GlUtil", V0.toString());
            } else {
                return;
            }
        }
    }

    public static int d(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        c();
        a(35633, str, glCreateProgram);
        a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder V0 = je.V0("Unable to link shader program: \n");
            V0.append(GLES20.glGetProgramInfoLog(glCreateProgram));
            Log.e("GlUtil", V0.toString());
        }
        c();
        return glCreateProgram;
    }

    public static FloatBuffer e(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void f() {
        if (f0.a >= 18) {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0061: APUT  (r0v1 int[]), (0 ??[int, short, byte, char]), (r7v2 int) */
    private static int[] g(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    private static String h(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] g = g(str2);
        if (g[0] != -1) {
            sb.append(str2);
            h(sb, g[1], g[2]);
            return sb.toString();
        }
        int[] g2 = g(str);
        if (g[3] == 0) {
            sb.append((CharSequence) str, 0, g2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (g[2] == 0) {
            sb.append((CharSequence) str, 0, g2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (g[1] != 0) {
            int i = g2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return h(sb, g[1] + i, i + g[2]);
        } else if (str2.charAt(g[1]) == '/') {
            sb.append((CharSequence) str, 0, g2[1]);
            sb.append(str2);
            return h(sb, g2[1], g2[1] + g[2]);
        } else if (g2[0] + 2 >= g2[1] || g2[1] != g2[2]) {
            int lastIndexOf = str.lastIndexOf(47, g2[2] - 1);
            int i2 = lastIndexOf == -1 ? g2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return h(sb, g2[1], i2 + g[2]);
        } else {
            sb.append((CharSequence) str, 0, g2[1]);
            sb.append('/');
            sb.append(str2);
            return h(sb, g2[1], g2[1] + g[2] + 1);
        }
    }

    public static Uri j(String str, String str2) {
        return Uri.parse(i(str, str2));
    }
}
