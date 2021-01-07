package kotlin.reflect;

import kotlin.b;

public interface e<R> extends b<R>, b<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // kotlin.reflect.b
    boolean isSuspend();
}
