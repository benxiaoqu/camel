
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.fhir.api.FhirHistory;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.fhir.api.FhirHistory
 */
public enum FhirHistoryApiMethod implements ApiMethod {

    ON_INSTANCE(
        Object.class,
        "onInstance",
        arg("id", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("returnType", Class.class),
        arg("count", Integer.class),
        arg("cutoff", java.util.Date.class),
        arg("iCutoff", org.hl7.fhir.instance.model.api.IPrimitiveType.class),
        arg("extraParameters", java.util.Map.class)),

    ON_SERVER(
        Object.class,
        "onServer",
        arg("returnType", Class.class),
        arg("count", Integer.class),
        arg("cutoff", java.util.Date.class),
        arg("iCutoff", org.hl7.fhir.instance.model.api.IPrimitiveType.class),
        arg("extraParameters", java.util.Map.class)),

    ON_TYPE(
        Object.class,
        "onType",
        arg("resourceType", Class.class),
        arg("returnType", Class.class),
        arg("count", Integer.class),
        arg("cutoff", java.util.Date.class),
        arg("iCutoff", org.hl7.fhir.instance.model.api.IPrimitiveType.class),
        arg("extraParameters", java.util.Map.class));

    private final ApiMethod apiMethod;

    private FhirHistoryApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(FhirHistory.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
