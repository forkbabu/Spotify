package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import defpackage.p81;
import java.util.ArrayList;
import java.util.Iterator;

public class HubsJsonComponentBundleDeserializer extends JsonDeserializer<HubsJsonComponentBundle> {
    private HubsImmutableComponentBundle b(JsonParser jsonParser) {
        JsonToken currentToken;
        p81.a builder = HubsImmutableComponentBundle.builder();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            JsonToken currentToken2 = jsonParser.getCurrentToken();
            if (!(currentToken2 == JsonToken.VALUE_NULL || currentToken2 == null)) {
                String currentName = jsonParser.getCurrentName();
                int ordinal = currentToken2.ordinal();
                if (ordinal != 1) {
                    int i = 0;
                    if (ordinal != 3) {
                        switch (ordinal) {
                            case 7:
                                builder = builder.p(currentName, jsonParser.getText());
                                continue;
                            case 8:
                                builder = builder.m(currentName, jsonParser.getLongValue());
                                continue;
                            case 9:
                                builder = builder.h(currentName, jsonParser.getDoubleValue());
                                continue;
                            case 10:
                                builder = builder.b(currentName, true);
                                continue;
                            case 11:
                                builder = builder.b(currentName, false);
                                continue;
                        }
                    } else {
                        String currentName2 = jsonParser.getCurrentName();
                        if (!(jsonParser.nextToken() == JsonToken.END_ARRAY || (currentToken = jsonParser.getCurrentToken()) == null)) {
                            int ordinal2 = currentToken.ordinal();
                            if (ordinal2 != 1) {
                                switch (ordinal2) {
                                    case 7:
                                        ArrayList arrayList = new ArrayList();
                                        do {
                                            arrayList.add(jsonParser.getText());
                                        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                                        builder = builder.q(currentName2, (String[]) arrayList.toArray(new String[0]));
                                        continue;
                                    case 8:
                                        ArrayList arrayList2 = new ArrayList();
                                        do {
                                            arrayList2.add(Long.valueOf(jsonParser.getLongValue()));
                                        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                                        long[] jArr = new long[arrayList2.size()];
                                        Iterator it = arrayList2.iterator();
                                        while (it.hasNext()) {
                                            jArr[i] = ((Long) it.next()).longValue();
                                            i++;
                                        }
                                        builder = builder.l(currentName2, jArr);
                                        continue;
                                    case 9:
                                        ArrayList arrayList3 = new ArrayList();
                                        do {
                                            arrayList3.add(Double.valueOf(jsonParser.getDoubleValue()));
                                        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                                        double[] dArr = new double[arrayList3.size()];
                                        Iterator it2 = arrayList3.iterator();
                                        while (it2.hasNext()) {
                                            dArr[i] = ((Double) it2.next()).doubleValue();
                                            i++;
                                        }
                                        builder = builder.g(currentName2, dArr);
                                        continue;
                                    case 10:
                                    case 11:
                                        ArrayList arrayList4 = new ArrayList();
                                        do {
                                            arrayList4.add(Boolean.valueOf(jsonParser.getBooleanValue()));
                                        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                                        boolean[] zArr = new boolean[arrayList4.size()];
                                        Iterator it3 = arrayList4.iterator();
                                        while (it3.hasNext()) {
                                            zArr[i] = ((Boolean) it3.next()).booleanValue();
                                            i++;
                                        }
                                        builder = builder.c(currentName2, zArr);
                                        continue;
                                }
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                do {
                                    arrayList5.add(b(jsonParser));
                                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                                builder = builder.f(currentName2, (HubsImmutableComponentBundle[]) arrayList5.toArray(new HubsImmutableComponentBundle[0]));
                            }
                        }
                    }
                } else {
                    builder = builder.e(currentName, b(jsonParser));
                }
            }
        }
        return (HubsImmutableComponentBundle) builder.d();
    }

    public HubsJsonComponentBundle a(JsonParser jsonParser) {
        if (jsonParser.currentToken() == JsonToken.VALUE_NULL || jsonParser.currentToken() == null) {
            return null;
        }
        return new HubsJsonComponentBundle(b(jsonParser));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ HubsJsonComponentBundle deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return a(jsonParser);
    }
}
