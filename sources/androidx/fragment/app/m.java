package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* access modifiers changed from: package-private */
public class m implements LayoutInflater.Factory2 {
    private final o a;

    m(o oVar) {
        this.a = oVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w5.a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !k.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.a.T(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.a.U(string);
        }
        if (fragment == null && i != -1) {
            fragment = this.a.T(i);
        }
        if (o.k0(2)) {
            StringBuilder V0 = je.V0("onCreateView: id=0x");
            V0.append(Integer.toHexString(resourceId));
            V0.append(" fname=");
            V0.append(attributeValue);
            V0.append(" existing=");
            V0.append(fragment);
            V0.toString();
        }
        if (fragment == null) {
            fragment = this.a.a0().a(context.getClassLoader(), attributeValue);
            fragment.v = true;
            fragment.E = resourceId != 0 ? resourceId : i;
            fragment.F = i;
            fragment.G = string;
            fragment.w = true;
            o oVar = this.a;
            fragment.A = oVar;
            l<?> lVar = oVar.o;
            fragment.B = lVar;
            fragment.D3(lVar.d(), attributeSet, fragment.b);
            this.a.c(fragment);
            o oVar2 = this.a;
            oVar2.s0(fragment, oVar2.n);
        } else if (!fragment.w) {
            fragment.w = true;
            l<?> lVar2 = this.a.o;
            fragment.B = lVar2;
            fragment.D3(lVar2.d(), attributeSet, fragment.b);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        }
        o oVar3 = this.a;
        int i2 = oVar3.n;
        if (i2 >= 1 || !fragment.v) {
            oVar3.s0(fragment, i2);
        } else {
            oVar3.s0(fragment, 1);
        }
        View view2 = fragment.P;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.P.getTag() == null) {
                fragment.P.setTag(string);
            }
            return fragment.P;
        }
        throw new IllegalStateException(je.y0("Fragment ", attributeValue, " did not create a view."));
    }
}
