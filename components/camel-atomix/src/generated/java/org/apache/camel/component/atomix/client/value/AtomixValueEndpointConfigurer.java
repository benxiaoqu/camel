/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.value;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixValueEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtomixValueEndpoint target = (AtomixValueEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": target.getConfiguration().setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultaction":
        case "defaultAction": target.getConfiguration().setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.value.AtomixValue.Action.class, value)); return true;
        case "defaultresourceconfig":
        case "defaultResourceConfig": target.getConfiguration().setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultresourceoptions":
        case "defaultResourceOptions": target.getConfiguration().setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": target.getConfiguration().setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nodes": target.getConfiguration().setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "readconsistency":
        case "readConsistency": target.getConfiguration().setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceconfigs":
        case "resourceConfigs": target.getConfiguration().setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceoptions":
        case "resourceOptions": target.getConfiguration().setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "resultheader":
        case "resultHeader": target.getConfiguration().setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transportclassname":
        case "transportClassName": target.getConfiguration().setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("atomix", io.atomix.Atomix.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("configurationUri", java.lang.String.class);
        answer.put("defaultAction", org.apache.camel.component.atomix.client.value.AtomixValue.Action.class);
        answer.put("defaultResourceConfig", java.util.Properties.class);
        answer.put("defaultResourceOptions", java.util.Properties.class);
        answer.put("ephemeral", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("nodes", java.lang.String.class);
        answer.put("readConsistency", io.atomix.resource.ReadConsistency.class);
        answer.put("resourceConfigs", java.util.Map.class);
        answer.put("resourceOptions", java.util.Map.class);
        answer.put("resultHeader", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("transportClassName", java.lang.String.class);
        answer.put("ttl", long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AtomixValueEndpoint target = (AtomixValueEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": return target.getConfiguration().getAtomix();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configurationuri":
        case "configurationUri": return target.getConfiguration().getConfigurationUri();
        case "defaultaction":
        case "defaultAction": return target.getConfiguration().getDefaultAction();
        case "defaultresourceconfig":
        case "defaultResourceConfig": return target.getConfiguration().getDefaultResourceConfig();
        case "defaultresourceoptions":
        case "defaultResourceOptions": return target.getConfiguration().getDefaultResourceOptions();
        case "ephemeral": return target.getConfiguration().isEphemeral();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nodes": return target.getConfiguration().getNodes();
        case "readconsistency":
        case "readConsistency": return target.getConfiguration().getReadConsistency();
        case "resourceconfigs":
        case "resourceConfigs": return target.getConfiguration().getResourceConfigs();
        case "resourceoptions":
        case "resourceOptions": return target.getConfiguration().getResourceOptions();
        case "resultheader":
        case "resultHeader": return target.getConfiguration().getResultHeader();
        case "synchronous": return target.isSynchronous();
        case "transportclassname":
        case "transportClassName": return target.getConfiguration().getTransportClassName();
        case "ttl": return target.getConfiguration().getTtl();
        default: return null;
        }
    }
}
