package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    private volatile transient NameTransformer _currentlyTransforming;
    protected transient Exception _nullFromCreator;

    static class BeanReferring extends ReadableObjectId.Referring {
        private Object _bean;
        private final DeserializationContext _context;
        private final SettableBeanProperty _prop;

        BeanReferring(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this._context = deserializationContext;
            this._prop = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) {
            Object obj3 = this._bean;
            if (obj3 != null) {
                this._prop.set(obj3, obj2);
                return;
            }
            DeserializationContext deserializationContext = this._context;
            SettableBeanProperty settableBeanProperty = this._prop;
            deserializationContext.reportInputMismatch(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this._prop.getDeclaringClass().getName());
            throw null;
        }

        public void setBean(Object obj) {
            this._bean = obj;
        }
    }

    public BeanDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, hashSet, z, z2);
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                        throw null;
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return createUsingDefault;
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken currentToken = jsonParser.getCurrentToken();
        ArrayList<BeanReferring> arrayList = null;
        TokenBuffer tokenBuffer = null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
                if (findCreatorProperty == null) {
                    SettableBeanProperty find = this._beanProperties.find(currentName);
                    if (find != null) {
                        try {
                            startBuilding.bufferProperty(find, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find));
                        } catch (UnresolvedForwardReference e) {
                            BeanReferring beanReferring = new BeanReferring(deserializationContext, e, find._type, find);
                            e.getRoid().appendReferring(beanReferring);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(beanReferring);
                        }
                    } else {
                        Set<String> set = this._ignorableProps;
                        if (set == null || !set.contains(currentName)) {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                try {
                                    startBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                                } catch (Exception e2) {
                                    wrapAndThrow(e2, this._beanType.getRawClass(), currentName, deserializationContext);
                                    throw null;
                                }
                            } else {
                                if (tokenBuffer == null) {
                                    tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                                }
                                tokenBuffer.writeFieldName(currentName);
                                tokenBuffer.copyCurrentStructure(jsonParser);
                            }
                        } else {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                        }
                    }
                } else if (activeView != null && !findCreatorProperty.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else if (startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                    jsonParser.nextToken();
                    try {
                        Object build = propertyBasedCreator.build(deserializationContext, startBuilding);
                        if (build == null) {
                            Class<?> handledType = handledType();
                            if (this._nullFromCreator == null) {
                                this._nullFromCreator = new NullPointerException("JSON Creator returned null");
                            }
                            deserializationContext.handleInstantiationProblem(handledType, null, this._nullFromCreator);
                            throw null;
                        }
                        jsonParser.setCurrentValue(build);
                        if (build.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, build, tokenBuffer);
                        }
                        if (tokenBuffer != null) {
                            handleUnknownProperties(deserializationContext, build, tokenBuffer);
                        }
                        return deserialize(jsonParser, deserializationContext, build);
                    } catch (Exception e3) {
                        wrapInstantiationProblem(e3, deserializationContext);
                        throw null;
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            Object build2 = propertyBasedCreator.build(deserializationContext, startBuilding);
            if (arrayList != null) {
                for (BeanReferring beanReferring2 : arrayList) {
                    beanReferring2.setBean(build2);
                }
            }
            if (tokenBuffer != null) {
                if (build2.getClass() != this._beanType.getRawClass()) {
                    return handlePolymorphic(null, deserializationContext, build2, tokenBuffer);
                }
                handleUnknownProperties(deserializationContext, build2, tokenBuffer);
            }
            return build2;
        } catch (Exception e4) {
            wrapInstantiationProblem(e4, deserializationContext);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            wrapAndThrow(e, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        if (!jsonParser.isExpectedStartObjectToken()) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != null) {
                switch (currentToken.ordinal()) {
                    case 2:
                    case 5:
                        if (this._vanillaProcessing) {
                            return vanillaDeserialize(jsonParser, deserializationContext);
                        }
                        if (this._objectIdReader != null) {
                            return deserializeFromObject(jsonParser, deserializationContext);
                        }
                        return deserializeFromObject(jsonParser, deserializationContext);
                    case 3:
                        return deserializeFromArray(jsonParser, deserializationContext);
                    case 6:
                        return deserializeFromEmbedded(jsonParser, deserializationContext);
                    case 7:
                        return deserializeFromString(jsonParser, deserializationContext);
                    case 8:
                        return deserializeFromNumber(jsonParser, deserializationContext);
                    case 9:
                        return deserializeFromDouble(jsonParser, deserializationContext);
                    case 10:
                    case 11:
                        return deserializeFromBoolean(jsonParser, deserializationContext);
                    case 12:
                        if (jsonParser.requiresCustomCodec()) {
                            TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                            tokenBuffer.writeEndObject();
                            JsonParser asParser = tokenBuffer.asParser(jsonParser);
                            asParser.nextToken();
                            if (this._vanillaProcessing) {
                                JsonToken jsonToken = JsonToken.END_OBJECT;
                                obj = vanillaDeserialize(asParser, deserializationContext);
                            } else {
                                obj = deserializeFromObject(asParser, deserializationContext);
                            }
                            asParser.close();
                            return obj;
                        }
                        deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
                        throw null;
                }
            }
            deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            throw null;
        } else if (this._vanillaProcessing) {
            jsonParser.nextToken();
            return vanillaDeserialize(jsonParser, deserializationContext);
        } else {
            jsonParser.nextToken();
            if (this._objectIdReader != null) {
                return deserializeFromObject(jsonParser, deserializationContext);
            }
            return deserializeFromObject(jsonParser, deserializationContext);
        }
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Class<?> activeView;
        Object objectId;
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null) {
            objectIdReader.maySerializeAsObject();
        }
        if (!this._nonStandardCreation) {
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            jsonParser.setCurrentValue(createUsingDefault);
            if (jsonParser.canReadObjectId() && (objectId = jsonParser.getObjectId()) != null) {
                _handleTypedObjectId(jsonParser, deserializationContext, createUsingDefault, objectId);
            }
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDefault);
            }
            if (!this._needViewProcesing || (activeView = deserializationContext.getActiveView()) == null) {
                if (jsonParser.hasTokenId(5)) {
                    String currentName = jsonParser.getCurrentName();
                    do {
                        jsonParser.nextToken();
                        SettableBeanProperty find = this._beanProperties.find(currentName);
                        if (find != null) {
                            try {
                                find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                            } catch (Exception e) {
                                wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                                throw null;
                            }
                        } else {
                            handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                        }
                        currentName = jsonParser.nextFieldName();
                    } while (currentName != null);
                }
                return createUsingDefault;
            }
            deserializeWithView(jsonParser, deserializationContext, createUsingDefault, activeView);
            return createUsingDefault;
        } else if (this._unwrappedPropertyHandler != null) {
            JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
            if (jsonDeserializer != null) {
                return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
            }
            PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
            if (propertyBasedCreator != null) {
                PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
                TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                tokenBuffer.writeStartObject();
                JsonToken currentToken = jsonParser.getCurrentToken();
                while (currentToken == JsonToken.FIELD_NAME) {
                    String currentName2 = jsonParser.getCurrentName();
                    jsonParser.nextToken();
                    SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName2);
                    if (findCreatorProperty != null) {
                        if (startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                            JsonToken nextToken = jsonParser.nextToken();
                            try {
                                Object build = propertyBasedCreator.build(deserializationContext, startBuilding);
                                jsonParser.setCurrentValue(build);
                                while (nextToken == JsonToken.FIELD_NAME) {
                                    tokenBuffer.copyCurrentStructure(jsonParser);
                                    nextToken = jsonParser.nextToken();
                                }
                                JsonToken jsonToken = JsonToken.END_OBJECT;
                                if (nextToken == jsonToken) {
                                    tokenBuffer.writeEndObject();
                                    if (build.getClass() == this._beanType.getRawClass()) {
                                        this._unwrappedPropertyHandler.processUnwrapped(deserializationContext, build, tokenBuffer);
                                        return build;
                                    }
                                    deserializationContext.reportInputMismatch(findCreatorProperty, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                                    throw null;
                                }
                                deserializationContext.reportWrongTokenException(this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                                throw null;
                            } catch (Exception e2) {
                                wrapInstantiationProblem(e2, deserializationContext);
                                throw null;
                            }
                        }
                    } else if (!startBuilding.readIdProperty(currentName2)) {
                        SettableBeanProperty find2 = this._beanProperties.find(currentName2);
                        if (find2 != null) {
                            startBuilding.bufferProperty(find2, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find2));
                        } else {
                            Set<String> set = this._ignorableProps;
                            if (set != null && set.contains(currentName2)) {
                                handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName2);
                            } else if (this._anySetter == null) {
                                tokenBuffer.writeFieldName(currentName2);
                                tokenBuffer.copyCurrentStructure(jsonParser);
                            } else {
                                TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                                tokenBuffer.writeFieldName(currentName2);
                                tokenBuffer.append(asCopyOfValue);
                                try {
                                    SettableAnyProperty settableAnyProperty = this._anySetter;
                                    startBuilding.bufferAnyProperty(settableAnyProperty, currentName2, settableAnyProperty.deserialize(asCopyOfValue.asParserOnFirstToken(), deserializationContext));
                                } catch (Exception e3) {
                                    wrapAndThrow(e3, this._beanType.getRawClass(), currentName2, deserializationContext);
                                    throw null;
                                }
                            }
                        }
                    }
                    currentToken = jsonParser.nextToken();
                }
                try {
                    Object build2 = propertyBasedCreator.build(deserializationContext, startBuilding);
                    this._unwrappedPropertyHandler.processUnwrapped(deserializationContext, build2, tokenBuffer);
                    return build2;
                } catch (Exception e4) {
                    wrapInstantiationProblem(e4, deserializationContext);
                    throw null;
                }
            } else {
                TokenBuffer tokenBuffer2 = new TokenBuffer(jsonParser, deserializationContext);
                tokenBuffer2.writeStartObject();
                Object createUsingDefault2 = this._valueInstantiator.createUsingDefault(deserializationContext);
                jsonParser.setCurrentValue(createUsingDefault2);
                if (this._injectables != null) {
                    injectValues(deserializationContext, createUsingDefault2);
                }
                Class<?> activeView2 = this._needViewProcesing ? deserializationContext.getActiveView() : null;
                String currentName3 = jsonParser.hasTokenId(5) ? jsonParser.getCurrentName() : null;
                while (currentName3 != null) {
                    jsonParser.nextToken();
                    SettableBeanProperty find3 = this._beanProperties.find(currentName3);
                    if (find3 == null) {
                        Set<String> set2 = this._ignorableProps;
                        if (set2 != null && set2.contains(currentName3)) {
                            handleIgnoredProperty(jsonParser, deserializationContext, createUsingDefault2, currentName3);
                        } else if (this._anySetter == null) {
                            tokenBuffer2.writeFieldName(currentName3);
                            tokenBuffer2.copyCurrentStructure(jsonParser);
                        } else {
                            TokenBuffer asCopyOfValue2 = TokenBuffer.asCopyOfValue(jsonParser);
                            tokenBuffer2.writeFieldName(currentName3);
                            tokenBuffer2.append(asCopyOfValue2);
                            try {
                                this._anySetter.deserializeAndSet(asCopyOfValue2.asParserOnFirstToken(), deserializationContext, createUsingDefault2, currentName3);
                            } catch (Exception e5) {
                                wrapAndThrow(e5, createUsingDefault2, currentName3, deserializationContext);
                                throw null;
                            }
                        }
                    } else if (activeView2 == null || find3.visibleInView(activeView2)) {
                        try {
                            find3.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault2);
                        } catch (Exception e6) {
                            wrapAndThrow(e6, createUsingDefault2, currentName3, deserializationContext);
                            throw null;
                        }
                    } else {
                        jsonParser.skipChildren();
                    }
                    currentName3 = jsonParser.nextFieldName();
                }
                tokenBuffer2.writeEndObject();
                this._unwrappedPropertyHandler.processUnwrapped(deserializationContext, createUsingDefault2, tokenBuffer2);
                return createUsingDefault2;
            }
        } else {
            ExternalTypeHandler externalTypeHandler = this._externalTypeIdHandler;
            if (externalTypeHandler == null) {
                Object deserializeFromObjectUsingNonDefault = deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
                if (this._injectables != null) {
                    injectValues(deserializationContext, deserializeFromObjectUsingNonDefault);
                }
                return deserializeFromObjectUsingNonDefault;
            } else if (this._propertyBasedCreator != null) {
                ExternalTypeHandler start = externalTypeHandler.start();
                PropertyBasedCreator propertyBasedCreator2 = this._propertyBasedCreator;
                PropertyValueBuffer startBuilding2 = propertyBasedCreator2.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
                TokenBuffer tokenBuffer3 = new TokenBuffer(jsonParser, deserializationContext);
                tokenBuffer3.writeStartObject();
                JsonToken currentToken2 = jsonParser.getCurrentToken();
                while (currentToken2 == JsonToken.FIELD_NAME) {
                    String currentName4 = jsonParser.getCurrentName();
                    jsonParser.nextToken();
                    SettableBeanProperty findCreatorProperty2 = propertyBasedCreator2.findCreatorProperty(currentName4);
                    if (findCreatorProperty2 != null) {
                        if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName4, null) && startBuilding2.assignParameter(findCreatorProperty2, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty2))) {
                            JsonToken nextToken2 = jsonParser.nextToken();
                            try {
                                Object build3 = propertyBasedCreator2.build(deserializationContext, startBuilding2);
                                while (nextToken2 == JsonToken.FIELD_NAME) {
                                    jsonParser.nextToken();
                                    tokenBuffer3.copyCurrentStructure(jsonParser);
                                    nextToken2 = jsonParser.nextToken();
                                }
                                if (build3.getClass() == this._beanType.getRawClass()) {
                                    start.complete(jsonParser, deserializationContext, build3);
                                    return build3;
                                }
                                JavaType javaType = this._beanType;
                                deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, build3.getClass()));
                                throw null;
                            } catch (Exception e7) {
                                wrapAndThrow(e7, this._beanType.getRawClass(), currentName4, deserializationContext);
                                throw null;
                            }
                        }
                    } else if (!startBuilding2.readIdProperty(currentName4)) {
                        SettableBeanProperty find4 = this._beanProperties.find(currentName4);
                        if (find4 != null) {
                            startBuilding2.bufferProperty(find4, find4.deserialize(jsonParser, deserializationContext));
                        } else if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName4, null)) {
                            Set<String> set3 = this._ignorableProps;
                            if (set3 == null || !set3.contains(currentName4)) {
                                SettableAnyProperty settableAnyProperty2 = this._anySetter;
                                if (settableAnyProperty2 != null) {
                                    startBuilding2.bufferAnyProperty(settableAnyProperty2, currentName4, settableAnyProperty2.deserialize(jsonParser, deserializationContext));
                                }
                            } else {
                                handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName4);
                            }
                        }
                    }
                    currentToken2 = jsonParser.nextToken();
                }
                tokenBuffer3.writeEndObject();
                try {
                    return start.complete(jsonParser, deserializationContext, startBuilding2, propertyBasedCreator2);
                } catch (Exception e8) {
                    wrapInstantiationProblem(e8, deserializationContext);
                    throw null;
                }
            } else {
                JsonDeserializer<Object> jsonDeserializer2 = this._delegateDeserializer;
                if (jsonDeserializer2 != null) {
                    return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer2.deserialize(jsonParser, deserializationContext));
                }
                Object createUsingDefault3 = this._valueInstantiator.createUsingDefault(deserializationContext);
                deserializeWithExternalTypeId(jsonParser, deserializationContext, createUsingDefault3);
                return createUsingDefault3;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        ExternalTypeHandler start = this._externalTypeIdHandler.start();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            JsonToken nextToken = jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                if (nextToken.isScalarValue()) {
                    start.handleTypePropertyValue(jsonParser, deserializationContext, currentName, obj);
                }
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                        throw null;
                    }
                } else {
                    jsonParser.skipChildren();
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                } else if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, obj)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                        } catch (Exception e2) {
                            wrapAndThrow(e2, obj, currentName, deserializationContext);
                            throw null;
                        }
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        start.complete(jsonParser, deserializationContext, obj);
        return obj;
    }

    /* access modifiers changed from: protected */
    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) {
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find == null) {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, currentName);
                } else if (!find.visibleInView(cls)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                        throw null;
                    }
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this._currentlyTransforming == nameTransformer) {
            return this;
        }
        this._currentlyTransforming = nameTransformer;
        try {
            return new BeanDeserializer(this, nameTransformer);
        } finally {
            this._currentlyTransforming = null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnorableProperties(Set set) {
        return new BeanDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    protected BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    protected BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        String str;
        Class<?> activeView;
        jsonParser.setCurrentValue(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.START_OBJECT) {
                currentToken = jsonParser.nextToken();
            }
            TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
            tokenBuffer.writeStartObject();
            Class<?> activeView2 = this._needViewProcesing ? deserializationContext.getActiveView() : null;
            while (currentToken == JsonToken.FIELD_NAME) {
                String currentName = jsonParser.getCurrentName();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                jsonParser.nextToken();
                if (find == null) {
                    Set<String> set = this._ignorableProps;
                    if (set != null && set.contains(currentName)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                    } else if (this._anySetter == null) {
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.copyCurrentStructure(jsonParser);
                    } else {
                        TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.append(asCopyOfValue);
                        try {
                            this._anySetter.deserializeAndSet(asCopyOfValue.asParserOnFirstToken(), deserializationContext, obj, currentName);
                        } catch (Exception e) {
                            wrapAndThrow(e, obj, currentName, deserializationContext);
                            throw null;
                        }
                    }
                } else if (activeView2 == null || find.visibleInView(activeView2)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, currentName, deserializationContext);
                        throw null;
                    }
                } else {
                    jsonParser.skipChildren();
                }
                currentToken = jsonParser.nextToken();
            }
            tokenBuffer.writeEndObject();
            this._unwrappedPropertyHandler.processUnwrapped(deserializationContext, obj, tokenBuffer);
            return obj;
        } else if (this._externalTypeIdHandler != null) {
            deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
            return obj;
        } else {
            if (jsonParser.isExpectedStartObjectToken()) {
                str = jsonParser.nextFieldName();
                if (str == null) {
                    return obj;
                }
            } else if (!jsonParser.hasTokenId(5)) {
                return obj;
            } else {
                str = jsonParser.getCurrentName();
            }
            if (!this._needViewProcesing || (activeView = deserializationContext.getActiveView()) == null) {
                do {
                    jsonParser.nextToken();
                    SettableBeanProperty find2 = this._beanProperties.find(str);
                    if (find2 != null) {
                        try {
                            find2.deserializeAndSet(jsonParser, deserializationContext, obj);
                        } catch (Exception e3) {
                            wrapAndThrow(e3, obj, str, deserializationContext);
                            throw null;
                        }
                    } else {
                        handleUnknownVanilla(jsonParser, deserializationContext, obj, str);
                    }
                    str = jsonParser.nextFieldName();
                } while (str != null);
                return obj;
            }
            deserializeWithView(jsonParser, deserializationContext, obj, activeView);
            return obj;
        }
    }
}
