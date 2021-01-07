package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.lang3.a;

/* renamed from: j62  reason: default package */
public final class j62 {
    private static boolean a(Field field, Class<?> cls) {
        Type[] actualTypeArguments;
        if (!Collection.class.isAssignableFrom(field.getType()) || (actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()) == null || actualTypeArguments.length <= 0) {
            return false;
        }
        return cls.isAssignableFrom((Class) actualTypeArguments[0]);
    }

    public static boolean b(Object obj, Bundle bundle) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (bundle == null) {
            return false;
        }
        bundle.setClassLoader(obj.getClass().getClassLoader());
        Class<?> cls = obj.getClass();
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(i62.class)) {
                    StringBuilder V0 = je.V0("SAVED_STATE_");
                    V0.append(cls.getSimpleName());
                    V0.append('_');
                    V0.append(field.getName());
                    String sb = V0.toString();
                    Class<?> type = field.getType();
                    boolean isAccessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        Object obj7 = bundle.get(sb);
                        if (obj7 != null) {
                            if (!type.equals(Boolean[].class)) {
                                if (!type.equals(boolean[].class)) {
                                    if (!type.equals(Integer[].class)) {
                                        if (!type.equals(int[].class)) {
                                            if (!type.equals(Double[].class)) {
                                                if (!type.equals(double[].class)) {
                                                    if (!type.equals(Long[].class)) {
                                                        if (!type.equals(long[].class)) {
                                                            if (!type.equals(Float[].class)) {
                                                                if (!type.equals(float[].class)) {
                                                                    if (type.equals(String[].class)) {
                                                                        field.set(obj, bundle.getStringArray(sb));
                                                                    } else if (type.equals(ArrayList.class) && a(field, String.class)) {
                                                                        field.set(obj, bundle.getStringArrayList(sb));
                                                                    } else if (Parcelable[].class.isAssignableFrom(type)) {
                                                                        field.set(obj, bundle.getParcelableArray(sb));
                                                                    } else if (type.equals(ArrayList.class) && a(field, Parcelable.class)) {
                                                                        field.set(obj, bundle.getParcelableArrayList(sb));
                                                                    } else if (type.equals(Boolean.TYPE)) {
                                                                        field.setBoolean(obj, ((Boolean) obj7).booleanValue());
                                                                    } else if (type.equals(Integer.TYPE)) {
                                                                        field.setInt(obj, ((Integer) obj7).intValue());
                                                                    } else if (type.equals(Double.TYPE)) {
                                                                        field.setDouble(obj, ((Double) obj7).doubleValue());
                                                                    } else if (type.equals(Long.TYPE)) {
                                                                        field.setLong(obj, ((Long) obj7).longValue());
                                                                    } else if (type.equals(Float.TYPE)) {
                                                                        field.setFloat(obj, ((Float) obj7).floatValue());
                                                                    } else if (Parcelable.class.isAssignableFrom(type)) {
                                                                        field.set(obj, bundle.getParcelable(sb));
                                                                    } else if (Serializable.class.isAssignableFrom(type)) {
                                                                        field.set(obj, bundle.getSerializable(sb));
                                                                    } else {
                                                                        field.set(obj, obj7);
                                                                    }
                                                                }
                                                            }
                                                            if (type.getComponentType().isPrimitive()) {
                                                                obj6 = (float[]) obj7;
                                                            } else {
                                                                obj6 = a.e((float[]) obj7);
                                                            }
                                                            field.set(obj, obj6);
                                                        }
                                                    }
                                                    if (type.getComponentType().isPrimitive()) {
                                                        obj5 = (long[]) obj7;
                                                    } else {
                                                        obj5 = a.g((long[]) obj7);
                                                    }
                                                    field.set(obj, obj5);
                                                }
                                            }
                                            if (type.getComponentType().isPrimitive()) {
                                                obj4 = (double[]) obj7;
                                            } else {
                                                obj4 = a.d((double[]) obj7);
                                            }
                                            field.set(obj, obj4);
                                        }
                                    }
                                    if (type.getComponentType().isPrimitive()) {
                                        obj3 = (int[]) obj7;
                                    } else {
                                        obj3 = a.f((int[]) obj7);
                                    }
                                    field.set(obj, obj3);
                                }
                            }
                            if (type.getComponentType().isPrimitive()) {
                                obj2 = (boolean[]) obj7;
                            } else {
                                obj2 = a.c((boolean[]) obj7);
                            }
                            field.set(obj, obj2);
                        }
                        field.setAccessible(isAccessible);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError("Problems loading states " + field.getName() + ':' + e.getMessage());
                    } catch (Throwable th) {
                        field.setAccessible(isAccessible);
                        throw th;
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!"java.lang.Object".equals(cls.getName()));
        return true;
    }

    public static void c(Object obj, Bundle bundle) {
        boolean[] zArr;
        int[] iArr;
        double[] dArr;
        long[] jArr;
        float[] fArr;
        Class<?> cls = obj.getClass();
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(i62.class)) {
                    StringBuilder V0 = je.V0("SAVED_STATE_");
                    V0.append(cls.getSimpleName());
                    V0.append('_');
                    V0.append(field.getName());
                    String sb = V0.toString();
                    Class<?> type = field.getType();
                    boolean isAccessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            if (!type.equals(Boolean[].class)) {
                                if (!type.equals(boolean[].class)) {
                                    if (!type.equals(Integer[].class)) {
                                        if (!type.equals(int[].class)) {
                                            if (!type.equals(Double[].class)) {
                                                if (!type.equals(double[].class)) {
                                                    if (!type.equals(Long[].class)) {
                                                        if (!type.equals(long[].class)) {
                                                            if (!type.equals(Float[].class)) {
                                                                if (!type.equals(float[].class)) {
                                                                    if (type.equals(String[].class)) {
                                                                        bundle.putStringArray(sb, (String[]) obj2);
                                                                    } else if (type.equals(ArrayList.class) && a(field, String.class)) {
                                                                        bundle.putStringArrayList(sb, (ArrayList) obj2);
                                                                    } else if (Parcelable[].class.isAssignableFrom(type)) {
                                                                        bundle.putParcelableArray(sb, (Parcelable[]) obj2);
                                                                    } else if (!type.equals(ArrayList.class) || !a(field, Parcelable.class)) {
                                                                        if (!type.equals(Boolean.class)) {
                                                                            if (!type.equals(Boolean.TYPE)) {
                                                                                if (!type.equals(Integer.class)) {
                                                                                    if (!type.equals(Integer.TYPE)) {
                                                                                        if (!type.equals(Double.class)) {
                                                                                            if (!type.equals(Double.TYPE)) {
                                                                                                if (!type.equals(Long.class)) {
                                                                                                    if (!type.equals(Long.TYPE)) {
                                                                                                        if (!type.equals(Float.class)) {
                                                                                                            if (!type.equals(Float.TYPE)) {
                                                                                                                if (type.equals(String.class)) {
                                                                                                                    bundle.putString(sb, (String) obj2);
                                                                                                                } else if (Parcelable.class.isAssignableFrom(type)) {
                                                                                                                    bundle.putParcelable(sb, (Parcelable) obj2);
                                                                                                                } else if (Serializable.class.isAssignableFrom(type)) {
                                                                                                                    bundle.putSerializable(sb, (Serializable) obj2);
                                                                                                                } else {
                                                                                                                    throw new AssertionError("Unsupported states " + field.getName());
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        bundle.putFloat(sb, ((Float) obj2).floatValue());
                                                                                                    }
                                                                                                }
                                                                                                bundle.putLong(sb, ((Long) obj2).longValue());
                                                                                            }
                                                                                        }
                                                                                        bundle.putDouble(sb, ((Double) obj2).doubleValue());
                                                                                    }
                                                                                }
                                                                                bundle.putInt(sb, ((Integer) obj2).intValue());
                                                                            }
                                                                        }
                                                                        bundle.putBoolean(sb, ((Boolean) obj2).booleanValue());
                                                                    } else {
                                                                        bundle.putParcelableArrayList(sb, (ArrayList) obj2);
                                                                    }
                                                                }
                                                            }
                                                            if (type.getComponentType().isPrimitive()) {
                                                                fArr = (float[]) obj2;
                                                            } else {
                                                                fArr = a.i((Float[]) obj2);
                                                            }
                                                            bundle.putFloatArray(sb, fArr);
                                                        }
                                                    }
                                                    if (type.getComponentType().isPrimitive()) {
                                                        jArr = (long[]) obj2;
                                                    } else {
                                                        jArr = a.k((Long[]) obj2);
                                                    }
                                                    bundle.putLongArray(sb, jArr);
                                                }
                                            }
                                            if (type.getComponentType().isPrimitive()) {
                                                dArr = (double[]) obj2;
                                            } else {
                                                dArr = a.h((Double[]) obj2);
                                            }
                                            bundle.putDoubleArray(sb, dArr);
                                        }
                                    }
                                    if (type.getComponentType().isPrimitive()) {
                                        iArr = (int[]) obj2;
                                    } else {
                                        iArr = a.j((Integer[]) obj2);
                                    }
                                    bundle.putIntArray(sb, iArr);
                                }
                            }
                            if (type.getComponentType().isPrimitive()) {
                                zArr = (boolean[]) obj2;
                            } else {
                                zArr = a.l((Boolean[]) obj2);
                            }
                            bundle.putBooleanArray(sb, zArr);
                        }
                        field.setAccessible(isAccessible);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError("Problems saving states " + field.getName() + ':' + e.getMessage());
                    } catch (Throwable th) {
                        field.setAccessible(isAccessible);
                        throw th;
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!"java.lang.Object".equals(cls.getName()));
    }
}
