package com.fasterxml.jackson.databind.util;

public abstract class PrimitiveArrayBuilder<T> {
    protected Node<T> _bufferHead;
    protected Node<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    /* access modifiers changed from: package-private */
    public static final class Node<T> {
        final T _data;
        final int _dataLength;
        Node<T> _next;

        public Node(T t, int i) {
            this._data = t;
            this._dataLength = i;
        }
    }

    protected PrimitiveArrayBuilder() {
    }

    /* access modifiers changed from: protected */
    public abstract T _constructArray(int i);

    public final T appendCompletedChunk(T t, int i) {
        Node<T> node = new Node<>(t, i);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            Node<T> node2 = this._bufferTail;
            if (node2._next == null) {
                node2._next = node;
                this._bufferTail = node;
            } else {
                throw new IllegalStateException();
            }
        }
        this._bufferedEntryCount += i;
        return _constructArray(i < 16384 ? i + i : i + (i >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t, int i) {
        int i2 = this._bufferedEntryCount + i;
        T _constructArray = _constructArray(i2);
        int i3 = 0;
        for (Node<T> node = this._bufferHead; node != null; node = node._next) {
            System.arraycopy(node._data, 0, _constructArray, i3, node._dataLength);
            i3 += node._dataLength;
        }
        System.arraycopy(t, 0, _constructArray, i3, i);
        int i4 = i3 + i;
        if (i4 == i2) {
            return _constructArray;
        }
        throw new IllegalStateException(je.s0("Should have gotten ", i2, " entries, got ", i4));
    }

    public T resetAndStart() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node._data;
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
        T t = this._freeBuffer;
        return t == null ? _constructArray(12) : t;
    }
}
