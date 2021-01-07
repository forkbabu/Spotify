package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.Map;
import java.util.Set;

public class BuilderBasedDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _buildMethod;
    protected final JavaType _targetType;

    public BuilderBasedDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, set, z, z2);
        this._targetType = javaType;
        this._buildMethod = beanDeserializerBuilder._buildMethod;
        if (this._objectIdReader != null) {
            StringBuilder V0 = je.V0("Cannot use Object Id with Builder-based deserialization (type ");
            V0.append(beanDescription.getType());
            V0.append(")");
            throw new IllegalArgumentException(V0.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Class<?> activeView;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView2 = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken currentToken = jsonParser.getCurrentToken();
        TokenBuffer tokenBuffer = null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (activeView2 != null && !findCreatorProperty.visibleInView(activeView2)) {
                    jsonParser.skipChildren();
                } else if (startBuilding.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        Object build = propertyBasedCreator.build(deserializationContext, startBuilding);
                        if (build.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, build, tokenBuffer);
                        }
                        if (tokenBuffer != null) {
                            handleUnknownProperties(deserializationContext, build, tokenBuffer);
                        }
                        if (this._injectables != null) {
                            injectValues(deserializationContext, build);
                        }
                        if (this._unwrappedPropertyHandler != null) {
                            if (jsonParser.hasToken(JsonToken.START_OBJECT)) {
                                jsonParser.nextToken();
                            }
                            TokenBuffer tokenBuffer2 = new TokenBuffer(jsonParser, deserializationContext);
                            tokenBuffer2.writeStartObject();
                            return deserializeWithUnwrapped(jsonParser, deserializationContext, build, tokenBuffer2);
                        } else if (this._externalTypeIdHandler != null) {
                            return deserializeWithExternalTypeId(jsonParser, deserializationContext, build);
                        } else {
                            if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
                                return deserializeWithView(jsonParser, deserializationContext, build, activeView);
                            }
                            JsonToken currentToken2 = jsonParser.getCurrentToken();
                            if (currentToken2 == JsonToken.START_OBJECT) {
                                currentToken2 = jsonParser.nextToken();
                            }
                            while (currentToken2 == JsonToken.FIELD_NAME) {
                                String currentName2 = jsonParser.getCurrentName();
                                jsonParser.nextToken();
                                SettableBeanProperty find = this._beanProperties.find(currentName2);
                                if (find != null) {
                                    try {
                                        build = find.deserializeSetAndReturn(jsonParser, deserializationContext, build);
                                    } catch (Exception e) {
                                        wrapAndThrow(e, build, currentName2, deserializationContext);
                                        throw null;
                                    }
                                } else {
                                    handleUnknownVanilla(jsonParser, deserializationContext, handledType(), currentName2);
                                }
                                currentToken2 = jsonParser.nextToken();
                            }
                            return build;
                        }
                    } catch (Exception e2) {
                        wrapAndThrow(e2, this._beanType.getRawClass(), currentName, deserializationContext);
                        throw null;
                    }
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find2 = this._beanProperties.find(currentName);
                if (find2 != null) {
                    startBuilding.bufferProperty(find2, find2.deserialize(jsonParser, deserializationContext));
                } else {
                    Set<String> set = this._ignorableProps;
                    if (set == null || !set.contains(currentName)) {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            startBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
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
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            Object build2 = propertyBasedCreator.build(deserializationContext, startBuilding);
            if (tokenBuffer != null) {
                if (build2.getClass() != this._beanType.getRawClass()) {
                    return handlePolymorphic(null, deserializationContext, build2, tokenBuffer);
                }
                handleUnknownProperties(deserializationContext, build2, tokenBuffer);
            }
            return build2;
        } catch (Exception e3) {
            wrapInstantiationProblem(e3, deserializationContext);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayBuilderDeserializer(this, this._targetType, this._beanProperties.getPropertiesInInsertionOrder(), this._buildMethod);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.isExpectedStartObjectToken()) {
            jsonParser.nextToken();
            if (!this._vanillaProcessing) {
                return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
            }
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            while (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
                String currentName = jsonParser.getCurrentName();
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    try {
                        createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                        throw null;
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                }
                jsonParser.nextToken();
            }
            return finishBuild(deserializationContext, createUsingDefault);
        }
        switch (jsonParser.getCurrentTokenId()) {
            case 2:
            case 5:
                return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
            case 3:
                return finishBuild(deserializationContext, deserializeFromArray(jsonParser, deserializationContext));
            case 4:
            case 11:
            default:
                deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
                throw null;
            case 6:
                return finishBuild(deserializationContext, deserializeFromString(jsonParser, deserializationContext));
            case 7:
                return finishBuild(deserializationContext, deserializeFromNumber(jsonParser, deserializationContext));
            case 8:
                return finishBuild(deserializationContext, deserializeFromDouble(jsonParser, deserializationContext));
            case 9:
            case 10:
                return finishBuild(deserializationContext, deserializeFromBoolean(jsonParser, deserializationContext));
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Class<?> activeView;
        if (!this._nonStandardCreation) {
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDefault);
            }
            if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
                return deserializeWithView(jsonParser, deserializationContext, createUsingDefault, activeView);
            }
            while (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
                String currentName = jsonParser.getCurrentName();
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    try {
                        createUsingDefault = find.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                        throw null;
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                }
                jsonParser.nextToken();
            }
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
                        if (startBuilding.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                            jsonParser.nextToken();
                            try {
                                Object build = propertyBasedCreator.build(deserializationContext, startBuilding);
                                if (build.getClass() != this._beanType.getRawClass()) {
                                    return handlePolymorphic(jsonParser, deserializationContext, build, tokenBuffer);
                                }
                                return deserializeWithUnwrapped(jsonParser, deserializationContext, build, tokenBuffer);
                            } catch (Exception e2) {
                                wrapAndThrow(e2, this._beanType.getRawClass(), currentName2, deserializationContext);
                                throw null;
                            }
                        }
                    } else if (!startBuilding.readIdProperty(currentName2)) {
                        SettableBeanProperty find2 = this._beanProperties.find(currentName2);
                        if (find2 != null) {
                            startBuilding.bufferProperty(find2, find2.deserialize(jsonParser, deserializationContext));
                        } else {
                            Set<String> set = this._ignorableProps;
                            if (set == null || !set.contains(currentName2)) {
                                tokenBuffer.writeFieldName(currentName2);
                                tokenBuffer.copyCurrentStructure(jsonParser);
                                SettableAnyProperty settableAnyProperty = this._anySetter;
                                if (settableAnyProperty != null) {
                                    startBuilding.bufferAnyProperty(settableAnyProperty, currentName2, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                                }
                            } else {
                                handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName2);
                            }
                        }
                    }
                    currentToken = jsonParser.nextToken();
                }
                tokenBuffer.writeEndObject();
                try {
                    Object build2 = propertyBasedCreator.build(deserializationContext, startBuilding);
                    this._unwrappedPropertyHandler.processUnwrapped(deserializationContext, build2, tokenBuffer);
                    return build2;
                } catch (Exception e3) {
                    wrapInstantiationProblem(e3, deserializationContext);
                    throw null;
                }
            } else {
                TokenBuffer tokenBuffer2 = new TokenBuffer(jsonParser, deserializationContext);
                tokenBuffer2.writeStartObject();
                Object createUsingDefault2 = this._valueInstantiator.createUsingDefault(deserializationContext);
                if (this._injectables != null) {
                    injectValues(deserializationContext, createUsingDefault2);
                }
                Class<?> activeView2 = this._needViewProcesing ? deserializationContext.getActiveView() : null;
                while (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String currentName3 = jsonParser.getCurrentName();
                    jsonParser.nextToken();
                    SettableBeanProperty find3 = this._beanProperties.find(currentName3);
                    if (find3 == null) {
                        Set<String> set2 = this._ignorableProps;
                        if (set2 == null || !set2.contains(currentName3)) {
                            tokenBuffer2.writeFieldName(currentName3);
                            tokenBuffer2.copyCurrentStructure(jsonParser);
                            SettableAnyProperty settableAnyProperty2 = this._anySetter;
                            if (settableAnyProperty2 != null) {
                                try {
                                    settableAnyProperty2.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault2, currentName3);
                                } catch (Exception e4) {
                                    wrapAndThrow(e4, createUsingDefault2, currentName3, deserializationContext);
                                    throw null;
                                }
                            }
                        } else {
                            handleIgnoredProperty(jsonParser, deserializationContext, createUsingDefault2, currentName3);
                        }
                    } else if (activeView2 == null || find3.visibleInView(activeView2)) {
                        try {
                            createUsingDefault2 = find3.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault2);
                        } catch (Exception e5) {
                            wrapAndThrow(e5, createUsingDefault2, currentName3, deserializationContext);
                            throw null;
                        }
                    } else {
                        jsonParser.skipChildren();
                    }
                    jsonParser.nextToken();
                }
                tokenBuffer2.writeEndObject();
                this._unwrappedPropertyHandler.processUnwrapped(deserializationContext, createUsingDefault2, tokenBuffer2);
                return createUsingDefault2;
            }
        } else if (this._externalTypeIdHandler == null) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        } else {
            if (this._propertyBasedCreator != null) {
                return deserializeUsingPropertyBasedWithExternalTypeId(deserializationContext);
            }
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
        }
    }

    /* access modifiers changed from: protected */
    public Object deserializeUsingPropertyBasedWithExternalTypeId(DeserializationContext deserializationContext) {
        JavaType javaType = this._targetType;
        deserializationContext.reportBadDefinition(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", javaType));
        throw null;
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
                        obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
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
    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find == null) {
                Set<String> set = this._ignorableProps;
                if (set == null || !set.contains(currentName)) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                    }
                } else {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                }
            } else if (activeView == null || find.visibleInView(activeView)) {
                try {
                    obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, currentName, deserializationContext);
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
    }

    /* access modifiers changed from: protected */
    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find == null) {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, currentName);
            } else if (!find.visibleInView(cls)) {
                jsonParser.skipChildren();
            } else {
                try {
                    obj = find.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, currentName, deserializationContext);
                    throw null;
                }
            }
            currentToken = jsonParser.nextToken();
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public Object finishBuild(DeserializationContext deserializationContext, Object obj) {
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.mo17getMember().invoke(obj, null);
        } catch (Exception e) {
            wrapInstantiationProblem(e, deserializationContext);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return new BuilderBasedDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    protected BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super(builderBasedDeserializer, nameTransformer);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super(builderBasedDeserializer, objectIdReader);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set) {
        super(builderBasedDeserializer, set);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super(builderBasedDeserializer, beanPropertyMap);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        JavaType javaType = this._targetType;
        Class<?> handledType = handledType();
        Class<?> cls = obj.getClass();
        if (handledType.isAssignableFrom(cls)) {
            deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, handledType.getName()));
            throw null;
        }
        deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls.getName()));
        throw null;
    }
}
