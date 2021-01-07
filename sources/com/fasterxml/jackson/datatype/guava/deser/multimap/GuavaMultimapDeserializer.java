package com.fasterxml.jackson.datatype.guava.deser.multimap;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class GuavaMultimapDeserializer<T extends Multimap<Object, Object>> extends StdDeserializer<T> implements ContextualDeserializer {
    private static final List<String> METHOD_NAMES = ImmutableList.of("copyOf", "create");
    private static final long serialVersionUID = 1;
    private final Method creatorMethod;
    private final JsonDeserializer<?> elementDeserializer;
    private final TypeDeserializer elementTypeDeserializer;
    private final KeyDeserializer keyDeserializer;
    private final NullValueProvider nullProvider;
    private final boolean skipNullValues;
    private final MapLikeType type;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GuavaMultimapDeserializer(com.fasterxml.jackson.databind.type.MapLikeType r15, com.fasterxml.jackson.databind.KeyDeserializer r16, com.fasterxml.jackson.databind.jsontype.TypeDeserializer r17, com.fasterxml.jackson.databind.JsonDeserializer<?> r18) {
        /*
            r14 = this;
            java.lang.Class r0 = r15.getRawClass()
            java.lang.Class<com.google.common.collect.Multimap> r1 = com.google.common.collect.Multimap.class
            java.lang.Class<com.google.common.collect.LinkedListMultimap> r2 = com.google.common.collect.LinkedListMultimap.class
            r3 = 0
            if (r0 == r2) goto L_0x0053
            java.lang.Class<com.google.common.collect.ListMultimap> r2 = com.google.common.collect.ListMultimap.class
            if (r0 == r2) goto L_0x0053
            if (r0 != r1) goto L_0x0012
            goto L_0x0053
        L_0x0012:
            java.util.List<java.lang.String> r2 = com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.METHOD_NAMES
            java.util.Iterator r2 = r2.iterator()
        L_0x0018:
            boolean r4 = r2.hasNext()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0034
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0032 }
            r6[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0032 }
            java.lang.reflect.Method r4 = r0.getMethod(r4, r6)     // Catch:{ NoSuchMethodException -> 0x0032 }
            if (r4 == 0) goto L_0x0018
        L_0x0030:
            r12 = r4
            goto L_0x0054
        L_0x0032:
            goto L_0x0018
        L_0x0034:
            java.util.List<java.lang.String> r2 = com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.METHOD_NAMES
            java.util.Iterator r2 = r2.iterator()
        L_0x003a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0053
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0051 }
            r7[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.reflect.Method r4 = r0.getMethod(r4, r7)     // Catch:{ NoSuchMethodException -> 0x0051 }
            if (r4 == 0) goto L_0x003a
            goto L_0x0030
        L_0x0051:
            goto L_0x003a
        L_0x0053:
            r12 = r3
        L_0x0054:
            r13 = 0
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.<init>(com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.KeyDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer):void");
    }

    private Throwable _peel(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private void expect(JsonParser jsonParser, JsonToken jsonToken) {
        if (jsonParser.getCurrentToken() != jsonToken) {
            throw new JsonMappingException(jsonParser, "Expecting " + jsonToken + ", found " + jsonParser.getCurrentToken(), jsonParser.getCurrentLocation());
        }
    }

    private Object getCurrentTokenValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TypeDeserializer typeDeserializer = this.elementTypeDeserializer;
        if (typeDeserializer != null) {
            return this.elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return this.elementDeserializer.deserialize(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public abstract JsonDeserializer<?> _createContextual(MapLikeType mapLikeType, KeyDeserializer keyDeserializer2, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Method method, NullValueProvider nullValueProvider);

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer<?> jsonDeserializer;
        KeyDeserializer keyDeserializer2 = this.keyDeserializer;
        if (keyDeserializer2 == null) {
            keyDeserializer2 = deserializationContext.findKeyDeserializer(this.type.getKeyType(), beanProperty);
        }
        JsonDeserializer<?> jsonDeserializer2 = this.elementDeserializer;
        JavaType contentType = this.type.getContentType();
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, contentType);
        }
        TypeDeserializer typeDeserializer = this.elementTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return _createContextual(this.type, keyDeserializer2, typeDeserializer, jsonDeserializer, this.creatorMethod, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer));
    }

    /* access modifiers changed from: protected */
    public abstract T createMultimap();

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        Object obj2;
        Object obj3;
        if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            T createMultimap = createMultimap();
            expect(jsonParser, JsonToken.START_OBJECT);
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                KeyDeserializer keyDeserializer2 = this.keyDeserializer;
                if (keyDeserializer2 != null) {
                    obj3 = keyDeserializer2.deserializeKey(jsonParser.getCurrentName(), deserializationContext);
                } else {
                    obj3 = jsonParser.getCurrentName();
                }
                jsonParser.nextToken();
                if (jsonParser.currentToken() == JsonToken.START_ARRAY) {
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        createMultimap.put(obj3, getCurrentTokenValue(jsonParser, deserializationContext));
                    }
                } else {
                    createMultimap.put(obj3, getCurrentTokenValue(jsonParser, deserializationContext));
                }
            }
            Method method = this.creatorMethod;
            if (method == null) {
                return createMultimap;
            }
            try {
                return (Multimap) method.invoke(null, createMultimap);
            } catch (InvocationTargetException e) {
                StringBuilder V0 = je.V0("Could not map to ");
                V0.append(this.type);
                throw new JsonMappingException(jsonParser, V0.toString(), _peel(e));
            } catch (IllegalArgumentException e2) {
                StringBuilder V02 = je.V0("Could not map to ");
                V02.append(this.type);
                throw new JsonMappingException(jsonParser, V02.toString(), _peel(e2));
            } catch (IllegalAccessException e3) {
                StringBuilder V03 = je.V0("Could not map to ");
                V03.append(this.type);
                throw new JsonMappingException(jsonParser, V03.toString(), _peel(e3));
            }
        } else {
            T createMultimap2 = createMultimap();
            expect(jsonParser, JsonToken.START_OBJECT);
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                KeyDeserializer keyDeserializer3 = this.keyDeserializer;
                if (keyDeserializer3 != null) {
                    obj = keyDeserializer3.deserializeKey(jsonParser.getCurrentName(), deserializationContext);
                } else {
                    obj = jsonParser.getCurrentName();
                }
                jsonParser.nextToken();
                expect(jsonParser, JsonToken.START_ARRAY);
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                        TypeDeserializer typeDeserializer = this.elementTypeDeserializer;
                        if (typeDeserializer != null) {
                            obj2 = this.elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        } else {
                            obj2 = this.elementDeserializer.deserialize(jsonParser, deserializationContext);
                        }
                    } else if (!this.skipNullValues) {
                        obj2 = this.nullProvider.getNullValue(deserializationContext);
                    }
                    createMultimap2.put(obj, obj2);
                }
            }
            Method method2 = this.creatorMethod;
            if (method2 == null) {
                return createMultimap2;
            }
            try {
                return (Multimap) method2.invoke(null, createMultimap2);
            } catch (InvocationTargetException e4) {
                StringBuilder V04 = je.V0("Could not map to ");
                V04.append(this.type);
                throw new JsonMappingException(jsonParser, V04.toString(), _peel(e4));
            } catch (IllegalArgumentException e5) {
                StringBuilder V05 = je.V0("Could not map to ");
                V05.append(this.type);
                throw new JsonMappingException(jsonParser, V05.toString(), _peel(e5));
            } catch (IllegalAccessException e6) {
                StringBuilder V06 = je.V0("Could not map to ");
                V06.append(this.type);
                throw new JsonMappingException(jsonParser, V06.toString(), _peel(e6));
            }
        }
    }

    public GuavaMultimapDeserializer(MapLikeType mapLikeType, KeyDeserializer keyDeserializer2, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Method method, NullValueProvider nullValueProvider) {
        super(mapLikeType);
        boolean z;
        this.type = mapLikeType;
        this.keyDeserializer = keyDeserializer2;
        this.elementTypeDeserializer = typeDeserializer;
        this.elementDeserializer = jsonDeserializer;
        this.creatorMethod = method;
        this.nullProvider = nullValueProvider;
        if (nullValueProvider == null) {
            z = false;
        } else {
            z = NullsConstantProvider.isSkipper(nullValueProvider);
        }
        this.skipNullValues = z;
    }
}
