package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;

public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;
    private transient Class<V> valueType;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        this.valueType = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.keyType), new EnumMap(this.valueType));
        Collections2.populateMap(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
        objectOutputStream.writeObject(this.valueType);
        Collections2.writeMap(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public Object checkKey(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public Object checkValue(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    /* renamed from: inverse */
    public BiMap mo68inverse() {
        return this.inverse;
    }
}
