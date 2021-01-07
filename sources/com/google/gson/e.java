package com.google.gson;

import com.google.gson.stream.JsonToken;
import com.google.gson.stream.a;
import com.google.gson.stream.b;

/* access modifiers changed from: package-private */
public class e extends w<Number> {
    e(j jVar) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public Number read(a aVar) {
        if (aVar.J() != JsonToken.NULL) {
            return Double.valueOf(aVar.s());
        }
        aVar.D();
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
    @Override // com.google.gson.w
    public void write(b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.r();
            return;
        }
        j.a(number2.doubleValue());
        bVar.M(number2);
    }
}
