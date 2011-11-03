// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.prodageo.exa6023.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("org.prodageo.exa6023.server.domain.PizzaOrder")
@ServiceName("org.prodageo.exa6023.server.domain.PizzaOrder")
public interface PizzaOrderRequest extends RequestContext {

    abstract InstanceRequest<org.prodageo.exa6023.client.managed.request.PizzaOrderProxy, java.lang.Void> persist();

    abstract InstanceRequest<org.prodageo.exa6023.client.managed.request.PizzaOrderProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countPizzaOrders();

    abstract Request<org.prodageo.exa6023.client.managed.request.PizzaOrderProxy> findPizzaOrder(Long id);

    abstract Request<java.util.List<org.prodageo.exa6023.client.managed.request.PizzaOrderProxy>> findAllPizzaOrders();

    abstract Request<java.util.List<org.prodageo.exa6023.client.managed.request.PizzaOrderProxy>> findPizzaOrderEntries(int firstResult, int maxResults);
}
