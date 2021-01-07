package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DeserializationContext extends DatabindContext implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient ArrayBuilders _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected LinkedNode<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient ObjectBuffer _objectBuffer;
    protected transient JsonParser _parser;
    protected final Class<?> _view;

    protected DeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        if (deserializerFactory != null) {
            this._factory = deserializerFactory;
            this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
            this._featureFlags = 0;
            this._config = null;
            this._view = null;
            this._attributes = null;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null DeserializerFactory");
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public abstract JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj);

    public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) {
        return handleSecondaryContextualization(this._cache.findValueDeserializer(this, this._factory, javaType), beanProperty, javaType);
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) {
        Class<?> cls;
        if (this._injectableValues == null) {
            int i = ClassUtil.a;
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            reportBadDefinition(cls, String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        }
        throw null;
    }

    public final KeyDeserializer findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) {
        KeyDeserializer findKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        return findKeyDeserializer instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) findKeyDeserializer).createContextual(this, beanProperty) : findKeyDeserializer;
    }

    public final JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType javaType) {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver);

    public final JsonDeserializer<Object> findRootValueDeserializer(JavaType javaType) {
        JsonDeserializer<?> handleSecondaryContextualization = handleSecondaryContextualization(this._cache.findValueDeserializer(this, this._factory, javaType), null, javaType);
        TypeDeserializer findTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return findTypeDeserializer != null ? new TypeWrappedDeserializer(findTypeDeserializer.forProperty(null), handleSecondaryContextualization) : handleSecondaryContextualization;
    }

    public final Class<?> getActiveView() {
        return this._view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final ArrayBuilders getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new ArrayBuilders();
        }
        return this._arrayBuilders;
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    /* renamed from: getConfig */
    public DeserializationConfig mo12getConfig() {
        return this._config;
    }

    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config._nodeFactory;
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) {
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
            Object obj2 = DeserializationProblemHandler.NOT_HANDLED;
        }
        ClassUtil.throwIfIOE(th);
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) {
        String _format = _format(str, objArr);
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
            Object obj = DeserializationProblemHandler.NOT_HANDLED;
        }
        if (valueInstantiator == null || valueInstantiator.canInstantiate()) {
            throw MismatchedInputException.from(this._parser, cls, _format(String.format("Cannot construct instance of %s (although at least one Creator exists): %s", ClassUtil.nameOf(cls), _format), new Object[0]));
        }
        reportBadDefinition(constructType(cls), String.format("Cannot construct instance of %s (no Creators, like default construct, exist): %s", ClassUtil.nameOf(cls), _format));
        throw null;
    }

    public JavaType handleMissingTypeId(JavaType javaType, TypeIdResolver typeIdResolver, String str) {
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
        }
        throw new InvalidTypeIdException(this._parser, _colonConcat(String.format("Missing type id when trying to resolve subtype of %s", javaType), str), javaType, null);
    }

    public JsonDeserializer<?> handlePrimaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) {
        if (jsonDeserializer instanceof ContextualDeserializer) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer;
    }

    public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) {
        if (jsonDeserializer instanceof ContextualDeserializer) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) {
        handleUnexpectedToken(cls, jsonParser.getCurrentToken(), jsonParser, null, new Object[0]);
        throw null;
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Object obj, String str) {
        Class<?> cls;
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.skipChildren();
            return true;
        }
        Collection<Object> knownPropertyNames = jsonDeserializer.getKnownPropertyNames();
        JsonParser jsonParser2 = this._parser;
        int i = UnrecognizedPropertyException.a;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(jsonParser2, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", str, cls.getName()), jsonParser2.getCurrentLocation(), cls, str, knownPropertyNames);
        unrecognizedPropertyException.prependPath(new JsonMappingException.Reference(obj, str));
        throw unrecognizedPropertyException;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, TypeIdResolver typeIdResolver, String str2) {
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            return null;
        }
        throw invalidTypeIdException(javaType, str, str2);
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) {
        String _format = _format(str2, objArr);
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
            Object obj = DeserializationProblemHandler.NOT_HANDLED;
        }
        throw new InvalidFormatException(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", ClassUtil.nameOf(cls), _quotedString(str), _format), str, cls);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) {
        Class<?> cls = javaType._class;
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
            Object obj2 = DeserializationProblemHandler.NOT_HANDLED;
        }
        throw new InvalidFormatException(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", ClassUtil.nameOf(cls), ClassUtil.classNameOf(obj)), obj, cls);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) {
        String _format = _format(str, objArr);
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
            Object obj = DeserializationProblemHandler.NOT_HANDLED;
        }
        throw weirdNumberException(number, cls, _format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) {
        String _format = _format(str2, objArr);
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
            Object obj = DeserializationProblemHandler.NOT_HANDLED;
        }
        throw weirdStringException(str, cls, _format);
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._featureFlags) != 0;
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        String str;
        JavaType constructType = constructType(cls);
        if (th == null) {
            str = "N/A";
        } else {
            str = ClassUtil.exceptionMessage(th);
            if (str == null) {
                str = ClassUtil.nameOf(th.getClass());
            }
        }
        InvalidDefinitionException from = InvalidDefinitionException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", ClassUtil.nameOf(cls), str), constructType);
        from.initCause(th);
        return from;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return new InvalidTypeIdException(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, javaType), str2), javaType, str);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj);

    public final ObjectBuffer leaseObjectBuffer() {
        ObjectBuffer objectBuffer = this._objectBuffer;
        if (objectBuffer == null) {
            return new ObjectBuffer();
        }
        this._objectBuffer = null;
        return objectBuffer;
    }

    public Date parseDate(String str) {
        try {
            DateFormat dateFormat = this._dateFormat;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this._config.getDateFormat().clone();
                this._dateFormat = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, ClassUtil.exceptionMessage(e)));
        }
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public <T> T reportBadDefinition(JavaType javaType, String str) {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    public <T> T reportBadMerge(JsonDeserializer<?> jsonDeserializer) {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return null;
        }
        JavaType constructType = constructType(jsonDeserializer.handledType());
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid configuration: values of type %s cannot be merged", constructType), constructType);
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) {
        String _format = _format(str, objArr);
        int i = ClassUtil.a;
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", ClassUtil.backticked(beanPropertyDefinition.getName()), ClassUtil.nameOf(beanDescription._type._class), _format), beanDescription, beanPropertyDefinition);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", ClassUtil.nameOf(beanDescription._type._class), _format(str, objArr)), beanDescription, (BeanPropertyDefinition) null);
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) {
        JavaType javaType;
        String _format = _format(str, objArr);
        if (beanProperty == null) {
            javaType = null;
        } else {
            javaType = ((SettableBeanProperty) beanProperty).getType();
        }
        throw MismatchedInputException.from(this._parser, javaType, _format);
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", jsonToken, ClassUtil.nameOf(cls)));
    }

    public void reportWrongTokenException(JsonDeserializer<?> jsonDeserializer, JsonToken jsonToken, String str, Object... objArr) {
        throw wrongTokenException(this._parser, jsonDeserializer.handledType(), jsonToken, _format(str, objArr));
    }

    public final void returnObjectBuffer(ObjectBuffer objectBuffer) {
        if (this._objectBuffer == null || objectBuffer.initialCapacity() >= this._objectBuffer.initialCapacity()) {
            this._objectBuffer = objectBuffer;
        }
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return new InvalidFormatException(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", ClassUtil.nameOf(cls), String.valueOf(number), str), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return new InvalidFormatException(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", ClassUtil.nameOf(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.getCurrentToken(), jsonToken), str));
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    /* renamed from: getConfig  reason: collision with other method in class */
    public MapperConfig mo12getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) {
        String _format = _format(str, objArr);
        for (LinkedNode<DeserializationProblemHandler> linkedNode = this._config._problemHandlers; linkedNode != null; linkedNode = linkedNode.next()) {
            linkedNode.value().getClass();
            Object obj = DeserializationProblemHandler.NOT_HANDLED;
        }
        if (_format == null) {
            if (jsonToken == null) {
                _format = String.format("Unexpected end-of-input when binding data into %s", ClassUtil.nameOf(cls));
            } else {
                _format = String.format("Cannot deserialize instance of %s out of %s token", ClassUtil.nameOf(cls), jsonToken);
            }
        }
        throw MismatchedInputException.from(this._parser, cls, _format(_format, new Object[0]));
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) {
        String _format = _format(str, objArr);
        JsonParser jsonParser = this._parser;
        throw MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.getCurrentToken(), jsonToken), _format));
    }

    public <T> T reportInputMismatch(JsonDeserializer<?> jsonDeserializer, String str, Object... objArr) {
        throw MismatchedInputException.from(this._parser, jsonDeserializer.handledType(), _format(str, objArr));
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) {
        throw MismatchedInputException.from(this._parser, cls, _format(str, objArr));
    }

    protected DeserializationContext(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory) {
        this._cache = deserializationContext._cache;
        this._factory = deserializerFactory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._attributes = deserializationContext._attributes;
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) {
        throw MismatchedInputException.from(this._parser, javaType, _format(str, objArr));
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) {
        throw wrongTokenException(this._parser, cls, jsonToken, _format(str, objArr));
    }

    protected DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig._deserFeatures;
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._attributes = deserializationConfig.getAttributes();
    }
}
