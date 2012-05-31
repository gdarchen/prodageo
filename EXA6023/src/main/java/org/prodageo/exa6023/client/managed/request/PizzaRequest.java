// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.prodageo.exa6023.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("org.prodageo.exa6023.server.domain.Pizza")
@ServiceName("org.prodageo.exa6023.server.domain.Pizza")
public interface PizzaRequest extends RequestContext {

    abstract InstanceRequest<org.prodageo.exa6023.client.managed.request.PizzaProxy, java.lang.Void> persist();

    abstract InstanceRequest<org.prodageo.exa6023.client.managed.request.PizzaProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countPizzas();

    abstract Request<org.prodageo.exa6023.client.managed.request.PizzaProxy> findPizza(Long id);

    abstract Request<java.util.List<org.prodageo.exa6023.client.managed.request.PizzaProxy>> findAllPizzas();

    abstract Request<java.util.List<org.prodageo.exa6023.client.managed.request.PizzaProxy>> findPizzaEntries(int firstResult, int maxResults);
}