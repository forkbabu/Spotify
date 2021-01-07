package com.google.common.base;

import com.google.common.base.Splitter;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public abstract class AbstractIterator<T> implements Iterator<T> {
    private T next;
    private State state = State.NOT_READY;

    /* access modifiers changed from: private */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractIterator() {
    }

    /* access modifiers changed from: protected */
    public final T endOfData() {
        this.state = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        T t;
        int separatorStart;
        State state2 = this.state;
        State state3 = State.FAILED;
        MoreObjects.checkState(state2 != state3);
        int ordinal = this.state.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.state = state3;
        Splitter.SplittingIterator splittingIterator = (Splitter.SplittingIterator) this;
        int i = splittingIterator.offset;
        while (true) {
            int i2 = splittingIterator.offset;
            if (i2 == -1) {
                splittingIterator.endOfData();
                t = null;
                break;
            }
            separatorStart = splittingIterator.separatorStart(i2);
            if (separatorStart == -1) {
                separatorStart = splittingIterator.toSplit.length();
                splittingIterator.offset = -1;
            } else {
                splittingIterator.offset = splittingIterator.separatorEnd(separatorStart);
            }
            int i3 = splittingIterator.offset;
            if (i3 == i) {
                int i4 = i3 + 1;
                splittingIterator.offset = i4;
                if (i4 > splittingIterator.toSplit.length()) {
                    splittingIterator.offset = -1;
                }
            } else {
                while (i < separatorStart && splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(i))) {
                    i++;
                }
                while (separatorStart > i) {
                    int i5 = separatorStart - 1;
                    if (!splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(i5))) {
                        break;
                    }
                    separatorStart = i5;
                }
                if (!splittingIterator.omitEmptyStrings || i != separatorStart) {
                    break;
                }
                i = splittingIterator.offset;
            }
        }
        int i6 = splittingIterator.limit;
        if (i6 == 1) {
            separatorStart = splittingIterator.toSplit.length();
            splittingIterator.offset = -1;
            while (separatorStart > i) {
                int i7 = separatorStart - 1;
                if (!splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(i7))) {
                    break;
                }
                separatorStart = i7;
            }
        } else {
            splittingIterator.limit = i6 - 1;
        }
        t = (T) splittingIterator.toSplit.subSequence(i, separatorStart).toString();
        this.next = t;
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.state = State.NOT_READY;
            T t = this.next;
            this.next = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
