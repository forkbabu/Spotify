package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private static final long serialVersionUID = 2;
    private final Map<String, List<PropertyName>> _aliasDefs;
    private final Map<String, String> _aliasMapping;
    protected final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private final SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x006f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeanPropertyMap(boolean r5, java.util.Collection<com.fasterxml.jackson.databind.deser.SettableBeanProperty> r6, java.util.Map<java.lang.String, java.util.List<com.fasterxml.jackson.databind.PropertyName>> r7) {
        /*
            r4 = this;
            r4.<init>()
            r4._caseInsensitive = r5
            int r5 = r6.size()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r5 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r5]
            java.lang.Object[] r5 = r6.toArray(r5)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r5 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) r5
            r4._propsInOrder = r5
            r4._aliasDefs = r7
            if (r7 == 0) goto L_0x006b
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L_0x001e
            goto L_0x006b
        L_0x001e:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r4._caseInsensitive
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.toLowerCase()
        L_0x0045:
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            com.fasterxml.jackson.databind.PropertyName r2 = (com.fasterxml.jackson.databind.PropertyName) r2
            java.lang.String r2 = r2.getSimpleName()
            boolean r3 = r4._caseInsensitive
            if (r3 == 0) goto L_0x0067
            java.lang.String r2 = r2.toLowerCase()
        L_0x0067:
            r5.put(r2, r1)
            goto L_0x004f
        L_0x006b:
            java.util.Map r5 = java.util.Collections.emptyMap()
        L_0x006f:
            r4._aliasMapping = r5
            r4.init(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.<init>(boolean, java.util.Collection, java.util.Map):void");
    }

    private final int _findFromOrdered(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i = 0; i < length; i++) {
            if (this._propsInOrder[i] == settableBeanProperty) {
                return i;
            }
        }
        StringBuilder V0 = je.V0("Illegal state: property '");
        V0.append(settableBeanProperty.getName());
        V0.append("' missing from _propsInOrder");
        throw new IllegalStateException(V0.toString());
    }

    private SettableBeanProperty _findWithAlias(String str) {
        if (str == null) {
            return null;
        }
        int _hashCode = _hashCode(str);
        int i = _hashCode << 1;
        Object obj = this._hashArea[i];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this._hashArea[i + 1];
        }
        if (obj == null) {
            return null;
        }
        int i2 = this._hashMask + 1;
        int i3 = ((_hashCode >> 1) + i2) << 1;
        Object obj2 = this._hashArea[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i3 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i4 = (i2 + (i2 >> 1)) << 1;
        int i5 = this._spillCount + i4;
        while (i4 < i5) {
            Object obj3 = this._hashArea[i4];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this._hashArea[i4 + 1];
            }
            i4 += 2;
        }
        return null;
    }

    private final int _hashCode(String str) {
        return str.hashCode() & this._hashMask;
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i);
                i++;
            }
        }
        return this;
    }

    public SettableBeanProperty find(String str) {
        if (str != null) {
            if (this._caseInsensitive) {
                str = str.toLowerCase();
            }
            int hashCode = str.hashCode() & this._hashMask;
            int i = hashCode << 1;
            Object obj = this._hashArea[i];
            if (obj == str || str.equals(obj)) {
                return (SettableBeanProperty) this._hashArea[i + 1];
            }
            if (obj == null) {
                return _findWithAlias(this._aliasMapping.get(str));
            }
            int i2 = this._hashMask + 1;
            int i3 = ((hashCode >> 1) + i2) << 1;
            Object obj2 = this._hashArea[i3];
            if (str.equals(obj2)) {
                return (SettableBeanProperty) this._hashArea[i3 + 1];
            }
            if (obj2 != null) {
                int i4 = (i2 + (i2 >> 1)) << 1;
                int i5 = this._spillCount + i4;
                while (i4 < i5) {
                    Object obj3 = this._hashArea[i4];
                    if (obj3 == str || str.equals(obj3)) {
                        return (SettableBeanProperty) this._hashArea[i4 + 1];
                    }
                    i4 += 2;
                }
            }
            return _findWithAlias(this._aliasMapping.get(str));
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    public boolean hasAliases() {
        return !this._aliasDefs.isEmpty();
    }

    /* access modifiers changed from: protected */
    public void init(Collection<SettableBeanProperty> collection) {
        int i;
        int size = collection.size();
        this._size = size;
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i2 = 32;
            while (i2 < size + (size >> 2)) {
                i2 += i2;
            }
            i = i2;
        }
        this._hashMask = i - 1;
        int i3 = (i >> 1) + i;
        Object[] objArr = new Object[(i3 * 2)];
        int i4 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                boolean z = this._caseInsensitive;
                String name = settableBeanProperty.getName();
                if (z) {
                    name = name.toLowerCase();
                }
                int _hashCode = _hashCode(name);
                int i5 = _hashCode << 1;
                if (objArr[i5] != null) {
                    i5 = ((_hashCode >> 1) + i) << 1;
                    if (objArr[i5] != null) {
                        i5 = (i3 << 1) + i4;
                        i4 += 2;
                        if (i5 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i5] = name;
                objArr[i5 + 1] = settableBeanProperty;
            }
        }
        this._hashArea = objArr;
        this._spillCount = i4;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList.iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        boolean z = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        if (z) {
            name = name.toLowerCase();
        }
        boolean z2 = false;
        int length = this._hashArea.length;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i];
            if (settableBeanProperty2 != null) {
                if (z2 || !(z2 = name.equals(objArr[i - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = null;
                }
            }
        }
        if (z2) {
            init(arrayList);
            return;
        }
        StringBuilder V0 = je.V0("No entry '");
        V0.append(settableBeanProperty.getName());
        V0.append("' found, can't remove");
        throw new NoSuchElementException(V0.toString());
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        JsonDeserializer<Object> unwrappingDeserializer;
        if (nameTransformer == NameTransformer.NOP) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                SettableBeanProperty withSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
                JsonDeserializer<Object> valueDeserializer = withSimpleName.getValueDeserializer();
                if (!(valueDeserializer == null || (unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer)) {
                    withSimpleName = withSimpleName.withValueDeserializer(unwrappingDeserializer);
                }
                arrayList.add(withSimpleName);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    public void replace(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this._hashArea.length;
        for (int i = 1; i <= length; i += 2) {
            Object[] objArr = this._hashArea;
            if (objArr[i] == settableBeanProperty) {
                objArr[i] = settableBeanProperty2;
                this._propsInOrder[_findFromOrdered(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        StringBuilder V0 = je.V0("No entry '");
        V0.append(settableBeanProperty.getName());
        V0.append("' found, can't replace");
        throw new NoSuchElementException(V0.toString());
    }

    public int size() {
        return this._size;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i2 = i + 1;
            if (i > 0) {
                V0.append(", ");
            }
            V0.append(next.getName());
            V0.append('(');
            V0.append(next.getType());
            V0.append(')');
            i = i2;
        }
        V0.append(']');
        if (!this._aliasDefs.isEmpty()) {
            V0.append("(aliases: ");
            V0.append(this._aliasDefs);
            V0.append(")");
        }
        return V0.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z) {
        if (this._caseInsensitive == z) {
            return this;
        }
        return new BeanPropertyMap(this, z);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        boolean z = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        if (z) {
            name = name.toLowerCase();
        }
        int length = this._hashArea.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(name)) {
                return new BeanPropertyMap(this, settableBeanProperty, i, _findFromOrdered(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, name, _hashCode(name));
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i];
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.getName())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i, int i2) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        this._hashArea[i] = settableBeanProperty;
        settableBeanPropertyArr2[i2] = settableBeanProperty;
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i2 = this._hashMask + 1;
        int i3 = i << 1;
        Object[] objArr2 = this._hashArea;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = this._spillCount;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this._spillCount = i4 + 2;
                if (i3 >= objArr2.length) {
                    this._hashArea = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this._hashArea;
        objArr3[i3] = str;
        objArr3[i3 + 1] = settableBeanProperty;
    }

    protected BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z) {
        this._caseInsensitive = z;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
