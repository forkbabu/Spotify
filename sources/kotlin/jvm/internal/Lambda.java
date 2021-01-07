package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class Lambda<R> implements g<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    @Override // java.lang.Object
    public String toString() {
        String g = j.g(this);
        h.d(g, "Reflection.renderLambdaToString(this)");
        return g;
    }
}
