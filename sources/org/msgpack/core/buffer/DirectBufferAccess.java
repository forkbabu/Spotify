package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public class DirectBufferAccess {
    static Constructor byteBufferConstructor;
    static DirectBufferConstructorType directBufferConstructorType;
    static Class<?> directByteBufferClass;
    static Method mClean;
    static Method mCleaner;
    static Method mGetAddress;
    static Method memoryBlockWrapFromJni;

    /* renamed from: org.msgpack.core.buffer.DirectBufferAccess$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;

        static {
            DirectBufferConstructorType.values();
            int[] iArr = new int[4];
            $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType = iArr;
            try {
                DirectBufferConstructorType directBufferConstructorType = DirectBufferConstructorType.ARGS_LONG_INT_REF;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;
                DirectBufferConstructorType directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;
                DirectBufferConstructorType directBufferConstructorType3 = DirectBufferConstructorType.ARGS_INT_INT;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;
                DirectBufferConstructorType directBufferConstructorType4 = DirectBufferConstructorType.ARGS_MB_INT_INT;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public enum DirectBufferConstructorType {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        DirectBufferConstructorType directBufferConstructorType2;
        Constructor<?> constructor;
        try {
            Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass("java.nio.DirectByteBuffer");
            directByteBufferClass = loadClass;
            Method method = null;
            try {
                constructor = loadClass.getDeclaredConstructor(Long.TYPE, Integer.TYPE, Object.class);
                directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT_REF;
            } catch (NoSuchMethodException unused) {
                try {
                    constructor = directByteBufferClass.getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                    directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT;
                } catch (NoSuchMethodException unused2) {
                    try {
                        Class<?> cls = directByteBufferClass;
                        Class<?> cls2 = Integer.TYPE;
                        constructor = cls.getDeclaredConstructor(cls2, cls2);
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_INT_INT;
                    } catch (NoSuchMethodException unused3) {
                        Class<?> cls3 = Class.forName("java.nio.MemoryBlock");
                        Class<?> cls4 = Integer.TYPE;
                        method = cls3.getDeclaredMethod("wrapFromJni", cls4, Long.TYPE);
                        method.setAccessible(true);
                        constructor = directByteBufferClass.getDeclaredConstructor(cls3, cls4, cls4);
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_MB_INT_INT;
                    }
                }
            }
            byteBufferConstructor = constructor;
            directBufferConstructorType = directBufferConstructorType2;
            memoryBlockWrapFromJni = method;
            if (constructor != null) {
                constructor.setAccessible(true);
                Method declaredMethod = directByteBufferClass.getDeclaredMethod("address", new Class[0]);
                mGetAddress = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = directByteBufferClass.getDeclaredMethod("cleaner", new Class[0]);
                mCleaner = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = mCleaner.getReturnType().getDeclaredMethod("clean", new Class[0]);
                mClean = declaredMethod3;
                declaredMethod3.setAccessible(true);
                return;
            }
            throw new RuntimeException("Constructor of DirectByteBuffer is not found");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private DirectBufferAccess() {
    }

    static void clean(Object obj) {
        try {
            mClean.invoke(mCleaner.invoke(obj, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    static long getAddress(Object obj) {
        try {
            return ((Long) mGetAddress.invoke(obj, new Object[0])).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    static ByteBuffer newByteBuffer(long j, int i, int i2, ByteBuffer byteBuffer) {
        try {
            int ordinal = directBufferConstructorType.ordinal();
            if (ordinal == 0) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j + ((long) i)), Integer.valueOf(i2), byteBuffer);
            }
            if (ordinal == 1) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j + ((long) i)), Integer.valueOf(i2));
            }
            if (ordinal == 2) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Integer.valueOf(((int) j) + i), Integer.valueOf(i2));
            }
            if (ordinal == 3) {
                return (ByteBuffer) byteBufferConstructor.newInstance(memoryBlockWrapFromJni.invoke(null, Long.valueOf(j + ((long) i)), Integer.valueOf(i2)), Integer.valueOf(i2), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
