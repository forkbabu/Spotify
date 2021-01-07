package com.google.common.io;

import com.google.common.primitives.Ints;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

public final class ByteStreams {
    static {
        new OutputStream() {
            /* class com.google.common.io.ByteStreams.AnonymousClass1 */

            @Override // java.lang.Object
            public String toString() {
                return "ByteStreams.nullOutputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) {
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr) {
                bArr.getClass();
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                bArr.getClass();
            }
        };
    }

    private static byte[] combineBuffers(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return combineBuffers(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            i = Ints.saturatedCast(((long) i) * ((long) 2));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
