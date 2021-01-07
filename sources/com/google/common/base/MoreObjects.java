package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;

        /* access modifiers changed from: private */
        public static final class ValueHolder {
            String name;
            ValueHolder next;
            Object value;

            ValueHolder(AnonymousClass1 r1) {
            }
        }

        ToStringHelper(String str, AnonymousClass1 r3) {
            ValueHolder valueHolder = new ValueHolder(null);
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.className = str;
        }

        private ToStringHelper addHolder(String str, Object obj) {
            ValueHolder valueHolder = new ValueHolder(null);
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            valueHolder.value = obj;
            str.getClass();
            valueHolder.name = str;
            return this;
        }

        public ToStringHelper add(String str, Object obj) {
            addHolder(str, obj);
            return this;
        }

        public ToStringHelper addValue(Object obj) {
            ValueHolder valueHolder = new ValueHolder(null);
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            valueHolder.value = obj;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            ValueHolder valueHolder = this.holderHead.next;
            String str = "";
            while (valueHolder != null) {
                Object obj = valueHolder.value;
                sb.append(str);
                String str2 = valueHolder.name;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                valueHolder = valueHolder.next;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper add(String str, int i) {
            addHolder(str, String.valueOf(i));
            return this;
        }

        public ToStringHelper add(String str, long j) {
            addHolder(str, String.valueOf(j));
            return this;
        }
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        predicate.getClass();
        predicate2.getClass();
        return new Predicates$AndPredicate(Arrays.asList(predicate, predicate2), null);
    }

    private static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(je.p0("negative size: ", i2));
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            str2 = lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(je.p0("negative size: ", i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(badPositionIndex(i, i2, "index"));
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = badPositionIndex(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = badPositionIndex(i2, i3, "end index");
            } else {
                str = lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new Predicates$CompositionPredicate(predicate, function, null);
    }

    public static String emptyToNull(String str) {
        int i = Platform.a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static <T> T firstNonNull(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new Predicates$InstanceOfPredicate(cls, null);
    }

    public static boolean isNullOrEmpty(String str) {
        int i = Platform.a;
        return str == null || str.isEmpty();
    }

    public static String lenientFormat(String str, Object... objArr) {
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj = objArr[i2];
                try {
                    str2 = String.valueOf(obj);
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
                objArr[i2] = str2;
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        if ((supplier instanceof Suppliers$NonSerializableMemoizingSupplier) || (supplier instanceof Suppliers$MemoizingSupplier)) {
            return supplier;
        }
        return supplier instanceof Serializable ? new Suppliers$MemoizingSupplier(supplier) : new Suppliers$NonSerializableMemoizingSupplier(supplier);
    }

    public static <T> Predicate<T> notNull() {
        return Predicates$ObjectPredicate.NOT_NULL;
    }

    public static String nullToEmpty(String str) {
        int i = Platform.a;
        return str == null ? "" : str;
    }

    public static <T> Supplier<T> ofInstance(T t) {
        return new Suppliers$SupplierOfInstance(t);
    }

    public static String repeat(String str, int i) {
        boolean z = false;
        if (i <= 1) {
            if (i >= 0) {
                z = true;
            }
            checkArgument(z, "invalid count: %s", i);
            return i == 0 ? "" : str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (((long) i2) == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(je.t0("Required array size too large: ", j));
        }
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName(), null);
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T> T checkNotNull(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(lenientFormat(str, obj));
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(lenientFormat(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t, String str, Object obj, Object obj2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(lenientFormat(str, Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(lenientFormat(str, Character.valueOf(c)));
        }
    }

    public static void checkState(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(lenientFormat(str, Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(lenientFormat(str, Integer.valueOf(i)));
        }
    }

    public static void checkState(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(lenientFormat(str, Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(lenientFormat(str, Long.valueOf(j), obj));
        }
    }

    public static void checkArgument(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(lenientFormat(str, obj, obj2));
        }
    }
}
