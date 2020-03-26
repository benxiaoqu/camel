/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xj;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.xslt.saxon.XsltSaxonEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XJEndpointConfigurer extends XsltSaxonEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XJEndpoint target = (XJEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "transformdirection":
        case "transformDirection": target.setTransformDirection(property(camelContext, org.apache.camel.component.xj.TransformDirection.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = super.getAllOptions(target);
        answer.put("transformDirection", org.apache.camel.component.xj.TransformDirection.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XJEndpoint target = (XJEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "transformdirection":
        case "transformDirection": return target.getTransformDirection();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}
