package com.google.gson;

import com.google.gson.stream.a;
import com.google.gson.stream.b;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public class h extends w<AtomicLong> {
    final /* synthetic */ w a;

    h(w wVar) {
        this.a = wVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public AtomicLong read(a aVar) {
        return new AtomicLong(((Number) this.a.read(aVar)).longValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
    @Override // com.google.gson.w
    public void write(b bVar, AtomicLong atomicLong) {
        this.a.write(bVar, Long.valueOf(atomicLong.get()));
    }
}
