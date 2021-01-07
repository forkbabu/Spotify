package io.netty.channel.group;

import io.netty.channel.ChannelException;
import io.netty.channel.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class ChannelGroupException extends ChannelException implements Iterable<Map.Entry<d, Throwable>> {
    private static final long serialVersionUID = -4093064295562629453L;
    private final Collection<Map.Entry<d, Throwable>> failed;

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<d, Throwable>> iterator() {
        return this.failed.iterator();
    }
}
