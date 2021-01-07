package kotlin.jvm.internal;

import kotlin.reflect.b;
import kotlin.reflect.h;

public abstract class PropertyReference extends CallableReference implements h {
    public PropertyReference() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public h getReflected() {
        return (h) super.getReflected();
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !h.a(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // java.lang.Object
    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder V0 = je.V0("property ");
        V0.append(getName());
        V0.append(" (Kotlin reflection is not available)");
        return V0.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
