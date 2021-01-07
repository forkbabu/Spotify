package defpackage;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

/* renamed from: mkf  reason: default package */
public interface mkf<C extends SelectableChannel> {
    void a(C c, Throwable th);

    void b(C c, SelectionKey selectionKey);
}
