package com.google.gson;

import com.google.gson.stream.JsonToken;
import com.google.gson.stream.a;
import com.google.gson.stream.b;

/* access modifiers changed from: package-private */
public class g extends w<Number> {
    g() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public Number read(a aVar) {
        if (aVar.J() != JsonToken.NULL) {
            return Long.valueOf(aVar.w());
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
        } else {
            bVar.O(number2.toString());
        }
    }
}
