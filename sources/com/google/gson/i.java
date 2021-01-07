package com.google.gson;

import com.google.gson.stream.a;
import com.google.gson.stream.b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* access modifiers changed from: package-private */
public class i extends w<AtomicLongArray> {
    final /* synthetic */ w a;

    i(w wVar) {
        this.a = wVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public AtomicLongArray read(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.l()) {
            arrayList.add(Long.valueOf(((Number) this.a.read(aVar)).longValue()));
        }
        aVar.g();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
    @Override // com.google.gson.w
    public void write(b bVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        bVar.b();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.a.write(bVar, Long.valueOf(atomicLongArray2.get(i)));
        }
        bVar.g();
    }
}
