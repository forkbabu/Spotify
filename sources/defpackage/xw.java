package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xw  reason: default package */
public class xw {
    private final t1<String, yw> a = new t1<>();
    private final t1<String, PropertyValuesHolder[]> b = new t1<>();

    public static xw a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static xw b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    private static xw c(List<Animator> list) {
        xw xwVar = new xw();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                xwVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                xwVar.a.put(objectAnimator.getPropertyName(), yw.b(objectAnimator));
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return xwVar;
    }

    public <T> ObjectAnimator d(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, e(str));
        ofPropertyValuesHolder.setProperty(property);
        f(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public PropertyValuesHolder[] e(String str) {
        if (h(str)) {
            PropertyValuesHolder[] orDefault = this.b.getOrDefault(str, null);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
            for (int i = 0; i < orDefault.length; i++) {
                propertyValuesHolderArr[i] = orDefault[i].clone();
            }
            return propertyValuesHolderArr;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        return this.a.equals(((xw) obj).a);
    }

    public yw f(String str) {
        if (this.a.getOrDefault(str, null) != null) {
            return this.a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public long g() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            yw m = this.a.m(i);
            j = Math.max(j, m.d() + m.c());
        }
        return j;
    }

    public boolean h(String str) {
        return this.b.getOrDefault(str, null) != null;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public String toString() {
        StringBuilder S0 = je.S0('\n');
        S0.append(xw.class.getName());
        S0.append('{');
        S0.append(Integer.toHexString(System.identityHashCode(this)));
        S0.append(" timings: ");
        S0.append(this.a);
        S0.append("}\n");
        return S0.toString();
    }
}
