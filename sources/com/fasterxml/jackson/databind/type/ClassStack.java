package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.spotify.music.features.ads.model.Ad;
import java.util.ArrayList;
import java.util.Iterator;

public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this._selfRefs == null) {
            this._selfRefs = new ArrayList<>();
        }
        this._selfRefs.add(resolvedRecursiveType);
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                ResolvedRecursiveType next = it.next();
                if (next._referencedType == null) {
                    next._referencedType = javaType;
                } else {
                    StringBuilder V0 = je.V0("Trying to re-set self reference; old value = ");
                    V0.append(next._referencedType);
                    V0.append(", new = ");
                    V0.append(javaType);
                    throw new IllegalStateException(V0.toString());
                }
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder V0 = je.V0("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList == null) {
            str = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        } else {
            str = String.valueOf(arrayList.size());
        }
        V0.append(str);
        V0.append(')');
        for (ClassStack classStack = this; classStack != null; classStack = classStack._parent) {
            V0.append(' ');
            V0.append(classStack._current.getName());
        }
        V0.append(']');
        return V0.toString();
    }

    public ClassStack(Class<?> cls) {
        this._parent = null;
        this._current = cls;
    }
}
